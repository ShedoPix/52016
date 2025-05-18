// Generated from c:/Users/usuario/ssl-antlr-parcial-analizador/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnalizadorParser}.
 */
public interface AnalizadorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#regla}.
	 * @param ctx the parse tree
	 */
	void enterRegla(AnalizadorParser.ReglaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#regla}.
	 * @param ctx the parse tree
	 */
	void exitRegla(AnalizadorParser.ReglaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(AnalizadorParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(AnalizadorParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#nombre_dispositivo}.
	 * @param ctx the parse tree
	 */
	void enterNombre_dispositivo(AnalizadorParser.Nombre_dispositivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#nombre_dispositivo}.
	 * @param ctx the parse tree
	 */
	void exitNombre_dispositivo(AnalizadorParser.Nombre_dispositivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#estado_condicion}.
	 * @param ctx the parse tree
	 */
	void enterEstado_condicion(AnalizadorParser.Estado_condicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#estado_condicion}.
	 * @param ctx the parse tree
	 */
	void exitEstado_condicion(AnalizadorParser.Estado_condicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#valor_condicion}.
	 * @param ctx the parse tree
	 */
	void enterValor_condicion(AnalizadorParser.Valor_condicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#valor_condicion}.
	 * @param ctx the parse tree
	 */
	void exitValor_condicion(AnalizadorParser.Valor_condicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(AnalizadorParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(AnalizadorParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(AnalizadorParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(AnalizadorParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#accion_simple}.
	 * @param ctx the parse tree
	 */
	void enterAccion_simple(AnalizadorParser.Accion_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#accion_simple}.
	 * @param ctx the parse tree
	 */
	void exitAccion_simple(AnalizadorParser.Accion_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#activar}.
	 * @param ctx the parse tree
	 */
	void enterActivar(AnalizadorParser.ActivarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#activar}.
	 * @param ctx the parse tree
	 */
	void exitActivar(AnalizadorParser.ActivarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#desactivar}.
	 * @param ctx the parse tree
	 */
	void enterDesactivar(AnalizadorParser.DesactivarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#desactivar}.
	 * @param ctx the parse tree
	 */
	void exitDesactivar(AnalizadorParser.DesactivarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#ajustar}.
	 * @param ctx the parse tree
	 */
	void enterAjustar(AnalizadorParser.AjustarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#ajustar}.
	 * @param ctx the parse tree
	 */
	void exitAjustar(AnalizadorParser.AjustarContext ctx);
}