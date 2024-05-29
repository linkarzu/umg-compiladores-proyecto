// Generated from comandosDron.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class comandosDronLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HELP=1, STATUS=2, ENCENDER_MOTOR=3, APAGAR_MOTOR=4, GIRAR=5, ELEVARSE=6, 
		BAJAR=7, ROTAR=8, REGRESAR_BASE=9, DERECHA=10, IZQUIERDA=11, ADELANTE=12, 
		ATRAS=13, NUMERO=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HELP", "STATUS", "ENCENDER_MOTOR", "APAGAR_MOTOR", "GIRAR", "ELEVARSE", 
			"BAJAR", "ROTAR", "REGRESAR_BASE", "DERECHA", "IZQUIERDA", "ADELANTE", 
			"ATRAS", "NUMERO", "WS"
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


	public comandosDronLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "comandosDron.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004"+
		"\r\u0093\b\r\u000b\r\f\r\u0094\u0001\r\u0001\r\u0004\r\u0099\b\r\u000b"+
		"\r\f\r\u009a\u0003\r\u009d\b\r\u0001\u000e\u0004\u000e\u00a0\b\u000e\u000b"+
		"\u000e\f\u000e\u00a1\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u0001\u0000\u0002\u0001\u000009\u0003\u0000\t\n\r\r  \u00a8\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003$\u0001\u0000\u0000"+
		"\u0000\u0005+\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t"+
		"G\u0001\u0000\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rV\u0001\u0000"+
		"\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000"+
		"\u0000\u0013p\u0001\u0000\u0000\u0000\u0015x\u0001\u0000\u0000\u0000\u0017"+
		"\u0082\u0001\u0000\u0000\u0000\u0019\u008b\u0001\u0000\u0000\u0000\u001b"+
		"\u0092\u0001\u0000\u0000\u0000\u001d\u009f\u0001\u0000\u0000\u0000\u001f"+
		" \u0005h\u0000\u0000 !\u0005e\u0000\u0000!\"\u0005l\u0000\u0000\"#\u0005"+
		"p\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005s\u0000\u0000%&\u0005"+
		"t\u0000\u0000&\'\u0005a\u0000\u0000\'(\u0005t\u0000\u0000()\u0005u\u0000"+
		"\u0000)*\u0005s\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005e\u0000"+
		"\u0000,-\u0005n\u0000\u0000-.\u0005c\u0000\u0000./\u0005e\u0000\u0000"+
		"/0\u0005n\u0000\u000001\u0005d\u0000\u000012\u0005e\u0000\u000023\u0005"+
		"r\u0000\u000034\u0005_\u0000\u000045\u0005m\u0000\u000056\u0005o\u0000"+
		"\u000067\u0005t\u0000\u000078\u0005o\u0000\u000089\u0005r\u0000\u0000"+
		"9\u0006\u0001\u0000\u0000\u0000:;\u0005a\u0000\u0000;<\u0005p\u0000\u0000"+
		"<=\u0005a\u0000\u0000=>\u0005g\u0000\u0000>?\u0005a\u0000\u0000?@\u0005"+
		"r\u0000\u0000@A\u0005_\u0000\u0000AB\u0005m\u0000\u0000BC\u0005o\u0000"+
		"\u0000CD\u0005t\u0000\u0000DE\u0005o\u0000\u0000EF\u0005r\u0000\u0000"+
		"F\b\u0001\u0000\u0000\u0000GH\u0005g\u0000\u0000HI\u0005i\u0000\u0000"+
		"IJ\u0005r\u0000\u0000JK\u0005a\u0000\u0000KL\u0005r\u0000\u0000L\n\u0001"+
		"\u0000\u0000\u0000MN\u0005e\u0000\u0000NO\u0005l\u0000\u0000OP\u0005e"+
		"\u0000\u0000PQ\u0005v\u0000\u0000QR\u0005a\u0000\u0000RS\u0005r\u0000"+
		"\u0000ST\u0005s\u0000\u0000TU\u0005e\u0000\u0000U\f\u0001\u0000\u0000"+
		"\u0000VW\u0005b\u0000\u0000WX\u0005a\u0000\u0000XY\u0005j\u0000\u0000"+
		"YZ\u0005a\u0000\u0000Z[\u0005r\u0000\u0000[\u000e\u0001\u0000\u0000\u0000"+
		"\\]\u0005r\u0000\u0000]^\u0005o\u0000\u0000^_\u0005t\u0000\u0000_`\u0005"+
		"a\u0000\u0000`a\u0005r\u0000\u0000a\u0010\u0001\u0000\u0000\u0000bc\u0005"+
		"r\u0000\u0000cd\u0005e\u0000\u0000de\u0005g\u0000\u0000ef\u0005r\u0000"+
		"\u0000fg\u0005e\u0000\u0000gh\u0005s\u0000\u0000hi\u0005a\u0000\u0000"+
		"ij\u0005r\u0000\u0000jk\u0005_\u0000\u0000kl\u0005b\u0000\u0000lm\u0005"+
		"a\u0000\u0000mn\u0005s\u0000\u0000no\u0005e\u0000\u0000o\u0012\u0001\u0000"+
		"\u0000\u0000pq\u0005d\u0000\u0000qr\u0005e\u0000\u0000rs\u0005r\u0000"+
		"\u0000st\u0005e\u0000\u0000tu\u0005c\u0000\u0000uv\u0005h\u0000\u0000"+
		"vw\u0005a\u0000\u0000w\u0014\u0001\u0000\u0000\u0000xy\u0005i\u0000\u0000"+
		"yz\u0005z\u0000\u0000z{\u0005q\u0000\u0000{|\u0005u\u0000\u0000|}\u0005"+
		"i\u0000\u0000}~\u0005e\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f\u0080"+
		"\u0005d\u0000\u0000\u0080\u0081\u0005a\u0000\u0000\u0081\u0016\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0084\u0005d\u0000\u0000"+
		"\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005l\u0000\u0000\u0086\u0087"+
		"\u0005a\u0000\u0000\u0087\u0088\u0005n\u0000\u0000\u0088\u0089\u0005t"+
		"\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u0018\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005a\u0000\u0000\u008c\u008d\u0005t\u0000\u0000\u008d"+
		"\u008e\u0005r\u0000\u0000\u008e\u008f\u0005a\u0000\u0000\u008f\u0090\u0005"+
		"s\u0000\u0000\u0090\u001a\u0001\u0000\u0000\u0000\u0091\u0093\u0007\u0000"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u009c\u0001\u0000\u0000\u0000\u0096\u0098\u0005.\u0000"+
		"\u0000\u0097\u0099\u0007\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u001c\u0001\u0000\u0000\u0000\u009e\u00a0\u0007\u0001\u0000"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\u000e\u0000"+
		"\u0000\u00a4\u001e\u0001\u0000\u0000\u0000\u0005\u0000\u0094\u009a\u009c"+
		"\u00a1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}