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
		ENCENDER_MOTOR=1, APAGAR_MOTOR=2, GIRAR=3, ELEVARSE=4, BAJAR=5, ROTAR=6, 
		REGRESAR_BASE=7, DERECHA=8, IZQUIERDA=9, ADELANTE=10, ATRAS=11, NUMERO=12, 
		WS=13;
	public static final int
		RULE_comando = 0, RULE_accion = 1, RULE_direccion = 2, RULE_cantidad = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"comando", "accion", "direccion", "cantidad"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ENCENDER_MOTOR'", "'APAGAR_MOTOR'", "'GIRAR'", "'ELEVARSE'", 
			"'BAJAR'", "'ROTAR'", "'REGRESAR_BASE'", "'DERECHA'", "'IZQUIERDA'", 
			"'ADELANTE'", "'ATRAS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENCENDER_MOTOR", "APAGAR_MOTOR", "GIRAR", "ELEVARSE", "BAJAR", 
			"ROTAR", "REGRESAR_BASE", "DERECHA", "IZQUIERDA", "ADELANTE", "ATRAS", 
			"NUMERO", "WS"
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
			setState(8);
			accion();
			setState(9);
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
		public DireccionContext direccion() {
			return getRuleContext(DireccionContext.class,0);
		}
		public CantidadContext cantidad() {
			return getRuleContext(CantidadContext.class,0);
		}
		public TerminalNode ELEVARSE() { return getToken(comandosDronParser.ELEVARSE, 0); }
		public TerminalNode BAJAR() { return getToken(comandosDronParser.BAJAR, 0); }
		public TerminalNode ROTAR() { return getToken(comandosDronParser.ROTAR, 0); }
		public TerminalNode REGRESAR_BASE() { return getToken(comandosDronParser.REGRESAR_BASE, 0); }
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
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCENDER_MOTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(ENCENDER_MOTOR);
				}
				break;
			case APAGAR_MOTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(APAGAR_MOTOR);
				}
				break;
			case GIRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(GIRAR);
				setState(14);
				direccion();
				setState(15);
				cantidad();
				}
				break;
			case ELEVARSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				match(ELEVARSE);
				setState(18);
				cantidad();
				}
				break;
			case BAJAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(19);
				match(BAJAR);
				setState(20);
				cantidad();
				}
				break;
			case ROTAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(21);
				match(ROTAR);
				setState(22);
				direccion();
				setState(23);
				cantidad();
				}
				break;
			case REGRESAR_BASE:
				enterOuterAlt(_localctx, 7);
				{
				setState(25);
				match(REGRESAR_BASE);
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
	public static class DireccionContext extends ParserRuleContext {
		public TerminalNode DERECHA() { return getToken(comandosDronParser.DERECHA, 0); }
		public TerminalNode IZQUIERDA() { return getToken(comandosDronParser.IZQUIERDA, 0); }
		public TerminalNode ADELANTE() { return getToken(comandosDronParser.ADELANTE, 0); }
		public TerminalNode ATRAS() { return getToken(comandosDronParser.ATRAS, 0); }
		public DireccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).enterDireccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comandosDronListener ) ((comandosDronListener)listener).exitDireccion(this);
		}
	}

	public final DireccionContext direccion() throws RecognitionException {
		DireccionContext _localctx = new DireccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_direccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) ) {
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
		enterRule(_localctx, 6, RULE_cantidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
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
		"\u0004\u0001\r!\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004"+
		"\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\b\u000b\"\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001c\u0001"+
		"\u0000\u0000\u0000\u0006\u001e\u0001\u0000\u0000\u0000\b\t\u0003\u0002"+
		"\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000"+
		"\u000b\u001b\u0005\u0001\u0000\u0000\f\u001b\u0005\u0002\u0000\u0000\r"+
		"\u000e\u0005\u0003\u0000\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f"+
		"\u0010\u0003\u0006\u0003\u0000\u0010\u001b\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005\u0004\u0000\u0000\u0012\u001b\u0003\u0006\u0003\u0000\u0013"+
		"\u0014\u0005\u0005\u0000\u0000\u0014\u001b\u0003\u0006\u0003\u0000\u0015"+
		"\u0016\u0005\u0006\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017"+
		"\u0018\u0003\u0006\u0003\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019"+
		"\u001b\u0005\u0007\u0000\u0000\u001a\u000b\u0001\u0000\u0000\u0000\u001a"+
		"\f\u0001\u0000\u0000\u0000\u001a\r\u0001\u0000\u0000\u0000\u001a\u0011"+
		"\u0001\u0000\u0000\u0000\u001a\u0013\u0001\u0000\u0000\u0000\u001a\u0015"+
		"\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d\u0005"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\f\u0000\u0000\u001f\u0007\u0001"+
		"\u0000\u0000\u0000\u0001\u001a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}