package ltl2lustre.visitors;

import org.antlr.v4.runtime.misc.NotNull;

import ltl2lustre.parsing.ltlBaseVisitor;
import ltl2lustre.parsing.ltlParser;

public class SafetyCheckVisitor extends ltlBaseVisitor<Boolean> {
	
	// conservative checker for safety properties.
	
	
	// parameter: do we allow global properties under negation (usually on the 
	// lhs of implications)?
	boolean allowGUnderNegation;

	// used during visitation.
	boolean underNegation;
	
	public SafetyCheckVisitor(boolean allowGUnderNegation) {
		reset();
		this.allowGUnderNegation = allowGUnderNegation;
	}
	
	public void reset() {
		underNegation = false;
	}


	@Override
	protected Boolean aggregateResult(Boolean aggregate, Boolean nextResult) {
		if (aggregate != null && nextResult != null) {
			return aggregate && nextResult;
		} 
		if (aggregate != null) {
			return aggregate;
		}
		if (nextResult != null) {
			return nextResult;
		}
		return true;
	}

	
	@Override public Boolean visitBasicLtlExpr(@NotNull ltlParser.BasicLtlExprContext ctx) { return true; }
	@Override public Boolean visitProgram(@NotNull ltlParser.ProgramContext ctx) { return visitChildren(ctx); }
	@Override public Boolean visitUnyLtlExpr(@NotNull ltlParser.UnyLtlExprContext ctx) { 
		if (ctx.op.getText().equalsIgnoreCase("!")) {
			boolean oldUnderNegation = underNegation;
			underNegation = !underNegation;
			boolean result = visitChildren(ctx);
			underNegation = oldUnderNegation;
			return result;
		} else if (ctx.op.getText().equalsIgnoreCase("F")) {
			if (!underNegation) {
				return false;
			} else {
				return visitChildren(ctx);
			}
		} else if (ctx.op.getText().equalsIgnoreCase("G")) {
			if (underNegation) {
				if (allowGUnderNegation) {
					System.out.println("WARNING: use of G under negation - liveness property");
					return true;
				} else {
					return false;
				}
			} else {
				return visitChildren(ctx);
			}
		} else {
			return visitChildren(ctx);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>This is conservative; it will flag as liveness properties certain syntactic
	 *    forms of safety properties.  For example G(x) <==> false V x.  However, 
	 *    we just want to be safe.  If people want to write stupid stuff we will just
	 *    bail out.
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitBinaryLtlExpr(@NotNull ltlParser.BinaryLtlExprContext ctx) { 
		if (ctx.op.getText().equalsIgnoreCase("->")) {
			boolean oldUnderNegation = underNegation;
			underNegation = !underNegation;
			boolean lhsResult = ctx.lhs.accept(this);
			underNegation = oldUnderNegation;
			boolean rhsResult = ctx.rhs.accept(this);
			return lhsResult && rhsResult;
		} else if (ctx.op.getText().equalsIgnoreCase("U") ||
				   ctx.op.getText().equalsIgnoreCase("V")) {
			return false;
		} else if (ctx.op.getText().equalsIgnoreCase("<->")) {
			return false; 
		}
		else {
			return visitChildren(ctx); 
		}
	}
	
}
