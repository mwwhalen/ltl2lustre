package ltl2lustre.visitors;

import java.math.BigDecimal;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import jkind.lustre.BinaryExpr;
import jkind.lustre.BinaryOp;
import jkind.lustre.BoolExpr;
import jkind.lustre.Expr;
import jkind.lustre.IdExpr;
import jkind.lustre.IfThenElseExpr;
import jkind.lustre.IntExpr;
import jkind.lustre.RealExpr;
import jkind.lustre.UnaryExpr;
import jkind.lustre.UnaryOp;
import ltl2lustre.parsing.ltlBaseVisitor;
import ltl2lustre.parsing.ltlParser;
import ltl2lustre.parsing.ltlParser.BasicexprContext;

// copy the "under negation" stuff?  No, just run the SafetyCheck. 
public class GenerateLustreVisitor extends ltlBaseVisitor<Expr> {

	// Note: this traversal requires that the SafetyCheck analysis has been performed.
	// It does not completely check for liveness operators!
	
	// parameter
	int maxNextDepth;
	
	// varies during traversal
	int currentNextDepth;
	
	boolean underG;
	
	public GenerateLustreVisitor(int maxDepth) {
		this.maxNextDepth = maxDepth;
		this.currentNextDepth = 0;
		this.underG = false;
	}

	protected Expr aggregateResult(Expr aggregate, Expr nextResult) {
		if (aggregate != null && nextResult != null) {
			throw new IllegalArgumentException("Error aggregating results in GenerateLustreVisitor: two results!");
		} else if (aggregate != null) {
			return aggregate;
		} else if (nextResult != null) {
			return nextResult;
		} else {
			return null; 
		}
	}
	
	
	@Override public Expr visitProgram(@NotNull ltlParser.ProgramContext ctx) { 
		throw new IllegalArgumentException("Error: Generate Lustre Visitor should not be called on program nodes");
	}

	private Expr generateOptionalStepCounter(Expr base) {
		if (maxNextDepth > 0) {
			Expr stepCtr = new BinaryExpr(new IdExpr("initial_step_counter"), BinaryOp.GREATEREQUAL, new IntExpr(maxNextDepth));
			return new BinaryExpr(stepCtr, BinaryOp.IMPLIES, base);
		}
		else {
			return base;
		}
	}
	
	@Override public Expr visitAnonymousLtlExpr(@NotNull ltlParser.AnonymousLtlExprContext ctx) { 
		Expr result = ctx.expr.accept(this);
		return generateOptionalStepCounter(result);
	}
		
	@Override public Expr visitNamedLtlExpr(@NotNull ltlParser.NamedLtlExprContext ctx) { 
		Expr result = ctx.expr.accept(this);
		return generateOptionalStepCounter(result);
	}

	@Override public Expr visitNestedLtlExpr(@NotNull ltlParser.NestedLtlExprContext ctx) { 
		Expr result = visitChildren(ctx); 
		return result;
	}
	
	@Override public Expr visitBasicLtlExpr(@NotNull ltlParser.BasicLtlExprContext ctx) { 
		Expr result = visitChildren(ctx); 
		return result;
	}

	@Override public Expr visitConstant(@NotNull ltlParser.ConstantContext ctx) { 
		Expr result = visitChildren(ctx); 
		return result;
	}

	@Override public Expr visitNestedExpr(@NotNull ltlParser.NestedExprContext ctx) { 
		Expr result = visitChildren(ctx); 
		return result;
	}
	
	
	
	@Override public Expr visitIfThenElseExpr(@NotNull ltlParser.IfThenElseExprContext ctx) { 
		return new IfThenElseExpr(ctx.cond.accept(this),
				                  ctx.thene.accept(this),
				                  ctx.elsee.accept(this));
	}
	
	@Override public Expr visitBinaryExpr(@NotNull ltlParser.BinaryExprContext ctx) { 
		Expr lhsExpr = ctx.lhs.accept(this);
		Expr rhsExpr = ctx.rhs.accept(this);
		BinaryOp op; 
		switch (ctx.op.getText()) {
		case "*": op = BinaryOp.MULTIPLY; break;
		case "/": op = BinaryOp.DIVIDE; break;
		case "+": op = BinaryOp.PLUS; break;
		case "-": op = BinaryOp.MINUS; break;
		case "=": op = BinaryOp.EQUAL; break;
		case "!=": op = BinaryOp.NOTEQUAL; break;
		case "<": op = BinaryOp.LESS; break;
		case ">": op = BinaryOp.GREATER; break;
		case "<=": op = BinaryOp.LESSEQUAL; break;
		case ">=": op = BinaryOp.GREATEREQUAL; break;
		case "&": op = BinaryOp.AND; break;
		case "|": op = BinaryOp.OR; break;
		case "xor": op = BinaryOp.XOR; break;
		case "->": op = BinaryOp.IMPLIES; break;
		default: throw new IllegalArgumentException("Operator: [" + ctx.op.getText() + "] is currently unsupported in ltl2lustre");
		}
		return new BinaryExpr(lhsExpr, op, rhsExpr);
	}

