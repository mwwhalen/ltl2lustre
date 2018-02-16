// Generated from C:\Users\whalen\eclipse-workspace\LTL2Lustre\src\ltl2lustre\parsing\ltl.g4 by ANTLR 4.4

package ltl2lustre.parsing;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ltlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ltlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code basicLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicLtlExpr(@NotNull ltlParser.BasicLtlExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ltlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull ltlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ltlParser#boolconstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolconstant(@NotNull ltlParser.BoolconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpr(@NotNull ltlParser.NestedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenElseExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseExpr(@NotNull ltlParser.IfThenElseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(@NotNull ltlParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ltlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ltlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unyExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnyExpr(@NotNull ltlParser.UnyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code countExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountExpr(@NotNull ltlParser.CountExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ltlParser#realconstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealconstant(@NotNull ltlParser.RealconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonymousLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousLtlExpr(@NotNull ltlParser.AnonymousLtlExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ltlParser#intconstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntconstant(@NotNull ltlParser.IntconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedLtlExpr(@NotNull ltlParser.NamedLtlExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedLtlExpr(@NotNull ltlParser.NestedLtlExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ltlParser#variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_identifier(@NotNull ltlParser.Variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unyLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnyLtlExpr(@NotNull ltlParser.UnyLtlExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryLtlExpr}
	 * labeled alternative in {@link ltlParser#ltl_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLtlExpr(@NotNull ltlParser.BinaryLtlExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(@NotNull ltlParser.ConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ltlParser#basicexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(@NotNull ltlParser.IdExprContext ctx);
}