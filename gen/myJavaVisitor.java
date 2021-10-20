// Generated from C:/Users/hikse/IdeaProjects/CourseWork/src\myJava.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(myJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link myJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(myJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myJavaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(myJavaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link myJavaParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(myJavaParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link myJavaParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(myJavaParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link myJavaParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(myJavaParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link myJavaParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(myJavaParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link myJavaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(myJavaParser.PrintContext ctx);
}