// Generated from c:/Users/usuario/ssl-antlr-parcial-analizador/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AnalizadorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IDENTIFICADOR=13, NUMERO=14, WS=15;
	public static final int
		RULE_regla = 0, RULE_condicion = 1, RULE_nombre_dispositivo = 2, RULE_estado_condicion = 3, 
		RULE_valor_condicion = 4, RULE_estado = 5, RULE_accion = 6, RULE_accion_simple = 7, 
		RULE_activar = 8, RULE_desactivar = 9, RULE_ajustar = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"regla", "condicion", "nombre_dispositivo", "estado_condicion", "valor_condicion", 
			"estado", "accion", "accion_simple", "activar", "desactivar", "ajustar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cuando'", "'entonces'", "';'", "'es'", "'mayor que'", "'menor que'", 
			"'encendido'", "'apagado'", "'activar'", "'desactivar'", "'ajustar'", 
			"'a'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IDENTIFICADOR", "NUMERO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Analizador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AnalizadorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReglaContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public AccionContext accion() {
			return getRuleContext(AccionContext.class,0);
		}
		public ReglaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterRegla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitRegla(this);
		}
	}

	public final ReglaContext regla() throws RecognitionException {
		ReglaContext _localctx = new ReglaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_regla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			condicion();
			setState(24);
			match(T__1);
			setState(25);
			accion();
			setState(26);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public Nombre_dispositivoContext nombre_dispositivo() {
			return getRuleContext(Nombre_dispositivoContext.class,0);
		}
		public Estado_condicionContext estado_condicion() {
			return getRuleContext(Estado_condicionContext.class,0);
		}
		public Valor_condicionContext valor_condicion() {
			return getRuleContext(Valor_condicionContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			nombre_dispositivo();
			setState(29);
			estado_condicion();
			setState(30);
			valor_condicion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nombre_dispositivoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(AnalizadorParser.IDENTIFICADOR, 0); }
		public Nombre_dispositivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_dispositivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterNombre_dispositivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitNombre_dispositivo(this);
		}
	}

	public final Nombre_dispositivoContext nombre_dispositivo() throws RecognitionException {
		Nombre_dispositivoContext _localctx = new Nombre_dispositivoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nombre_dispositivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Estado_condicionContext extends ParserRuleContext {
		public Estado_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterEstado_condicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitEstado_condicion(this);
		}
	}

	public final Estado_condicionContext estado_condicion() throws RecognitionException {
		Estado_condicionContext _localctx = new Estado_condicionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estado_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_condicionContext extends ParserRuleContext {
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(AnalizadorParser.NUMERO, 0); }
		public Valor_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterValor_condicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitValor_condicion(this);
		}
	}

	public final Valor_condicionContext valor_condicion() throws RecognitionException {
		Valor_condicionContext _localctx = new Valor_condicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valor_condicion);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				estado();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(NUMERO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstadoContext extends ParserRuleContext {
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccionContext extends ParserRuleContext {
		public Accion_simpleContext accion_simple() {
			return getRuleContext(Accion_simpleContext.class,0);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitAccion(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			accion_simple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Accion_simpleContext extends ParserRuleContext {
		public ActivarContext activar() {
			return getRuleContext(ActivarContext.class,0);
		}
		public DesactivarContext desactivar() {
			return getRuleContext(DesactivarContext.class,0);
		}
		public AjustarContext ajustar() {
			return getRuleContext(AjustarContext.class,0);
		}
		public Accion_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterAccion_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitAccion_simple(this);
		}
	}

	public final Accion_simpleContext accion_simple() throws RecognitionException {
		Accion_simpleContext _localctx = new Accion_simpleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_accion_simple);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				activar();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				desactivar();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				ajustar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActivarContext extends ParserRuleContext {
		public Nombre_dispositivoContext nombre_dispositivo() {
			return getRuleContext(Nombre_dispositivoContext.class,0);
		}
		public ActivarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterActivar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitActivar(this);
		}
	}

	public final ActivarContext activar() throws RecognitionException {
		ActivarContext _localctx = new ActivarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_activar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__8);
			setState(50);
			nombre_dispositivo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DesactivarContext extends ParserRuleContext {
		public Nombre_dispositivoContext nombre_dispositivo() {
			return getRuleContext(Nombre_dispositivoContext.class,0);
		}
		public DesactivarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desactivar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterDesactivar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitDesactivar(this);
		}
	}

	public final DesactivarContext desactivar() throws RecognitionException {
		DesactivarContext _localctx = new DesactivarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_desactivar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__9);
			setState(53);
			nombre_dispositivo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AjustarContext extends ParserRuleContext {
		public Nombre_dispositivoContext nombre_dispositivo() {
			return getRuleContext(Nombre_dispositivoContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(AnalizadorParser.NUMERO, 0); }
		public AjustarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ajustar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).enterAjustar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnalizadorListener ) ((AnalizadorListener)listener).exitAjustar(this);
		}
	}

	public final AjustarContext ajustar() throws RecognitionException {
		AjustarContext _localctx = new AjustarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ajustar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__10);
			setState(56);
			nombre_dispositivo();
			setState(57);
			match(T__11);
			setState(58);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000f=\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\'\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u00070\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0002\u0001\u0000\u0004\u0006\u0001"+
		"\u0000\u0007\b4\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u001c\u0001"+
		"\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006\"\u0001\u0000"+
		"\u0000\u0000\b&\u0001\u0000\u0000\u0000\n(\u0001\u0000\u0000\u0000\f*"+
		"\u0001\u0000\u0000\u0000\u000e/\u0001\u0000\u0000\u0000\u00101\u0001\u0000"+
		"\u0000\u0000\u00124\u0001\u0000\u0000\u0000\u00147\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0003\u0002\u0001\u0000"+
		"\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0003\f\u0006\u0000\u001a"+
		"\u001b\u0005\u0003\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0003\u0006\u0003\u0000\u001e"+
		"\u001f\u0003\b\u0004\u0000\u001f\u0003\u0001\u0000\u0000\u0000 !\u0005"+
		"\r\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\"#\u0007\u0000\u0000\u0000"+
		"#\u0007\u0001\u0000\u0000\u0000$\'\u0003\n\u0005\u0000%\'\u0005\u000e"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\t\u0001"+
		"\u0000\u0000\u0000()\u0007\u0001\u0000\u0000)\u000b\u0001\u0000\u0000"+
		"\u0000*+\u0003\u000e\u0007\u0000+\r\u0001\u0000\u0000\u0000,0\u0003\u0010"+
		"\b\u0000-0\u0003\u0012\t\u0000.0\u0003\u0014\n\u0000/,\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u000f\u0001"+
		"\u0000\u0000\u000012\u0005\t\u0000\u000023\u0003\u0004\u0002\u00003\u0011"+
		"\u0001\u0000\u0000\u000045\u0005\n\u0000\u000056\u0003\u0004\u0002\u0000"+
		"6\u0013\u0001\u0000\u0000\u000078\u0005\u000b\u0000\u000089\u0003\u0004"+
		"\u0002\u00009:\u0005\f\u0000\u0000:;\u0005\u000e\u0000\u0000;\u0015\u0001"+
		"\u0000\u0000\u0000\u0002&/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}