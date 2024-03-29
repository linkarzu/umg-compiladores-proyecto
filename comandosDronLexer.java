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
		ENCENDER_MOTOR=1, APAGAR_MOTOR=2, GIRAR=3, ELEVARSE=4, BAJAR=5, ROTAR=6, 
		REGRESAR_BASE=7, DERECHA=8, IZQUIERDA=9, ADELANTE=10, ATRAS=11, NUMERO=12, 
		WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENCENDER_MOTOR", "APAGAR_MOTOR", "GIRAR", "ELEVARSE", "BAJAR", "ROTAR", 
			"REGRESAR_BASE", "DERECHA", "IZQUIERDA", "ADELANTE", "ATRAS", "NUMERO", 
			"WS"
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
		"\u0004\u0000\r\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000b\u0083\b\u000b\u000b\u000b\f\u000b\u0084\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u0089\b\u000b\u000b\u000b\f\u000b\u008a"+
		"\u0003\u000b\u008d\b\u000b\u0001\f\u0004\f\u0090\b\f\u000b\f\f\f\u0091"+
		"\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u0001\u0000\u0002\u0001\u000009\u0003\u0000\t\n\r\r "+
		" \u0098\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003"+
		"*\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000\u0007=\u0001"+
		"\u0000\u0000\u0000\tF\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000"+
		"\u0000\rR\u0001\u0000\u0000\u0000\u000f`\u0001\u0000\u0000\u0000\u0011"+
		"h\u0001\u0000\u0000\u0000\u0013r\u0001\u0000\u0000\u0000\u0015{\u0001"+
		"\u0000\u0000\u0000\u0017\u0082\u0001\u0000\u0000\u0000\u0019\u008f\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005E\u0000\u0000\u001c\u001d\u0005N\u0000"+
		"\u0000\u001d\u001e\u0005C\u0000\u0000\u001e\u001f\u0005E\u0000\u0000\u001f"+
		" \u0005N\u0000\u0000 !\u0005D\u0000\u0000!\"\u0005E\u0000\u0000\"#\u0005"+
		"R\u0000\u0000#$\u0005_\u0000\u0000$%\u0005M\u0000\u0000%&\u0005O\u0000"+
		"\u0000&\'\u0005T\u0000\u0000\'(\u0005O\u0000\u0000()\u0005R\u0000\u0000"+
		")\u0002\u0001\u0000\u0000\u0000*+\u0005A\u0000\u0000+,\u0005P\u0000\u0000"+
		",-\u0005A\u0000\u0000-.\u0005G\u0000\u0000./\u0005A\u0000\u0000/0\u0005"+
		"R\u0000\u000001\u0005_\u0000\u000012\u0005M\u0000\u000023\u0005O\u0000"+
		"\u000034\u0005T\u0000\u000045\u0005O\u0000\u000056\u0005R\u0000\u0000"+
		"6\u0004\u0001\u0000\u0000\u000078\u0005G\u0000\u000089\u0005I\u0000\u0000"+
		"9:\u0005R\u0000\u0000:;\u0005A\u0000\u0000;<\u0005R\u0000\u0000<\u0006"+
		"\u0001\u0000\u0000\u0000=>\u0005E\u0000\u0000>?\u0005L\u0000\u0000?@\u0005"+
		"E\u0000\u0000@A\u0005V\u0000\u0000AB\u0005A\u0000\u0000BC\u0005R\u0000"+
		"\u0000CD\u0005S\u0000\u0000DE\u0005E\u0000\u0000E\b\u0001\u0000\u0000"+
		"\u0000FG\u0005B\u0000\u0000GH\u0005A\u0000\u0000HI\u0005J\u0000\u0000"+
		"IJ\u0005A\u0000\u0000JK\u0005R\u0000\u0000K\n\u0001\u0000\u0000\u0000"+
		"LM\u0005R\u0000\u0000MN\u0005O\u0000\u0000NO\u0005T\u0000\u0000OP\u0005"+
		"A\u0000\u0000PQ\u0005R\u0000\u0000Q\f\u0001\u0000\u0000\u0000RS\u0005"+
		"R\u0000\u0000ST\u0005E\u0000\u0000TU\u0005G\u0000\u0000UV\u0005R\u0000"+
		"\u0000VW\u0005E\u0000\u0000WX\u0005S\u0000\u0000XY\u0005A\u0000\u0000"+
		"YZ\u0005R\u0000\u0000Z[\u0005_\u0000\u0000[\\\u0005B\u0000\u0000\\]\u0005"+
		"A\u0000\u0000]^\u0005S\u0000\u0000^_\u0005E\u0000\u0000_\u000e\u0001\u0000"+
		"\u0000\u0000`a\u0005D\u0000\u0000ab\u0005E\u0000\u0000bc\u0005R\u0000"+
		"\u0000cd\u0005E\u0000\u0000de\u0005C\u0000\u0000ef\u0005H\u0000\u0000"+
		"fg\u0005A\u0000\u0000g\u0010\u0001\u0000\u0000\u0000hi\u0005I\u0000\u0000"+
		"ij\u0005Z\u0000\u0000jk\u0005Q\u0000\u0000kl\u0005U\u0000\u0000lm\u0005"+
		"I\u0000\u0000mn\u0005E\u0000\u0000no\u0005R\u0000\u0000op\u0005D\u0000"+
		"\u0000pq\u0005A\u0000\u0000q\u0012\u0001\u0000\u0000\u0000rs\u0005A\u0000"+
		"\u0000st\u0005D\u0000\u0000tu\u0005E\u0000\u0000uv\u0005L\u0000\u0000"+
		"vw\u0005A\u0000\u0000wx\u0005N\u0000\u0000xy\u0005T\u0000\u0000yz\u0005"+
		"E\u0000\u0000z\u0014\u0001\u0000\u0000\u0000{|\u0005A\u0000\u0000|}\u0005"+
		"T\u0000\u0000}~\u0005R\u0000\u0000~\u007f\u0005A\u0000\u0000\u007f\u0080"+
		"\u0005S\u0000\u0000\u0080\u0016\u0001\u0000\u0000\u0000\u0081\u0083\u0007"+
		"\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u008c\u0001\u0000\u0000\u0000\u0086\u0088\u0005"+
		".\u0000\u0000\u0087\u0089\u0007\u0000\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000"+
		"\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u0018\u0001\u0000\u0000\u0000\u008e\u0090\u0007\u0001"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0006\f\u0000"+
		"\u0000\u0094\u001a\u0001\u0000\u0000\u0000\u0005\u0000\u0084\u008a\u008c"+
		"\u0091\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}