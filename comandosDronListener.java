// Generated from comandosDron.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link comandosDronParser}.
 */
public interface comandosDronListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link comandosDronParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(comandosDronParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link comandosDronParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(comandosDronParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link comandosDronParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(comandosDronParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comandosDronParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(comandosDronParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comandosDronParser#direccion}.
	 * @param ctx the parse tree
	 */
	void enterDireccion(comandosDronParser.DireccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comandosDronParser#direccion}.
	 * @param ctx the parse tree
	 */
	void exitDireccion(comandosDronParser.DireccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comandosDronParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void enterCantidad(comandosDronParser.CantidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link comandosDronParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void exitCantidad(comandosDronParser.CantidadContext ctx);
}