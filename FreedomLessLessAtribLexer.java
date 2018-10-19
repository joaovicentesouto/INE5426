// Generated from FreedomLessLessAtrib.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FreedomLessLessAtribLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT_T=2, UNSIGNED_T=3, FLOAT_T=4, DOUBLE_T=5, SHORT_T=6, CHAR_T=7, 
		BOOL_T=8, VOID_T=9, IMPORT=10, CLASS=11, PUBLIC=12, PRIVATE=13, MAIN=14, 
		IF=15, ELSE=16, FOR=17, WHILE=18, SWITCH=19, CASE=20, BREAK=21, CONTINUE=22, 
		DEFAULT=23, RETURN=24, NEW=25, FREE=26, MALLOC=27, DELETE=28, SIZEOF=29, 
		ASSIGN=30, PLUS=31, MINUS=32, MULT=33, DIV=34, REF=35, ARROW=36, INCREM=37, 
		DECREM=38, AUTOPLUS=39, AUTOMINUS=40, AUTOMULT=41, AUTODIV=42, LESS=43, 
		BIGGER=44, LESS_EQ=45, BIGGER_EQ=46, EQUALS=47, NOT_EQUALS=48, AND=49, 
		OR=50, OPEN_PAR=51, CLOSE_PAR=52, OPEN_KEY=53, CLOSE_KEY=54, OPEN_BRAK=55, 
		CLOSE_BRAK=56, COMMA=57, SEMICOLON=58, TWOPOINTS=59, NULL=60, INT=61, 
		INTEGER=62, BOOLEAN=63, STRING=64, CHAR=65, FLOATING=66, ID=67, COMMENT=68, 
		WS=69, LINE_COMMENT=70;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "INT_T", "UNSIGNED_T", "FLOAT_T", "DOUBLE_T", "SHORT_T", "CHAR_T", 
		"BOOL_T", "VOID_T", "IMPORT", "CLASS", "PUBLIC", "PRIVATE", "MAIN", "IF", 
		"ELSE", "FOR", "WHILE", "SWITCH", "CASE", "BREAK", "CONTINUE", "DEFAULT", 
		"RETURN", "NEW", "FREE", "MALLOC", "DELETE", "SIZEOF", "ASSIGN", "PLUS", 
		"MINUS", "MULT", "DIV", "REF", "ARROW", "INCREM", "DECREM", "AUTOPLUS", 
		"AUTOMINUS", "AUTOMULT", "AUTODIV", "LESS", "BIGGER", "LESS_EQ", "BIGGER_EQ", 
		"EQUALS", "NOT_EQUALS", "AND", "OR", "OPEN_PAR", "CLOSE_PAR", "OPEN_KEY", 
		"CLOSE_KEY", "OPEN_BRAK", "CLOSE_BRAK", "COMMA", "SEMICOLON", "TWOPOINTS", 
		"NULL", "INT", "INTEGER", "BOOLEAN", "STRING", "CHAR", "FLOATING", "ID", 
		"COMMENT", "WS", "LINE_COMMENT", "NUMBER", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'int'", "'unsigned'", "'float'", "'double'", "'short'", 
		"'char'", "'bool'", "'void'", "'import'", "'class'", null, null, "'main'", 
		"'if'", "'else'", "'for'", "'while'", "'switch'", "'case'", "'break'", 
		"'continue'", "'default'", "'return'", "'new'", "'free'", "'malloc'", 
		"'delete'", "'sizeof'", "'='", "'+'", "'-'", "'*'", "'/'", "'&'", "'->'", 
		"'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'&&'", "'||'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "','", "';'", "':'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "INT_T", "UNSIGNED_T", "FLOAT_T", "DOUBLE_T", "SHORT_T", "CHAR_T", 
		"BOOL_T", "VOID_T", "IMPORT", "CLASS", "PUBLIC", "PRIVATE", "MAIN", "IF", 
		"ELSE", "FOR", "WHILE", "SWITCH", "CASE", "BREAK", "CONTINUE", "DEFAULT", 
		"RETURN", "NEW", "FREE", "MALLOC", "DELETE", "SIZEOF", "ASSIGN", "PLUS", 
		"MINUS", "MULT", "DIV", "REF", "ARROW", "INCREM", "DECREM", "AUTOPLUS", 
		"AUTOMINUS", "AUTOMULT", "AUTODIV", "LESS", "BIGGER", "LESS_EQ", "BIGGER_EQ", 
		"EQUALS", "NOT_EQUALS", "AND", "OR", "OPEN_PAR", "CLOSE_PAR", "OPEN_KEY", 
		"CLOSE_KEY", "OPEN_BRAK", "CLOSE_BRAK", "COMMA", "SEMICOLON", "TWOPOINTS", 
		"NULL", "INT", "INTEGER", "BOOLEAN", "STRING", "CHAR", "FLOATING", "ID", 
		"COMMENT", "WS", "LINE_COMMENT"
	};
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


	public FreedomLessLessAtribLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FreedomLessLessAtrib.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u01e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3=\3>\6>\u0193\n"+
		">\r>\16>\u0194\3?\5?\u0198\n?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u01a5"+
		"\n@\3A\3A\7A\u01a9\nA\fA\16A\u01ac\13A\3A\3A\3B\3B\3B\3B\3C\5C\u01b5\n"+
		"C\3C\3C\3C\3D\3D\7D\u01bc\nD\fD\16D\u01bf\13D\3E\3E\3E\3E\7E\u01c5\nE"+
		"\fE\16E\u01c8\13E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\7G\u01d7\nG\f"+
		"G\16G\u01da\13G\3G\5G\u01dd\nG\3G\3G\3G\3G\3H\3H\3I\3I\3I\3\u01c6\2J\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"\2\u0091\2\3\2\t\3\2$$\3\2))\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\7\2ddhhppttvv\2\u01ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u0093\3\2\2\2\5\u0095"+
		"\3\2\2\2\7\u0099\3\2\2\2\t\u00a2\3\2\2\2\13\u00a8\3\2\2\2\r\u00af\3\2"+
		"\2\2\17\u00b5\3\2\2\2\21\u00ba\3\2\2\2\23\u00bf\3\2\2\2\25\u00c4\3\2\2"+
		"\2\27\u00cb\3\2\2\2\31\u00d1\3\2\2\2\33\u00da\3\2\2\2\35\u00e4\3\2\2\2"+
		"\37\u00e9\3\2\2\2!\u00ec\3\2\2\2#\u00f1\3\2\2\2%\u00f5\3\2\2\2\'\u00fb"+
		"\3\2\2\2)\u0102\3\2\2\2+\u0107\3\2\2\2-\u010d\3\2\2\2/\u0116\3\2\2\2\61"+
		"\u011e\3\2\2\2\63\u0125\3\2\2\2\65\u0129\3\2\2\2\67\u012e\3\2\2\29\u0135"+
		"\3\2\2\2;\u013c\3\2\2\2=\u0143\3\2\2\2?\u0145\3\2\2\2A\u0147\3\2\2\2C"+
		"\u0149\3\2\2\2E\u014b\3\2\2\2G\u014d\3\2\2\2I\u014f\3\2\2\2K\u0152\3\2"+
		"\2\2M\u0155\3\2\2\2O\u0158\3\2\2\2Q\u015b\3\2\2\2S\u015e\3\2\2\2U\u0161"+
		"\3\2\2\2W\u0164\3\2\2\2Y\u0166\3\2\2\2[\u0168\3\2\2\2]\u016b\3\2\2\2_"+
		"\u016e\3\2\2\2a\u0171\3\2\2\2c\u0174\3\2\2\2e\u0177\3\2\2\2g\u017a\3\2"+
		"\2\2i\u017c\3\2\2\2k\u017e\3\2\2\2m\u0180\3\2\2\2o\u0182\3\2\2\2q\u0184"+
		"\3\2\2\2s\u0186\3\2\2\2u\u0188\3\2\2\2w\u018a\3\2\2\2y\u018c\3\2\2\2{"+
		"\u0192\3\2\2\2}\u0197\3\2\2\2\177\u01a4\3\2\2\2\u0081\u01a6\3\2\2\2\u0083"+
		"\u01af\3\2\2\2\u0085\u01b4\3\2\2\2\u0087\u01b9\3\2\2\2\u0089\u01c0\3\2"+
		"\2\2\u008b\u01ce\3\2\2\2\u008d\u01d2\3\2\2\2\u008f\u01e2\3\2\2\2\u0091"+
		"\u01e4\3\2\2\2\u0093\u0094\7\60\2\2\u0094\4\3\2\2\2\u0095\u0096\7k\2\2"+
		"\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098\6\3\2\2\2\u0099\u009a\7w"+
		"\2\2\u009a\u009b\7p\2\2\u009b\u009c\7u\2\2\u009c\u009d\7k\2\2\u009d\u009e"+
		"\7i\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7f\2\2\u00a1"+
		"\b\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7\n\3\2\2\2\u00a8\u00a9\7f\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7n\2\2"+
		"\u00ad\u00ae\7g\2\2\u00ae\f\3\2\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7j"+
		"\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7v\2\2\u00b4\16"+
		"\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7j\2\2\u00b7\u00b8\7c\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\20\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7n\2\2\u00be\22\3\2\2\2\u00bf\u00c0\7x\2\2\u00c0"+
		"\u00c1\7q\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7f\2\2\u00c3\24\3\2\2\2\u00c4"+
		"\u00c5\7k\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7q\2\2"+
		"\u00c8\u00c9\7t\2\2\u00c9\u00ca\7v\2\2\u00ca\26\3\2\2\2\u00cb\u00cc\7"+
		"e\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0"+
		"\7u\2\2\u00d0\30\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4"+
		"\7d\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7e\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\5w<\2\u00d9\32\3\2\2\2\u00da\u00db\7r\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7x\2\2\u00de\u00df\7c\2\2"+
		"\u00df\u00e0\7v\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\5w<\2\u00e3\34\3\2\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\36\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb"+
		"\7h\2\2\u00eb \3\2\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef"+
		"\7u\2\2\u00ef\u00f0\7g\2\2\u00f0\"\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3"+
		"\7q\2\2\u00f3\u00f4\7t\2\2\u00f4$\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7"+
		"\7j\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"&\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7y\2\2\u00fd\u00fe\7k\2\2\u00fe"+
		"\u00ff\7v\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7j\2\2\u0101(\3\2\2\2\u0102"+
		"\u0103\7e\2\2\u0103\u0104\7c\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2"+
		"\u0106*\3\2\2\2\u0107\u0108\7d\2\2\u0108\u0109\7t\2\2\u0109\u010a\7g\2"+
		"\2\u010a\u010b\7c\2\2\u010b\u010c\7m\2\2\u010c,\3\2\2\2\u010d\u010e\7"+
		"e\2\2\u010e\u010f\7q\2\2\u010f\u0110\7p\2\2\u0110\u0111\7v\2\2\u0111\u0112"+
		"\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7w\2\2\u0114\u0115\7g\2\2\u0115"+
		".\3\2\2\2\u0116\u0117\7f\2\2\u0117\u0118\7g\2\2\u0118\u0119\7h\2\2\u0119"+
		"\u011a\7c\2\2\u011a\u011b\7w\2\2\u011b\u011c\7n\2\2\u011c\u011d\7v\2\2"+
		"\u011d\60\3\2\2\2\u011e\u011f\7t\2\2\u011f\u0120\7g\2\2\u0120\u0121\7"+
		"v\2\2\u0121\u0122\7w\2\2\u0122\u0123\7t\2\2\u0123\u0124\7p\2\2\u0124\62"+
		"\3\2\2\2\u0125\u0126\7p\2\2\u0126\u0127\7g\2\2\u0127\u0128\7y\2\2\u0128"+
		"\64\3\2\2\2\u0129\u012a\7h\2\2\u012a\u012b\7t\2\2\u012b\u012c\7g\2\2\u012c"+
		"\u012d\7g\2\2\u012d\66\3\2\2\2\u012e\u012f\7o\2\2\u012f\u0130\7c\2\2\u0130"+
		"\u0131\7n\2\2\u0131\u0132\7n\2\2\u0132\u0133\7q\2\2\u0133\u0134\7e\2\2"+
		"\u01348\3\2\2\2\u0135\u0136\7f\2\2\u0136\u0137\7g\2\2\u0137\u0138\7n\2"+
		"\2\u0138\u0139\7g\2\2\u0139\u013a\7v\2\2\u013a\u013b\7g\2\2\u013b:\3\2"+
		"\2\2\u013c\u013d\7u\2\2\u013d\u013e\7k\2\2\u013e\u013f\7|\2\2\u013f\u0140"+
		"\7g\2\2\u0140\u0141\7q\2\2\u0141\u0142\7h\2\2\u0142<\3\2\2\2\u0143\u0144"+
		"\7?\2\2\u0144>\3\2\2\2\u0145\u0146\7-\2\2\u0146@\3\2\2\2\u0147\u0148\7"+
		"/\2\2\u0148B\3\2\2\2\u0149\u014a\7,\2\2\u014aD\3\2\2\2\u014b\u014c\7\61"+
		"\2\2\u014cF\3\2\2\2\u014d\u014e\7(\2\2\u014eH\3\2\2\2\u014f\u0150\7/\2"+
		"\2\u0150\u0151\7@\2\2\u0151J\3\2\2\2\u0152\u0153\7-\2\2\u0153\u0154\7"+
		"-\2\2\u0154L\3\2\2\2\u0155\u0156\7/\2\2\u0156\u0157\7/\2\2\u0157N\3\2"+
		"\2\2\u0158\u0159\7-\2\2\u0159\u015a\7?\2\2\u015aP\3\2\2\2\u015b\u015c"+
		"\7/\2\2\u015c\u015d\7?\2\2\u015dR\3\2\2\2\u015e\u015f\7,\2\2\u015f\u0160"+
		"\7?\2\2\u0160T\3\2\2\2\u0161\u0162\7\61\2\2\u0162\u0163\7?\2\2\u0163V"+
		"\3\2\2\2\u0164\u0165\7>\2\2\u0165X\3\2\2\2\u0166\u0167\7@\2\2\u0167Z\3"+
		"\2\2\2\u0168\u0169\7>\2\2\u0169\u016a\7?\2\2\u016a\\\3\2\2\2\u016b\u016c"+
		"\7@\2\2\u016c\u016d\7?\2\2\u016d^\3\2\2\2\u016e\u016f\7?\2\2\u016f\u0170"+
		"\7?\2\2\u0170`\3\2\2\2\u0171\u0172\7#\2\2\u0172\u0173\7?\2\2\u0173b\3"+
		"\2\2\2\u0174\u0175\7(\2\2\u0175\u0176\7(\2\2\u0176d\3\2\2\2\u0177\u0178"+
		"\7~\2\2\u0178\u0179\7~\2\2\u0179f\3\2\2\2\u017a\u017b\7*\2\2\u017bh\3"+
		"\2\2\2\u017c\u017d\7+\2\2\u017dj\3\2\2\2\u017e\u017f\7}\2\2\u017fl\3\2"+
		"\2\2\u0180\u0181\7\177\2\2\u0181n\3\2\2\2\u0182\u0183\7]\2\2\u0183p\3"+
		"\2\2\2\u0184\u0185\7_\2\2\u0185r\3\2\2\2\u0186\u0187\7.\2\2\u0187t\3\2"+
		"\2\2\u0188\u0189\7=\2\2\u0189v\3\2\2\2\u018a\u018b\7<\2\2\u018bx\3\2\2"+
		"\2\u018c\u018d\7p\2\2\u018d\u018e\7w\2\2\u018e\u018f\7n\2\2\u018f\u0190"+
		"\7n\2\2\u0190z\3\2\2\2\u0191\u0193\5\u008fH\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195|\3\2\2\2"+
		"\u0196\u0198\7/\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019a\5{>\2\u019a~\3\2\2\2\u019b\u019c\7v\2\2\u019c\u019d"+
		"\7t\2\2\u019d\u019e\7w\2\2\u019e\u01a5\7g\2\2\u019f\u01a0\7h\2\2\u01a0"+
		"\u01a1\7c\2\2\u01a1\u01a2\7n\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a5\7g\2\2"+
		"\u01a4\u019b\3\2\2\2\u01a4\u019f\3\2\2\2\u01a5\u0080\3\2\2\2\u01a6\u01aa"+
		"\7$\2\2\u01a7\u01a9\n\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ad\u01ae\7$\2\2\u01ae\u0082\3\2\2\2\u01af\u01b0\7)\2\2\u01b0\u01b1"+
		"\n\3\2\2\u01b1\u01b2\7)\2\2\u01b2\u0084\3\2\2\2\u01b3\u01b5\5}?\2\u01b4"+
		"\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\60"+
		"\2\2\u01b7\u01b8\5{>\2\u01b8\u0086\3\2\2\2\u01b9\u01bd\t\4\2\2\u01ba\u01bc"+
		"\t\5\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u0088\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7\61"+
		"\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c6\3\2\2\2\u01c3\u01c5\13\2\2\2\u01c4"+
		"\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7,\2\2\u01ca"+
		"\u01cb\7\61\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\bE\2\2\u01cd\u008a\3\2"+
		"\2\2\u01ce\u01cf\t\6\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\bF\2\2\u01d1"+
		"\u008c\3\2\2\2\u01d2\u01d3\7\61\2\2\u01d3\u01d4\7\61\2\2\u01d4\u01d8\3"+
		"\2\2\2\u01d5\u01d7\n\7\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01db\u01dd\7\17\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\7\f\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\bG"+
		"\2\2\u01e1\u008e\3\2\2\2\u01e2\u01e3\4\62;\2\u01e3\u0090\3\2\2\2\u01e4"+
		"\u01e5\7^\2\2\u01e5\u01e6\t\b\2\2\u01e6\u0092\3\2\2\2\f\2\u0194\u0197"+
		"\u01a4\u01aa\u01b4\u01bd\u01c6\u01d8\u01dc\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}