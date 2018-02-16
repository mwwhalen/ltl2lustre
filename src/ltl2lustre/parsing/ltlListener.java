// Generated from C:\Users\whalen\eclipse-workspace\LTL2Lustre\src\ltl2lustre\parsing\ltl.g4 by ANTLR 4.4

package ltl2lustre.parsing;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ltlParser}.
 */
public interface ltlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code basicLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 */
	void enterBasicLtlExpr(@NotNull ltlParser.BasicLtlExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 */
	void exitBasicLtlExpr(@NotNull ltlParser.BasicLtlExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ltlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull ltlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull ltlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ltlParser#boolconstant}.
	 * @param ctx the parse tree
	 */
	void enterBoolconstant(@NotNull ltlParser.BoolconstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlParser#boolconstant}.
	 * @param ctx the parse tree
	 */
	void exitBoolconstant(@NotNull ltlParser.BoolconstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpr(@NotNull ltlParser.NestedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpr(@NotNull ltlParser.NestedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElseExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseExpr(@NotNull ltlParser.IfThenElseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElseExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseExpr(@NotNull ltlParser.IfThenElseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(@NotNull ltlParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(@NotNull ltlParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ltlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ltlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ltlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unyExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnyExpr(@NotNull ltlParser.UnyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unyExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnyExpr(@NotNull ltlParser.UnyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code countExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void enterCountExpr(@NotNull ltlParser.CountExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code countExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void exitCountExpr(@NotNull ltlParser.CountExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ltlParser#realconstant}.
	 * @param ctx the parse tree
	 */
	void enterRealconstant(@NotNull ltlParser.RealconstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlParser#realconstant}.
	 * @param ctx the parse tree
	 */
	void exitRealconstant(@NotNull ltlParser.RealconstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anonymousLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_spec}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousLtlExpr(@NotNull ltlParser.AnonymousLtlExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anonymousLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_spec}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousLtlExpr(@NotNull ltlParser.AnonymousLtlExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ltlParser#intconstant}.
	 * @param ctx the parse tree
	 */
	void enterIntconstant(@NotNull ltlParser.IntconstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlParser#intconstant}.
	 * @param ctx the parse tree
	 */
	void exitIntconstant(@NotNull ltlParser.IntconstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_spec}.
	 * @param ctx the parse tree
	 */
	void enterNamedLtlExpr(@NotNull ltlParser.NamedLtlExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_spec}.
	 * @param ctx the parse tree
	 */
	void exitNamedLtlExpr(@NotNull ltlParser.NamedLtlExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 */
	void enterNestedLtlExpr(@NotNull ltlParser.NestedLtlExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 */
	void exitNestedLtlExpr(@NotNull ltlParser.NestedLtlExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ltlParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(@NotNull ltlParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(@NotNull ltlParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unyLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnyLtlExpr(@NotNull ltlParser.UnyLtlExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unyLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnyLtlExpr(@NotNull ltlParser.UnyLtlExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLtlExpr(@NotNull ltlParser.BinaryLtlExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLtlExpr(@NotNull ltlParser.BinaryLtlExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpr(@NotNull ltlParser.ConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpr(@NotNull ltlParser.ConstantExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(@NotNull ltlParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(@NotNull ltlParser.IdExprContext ctx);
}