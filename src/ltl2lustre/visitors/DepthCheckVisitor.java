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
			return null;
		}
	}

	private int visitUnyOp(String op, int result) {
		if (op.equalsIgnoreCase("X") ||
			op.equalsIgnoreCase("next")) {
			return result+1; 
		} else {
			return result;
		}		
	}
	
	@Override public Integer visitConstant(@NotNull ltlParser.ConstantContext ctx) { return 0; }

	@Override public Integer visitUnyExpr(@NotNull ltlParser.UnyExprContext ctx) { 
		int result = visitUnyOp(ctx.op.getText(), visitChildren(ctx));
		return result;
	}

	@Override public Integer visitUnyLtlExpr(@NotNull ltlParser.UnyLtlExprContext ctx) { 
		Integer childResult = visitChildren(ctx); 
		int result = visitUnyOp(ctx.op.getText(), childResult);
		return result;
	}

	@Override public Integer visitConstantExpr(@NotNull ltlParser.ConstantExprContext ctx) { return 0; }
	@Override public Integer visitIdExpr(@NotNull ltlParser.IdExprContext ctx) { return 0; }

}
