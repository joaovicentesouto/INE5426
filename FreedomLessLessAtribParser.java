// Generated from FreedomLessLessAtrib.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class SymbolEntry
{
	public String _type; //! func, attr, class
	public String _id;

	public String _class_scope;
	public String _function_scope;
	
	public String _permission;

	public String[] _features;

	public boolean _valid;
};

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FreedomLessLessAtribParser extends Parser {

	private static SymbolEntry[] _symbolTable;

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
	public static final int
		RULE_program_def = 0, RULE_import_def = 1, RULE_class_def = 2, RULE_class_members_def = 3, 
		RULE_public_def = 4, RULE_private_def = 5, RULE_class_scope_def = 6, RULE_attribute_def = 7, 
		RULE_valued_expression_def = 8, RULE_operation = 9, RULE_function_call_def = 10, 
		RULE_argument_def = 11, RULE_function_def = 12, RULE_param_def = 13, RULE_block_def = 14, 
		RULE_valueless_expression_def = 15, RULE_struct_def = 16, RULE_if_def = 17, 
		RULE_for_def = 18, RULE_valued_attribute_def = 19, RULE_while_def = 20, 
		RULE_switch_def = 21, RULE_switch_case_def = 22, RULE_switch_default_def = 23, 
		RULE_main_def = 24, RULE_type_def = 25, RULE_value_def = 26, RULE_logical_op = 27, 
		RULE_arithmetic_op = 28, RULE_auto_assign_op = 29, RULE_auto_increm_op = 30;
	public static final String[] ruleNames = {
		"program_def", "import_def", "class_def", "class_members_def", "public_def", 
		"private_def", "class_scope_def", "attribute_def", "valued_expression_def", 
		"operation", "function_call_def", "argument_def", "function_def", "param_def", 
		"block_def", "valueless_expression_def", "struct_def", "if_def", "for_def", 
		"valued_attribute_def", "while_def", "switch_def", "switch_case_def", 
		"switch_default_def", "main_def", "type_def", "value_def", "logical_op", 
		"arithmetic_op", "auto_assign_op", "auto_increm_op"
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

	public static String[] SymbolsTable

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
	public String getGrammarFileName() { return "FreedomLessLessAtrib.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FreedomLessLessAtribParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Program_defContext extends ParserRuleContext {
		public Import_defContext import_def() {
			return getRuleContext(Import_defContext.class,0);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public Main_defContext main_def() {
			return getRuleContext(Main_defContext.class,0);
		}
		public Program_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterProgram_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitProgram_def(this);
		}
	}

	public final Program_defContext program_def() throws RecognitionException {
		Program_defContext _localctx = new Program_defContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(62);
				import_def();
				}
			}

			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					class_def();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					function_def();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOID_T) {
				{
				setState(77);
				main_def();
				}
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

	public static class Import_defContext extends ParserRuleContext {
		public List<TerminalNode> IMPORT() { return getTokens(FreedomLessLessAtribParser.IMPORT); }
		public TerminalNode IMPORT(int i) {
			return getToken(FreedomLessLessAtribParser.IMPORT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(FreedomLessLessAtribParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(FreedomLessLessAtribParser.STRING, i);
		}
		public Import_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterImport_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitImport_def(this);
		}
	}

	public final Import_defContext import_def() throws RecognitionException {
		Import_defContext _localctx = new Import_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(IMPORT);
				setState(81);
				match(STRING);
				setState(82);
				if (!(still_not_imported(STRING.val))) throw new FailedPredicateException(this, "still_not_imported(STRING.val)");
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FreedomLessLessAtribParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessAtribParser.ID, 0); }
		public TerminalNode OPEN_KEY() { return getToken(FreedomLessLessAtribParser.OPEN_KEY, 0); }
		public Class_members_defContext class_members_def() {
			return getRuleContext(Class_members_defContext.class,0);
		}
		public TerminalNode CLOSE_KEY() { return getToken(FreedomLessLessAtribParser.CLOSE_KEY, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(CLASS);
			setState(88);
			match(ID);
			setState(89);
			match(OPEN_KEY);
			setState(90);
			class_members_def();
			setState(91);
			match(CLOSE_KEY);
			setState(92);
			if (!(class_free_name(ID))) throw new FailedPredicateException(this, "class_free_name(ID)");
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

	public static class Class_members_defContext extends ParserRuleContext {
		public Private_defContext private_def() {
			return getRuleContext(Private_defContext.class,0);
		}
		public Public_defContext public_def() {
			return getRuleContext(Public_defContext.class,0);
		}
		public Class_members_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_members_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterClass_members_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitClass_members_def(this);
		}
	}

	public final Class_members_defContext class_members_def() throws RecognitionException {
		Class_members_defContext _localctx = new Class_members_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_members_def);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				private_def();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				public_def();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(96);
					private_def();
					}
				}

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

	public static class Public_defContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(FreedomLessLessAtribParser.PUBLIC, 0); }
		public Class_scope_defContext class_scope_def() {
			return getRuleContext(Class_scope_defContext.class,0);
		}
		public Public_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_public_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterPublic_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitPublic_def(this);
		}
	}

	public final Public_defContext public_def() throws RecognitionException {
		Public_defContext _localctx = new Public_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_public_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PUBLIC);
			setState(102);
			class_scope_def();
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

	public static class Private_defContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(FreedomLessLessAtribParser.PRIVATE, 0); }
		public Class_scope_defContext class_scope_def() {
			return getRuleContext(Class_scope_defContext.class,0);
		}
		public Private_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_private_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterPrivate_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitPrivate_def(this);
		}
	}

	public final Private_defContext private_def() throws RecognitionException {
		Private_defContext _localctx = new Private_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_private_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(PRIVATE);
			setState(105);
			class_scope_def();
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

	public static class Class_scope_defContext extends ParserRuleContext {
		public List<Attribute_defContext> attribute_def() {
			return getRuleContexts(Attribute_defContext.class);
		}
		public Attribute_defContext attribute_def(int i) {
			return getRuleContext(Attribute_defContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessAtribParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessAtribParser.SEMICOLON, i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public Class_scope_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_scope_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterClass_scope_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitClass_scope_def(this);
		}
	}

	public final Class_scope_defContext class_scope_def() throws RecognitionException {
		Class_scope_defContext _localctx = new Class_scope_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_scope_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			class_scope_def.scope = father.scope
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					attribute_def();
					setState(109);
					match(SEMICOLON);
					attribute_def.scope = class_scope_def.scope
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << UNSIGNED_T) | (1L << FLOAT_T) | (1L << DOUBLE_T) | (1L << SHORT_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << VOID_T) | (1L << CLASS))) != 0)) {
				{
				{
				setState(117);
				function_def();
				function_def.scope = class_scope_def.scope
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Attribute_defContext extends ParserRuleContext {
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(FreedomLessLessAtribParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FreedomLessLessAtribParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FreedomLessLessAtribParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FreedomLessLessAtribParser.ASSIGN, i);
		}
		public List<Valued_expression_defContext> valued_expression_def() {
			return getRuleContexts(Valued_expression_defContext.class);
		}
		public Valued_expression_defContext valued_expression_def(int i) {
			return getRuleContext(Valued_expression_defContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FreedomLessLessAtribParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FreedomLessLessAtribParser.COMMA, i);
		}
		public List<TerminalNode> OPEN_BRAK() { return getTokens(FreedomLessLessAtribParser.OPEN_BRAK); }
		public TerminalNode OPEN_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.OPEN_BRAK, i);
		}
		public List<TerminalNode> INT() { return getTokens(FreedomLessLessAtribParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FreedomLessLessAtribParser.INT, i);
		}
		public List<TerminalNode> CLOSE_BRAK() { return getTokens(FreedomLessLessAtribParser.CLOSE_BRAK); }
		public TerminalNode CLOSE_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.CLOSE_BRAK, i);
		}
		public List<TerminalNode> MULT() { return getTokens(FreedomLessLessAtribParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(FreedomLessLessAtribParser.MULT, i);
		}
		public Attribute_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterAttribute_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitAttribute_def(this);
		}
	}

	public final Attribute_defContext attribute_def() throws RecognitionException {
		Attribute_defContext _localctx = new Attribute_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute_def);
		int _la;
		try {
			int _alt;
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				type_def();
				setState(126);
				match(ID);
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(127);
					match(ASSIGN);
					setState(128);
					valued_expression_def();
					}
					break;
				}
				setState(131);
				if (!(scope_free_name(ID[0]) && type_def.type == valued_expression_def.type)) throw new FailedPredicateException(this, "scope_free_name(ID[0]) && type_def.type == valued_expression_def.type");
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(132);
					match(COMMA);
					setState(133);
					match(ID);
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(134);
						match(ASSIGN);
						setState(135);
						valued_expression_def();
						}
						break;
					}
					setState(138);
					if (!(scope_free_name(ID[1]) && type_def.type == valued_expression_def.type)) throw new FailedPredicateException(this, "scope_free_name(ID[1]) && type_def.type == valued_expression_def.type");
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				type_def();
				setState(145);
				match(ID);
				setState(149); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(146);
						match(OPEN_BRAK);
						setState(147);
						match(INT);
						setState(148);
						match(CLOSE_BRAK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(151); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(153);
					match(ASSIGN);
					setState(154);
					valued_expression_def();
					}
					break;
				}
				setState(157);
				if (!(scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "vector")) throw new FailedPredicateException(this, "scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == \"vector\"");
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					match(COMMA);
					setState(159);
					match(ID);
					setState(163); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(160);
							match(OPEN_BRAK);
							setState(161);
							match(INT);
							setState(162);
							match(CLOSE_BRAK);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(165); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(167);
						match(ASSIGN);
						setState(168);
						valued_expression_def();
						}
						break;
					}
					setState(171);
					if (!(scope_free_name(ID[1]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "vector")) throw new FailedPredicateException(this, "scope_free_name(ID[1]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == \"vector\"");
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				type_def();
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					match(MULT);
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MULT );
				setState(183);
				match(ID);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(184);
					match(ASSIGN);
					setState(185);
					valued_expression_def();
					}
					break;
				}
				setState(188);
				if (!(scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "pointers")) throw new FailedPredicateException(this, "scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == \"pointers\"");
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(189);
					match(COMMA);
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(190);
						match(MULT);
						}
						}
						setState(193); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==MULT );
					setState(195);
					match(ID);
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(196);
						match(ASSIGN);
						setState(197);
						valued_expression_def();
						}
						break;
					}
					setState(200);
					if (!(scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "pointers")) throw new FailedPredicateException(this, "scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == \"pointers\"");
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class Valued_expression_defContext extends ParserRuleContext {
		public Value_defContext value_def() {
			return getRuleContext(Value_defContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Function_call_defContext function_call_def() {
			return getRuleContext(Function_call_defContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessAtribParser.OPEN_PAR, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessAtribParser.CLOSE_PAR, 0); }
		public TerminalNode MULT() { return getToken(FreedomLessLessAtribParser.MULT, 0); }
		public TerminalNode REF() { return getToken(FreedomLessLessAtribParser.REF, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessAtribParser.ID, 0); }
		public Auto_increm_opContext auto_increm_op() {
			return getRuleContext(Auto_increm_opContext.class,0);
		}
		public List<TerminalNode> OPEN_BRAK() { return getTokens(FreedomLessLessAtribParser.OPEN_BRAK); }
		public TerminalNode OPEN_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.OPEN_BRAK, i);
		}
		public List<TerminalNode> INT() { return getTokens(FreedomLessLessAtribParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FreedomLessLessAtribParser.INT, i);
		}
		public List<TerminalNode> CLOSE_BRAK() { return getTokens(FreedomLessLessAtribParser.CLOSE_BRAK); }
		public TerminalNode CLOSE_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.CLOSE_BRAK, i);
		}
		public TerminalNode ASSIGN() { return getToken(FreedomLessLessAtribParser.ASSIGN, 0); }
		public Auto_assign_opContext auto_assign_op() {
			return getRuleContext(Auto_assign_opContext.class,0);
		}
		public Valued_expression_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valued_expression_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterValued_expression_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitValued_expression_def(this);
		}
	}

	public final Valued_expression_defContext valued_expression_def() throws RecognitionException {
		Valued_expression_defContext _localctx = new Valued_expression_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valued_expression_def);
		try {
			int _alt;
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				value_def();
				valued_expression_def.type = value_def.type
				setState(210);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				function_call_def();
				valued_expression_def.type = value_def.type
				setState(214);
				operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(216);
					match(MULT);
					valued_expression_def.type = "* "
					}
					break;
				case REF:
					{
					setState(218);
					match(REF);
					valued_expression_def.type = "& "
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222);
				match(OPEN_PAR);
				setState(223);
				valued_expression_def();
				setState(224);
				match(CLOSE_PAR);
				valued_expression_def.type += valued_expression_def[0].type
				setState(226);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(ID);
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					{
					setState(231);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSIGN:
						{
						setState(229);
						match(ASSIGN);
						}
						break;
					case AUTOPLUS:
					case AUTOMINUS:
					case AUTOMULT:
					case AUTODIV:
						{
						setState(230);
						auto_assign_op();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(233);
					if (!(exits(ID[0]) && )) throw new FailedPredicateException(this, "exits(ID[0]) && ");
					setState(234);
					valued_expression_def();
					}
					}
					break;
				case 2:
					{
					setState(235);
					auto_increm_op();
					setState(236);
					if (!(!is_class(ID[0]))) throw new FailedPredicateException(this, "!is_class(ID[0])");
					}
					break;
				case 3:
					{
					setState(241); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(238);
							match(OPEN_BRAK);
							setState(239);
							match(INT);
							setState(240);
							match(CLOSE_BRAK);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(243); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(245);
					if (!(!is_class(ID[0]))) throw new FailedPredicateException(this, "!is_class(ID[0])");
					}
					break;
				}
				setState(248);
				if (!(lookup(ID[0]) && INT[0].val >= 0)) throw new FailedPredicateException(this, "lookup(ID[0]) && INT[0].val >= 0");
				setState(249);
				operation();
				setState(250);
				if (!(operation == null || function_call_def.type == operation.type)) throw new FailedPredicateException(this, "operation == null || function_call_def.type == operation.type");
				valued_expression_def.type = function_call_def.type
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
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

	public static class OperationContext extends ParserRuleContext {
		public List<Valued_expression_defContext> valued_expression_def() {
			return getRuleContexts(Valued_expression_defContext.class);
		}
		public Valued_expression_defContext valued_expression_def(int i) {
			return getRuleContext(Valued_expression_defContext.class,i);
		}
		public List<Logical_opContext> logical_op() {
			return getRuleContexts(Logical_opContext.class);
		}
		public Logical_opContext logical_op(int i) {
			return getRuleContext(Logical_opContext.class,i);
		}
		public List<Arithmetic_opContext> arithmetic_op() {
			return getRuleContexts(Arithmetic_opContext.class);
		}
		public Arithmetic_opContext arithmetic_op(int i) {
			return getRuleContext(Arithmetic_opContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS:
					case BIGGER:
					case LESS_EQ:
					case BIGGER_EQ:
					case EQUALS:
					case NOT_EQUALS:
					case AND:
					case OR:
						{
						setState(256);
						logical_op();
						setState(257);
						if (!(operation.type == null || operation.type == "bool")) throw new FailedPredicateException(this, "operation.type == null || operation.type == \"bool\"");
						operation.type = "bool"
						}
						break;
					case PLUS:
					case MINUS:
					case MULT:
					case DIV:
						{
						setState(260);
						arithmetic_op();
						setState(261);
						if (!(operation.type == null || operation.type != "bool")) throw new FailedPredicateException(this, "operation.type == null || operation.type != \"bool\"");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(265);
					valued_expression_def();
					setState(266);
					if (!(operation.type == null || operation.type == valued_expression_def.type)) throw new FailedPredicateException(this, "operation.type == null || operation.type == valued_expression_def.type");
					operation.type = valued_expression_def.type
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Function_call_defContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(FreedomLessLessAtribParser.NEW, 0); }
		public List<TerminalNode> ID() { return getTokens(FreedomLessLessAtribParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FreedomLessLessAtribParser.ID, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(FreedomLessLessAtribParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(FreedomLessLessAtribParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(FreedomLessLessAtribParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(FreedomLessLessAtribParser.CLOSE_PAR, i);
		}
		public List<Argument_defContext> argument_def() {
			return getRuleContexts(Argument_defContext.class);
		}
		public Argument_defContext argument_def(int i) {
			return getRuleContext(Argument_defContext.class,i);
		}
		public TerminalNode DELETE() { return getToken(FreedomLessLessAtribParser.DELETE, 0); }
		public TerminalNode FREE() { return getToken(FreedomLessLessAtribParser.FREE, 0); }
		public TerminalNode MALLOC() { return getToken(FreedomLessLessAtribParser.MALLOC, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(FreedomLessLessAtribParser.SIZEOF, 0); }
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public List<TerminalNode> MULT() { return getTokens(FreedomLessLessAtribParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(FreedomLessLessAtribParser.MULT, i);
		}
		public List<TerminalNode> OPEN_BRAK() { return getTokens(FreedomLessLessAtribParser.OPEN_BRAK); }
		public TerminalNode OPEN_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.OPEN_BRAK, i);
		}
		public List<TerminalNode> INT() { return getTokens(FreedomLessLessAtribParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FreedomLessLessAtribParser.INT, i);
		}
		public List<TerminalNode> CLOSE_BRAK() { return getTokens(FreedomLessLessAtribParser.CLOSE_BRAK); }
		public TerminalNode CLOSE_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.CLOSE_BRAK, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(FreedomLessLessAtribParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(FreedomLessLessAtribParser.ARROW, i);
		}
		public Function_call_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterFunction_call_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitFunction_call_def(this);
		}
	}

	public final Function_call_defContext function_call_def() throws RecognitionException {
		Function_call_defContext _localctx = new Function_call_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call_def);
		int _la;
		try {
			int _alt;
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(NEW);
				setState(275);
				match(ID);
				setState(276);
				match(OPEN_PAR);
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(277);
					argument_def();
					}
					break;
				}
				setState(280);
				match(CLOSE_PAR);
				setState(281);
				if (!(exits(ID[0]) && is_class(ID[0]))) throw new FailedPredicateException(this, "exits(ID[0]) && is_class(ID[0])");
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(DELETE);
				setState(283);
				match(ID);
				setState(284);
				if (!(exits(ID[0]) && is_class(ID[0]))) throw new FailedPredicateException(this, "exits(ID[0]) && is_class(ID[0])");
				}
				break;
			case FREE:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(FREE);
				setState(286);
				match(OPEN_PAR);
				setState(287);
				match(ID);
				setState(288);
				match(CLOSE_PAR);
				setState(289);
				if (!(exits(ID[0]) && is_dynamic(ID))) throw new FailedPredicateException(this, "exits(ID[0]) && is_dynamic(ID)");
				}
				break;
			case MALLOC:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(MALLOC);
				setState(291);
				match(OPEN_PAR);
				setState(292);
				valued_expression_def();
				setState(293);
				match(CLOSE_PAR);
				setState(294);
				if (!(valued_expression_def.val >= 0)) throw new FailedPredicateException(this, "valued_expression_def.val >= 0");
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(SIZEOF);
				setState(297);
				match(OPEN_PAR);
				setState(298);
				type_def();
				setState(311);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(299);
						match(MULT);
						}
						}
						setState(302); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==MULT );
					}
					break;
				case OPEN_BRAK:
					{
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(304);
						match(OPEN_BRAK);
						setState(305);
						match(INT);
						setState(306);
						match(CLOSE_BRAK);
						}
						}
						setState(309); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==OPEN_BRAK );
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(313);
				match(CLOSE_PAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(315);
					match(ID);
					setState(316);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==ARROW) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(317);
					if (!(lookup(ID[0]) && is_class(ID[0]))) throw new FailedPredicateException(this, "lookup(ID[0]) && is_class(ID[0])");
					}
					break;
				}
				setState(320);
				match(ID);
				setState(321);
				match(OPEN_PAR);
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(322);
					argument_def();
					}
					break;
				}
				setState(325);
				match(CLOSE_PAR);
				setState(326);
				if (!(lookup(ID[1]) && (is_function(ID[1]) && argument_def.caracteristicas == func_caract(ID[1]))) throw new FailedPredicateException(this, "lookup(ID[1]) && (is_function(ID[1]) && argument_def.caracteristicas == func_caract(ID[1])");
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(327);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==ARROW) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(328);
						match(ID);
						setState(329);
						match(OPEN_PAR);
						setState(331);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(330);
							argument_def();
							}
							break;
						}
						setState(333);
						match(CLOSE_PAR);
						setState(334);
						if (!(lookup(ID[2]) && (is_function(ID[2]) && argument_def == func_arg(ID[2])))) throw new FailedPredicateException(this, "lookup(ID[2]) && (is_function(ID[2]) && argument_def == func_arg(ID[2]))");
						}
						} 
					}
					setState(339);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
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

	public static class Argument_defContext extends ParserRuleContext {
		public List<Valued_expression_defContext> valued_expression_def() {
			return getRuleContexts(Valued_expression_defContext.class);
		}
		public Valued_expression_defContext valued_expression_def(int i) {
			return getRuleContext(Valued_expression_defContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FreedomLessLessAtribParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FreedomLessLessAtribParser.COMMA, i);
		}
		public Argument_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterArgument_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitArgument_def(this);
		}
	}

	public final Argument_defContext argument_def() throws RecognitionException {
		Argument_defContext _localctx = new Argument_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			valued_expression_def();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(343);
				match(COMMA);
				setState(344);
				valued_expression_def();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Function_defContext extends ParserRuleContext {
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public TerminalNode ID() { return getToken(FreedomLessLessAtribParser.ID, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessAtribParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessAtribParser.CLOSE_PAR, 0); }
		public Block_defContext block_def() {
			return getRuleContext(Block_defContext.class,0);
		}
		public Param_defContext param_def() {
			return getRuleContext(Param_defContext.class,0);
		}
		public List<TerminalNode> MULT() { return getTokens(FreedomLessLessAtribParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(FreedomLessLessAtribParser.MULT, i);
		}
		public List<TerminalNode> OPEN_BRAK() { return getTokens(FreedomLessLessAtribParser.OPEN_BRAK); }
		public TerminalNode OPEN_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.OPEN_BRAK, i);
		}
		public List<TerminalNode> INT() { return getTokens(FreedomLessLessAtribParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FreedomLessLessAtribParser.INT, i);
		}
		public List<TerminalNode> CLOSE_BRAK() { return getTokens(FreedomLessLessAtribParser.CLOSE_BRAK); }
		public TerminalNode CLOSE_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.CLOSE_BRAK, i);
		}
		public TerminalNode VOID_T() { return getToken(FreedomLessLessAtribParser.VOID_T, 0); }
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_def);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
			case UNSIGNED_T:
			case FLOAT_T:
			case DOUBLE_T:
			case SHORT_T:
			case CHAR_T:
			case BOOL_T:
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				type_def();
				setState(363);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(352); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(351);
						match(MULT);
						}
						}
						setState(354); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==MULT );
					}
					break;
				case OPEN_BRAK:
					{
					setState(359); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(356);
						match(OPEN_BRAK);
						setState(357);
						match(INT);
						setState(358);
						match(CLOSE_BRAK);
						}
						}
						setState(361); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==OPEN_BRAK );
					}
					break;
				case ID:
					break;
				default:
					break;
				}
				setState(365);
				match(ID);
				setState(366);
				match(OPEN_PAR);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << UNSIGNED_T) | (1L << FLOAT_T) | (1L << DOUBLE_T) | (1L << SHORT_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << CLASS))) != 0)) {
					{
					setState(367);
					param_def();
					}
				}

				setState(370);
				match(CLOSE_PAR);
				setState(371);
				block_def();
				}
				break;
			case VOID_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(VOID_T);
				setState(374);
				match(ID);
				setState(375);
				match(OPEN_PAR);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << UNSIGNED_T) | (1L << FLOAT_T) | (1L << DOUBLE_T) | (1L << SHORT_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << CLASS))) != 0)) {
					{
					setState(376);
					param_def();
					}
				}

				setState(379);
				match(CLOSE_PAR);
				setState(380);
				block_def();
				setState(381);
				if (!(!exits(ID))) throw new FailedPredicateException(this, "!exits(ID)");
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

	public static class Param_defContext extends ParserRuleContext {
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public TerminalNode ID() { return getToken(FreedomLessLessAtribParser.ID, 0); }
		public List<TerminalNode> MULT() { return getTokens(FreedomLessLessAtribParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(FreedomLessLessAtribParser.MULT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FreedomLessLessAtribParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FreedomLessLessAtribParser.COMMA, i);
		}
		public List<Param_defContext> param_def() {
			return getRuleContexts(Param_defContext.class);
		}
		public Param_defContext param_def(int i) {
			return getRuleContext(Param_defContext.class,i);
		}
		public List<TerminalNode> OPEN_BRAK() { return getTokens(FreedomLessLessAtribParser.OPEN_BRAK); }
		public TerminalNode OPEN_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.OPEN_BRAK, i);
		}
		public List<TerminalNode> INT() { return getTokens(FreedomLessLessAtribParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FreedomLessLessAtribParser.INT, i);
		}
		public List<TerminalNode> CLOSE_BRAK() { return getTokens(FreedomLessLessAtribParser.CLOSE_BRAK); }
		public TerminalNode CLOSE_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.CLOSE_BRAK, i);
		}
		public Param_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterParam_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitParam_def(this);
		}
	}

	public final Param_defContext param_def() throws RecognitionException {
		Param_defContext _localctx = new Param_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_def);
		int _la;
		try {
			int _alt;
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				type_def();
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(386);
					match(MULT);
					}
					}
					setState(389); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MULT );
				setState(391);
				match(ID);
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(392);
						match(COMMA);
						setState(393);
						param_def();
						}
						} 
					}
					setState(398);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(399);
				if (!(no_exists(ID) && (is_class(type_def.val) && ))) throw new FailedPredicateException(this, "no_exists(ID) && (is_class(type_def.val) && )");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				type_def();
				setState(402);
				match(ID);
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						match(OPEN_BRAK);
						setState(404);
						match(INT);
						setState(405);
						match(CLOSE_BRAK);
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(411);
						match(COMMA);
						setState(412);
						param_def();
						}
						} 
					}
					setState(417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
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

	public static class Block_defContext extends ParserRuleContext {
		public TerminalNode OPEN_KEY() { return getToken(FreedomLessLessAtribParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(FreedomLessLessAtribParser.CLOSE_KEY, 0); }
		public List<Valueless_expression_defContext> valueless_expression_def() {
			return getRuleContexts(Valueless_expression_defContext.class);
		}
		public Valueless_expression_defContext valueless_expression_def(int i) {
			return getRuleContext(Valueless_expression_defContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessAtribParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessAtribParser.SEMICOLON, i);
		}
		public List<Struct_defContext> struct_def() {
			return getRuleContexts(Struct_defContext.class);
		}
		public Struct_defContext struct_def(int i) {
			return getRuleContext(Struct_defContext.class,i);
		}
		public Block_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterBlock_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitBlock_def(this);
		}
	}

	public final Block_defContext block_def() throws RecognitionException {
		Block_defContext _localctx = new Block_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(OPEN_KEY);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << UNSIGNED_T) | (1L << FLOAT_T) | (1L << DOUBLE_T) | (1L << SHORT_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << CLASS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << FREE) | (1L << MALLOC) | (1L << DELETE) | (1L << SIZEOF) | (1L << MULT))) != 0) || _la==ID) {
				{
				setState(425);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_T:
				case UNSIGNED_T:
				case FLOAT_T:
				case DOUBLE_T:
				case SHORT_T:
				case CHAR_T:
				case BOOL_T:
				case CLASS:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case NEW:
				case FREE:
				case MALLOC:
				case DELETE:
				case SIZEOF:
				case MULT:
				case ID:
					{
					setState(421);
					valueless_expression_def();
					setState(422);
					match(SEMICOLON);
					}
					break;
				case IF:
				case FOR:
				case WHILE:
				case SWITCH:
					{
					setState(424);
					struct_def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(CLOSE_KEY);
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

	public static class Valueless_expression_defContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FreedomLessLessAtribParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(FreedomLessLessAtribParser.CONTINUE, 0); }
		public Attribute_defContext attribute_def() {
			return getRuleContext(Attribute_defContext.class,0);
		}
		public Function_call_defContext function_call_def() {
			return getRuleContext(Function_call_defContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(FreedomLessLessAtribParser.RETURN, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FreedomLessLessAtribParser.MULT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessAtribParser.OPEN_PAR, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessAtribParser.ID, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessAtribParser.CLOSE_PAR, 0); }
		public Auto_increm_opContext auto_increm_op() {
			return getRuleContext(Auto_increm_opContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FreedomLessLessAtribParser.ASSIGN, 0); }
		public Auto_assign_opContext auto_assign_op() {
			return getRuleContext(Auto_assign_opContext.class,0);
		}
		public Valueless_expression_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueless_expression_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterValueless_expression_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitValueless_expression_def(this);
		}
	}

	public final Valueless_expression_defContext valueless_expression_def() throws RecognitionException {
		Valueless_expression_defContext _localctx = new Valueless_expression_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_valueless_expression_def);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(BREAK);
				valueless_expression_def.val = "break"
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(CONTINUE);
				valueless_expression_def.val = "continue"
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				attribute_def();
				valueless_expression_def.val = attribute_def.val
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				function_call_def();
				valueless_expression_def.val = attribute_def.val
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(442);
				match(RETURN);
				setState(443);
				valued_expression_def();
				valueless_expression_def.val = attribute_def.val
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(446);
					match(MULT);
					setState(447);
					match(OPEN_PAR);
					setState(448);
					match(ID);
					setState(449);
					match(CLOSE_PAR);
					}
					break;
				case ID:
					{
					setState(450);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(459);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
				case AUTOPLUS:
				case AUTOMINUS:
				case AUTOMULT:
				case AUTODIV:
					{
					setState(455);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSIGN:
						{
						setState(453);
						match(ASSIGN);
						}
						break;
					case AUTOPLUS:
					case AUTOMINUS:
					case AUTOMULT:
					case AUTODIV:
						{
						setState(454);
						auto_assign_op();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(457);
					valued_expression_def();
					}
					break;
				case INCREM:
				case DECREM:
					{
					setState(458);
					auto_increm_op();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class Struct_defContext extends ParserRuleContext {
		public If_defContext if_def() {
			return getRuleContext(If_defContext.class,0);
		}
		public For_defContext for_def() {
			return getRuleContext(For_defContext.class,0);
		}
		public While_defContext while_def() {
			return getRuleContext(While_defContext.class,0);
		}
		public Switch_defContext switch_def() {
			return getRuleContext(Switch_defContext.class,0);
		}
		public Struct_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterStruct_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitStruct_def(this);
		}
	}

	public final Struct_defContext struct_def() throws RecognitionException {
		Struct_defContext _localctx = new Struct_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_struct_def);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				if_def();
				struct_def.type = "if"
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				for_def();
				struct_def.type = "for"
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				while_def();
				struct_def.type = "while"
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				switch_def();
				struct_def.type = "switch"
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

	public static class If_defContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FreedomLessLessAtribParser.IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessAtribParser.OPEN_PAR, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessAtribParser.CLOSE_PAR, 0); }
		public List<Block_defContext> block_def() {
			return getRuleContexts(Block_defContext.class);
		}
		public Block_defContext block_def(int i) {
			return getRuleContext(Block_defContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FreedomLessLessAtribParser.ELSE, 0); }
		public If_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterIf_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitIf_def(this);
		}
	}

	public final If_defContext if_def() throws RecognitionException {
		If_defContext _localctx = new If_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(IF);
			setState(478);
			match(OPEN_PAR);
			setState(479);
			valued_expression_def();
			setState(480);
			match(CLOSE_PAR);
			setState(481);
			block_def();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(482);
				match(ELSE);
				setState(483);
				block_def();
				}
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

	public static class For_defContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FreedomLessLessAtribParser.FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessAtribParser.OPEN_PAR, 0); }
		public List<Valued_attribute_defContext> valued_attribute_def() {
			return getRuleContexts(Valued_attribute_defContext.class);
		}
		public Valued_attribute_defContext valued_attribute_def(int i) {
			return getRuleContext(Valued_attribute_defContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessAtribParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessAtribParser.SEMICOLON, i);
		}
		public List<Valued_expression_defContext> valued_expression_def() {
			return getRuleContexts(Valued_expression_defContext.class);
		}
		public Valued_expression_defContext valued_expression_def(int i) {
			return getRuleContext(Valued_expression_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessAtribParser.CLOSE_PAR, 0); }
		public Block_defContext block_def() {
			return getRuleContext(Block_defContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FreedomLessLessAtribParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FreedomLessLessAtribParser.COMMA, i);
		}
		public For_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterFor_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitFor_def(this);
		}
	}

	public final For_defContext for_def() throws RecognitionException {
		For_defContext _localctx = new For_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(FOR);
			setState(487);
			match(OPEN_PAR);
			setState(488);
			valued_attribute_def();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(489);
				match(COMMA);
				setState(490);
				valued_attribute_def();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(SEMICOLON);
			setState(497);
			valued_expression_def();
			setState(498);
			match(SEMICOLON);
			setState(499);
			valued_expression_def();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(500);
				match(COMMA);
				setState(501);
				valued_expression_def();
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
			match(CLOSE_PAR);
			setState(508);
			block_def();
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

	public static class Valued_attribute_defContext extends ParserRuleContext {
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FreedomLessLessAtribParser.ASSIGN, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode ID() { return getToken(FreedomLessLessAtribParser.ID, 0); }
		public List<TerminalNode> MULT() { return getTokens(FreedomLessLessAtribParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(FreedomLessLessAtribParser.MULT, i);
		}
		public List<TerminalNode> OPEN_BRAK() { return getTokens(FreedomLessLessAtribParser.OPEN_BRAK); }
		public TerminalNode OPEN_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.OPEN_BRAK, i);
		}
		public List<TerminalNode> INT() { return getTokens(FreedomLessLessAtribParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FreedomLessLessAtribParser.INT, i);
		}
		public List<TerminalNode> CLOSE_BRAK() { return getTokens(FreedomLessLessAtribParser.CLOSE_BRAK); }
		public TerminalNode CLOSE_BRAK(int i) {
			return getToken(FreedomLessLessAtribParser.CLOSE_BRAK, i);
		}
		public Valued_attribute_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valued_attribute_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterValued_attribute_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitValued_attribute_def(this);
		}
	}

	public final Valued_attribute_defContext valued_attribute_def() throws RecognitionException {
		Valued_attribute_defContext _localctx = new Valued_attribute_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valued_attribute_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			type_def();
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT) {
					{
					{
					setState(511);
					match(MULT);
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(517);
				match(ID);
				setState(518);
				if (!(exits(ID[0]))) throw new FailedPredicateException(this, "exits(ID[0])");
				}
				break;
			case 2:
				{
				setState(519);
				match(ID);
				setState(523); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(520);
						match(OPEN_BRAK);
						setState(521);
						match(INT);
						setState(522);
						match(CLOSE_BRAK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(525); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(527);
				if (!(exits(ID[1]))) throw new FailedPredicateException(this, "exits(ID[1])");
				}
				break;
			}
			setState(530);
			match(ASSIGN);
			setState(531);
			valued_expression_def();
			valued_attribute_def.type = type_def.type
			valued_attribute_def.val = valued_expression_def.val
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

	public static class While_defContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FreedomLessLessAtribParser.WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessAtribParser.OPEN_PAR, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessAtribParser.CLOSE_PAR, 0); }
		public Block_defContext block_def() {
			return getRuleContext(Block_defContext.class,0);
		}
		public While_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterWhile_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitWhile_def(this);
		}
	}

	public final While_defContext while_def() throws RecognitionException {
		While_defContext _localctx = new While_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(WHILE);
			setState(536);
			match(OPEN_PAR);
			setState(537);
			valued_expression_def();
			setState(538);
			match(CLOSE_PAR);
			setState(539);
			block_def();
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

	public static class Switch_defContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(FreedomLessLessAtribParser.SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessAtribParser.OPEN_PAR, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessAtribParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_KEY() { return getToken(FreedomLessLessAtribParser.OPEN_KEY, 0); }
		public Switch_default_defContext switch_default_def() {
			return getRuleContext(Switch_default_defContext.class,0);
		}
		public TerminalNode CLOSE_KEY() { return getToken(FreedomLessLessAtribParser.CLOSE_KEY, 0); }
		public List<Switch_case_defContext> switch_case_def() {
			return getRuleContexts(Switch_case_defContext.class);
		}
		public Switch_case_defContext switch_case_def(int i) {
			return getRuleContext(Switch_case_defContext.class,i);
		}
		public Switch_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterSwitch_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitSwitch_def(this);
		}
	}

	public final Switch_defContext switch_def() throws RecognitionException {
		Switch_defContext _localctx = new Switch_defContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switch_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(SWITCH);
			setState(542);
			match(OPEN_PAR);
			setState(543);
			valued_expression_def();
			setState(544);
			match(CLOSE_PAR);
			setState(545);
			match(OPEN_KEY);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(546);
				switch_case_def();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			switch_default_def();
			setState(553);
			match(CLOSE_KEY);
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

	public static class Switch_case_defContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FreedomLessLessAtribParser.CASE, 0); }
		public Value_defContext value_def() {
			return getRuleContext(Value_defContext.class,0);
		}
		public TerminalNode TWOPOINTS() { return getToken(FreedomLessLessAtribParser.TWOPOINTS, 0); }
		public TerminalNode BREAK() { return getToken(FreedomLessLessAtribParser.BREAK, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessAtribParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessAtribParser.SEMICOLON, i);
		}
		public List<Valueless_expression_defContext> valueless_expression_def() {
			return getRuleContexts(Valueless_expression_defContext.class);
		}
		public Valueless_expression_defContext valueless_expression_def(int i) {
			return getRuleContext(Valueless_expression_defContext.class,i);
		}
		public List<Struct_defContext> struct_def() {
			return getRuleContexts(Struct_defContext.class);
		}
		public Struct_defContext struct_def(int i) {
			return getRuleContext(Struct_defContext.class,i);
		}
		public Switch_case_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterSwitch_case_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitSwitch_case_def(this);
		}
	}

	public final Switch_case_defContext switch_case_def() throws RecognitionException {
		Switch_case_defContext _localctx = new Switch_case_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_case_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(CASE);
			setState(556);
			value_def();
			setState(557);
			match(TWOPOINTS);
			setState(565); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(565);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_T:
					case UNSIGNED_T:
					case FLOAT_T:
					case DOUBLE_T:
					case SHORT_T:
					case CHAR_T:
					case BOOL_T:
					case CLASS:
					case BREAK:
					case CONTINUE:
					case RETURN:
					case NEW:
					case FREE:
					case MALLOC:
					case DELETE:
					case SIZEOF:
					case MULT:
					case ID:
						{
						setState(558);
						valueless_expression_def();
						setState(559);
						match(SEMICOLON);
						switch_default_def.val = valueless_expression_def.val
						}
						break;
					case IF:
					case FOR:
					case WHILE:
					case SWITCH:
						{
						setState(562);
						struct_def();
						switch_default_def.val = valueless_expression_def.val
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(567); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(569);
			match(BREAK);
			setState(570);
			match(SEMICOLON);
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

	public static class Switch_default_defContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(FreedomLessLessAtribParser.DEFAULT, 0); }
		public TerminalNode TWOPOINTS() { return getToken(FreedomLessLessAtribParser.TWOPOINTS, 0); }
		public TerminalNode BREAK() { return getToken(FreedomLessLessAtribParser.BREAK, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessAtribParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessAtribParser.SEMICOLON, i);
		}
		public List<Valueless_expression_defContext> valueless_expression_def() {
			return getRuleContexts(Valueless_expression_defContext.class);
		}
		public Valueless_expression_defContext valueless_expression_def(int i) {
			return getRuleContext(Valueless_expression_defContext.class,i);
		}
		public List<Struct_defContext> struct_def() {
			return getRuleContexts(Struct_defContext.class);
		}
		public Struct_defContext struct_def(int i) {
			return getRuleContext(Struct_defContext.class,i);
		}
		public Switch_default_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_default_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterSwitch_default_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitSwitch_default_def(this);
		}
	}

	public final Switch_default_defContext switch_default_def() throws RecognitionException {
		Switch_default_defContext _localctx = new Switch_default_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switch_default_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(DEFAULT);
			setState(573);
			match(TWOPOINTS);
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(581);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_T:
					case UNSIGNED_T:
					case FLOAT_T:
					case DOUBLE_T:
					case SHORT_T:
					case CHAR_T:
					case BOOL_T:
					case CLASS:
					case BREAK:
					case CONTINUE:
					case RETURN:
					case NEW:
					case FREE:
					case MALLOC:
					case DELETE:
					case SIZEOF:
					case MULT:
					case ID:
						{
						setState(574);
						valueless_expression_def();
						setState(575);
						match(SEMICOLON);
						switch_default_def.val = valueless_expression_def.val
						}
						break;
					case IF:
					case FOR:
					case WHILE:
					case SWITCH:
						{
						setState(578);
						struct_def();
						switch_default_def.val = struct_def.val
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(586);
			match(BREAK);
			setState(587);
			match(SEMICOLON);
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

	public static class Main_defContext extends ParserRuleContext {
		public TerminalNode VOID_T() { return getToken(FreedomLessLessAtribParser.VOID_T, 0); }
		public TerminalNode MAIN() { return getToken(FreedomLessLessAtribParser.MAIN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessAtribParser.OPEN_PAR, 0); }
		public TerminalNode INT_T() { return getToken(FreedomLessLessAtribParser.INT_T, 0); }
		public List<TerminalNode> ID() { return getTokens(FreedomLessLessAtribParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FreedomLessLessAtribParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(FreedomLessLessAtribParser.COMMA, 0); }
		public TerminalNode CHAR_T() { return getToken(FreedomLessLessAtribParser.CHAR_T, 0); }
		public List<TerminalNode> MULT() { return getTokens(FreedomLessLessAtribParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(FreedomLessLessAtribParser.MULT, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessAtribParser.CLOSE_PAR, 0); }
		public Block_defContext block_def() {
			return getRuleContext(Block_defContext.class,0);
		}
		public Main_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterMain_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitMain_def(this);
		}
	}

	public final Main_defContext main_def() throws RecognitionException {
		Main_defContext _localctx = new Main_defContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_main_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(VOID_T);
			setState(590);
			match(MAIN);
			setState(591);
			match(OPEN_PAR);
			setState(592);
			match(INT_T);
			setState(593);
			match(ID);
			setState(594);
			match(COMMA);
			setState(595);
			match(CHAR_T);
			setState(596);
			match(MULT);
			setState(597);
			match(MULT);
			setState(598);
			match(ID);
			setState(599);
			match(CLOSE_PAR);
			setState(600);
			block_def();
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

	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(FreedomLessLessAtribParser.INT_T, 0); }
		public TerminalNode UNSIGNED_T() { return getToken(FreedomLessLessAtribParser.UNSIGNED_T, 0); }
		public TerminalNode SHORT_T() { return getToken(FreedomLessLessAtribParser.SHORT_T, 0); }
		public TerminalNode FLOAT_T() { return getToken(FreedomLessLessAtribParser.FLOAT_T, 0); }
		public TerminalNode DOUBLE_T() { return getToken(FreedomLessLessAtribParser.DOUBLE_T, 0); }
		public TerminalNode CHAR_T() { return getToken(FreedomLessLessAtribParser.CHAR_T, 0); }
		public TerminalNode BOOL_T() { return getToken(FreedomLessLessAtribParser.BOOL_T, 0); }
		public TerminalNode CLASS() { return getToken(FreedomLessLessAtribParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessAtribParser.ID, 0); }
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitType_def(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type_def);
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(INT_T);
				type_def.type = "int"
				}
				break;
			case UNSIGNED_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(UNSIGNED_T);
				type_def.type = "unsigned"
				}
				break;
			case SHORT_T:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				match(SHORT_T);
				type_def.type = "short"
				}
				break;
			case FLOAT_T:
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				match(FLOAT_T);
				type_def.type = "float"
				}
				break;
			case DOUBLE_T:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				match(DOUBLE_T);
				type_def.type = "double"
				}
				break;
			case CHAR_T:
				enterOuterAlt(_localctx, 6);
				{
				setState(612);
				match(CHAR_T);
				type_def.type = "char"
				}
				break;
			case BOOL_T:
				enterOuterAlt(_localctx, 7);
				{
				setState(614);
				match(BOOL_T);
				type_def.type = "bool"
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 8);
				{
				setState(616);
				match(CLASS);
				setState(617);
				match(ID);
				type_def.type = "class"; type_def.val = ID.val
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

	public static class Value_defContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FreedomLessLessAtribParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(FreedomLessLessAtribParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(FreedomLessLessAtribParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(FreedomLessLessAtribParser.INTEGER, 0); }
		public TerminalNode FLOATING() { return getToken(FreedomLessLessAtribParser.FLOATING, 0); }
		public TerminalNode BOOLEAN() { return getToken(FreedomLessLessAtribParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(FreedomLessLessAtribParser.NULL, 0); }
		public Value_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterValue_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitValue_def(this);
		}
	}

	public final Value_defContext value_def() throws RecognitionException {
		Value_defContext _localctx = new Value_defContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value_def);
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(INT);
				value_def.val = INT.val
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(CHAR);
				value_def.val = CHAR.val
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				match(STRING);
				value_def.val = STRING.val
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
				match(INTEGER);
				value_def.val = INTEGER.val
				}
				break;
			case FLOATING:
				enterOuterAlt(_localctx, 5);
				{
				setState(629);
				match(FLOATING);
				value_def.val = FLOATING.val
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(631);
				match(BOOLEAN);
				value_def.val = BOOLEAN.val
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(633);
				match(NULL);
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

	public static class Logical_opContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(FreedomLessLessAtribParser.LESS, 0); }
		public TerminalNode BIGGER() { return getToken(FreedomLessLessAtribParser.BIGGER, 0); }
		public TerminalNode LESS_EQ() { return getToken(FreedomLessLessAtribParser.LESS_EQ, 0); }
		public TerminalNode BIGGER_EQ() { return getToken(FreedomLessLessAtribParser.BIGGER_EQ, 0); }
		public TerminalNode EQUALS() { return getToken(FreedomLessLessAtribParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(FreedomLessLessAtribParser.NOT_EQUALS, 0); }
		public TerminalNode AND() { return getToken(FreedomLessLessAtribParser.AND, 0); }
		public TerminalNode OR() { return getToken(FreedomLessLessAtribParser.OR, 0); }
		public Logical_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterLogical_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitLogical_op(this);
		}
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logical_op);
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(LESS);
				logical_op.val = "<"
				}
				break;
			case BIGGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(BIGGER);
				logical_op.val = ">"
				}
				break;
			case LESS_EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				match(LESS_EQ);
				logical_op.val = "=<"
				}
				break;
			case BIGGER_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				match(BIGGER_EQ);
				logical_op.val = ">="
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 5);
				{
				setState(644);
				match(EQUALS);
				logical_op.val = "=="
				}
				break;
			case NOT_EQUALS:
				enterOuterAlt(_localctx, 6);
				{
				setState(646);
				match(NOT_EQUALS);
				logical_op.val = "!="
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 7);
				{
				setState(648);
				match(AND);
				logical_op.val = "&&"
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 8);
				{
				setState(650);
				match(OR);
				logical_op.val = "||"
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

	public static class Arithmetic_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FreedomLessLessAtribParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FreedomLessLessAtribParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(FreedomLessLessAtribParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FreedomLessLessAtribParser.DIV, 0); }
		public Arithmetic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterArithmetic_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitArithmetic_op(this);
		}
	}

	public final Arithmetic_opContext arithmetic_op() throws RecognitionException {
		Arithmetic_opContext _localctx = new Arithmetic_opContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arithmetic_op);
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				match(PLUS);
				arithmetic_op.val = "+"
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(MINUS);
				arithmetic_op.val = "-"
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				match(MULT);
				arithmetic_op.val = "*"
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(660);
				match(DIV);
				arithmetic_op.val = "/"
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

	public static class Auto_assign_opContext extends ParserRuleContext {
		public TerminalNode AUTOPLUS() { return getToken(FreedomLessLessAtribParser.AUTOPLUS, 0); }
		public TerminalNode AUTOMINUS() { return getToken(FreedomLessLessAtribParser.AUTOMINUS, 0); }
		public TerminalNode AUTOMULT() { return getToken(FreedomLessLessAtribParser.AUTOMULT, 0); }
		public TerminalNode AUTODIV() { return getToken(FreedomLessLessAtribParser.AUTODIV, 0); }
		public Auto_assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auto_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterAuto_assign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitAuto_assign_op(this);
		}
	}

	public final Auto_assign_opContext auto_assign_op() throws RecognitionException {
		Auto_assign_opContext _localctx = new Auto_assign_opContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_auto_assign_op);
		try {
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTOPLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(AUTOPLUS);
				arithmetic_op.val = AUTOPLUS.val
				}
				break;
			case AUTOMINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(AUTOMINUS);
				arithmetic_op.val = AUTOMINUS.val
				}
				break;
			case AUTOMULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				match(AUTOMULT);
				arithmetic_op.val = AUTOMULT.val
				}
				break;
			case AUTODIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(670);
				match(AUTODIV);
				arithmetic_op.val = AUTODIV.val
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

	public static class Auto_increm_opContext extends ParserRuleContext {
		public TerminalNode INCREM() { return getToken(FreedomLessLessAtribParser.INCREM, 0); }
		public TerminalNode DECREM() { return getToken(FreedomLessLessAtribParser.DECREM, 0); }
		public Auto_increm_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auto_increm_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).enterAuto_increm_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessAtribListener ) ((FreedomLessLessAtribListener)listener).exitAuto_increm_op(this);
		}
	}

	public final Auto_increm_opContext auto_increm_op() throws RecognitionException {
		Auto_increm_opContext _localctx = new Auto_increm_opContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_auto_increm_op);
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREM:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				match(INCREM);
				auto_increm_op.val = "++"
				}
				break;
			case DECREM:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(DECREM);
				auto_increm_op.val = "--"
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return import_def_sempred((Import_defContext)_localctx, predIndex);
		case 2:
			return class_def_sempred((Class_defContext)_localctx, predIndex);
		case 7:
			return attribute_def_sempred((Attribute_defContext)_localctx, predIndex);
		case 8:
			return valued_expression_def_sempred((Valued_expression_defContext)_localctx, predIndex);
		case 9:
			return operation_sempred((OperationContext)_localctx, predIndex);
		case 10:
			return function_call_def_sempred((Function_call_defContext)_localctx, predIndex);
		case 12:
			return function_def_sempred((Function_defContext)_localctx, predIndex);
		case 13:
			return param_def_sempred((Param_defContext)_localctx, predIndex);
		case 19:
			return valued_attribute_def_sempred((Valued_attribute_defContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean import_def_sempred(Import_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return still_not_imported(STRING.val);
		}
		return true;
	}
	private boolean class_def_sempred(Class_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return class_free_name(ID);
		}
		return true;
	}
	private boolean attribute_def_sempred(Attribute_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return scope_free_name(ID[0]) && type_def.type == valued_expression_def.type;
		case 3:
			return scope_free_name(ID[1]) && type_def.type == valued_expression_def.type;
		case 4:
			return scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "vector";
		case 5:
			return scope_free_name(ID[1]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "vector";
		case 6:
			return scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "pointers";
		case 7:
			return scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "pointers";
		}
		return true;
	}
	private boolean valued_expression_def_sempred(Valued_expression_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return exits(ID[0]) && ;
		case 9:
			return !is_class(ID[0]);
		case 10:
			return !is_class(ID[0]);
		case 11:
			return lookup(ID[0]) && INT[0].val >= 0;
		case 12:
			return operation == null || function_call_def.type == operation.type;
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return operation.type == null || operation.type == "bool";
		case 14:
			return operation.type == null || operation.type != "bool";
		case 15:
			return operation.type == null || operation.type == valued_expression_def.type;
		}
		return true;
	}
	private boolean function_call_def_sempred(Function_call_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return exits(ID[0]) && is_class(ID[0]);
		case 17:
			return exits(ID[0]) && is_class(ID[0]);
		case 18:
			return exits(ID[0]) && is_dynamic(ID);
		case 19:
			return valued_expression_def.val >= 0;
		case 20:
			return lookup(ID[0]) && is_class(ID[0]);
		case 21:
			return lookup(ID[1]) && (is_function(ID[1]) && argument_def.caracteristicas == func_caract(ID[1]);
		case 22:
			return lookup(ID[2]) && (is_function(ID[2]) && argument_def == func_arg(ID[2]));
		}
		return true;
	}
	private boolean function_def_sempred(Function_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return !exits(ID);
		}
		return true;
	}
	private boolean param_def_sempred(Param_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return no_exists(ID) && (is_class(type_def.val) && );
		}
		return true;
	}
	private boolean valued_attribute_def_sempred(Valued_attribute_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return exits(ID[0]);
		case 26:
			return exits(ID[1]);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u02ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\5\2B\n\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2"+
		"\5\2Q\n\2\3\3\3\3\3\3\6\3V\n\3\r\3\16\3W\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\5\5d\n\5\5\5f\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\7\bs\n\b\f\b\16\bv\13\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t"+
		"\3\t\3\t\5\t\u0084\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\t\7\t\u008e"+
		"\n\t\f\t\16\t\u0091\13\t\3\t\3\t\3\t\3\t\3\t\6\t\u0098\n\t\r\t\16\t\u0099"+
		"\3\t\3\t\5\t\u009e\n\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00a6\n\t\r\t\16\t"+
		"\u00a7\3\t\3\t\5\t\u00ac\n\t\3\t\7\t\u00af\n\t\f\t\16\t\u00b2\13\t\3\t"+
		"\3\t\6\t\u00b6\n\t\r\t\16\t\u00b7\3\t\3\t\3\t\5\t\u00bd\n\t\3\t\3\t\3"+
		"\t\6\t\u00c2\n\t\r\t\16\t\u00c3\3\t\3\t\3\t\5\t\u00c9\n\t\3\t\7\t\u00cc"+
		"\n\t\f\t\16\t\u00cf\13\t\5\t\u00d1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00df\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00ea\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00f4\n\n\r\n\16\n\u00f5"+
		"\3\n\5\n\u00f9\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0101\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u010a\n\13\3\13\3\13\3\13\3\13\7\13\u0110\n"+
		"\13\f\13\16\13\u0113\13\13\3\f\3\f\3\f\3\f\5\f\u0119\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f"+
		"\u012f\n\f\r\f\16\f\u0130\3\f\3\f\3\f\6\f\u0136\n\f\r\f\16\f\u0137\5\f"+
		"\u013a\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0141\n\f\3\f\3\f\3\f\5\f\u0146\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u014e\n\f\3\f\3\f\7\f\u0152\n\f\f\f\16\f"+
		"\u0155\13\f\5\f\u0157\n\f\3\r\3\r\3\r\7\r\u015c\n\r\f\r\16\r\u015f\13"+
		"\r\3\16\3\16\6\16\u0163\n\16\r\16\16\16\u0164\3\16\3\16\3\16\6\16\u016a"+
		"\n\16\r\16\16\16\u016b\5\16\u016e\n\16\3\16\3\16\3\16\5\16\u0173\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u017c\n\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0182\n\16\3\17\3\17\6\17\u0186\n\17\r\17\16\17\u0187\3\17\3\17"+
		"\3\17\7\17\u018d\n\17\f\17\16\17\u0190\13\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u0199\n\17\f\17\16\17\u019c\13\17\3\17\3\17\7\17\u01a0"+
		"\n\17\f\17\16\17\u01a3\13\17\5\17\u01a5\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u01ac\n\20\f\20\16\20\u01af\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u01c6\n\21\3\21\3\21\5\21\u01ca\n\21\3\21\3\21\5\21\u01ce\n"+
		"\21\5\21\u01d0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u01de\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01e7"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u01ee\n\24\f\24\16\24\u01f1\13\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01f9\n\24\f\24\16\24\u01fc\13\24"+
		"\3\24\3\24\3\24\3\25\3\25\7\25\u0203\n\25\f\25\16\25\u0206\13\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\6\25\u020e\n\25\r\25\16\25\u020f\3\25\5\25\u0213"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0226\n\27\f\27\16\27\u0229\13\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0238\n\30"+
		"\r\30\16\30\u0239\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\7\31\u0248\n\31\f\31\16\31\u024b\13\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u026e\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u027d\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u028f\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0299\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u02a3\n\37\3 \3 \3 \3 \5 \u02a9\n \3 \2\2!\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\3\4\2\3\3&&\2\u02fd"+
		"\2A\3\2\2\2\4U\3\2\2\2\6Y\3\2\2\2\be\3\2\2\2\ng\3\2\2\2\fj\3\2\2\2\16"+
		"m\3\2\2\2\20\u00d0\3\2\2\2\22\u0100\3\2\2\2\24\u0111\3\2\2\2\26\u0156"+
		"\3\2\2\2\30\u0158\3\2\2\2\32\u0181\3\2\2\2\34\u01a4\3\2\2\2\36\u01a6\3"+
		"\2\2\2 \u01cf\3\2\2\2\"\u01dd\3\2\2\2$\u01df\3\2\2\2&\u01e8\3\2\2\2(\u0200"+
		"\3\2\2\2*\u0219\3\2\2\2,\u021f\3\2\2\2.\u022d\3\2\2\2\60\u023e\3\2\2\2"+
		"\62\u024f\3\2\2\2\64\u026d\3\2\2\2\66\u027c\3\2\2\28\u028e\3\2\2\2:\u0298"+
		"\3\2\2\2<\u02a2\3\2\2\2>\u02a8\3\2\2\2@B\5\4\3\2A@\3\2\2\2AB\3\2\2\2B"+
		"F\3\2\2\2CE\5\6\4\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GL\3\2\2\2"+
		"HF\3\2\2\2IK\5\32\16\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2OQ\5\62\32\2PO\3\2\2\2PQ\3\2\2\2Q\3\3\2\2\2RS\7\f\2\2ST\7"+
		"B\2\2TV\6\3\2\2UR\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\5\3\2\2\2YZ\7"+
		"\r\2\2Z[\7E\2\2[\\\7\67\2\2\\]\5\b\5\2]^\78\2\2^_\6\4\3\2_\7\3\2\2\2`"+
		"f\5\f\7\2ac\5\n\6\2bd\5\f\7\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2e`\3\2\2\2"+
		"ea\3\2\2\2f\t\3\2\2\2gh\7\16\2\2hi\5\16\b\2i\13\3\2\2\2jk\7\17\2\2kl\5"+
		"\16\b\2l\r\3\2\2\2mt\b\b\1\2no\5\20\t\2op\7<\2\2pq\b\b\1\2qs\3\2\2\2r"+
		"n\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u|\3\2\2\2vt\3\2\2\2wx\5\32\16"+
		"\2xy\b\b\1\2y{\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2"+
		"\2\2~|\3\2\2\2\177\u0080\5\64\33\2\u0080\u0083\7E\2\2\u0081\u0082\7 \2"+
		"\2\u0082\u0084\5\22\n\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u008f\6\t\4\2\u0086\u0087\7;\2\2\u0087\u008a\7E\2"+
		"\2\u0088\u0089\7 \2\2\u0089\u008b\5\22\n\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\6\t\5\2\u008d\u0086\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u00d1\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\5\64\33\2\u0093\u0097\7E\2\2\u0094"+
		"\u0095\79\2\2\u0095\u0096\7?\2\2\u0096\u0098\7:\2\2\u0097\u0094\3\2\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u009c\7 \2\2\u009c\u009e\5\22\n\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00b0\6\t\6\2\u00a0\u00a1\7;"+
		"\2\2\u00a1\u00a5\7E\2\2\u00a2\u00a3\79\2\2\u00a3\u00a4\7?\2\2\u00a4\u00a6"+
		"\7:\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\7 \2\2\u00aa\u00ac\5\22"+
		"\n\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\6\t\7\2\u00ae\u00a0\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00d1\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\5\64\33\2\u00b4\u00b6\7#\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bc\7E\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bd\5\22\n\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00cd\6\t\b\2\u00bf"+
		"\u00c1\7;\2\2\u00c0\u00c2\7#\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2"+
		"\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8"+
		"\7E\2\2\u00c6\u00c7\7 \2\2\u00c7\u00c9\5\22\n\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\6\t\t\2\u00cb\u00bf\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\177\3\2\2\2\u00d0\u0092\3\2\2"+
		"\2\u00d0\u00b3\3\2\2\2\u00d1\21\3\2\2\2\u00d2\u00d3\5\66\34\2\u00d3\u00d4"+
		"\b\n\1\2\u00d4\u00d5\5\24\13\2\u00d5\u0101\3\2\2\2\u00d6\u00d7\5\26\f"+
		"\2\u00d7\u00d8\b\n\1\2\u00d8\u00d9\5\24\13\2\u00d9\u0101\3\2\2\2\u00da"+
		"\u00db\7#\2\2\u00db\u00df\b\n\1\2\u00dc\u00dd\7%\2\2\u00dd\u00df\b\n\1"+
		"\2\u00de\u00da\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\7\65\2\2\u00e1\u00e2\5\22\n\2\u00e2\u00e3\7\66\2\2\u00e3\u00e4\b\n\1"+
		"\2\u00e4\u00e5\5\24\13\2\u00e5\u0101\3\2\2\2\u00e6\u00f8\7E\2\2\u00e7"+
		"\u00ea\7 \2\2\u00e8\u00ea\5<\37\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\6\n\n\2\u00ec\u00f9\5\22\n\2\u00ed"+
		"\u00ee\5> \2\u00ee\u00ef\6\n\13\2\u00ef\u00f9\3\2\2\2\u00f0\u00f1\79\2"+
		"\2\u00f1\u00f2\7?\2\2\u00f2\u00f4\7:\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\6\n\f\2\u00f8\u00e9\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00f3\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\6\n\r\2\u00fb"+
		"\u00fc\5\24\13\2\u00fc\u00fd\6\n\16\2\u00fd\u00fe\b\n\1\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00d2\3\2\2\2\u0100\u00d6\3\2\2\2\u0100"+
		"\u00de\3\2\2\2\u0100\u00e6\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\23\3\2\2"+
		"\2\u0102\u0103\58\35\2\u0103\u0104\6\13\17\2\u0104\u0105\b\13\1\2\u0105"+
		"\u010a\3\2\2\2\u0106\u0107\5:\36\2\u0107\u0108\6\13\20\2\u0108\u010a\3"+
		"\2\2\2\u0109\u0102\3\2\2\2\u0109\u0106\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\5\22\n\2\u010c\u010d\6\13\21\2\u010d\u010e\b\13\1\2\u010e\u0110"+
		"\3\2\2\2\u010f\u0109\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\25\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\33\2"+
		"\2\u0115\u0116\7E\2\2\u0116\u0118\7\65\2\2\u0117\u0119\5\30\r\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\66"+
		"\2\2\u011b\u0157\6\f\22\2\u011c\u011d\7\36\2\2\u011d\u011e\7E\2\2\u011e"+
		"\u0157\6\f\23\2\u011f\u0120\7\34\2\2\u0120\u0121\7\65\2\2\u0121\u0122"+
		"\7E\2\2\u0122\u0123\7\66\2\2\u0123\u0157\6\f\24\2\u0124\u0125\7\35\2\2"+
		"\u0125\u0126\7\65\2\2\u0126\u0127\5\22\n\2\u0127\u0128\7\66\2\2\u0128"+
		"\u0129\6\f\25\2\u0129\u0157\3\2\2\2\u012a\u012b\7\37\2\2\u012b\u012c\7"+
		"\65\2\2\u012c\u0139\5\64\33\2\u012d\u012f\7#\2\2\u012e\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u013a\3\2"+
		"\2\2\u0132\u0133\79\2\2\u0133\u0134\7?\2\2\u0134\u0136\7:\2\2\u0135\u0132"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u012e\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\66\2\2\u013c\u0157\3\2\2\2\u013d"+
		"\u013e\7E\2\2\u013e\u013f\t\2\2\2\u013f\u0141\6\f\26\2\u0140\u013d\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7E\2\2\u0143"+
		"\u0145\7\65\2\2\u0144\u0146\5\30\r\2\u0145\u0144\3\2\2\2\u0145\u0146\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\66\2\2\u0148\u0153\6\f\27\2\u0149"+
		"\u014a\t\2\2\2\u014a\u014b\7E\2\2\u014b\u014d\7\65\2\2\u014c\u014e\5\30"+
		"\r\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\7\66\2\2\u0150\u0152\6\f\30\2\u0151\u0149\3\2\2\2\u0152\u0155\3"+
		"\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0114\3\2\2\2\u0156\u011c\3\2\2\2\u0156\u011f\3\2"+
		"\2\2\u0156\u0124\3\2\2\2\u0156\u012a\3\2\2\2\u0156\u0140\3\2\2\2\u0157"+
		"\27\3\2\2\2\u0158\u015d\5\22\n\2\u0159\u015a\7;\2\2\u015a\u015c\5\22\n"+
		"\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\31\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u016d\5\64\33\2\u0161"+
		"\u0163\7#\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u016e\3\2\2\2\u0166\u0167\79\2\2\u0167"+
		"\u0168\7?\2\2\u0168\u016a\7:\2\2\u0169\u0166\3\2\2\2\u016a\u016b\3\2\2"+
		"\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u0162"+
		"\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\7E\2\2\u0170\u0172\7\65\2\2\u0171\u0173\5\34\17\2\u0172\u0171\3"+
		"\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\66\2\2\u0175"+
		"\u0176\5\36\20\2\u0176\u0182\3\2\2\2\u0177\u0178\7\13\2\2\u0178\u0179"+
		"\7E\2\2\u0179\u017b\7\65\2\2\u017a\u017c\5\34\17\2\u017b\u017a\3\2\2\2"+
		"\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7\66\2\2\u017e\u017f"+
		"\5\36\20\2\u017f\u0180\6\16\31\2\u0180\u0182\3\2\2\2\u0181\u0160\3\2\2"+
		"\2\u0181\u0177\3\2\2\2\u0182\33\3\2\2\2\u0183\u0185\5\64\33\2\u0184\u0186"+
		"\7#\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018e\7E\2\2\u018a\u018b\7;\2"+
		"\2\u018b\u018d\5\34\17\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0192\6\17\32\2\u0192\u01a5\3\2\2\2\u0193\u0194\5\64\33\2\u0194"+
		"\u019a\7E\2\2\u0195\u0196\79\2\2\u0196\u0197\7?\2\2\u0197\u0199\7:\2\2"+
		"\u0198\u0195\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u01a1\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7;\2\2\u019e"+
		"\u01a0\5\34\17\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u0183\3\2\2\2\u01a4\u0193\3\2\2\2\u01a5\35\3\2\2\2\u01a6\u01ad\7\67\2"+
		"\2\u01a7\u01a8\5 \21\2\u01a8\u01a9\7<\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac"+
		"\5\"\22\2\u01ab\u01a7\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01b0\u01b1\78\2\2\u01b1\37\3\2\2\2\u01b2\u01b3\7\27\2\2\u01b3"+
		"\u01d0\b\21\1\2\u01b4\u01b5\7\30\2\2\u01b5\u01d0\b\21\1\2\u01b6\u01b7"+
		"\5\20\t\2\u01b7\u01b8\b\21\1\2\u01b8\u01d0\3\2\2\2\u01b9\u01ba\5\26\f"+
		"\2\u01ba\u01bb\b\21\1\2\u01bb\u01d0\3\2\2\2\u01bc\u01bd\7\32\2\2\u01bd"+
		"\u01be\5\22\n\2\u01be\u01bf\b\21\1\2\u01bf\u01d0\3\2\2\2\u01c0\u01c1\7"+
		"#\2\2\u01c1\u01c2\7\65\2\2\u01c2\u01c3\7E\2\2\u01c3\u01c6\7\66\2\2\u01c4"+
		"\u01c6\7E\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01cd\3\2"+
		"\2\2\u01c7\u01ca\7 \2\2\u01c8\u01ca\5<\37\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\5\22\n\2\u01cc\u01ce\5"+
		"> \2\u01cd\u01c9\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01b2\3\2\2\2\u01cf\u01b4\3\2\2\2\u01cf\u01b6\3\2\2\2\u01cf\u01b9\3\2"+
		"\2\2\u01cf\u01bc\3\2\2\2\u01cf\u01c5\3\2\2\2\u01d0!\3\2\2\2\u01d1\u01d2"+
		"\5$\23\2\u01d2\u01d3\b\22\1\2\u01d3\u01de\3\2\2\2\u01d4\u01d5\5&\24\2"+
		"\u01d5\u01d6\b\22\1\2\u01d6\u01de\3\2\2\2\u01d7\u01d8\5*\26\2\u01d8\u01d9"+
		"\b\22\1\2\u01d9\u01de\3\2\2\2\u01da\u01db\5,\27\2\u01db\u01dc\b\22\1\2"+
		"\u01dc\u01de\3\2\2\2\u01dd\u01d1\3\2\2\2\u01dd\u01d4\3\2\2\2\u01dd\u01d7"+
		"\3\2\2\2\u01dd\u01da\3\2\2\2\u01de#\3\2\2\2\u01df\u01e0\7\21\2\2\u01e0"+
		"\u01e1\7\65\2\2\u01e1\u01e2\5\22\n\2\u01e2\u01e3\7\66\2\2\u01e3\u01e6"+
		"\5\36\20\2\u01e4\u01e5\7\22\2\2\u01e5\u01e7\5\36\20\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7%\3\2\2\2\u01e8\u01e9\7\23\2\2\u01e9\u01ea"+
		"\7\65\2\2\u01ea\u01ef\5(\25\2\u01eb\u01ec\7;\2\2\u01ec\u01ee\5(\25\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7<\2\2\u01f3"+
		"\u01f4\5\22\n\2\u01f4\u01f5\7<\2\2\u01f5\u01fa\5\22\n\2\u01f6\u01f7\7"+
		";\2\2\u01f7\u01f9\5\22\n\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fd\u01fe\7\66\2\2\u01fe\u01ff\5\36\20\2\u01ff\'\3\2\2\2\u0200"+
		"\u0212\5\64\33\2\u0201\u0203\7#\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3"+
		"\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0207\u0208\7E\2\2\u0208\u0213\6\25\33\2\u0209\u020d\7"+
		"E\2\2\u020a\u020b\79\2\2\u020b\u020c\7?\2\2\u020c\u020e\7:\2\2\u020d\u020a"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0213\6\25\34\2\u0212\u0204\3\2\2\2\u0212\u0209\3"+
		"\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7 \2\2\u0215\u0216\5\22\n\2\u0216"+
		"\u0217\b\25\1\2\u0217\u0218\b\25\1\2\u0218)\3\2\2\2\u0219\u021a\7\24\2"+
		"\2\u021a\u021b\7\65\2\2\u021b\u021c\5\22\n\2\u021c\u021d\7\66\2\2\u021d"+
		"\u021e\5\36\20\2\u021e+\3\2\2\2\u021f\u0220\7\25\2\2\u0220\u0221\7\65"+
		"\2\2\u0221\u0222\5\22\n\2\u0222\u0223\7\66\2\2\u0223\u0227\7\67\2\2\u0224"+
		"\u0226\5.\30\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a"+
		"\u022b\5\60\31\2\u022b\u022c\78\2\2\u022c-\3\2\2\2\u022d\u022e\7\26\2"+
		"\2\u022e\u022f\5\66\34\2\u022f\u0237\7=\2\2\u0230\u0231\5 \21\2\u0231"+
		"\u0232\7<\2\2\u0232\u0233\b\30\1\2\u0233\u0238\3\2\2\2\u0234\u0235\5\""+
		"\22\2\u0235\u0236\b\30\1\2\u0236\u0238\3\2\2\2\u0237\u0230\3\2\2\2\u0237"+
		"\u0234\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\27\2\2\u023c\u023d\7<\2\2\u023d"+
		"/\3\2\2\2\u023e\u023f\7\31\2\2\u023f\u0249\7=\2\2\u0240\u0241\5 \21\2"+
		"\u0241\u0242\7<\2\2\u0242\u0243\b\31\1\2\u0243\u0248\3\2\2\2\u0244\u0245"+
		"\5\"\22\2\u0245\u0246\b\31\1\2\u0246\u0248\3\2\2\2\u0247\u0240\3\2\2\2"+
		"\u0247\u0244\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7\27\2\2"+
		"\u024d\u024e\7<\2\2\u024e\61\3\2\2\2\u024f\u0250\7\13\2\2\u0250\u0251"+
		"\7\20\2\2\u0251\u0252\7\65\2\2\u0252\u0253\7\4\2\2\u0253\u0254\7E\2\2"+
		"\u0254\u0255\7;\2\2\u0255\u0256\7\t\2\2\u0256\u0257\7#\2\2\u0257\u0258"+
		"\7#\2\2\u0258\u0259\7E\2\2\u0259\u025a\7\66\2\2\u025a\u025b\5\36\20\2"+
		"\u025b\63\3\2\2\2\u025c\u025d\7\4\2\2\u025d\u026e\b\33\1\2\u025e\u025f"+
		"\7\5\2\2\u025f\u026e\b\33\1\2\u0260\u0261\7\b\2\2\u0261\u026e\b\33\1\2"+
		"\u0262\u0263\7\6\2\2\u0263\u026e\b\33\1\2\u0264\u0265\7\7\2\2\u0265\u026e"+
		"\b\33\1\2\u0266\u0267\7\t\2\2\u0267\u026e\b\33\1\2\u0268\u0269\7\n\2\2"+
		"\u0269\u026e\b\33\1\2\u026a\u026b\7\r\2\2\u026b\u026c\7E\2\2\u026c\u026e"+
		"\b\33\1\2\u026d\u025c\3\2\2\2\u026d\u025e\3\2\2\2\u026d\u0260\3\2\2\2"+
		"\u026d\u0262\3\2\2\2\u026d\u0264\3\2\2\2\u026d\u0266\3\2\2\2\u026d\u0268"+
		"\3\2\2\2\u026d\u026a\3\2\2\2\u026e\65\3\2\2\2\u026f\u0270\7?\2\2\u0270"+
		"\u027d\b\34\1\2\u0271\u0272\7C\2\2\u0272\u027d\b\34\1\2\u0273\u0274\7"+
		"B\2\2\u0274\u027d\b\34\1\2\u0275\u0276\7@\2\2\u0276\u027d\b\34\1\2\u0277"+
		"\u0278\7D\2\2\u0278\u027d\b\34\1\2\u0279\u027a\7A\2\2\u027a\u027d\b\34"+
		"\1\2\u027b\u027d\7>\2\2\u027c\u026f\3\2\2\2\u027c\u0271\3\2\2\2\u027c"+
		"\u0273\3\2\2\2\u027c\u0275\3\2\2\2\u027c\u0277\3\2\2\2\u027c\u0279\3\2"+
		"\2\2\u027c\u027b\3\2\2\2\u027d\67\3\2\2\2\u027e\u027f\7-\2\2\u027f\u028f"+
		"\b\35\1\2\u0280\u0281\7.\2\2\u0281\u028f\b\35\1\2\u0282\u0283\7/\2\2\u0283"+
		"\u028f\b\35\1\2\u0284\u0285\7\60\2\2\u0285\u028f\b\35\1\2\u0286\u0287"+
		"\7\61\2\2\u0287\u028f\b\35\1\2\u0288\u0289\7\62\2\2\u0289\u028f\b\35\1"+
		"\2\u028a\u028b\7\63\2\2\u028b\u028f\b\35\1\2\u028c\u028d\7\64\2\2\u028d"+
		"\u028f\b\35\1\2\u028e\u027e\3\2\2\2\u028e\u0280\3\2\2\2\u028e\u0282\3"+
		"\2\2\2\u028e\u0284\3\2\2\2\u028e\u0286\3\2\2\2\u028e\u0288\3\2\2\2\u028e"+
		"\u028a\3\2\2\2\u028e\u028c\3\2\2\2\u028f9\3\2\2\2\u0290\u0291\7!\2\2\u0291"+
		"\u0299\b\36\1\2\u0292\u0293\7\"\2\2\u0293\u0299\b\36\1\2\u0294\u0295\7"+
		"#\2\2\u0295\u0299\b\36\1\2\u0296\u0297\7$\2\2\u0297\u0299\b\36\1\2\u0298"+
		"\u0290\3\2\2\2\u0298\u0292\3\2\2\2\u0298\u0294\3\2\2\2\u0298\u0296\3\2"+
		"\2\2\u0299;\3\2\2\2\u029a\u029b\7)\2\2\u029b\u02a3\b\37\1\2\u029c\u029d"+
		"\7*\2\2\u029d\u02a3\b\37\1\2\u029e\u029f\7+\2\2\u029f\u02a3\b\37\1\2\u02a0"+
		"\u02a1\7,\2\2\u02a1\u02a3\b\37\1\2\u02a2\u029a\3\2\2\2\u02a2\u029c\3\2"+
		"\2\2\u02a2\u029e\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3=\3\2\2\2\u02a4\u02a5"+
		"\7\'\2\2\u02a5\u02a9\b \1\2\u02a6\u02a7\7(\2\2\u02a7\u02a9\b \1\2\u02a8"+
		"\u02a4\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9?\3\2\2\2MAFLPWcet|\u0083\u008a"+
		"\u008f\u0099\u009d\u00a7\u00ab\u00b0\u00b7\u00bc\u00c3\u00c8\u00cd\u00d0"+
		"\u00de\u00e9\u00f5\u00f8\u0100\u0109\u0111\u0118\u0130\u0137\u0139\u0140"+
		"\u0145\u014d\u0153\u0156\u015d\u0164\u016b\u016d\u0172\u017b\u0181\u0187"+
		"\u018e\u019a\u01a1\u01a4\u01ab\u01ad\u01c5\u01c9\u01cd\u01cf\u01dd\u01e6"+
		"\u01ef\u01fa\u0204\u020f\u0212\u0227\u0237\u0239\u0247\u0249\u026d\u027c"+
		"\u028e\u0298\u02a2\u02a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}