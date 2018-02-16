package ltl2lustre.visitors;

import org.antlr.v4.runtime.misc.NotNull;

import ltl2lustre.parsing.ltlBaseVisitor;
import ltl2lustre.parsing.ltlParser;

public class DepthCheckVisitor extends ltlBaseVisitor<Integer> {
	
	@Override
	protected Integer aggregateResult(Integer aggregate, Integer nextResult) {
		if (aggregate != null && nextResult != null) {
			return Integer.max(aggregate, nextResult);
		} else if (aggregate != null) {
			return aggregate;
		} else if (nextResult != null) {
			return nextResult;
		} else {
			return 0;
		}
	}

	private int visitUnyOp(String op, int result) {
		if (op.equalsIgnoreCase("X") ||
			op.equalsIgnoreCase("next")) {
			return result++; 
		} else {
			return result;
		}		
	}
	
	@Override public Integer visitConstant(@NotNull ltlParser.ConstantContext ctx) { return 0; }

	@Override public Integer visitUnyExpr(@NotNull ltlParser.UnyExprContext ctx) { 
		return visitUnyOp(ctx.op.getText(), visitChildren(ctx)); 
	}

	@Override public Integer visitUnyLtlExpr(@NotNull ltlParser.UnyLtlExprContext ctx) { 
		return visitUnyOp(ctx.op.getText(), visitChildren(ctx));
	}

	@Override public Integer visitConstantExpr(@NotNull ltlParser.ConstantExprContext ctx) { return 0; }
	@Override public Integer visitIdExpr(@NotNull ltlParser.IdExprContext ctx) { return 0; }
	
}