	@Override public Expr visitUnyExpr(@NotNull ltlParser.UnyExprContext ctx) { 
		switch(ctx.op.getText()) {
		case "!" : return new UnaryExpr(UnaryOp.NOT, ctx.sub.accept(this)); 
		case "-" : return new UnaryExpr(UnaryOp.NEGATIVE, ctx.sub.accept(this)); 
		case "next" : {
			currentNextDepth++; 
			Expr result = ctx.sub.accept(this);
			currentNextDepth--; 
			return result;
		}
		default: throw new IllegalArgumentException("Operator: [" + ctx.op.getText() + "] is currently unsupported in ltl2lustre");
		}
	}

	private Expr boolToIntExpr(Expr child) {
		return new IfThenElseExpr(child, new IntExpr(1), new IntExpr(0));
	}
	
	@Override public Expr visitCountExpr(@NotNull ltlParser.CountExprContext ctx) { 
		Expr sumExpr = new IntExpr(0);
		for (BasicexprContext child: ctx.el) {
			Expr lustreExpr = child.accept(this);
			Expr intExpr = boolToIntExpr(lustreExpr);
			sumExpr = new BinaryExpr(sumExpr, BinaryOp.PLUS, intExpr);
		}
		return sumExpr;
	}
	
	private Expr addPres(int count, Expr nested) {
		if (count < 0) {
			throw new IllegalArgumentException("addPres called with a negative argument");
		} else if (count == 0) {
			return nested;
		} else {
			return new UnaryExpr(UnaryOp.PRE, addPres(count-1, nested));
		}
	}

	@Override public Expr visitConstantExpr(@NotNull ltlParser.ConstantExprContext ctx) { 
		Expr result = visitChildren(ctx); 
		return result;
	}

	@Override public Expr visitIdExpr(@NotNull ltlParser.IdExprContext ctx) { 
		Expr result = visitChildren(ctx); 
		return result;
	}
	
	@Override public Expr visitVariable_identifier(@NotNull ltlParser.Variable_identifierContext ctx) { 
		if (!underG) {
			throw new IllegalArgumentException("Variable ID expression: " + ctx.getText() + " found outside a G temporal operator.  This is currently unsupported in ltl2lustre");
		}
		return addPres(this.maxNextDepth - this.currentNextDepth, new IdExpr(ctx.getText()));
	}
	
	@Override public Expr visitUnyLtlExpr(@NotNull ltlParser.UnyLtlExprContext ctx) { 
		ParseTree childExpr = ctx.sub;
		switch (ctx.op.getText()) {
		case "!": return new UnaryExpr(UnaryOp.NOT, childExpr.accept(this));
		case "X": {
			currentNextDepth++;
			Expr result = childExpr.accept(this);
			currentNextDepth--;
			return result;
		}
		case "G" : case "F" : {
			// assumes that SafetyCheck has been executed, so F is under negation.
			boolean oldUnderG = underG;
			underG = true;
			Expr result = childExpr.accept(this);
			underG = oldUnderG;
			return result;
		}
		default: throw new IllegalArgumentException("Operator: [" + ctx.op.getText() + "] is currently unsupported in ltl2lustre");
		}
	}

	@Override public Expr visitBinaryLtlExpr(@NotNull ltlParser.BinaryLtlExprContext ctx) { 
		BinaryOp op;
		Expr lhsExpr = ctx.lhs.accept(this);
		Expr rhsExpr = ctx.rhs.accept(this);
		switch (ctx.op.getText()) {
		case "&": op = BinaryOp.AND; break;
		case "|": op = BinaryOp.OR; break;
		case "xor": op = BinaryOp.XOR; break;
		case "->": op = BinaryOp.IMPLIES; break;
		case "<->": op = BinaryOp.EQUAL; break;
		default: throw new IllegalArgumentException("Operator: [" + ctx.op.getText() + "] is currently unsupported in ltl2lustre");
		}
		return new BinaryExpr(lhsExpr, op, rhsExpr);
	}

	@Override public Expr visitRealconstant(@NotNull ltlParser.RealconstantContext ctx) { 
		return new RealExpr(BigDecimal.valueOf(Double.parseDouble(ctx.getText())));
	}
	@Override public Expr visitIntconstant(@NotNull ltlParser.IntconstantContext ctx) { 
		return new IntExpr(Integer.decode(ctx.getText()));
	}
	@Override public Expr visitBoolconstant(@NotNull ltlParser.BoolconstantContext ctx) { 
		switch (ctx.getText()) {
		case "TRUE": return new BoolExpr(true);
		case "FALSE": return new BoolExpr(false);
		default: throw new IllegalArgumentException("Boolean constant: [" + ctx.getText() + "] is currently unsupported in ltl2lustre");
		}
	}
}
