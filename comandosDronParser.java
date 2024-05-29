// Generated from comandosDron.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class comandosDronParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HELP=1, STATUS=2, ENCENDER_MOTOR=3, APAGAR_MOTOR=4, GIRAR=5, ELEVARSE=6, 
		BAJAR=7, ROTAR=8, REGRESAR_BASE=9, DERECHA=10, IZQUIERDA=11, ADELANTE=12, 
		ATRAS=13, NUMERO=14, WS=15;
	public static final int
		RULE_comando = 0, RULE_accion = 1, RULE_direccionGiro = 2, RULE_direccionRotacion = 3, 
		RULE_cantidad = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"comando", "accion", "direccionGiro", "direccionRotacion", "cantidad"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'help'", "'status'", "'encender_motor'", "'apagar_motor'", "'girar'", 
			"'elevarse'", "'bajar'", "'rotar'", "'regresar_base'", "'derecha'", "'izquierda'", 
			"'adelante'", "'atras'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HELP", "STATUS", "ENCENDER_MOTOR", "APAGAR_MOTOR", "GIRAR", "ELEVARSE", 
			"BAJAR", "ROTAR", "REGRESAR_BASE", "DERECHA", "IZQUIERDA", "ADELANTE", 
			"ATRAS", "NUMERO", "WS"
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
	public String getGrammarFileName() { return "comandosDron.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    // Crear una instancia del listener DroneListener y del contexto DroneContext
	    // para realizar acciones y validaciones personalizadas durante el análisis sintáctico.
	    //
	    // El listener se encargará de manejar las reglas semánticas y las acciones específicas
	    // para cada comando reconocido por la gramática, utilizando el contexto del dron.
	    private DroneListener droneListener = new DroneListener(new DroneContext());

	public comandosDronParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public AccionContext accion() {
			return getRuleContext(AccionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(comandosDronParser.EOF, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			accion();
			setState(11);
			match(EOF);
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
		public TerminalNode ENCENDER_MOTOR() { return getToken(comandosDronParser.ENCENDER_MOTOR, 0); }
		public TerminalNode APAGAR_MOTOR() { return getToken(comandosDronParser.APAGAR_MOTOR, 0); }
		public TerminalNode GIRAR() { return getToken(comandosDronParser.GIRAR, 0); }
		public DireccionGiroContext direccionGiro() {
			return getRuleContext(DireccionGiroContext.class,0);
		}
		public CantidadContext cantidad() {
			return getRuleContext(CantidadContext.class,0);
		}
		public TerminalNode ELEVARSE() { return getToken(comandosDronParser.ELEVARSE, 0); }
		public TerminalNode BAJAR() { return getToken(comandosDronParser.BAJAR, 0); }
		public TerminalNode ROTAR() { return getToken(comandosDronParser.ROTAR, 0); }
		public DireccionRotacionContext direccionRotacion() {
			return getRuleContext(DireccionRotacionContext.class,0);
		}
		public TerminalNode REGRESAR_BASE() { return getToken(comandosDronParser.REGRESAR_BASE, 0); }
		public TerminalNode HELP() { return getToken(comandosDronParser.HELP, 0); }
		public TerminalNode STATUS() { return getToken(comandosDronParser.STATUS, 0); }
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).exitAccion(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_accion);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCENDER_MOTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(ENCENDER_MOTOR);
				}
				break;
			case APAGAR_MOTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(APAGAR_MOTOR);
				}
				break;
			case GIRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				match(GIRAR);
				setState(16);
				direccionGiro();
				setState(17);
				cantidad();
				}
				break;
			case ELEVARSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				match(ELEVARSE);
				setState(20);
				cantidad();
				}
				break;
			case BAJAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(21);
				match(BAJAR);
				setState(22);
				cantidad();
				}
				break;
			case ROTAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(23);
				match(ROTAR);
				setState(24);
				direccionRotacion();
				setState(25);
				cantidad();
				}
				break;
			case REGRESAR_BASE:
				enterOuterAlt(_localctx, 7);
				{
				setState(27);
				match(REGRESAR_BASE);
				}
				break;
			case HELP:
				enterOuterAlt(_localctx, 8);
				{
				setState(28);
				match(HELP);
				}
				break;
			case STATUS:
				enterOuterAlt(_localctx, 9);
				{
				setState(29);
				match(STATUS);
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
	public static class DireccionGiroContext extends ParserRuleContext {
		public TerminalNode DERECHA() { return getToken(comandosDronParser.DERECHA, 0); }
		public TerminalNode IZQUIERDA() { return getToken(comandosDronParser.IZQUIERDA, 0); }
		public DireccionGiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direccionGiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).enterDireccionGiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).exitDireccionGiro(this);
		}
	}

	public final DireccionGiroContext direccionGiro() throws RecognitionException {
		DireccionGiroContext _localctx = new DireccionGiroContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_direccionGiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==DERECHA || _la==IZQUIERDA) ) {
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
	public static class DireccionRotacionContext extends ParserRuleContext {
		public TerminalNode ADELANTE() { return getToken(comandosDronParser.ADELANTE, 0); }
		public TerminalNode ATRAS() { return getToken(comandosDronParser.ATRAS, 0); }
		public DireccionRotacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direccionRotacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).enterDireccionRotacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).exitDireccionRotacion(this);
		}
	}

	public final DireccionRotacionContext direccionRotacion() throws RecognitionException {
		DireccionRotacionContext _localctx = new DireccionRotacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_direccionRotacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==ADELANTE || _la==ATRAS) ) {
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
	public static class CantidadContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(comandosDronParser.NUMERO, 0); }
		public CantidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cantidad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).enterCantidad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).exitCantidad(this);
		}
	}

	public final CantidadContext cantidad() throws RecognitionException {
		CantidadContext _localctx = new CantidadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cantidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
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
		"\u0004\u0001\u000f\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\n\u000b\u0001\u0000"+
		"\f\r)\u0000\n\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000"+
		"\u0004 \u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b$\u0001"+
		"\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000"+
		"\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u001f\u0005\u0003\u0000"+
		"\u0000\u000e\u001f\u0005\u0004\u0000\u0000\u000f\u0010\u0005\u0005\u0000"+
		"\u0000\u0010\u0011\u0003\u0004\u0002\u0000\u0011\u0012\u0003\b\u0004\u0000"+
		"\u0012\u001f\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0006\u0000\u0000"+
		"\u0014\u001f\u0003\b\u0004\u0000\u0015\u0016\u0005\u0007\u0000\u0000\u0016"+
		"\u001f\u0003\b\u0004\u0000\u0017\u0018\u0005\b\u0000\u0000\u0018\u0019"+
		"\u0003\u0006\u0003\u0000\u0019\u001a\u0003\b\u0004\u0000\u001a\u001f\u0001"+
		"\u0000\u0000\u0000\u001b\u001f\u0005\t\u0000\u0000\u001c\u001f\u0005\u0001"+
		"\u0000\u0000\u001d\u001f\u0005\u0002\u0000\u0000\u001e\r\u0001\u0000\u0000"+
		"\u0000\u001e\u000e\u0001\u0000\u0000\u0000\u001e\u000f\u0001\u0000\u0000"+
		"\u0000\u001e\u0013\u0001\u0000\u0000\u0000\u001e\u0015\u0001\u0000\u0000"+
		"\u0000\u001e\u0017\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000"+
		"\u0000\u001f\u0003\u0001\u0000\u0000\u0000 !\u0007\u0000\u0000\u0000!"+
		"\u0005\u0001\u0000\u0000\u0000\"#\u0007\u0001\u0000\u0000#\u0007\u0001"+
		"\u0000\u0000\u0000$%\u0005\u000e\u0000\u0000%\t\u0001\u0000\u0000\u0000"+
		"\u0001\u001e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}