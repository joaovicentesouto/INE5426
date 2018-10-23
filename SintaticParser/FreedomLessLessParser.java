// Generated from FreedomLessLess.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FreedomLessLessParser extends Parser {
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
		RULE_program_def = 0, RULE_class_def = 1, RULE_class_members_def = 2, 
		RULE_public_def = 3, RULE_private_def = 4, RULE_class_scope_def = 5, RULE_attribute_def = 6, 
		RULE_valued_expression_def = 7, RULE_operation = 8, RULE_function_call_def = 9, 
		RULE_argument_def = 10, RULE_function_def = 11, RULE_param_def = 12, RULE_block_def = 13, 
		RULE_valueless_expression_def = 14, RULE_struct_def = 15, RULE_if_def = 16, 
		RULE_for_def = 17, RULE_valued_attribute_def = 18, RULE_while_def = 19, 
		RULE_switch_def = 20, RULE_switch_case_def = 21, RULE_switch_default_def = 22, 
		RULE_main_def = 23, RULE_type_def = 24, RULE_value_def = 25, RULE_logical_op = 26, 
		RULE_arithmetic_op = 27, RULE_auto_assign_op = 28, RULE_auto_increm_op = 29;
	public static final String[] ruleNames = {
		"program_def", "class_def", "class_members_def", "public_def", "private_def", 
		"class_scope_def", "attribute_def", "valued_expression_def", "operation", 
		"function_call_def", "argument_def", "function_def", "param_def", "block_def", 
		"valueless_expression_def", "struct_def", "if_def", "for_def", "valued_attribute_def", 
		"while_def", "switch_def", "switch_case_def", "switch_default_def", "main_def", 
		"type_def", "value_def", "logical_op", "arithmetic_op", "auto_assign_op", 
		"auto_increm_op"
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

	@Override
	public String getGrammarFileName() { return "FreedomLessLess.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FreedomLessLessParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Program_defContext extends ParserRuleContext {
		public Main_defContext main_def() {
			return getRuleContext(Main_defContext.class,0);
		}
		public List<Attribute_defContext> attribute_def() {
			return getRuleContexts(Attribute_defContext.class);
		}
		public Attribute_defContext attribute_def(int i) {
			return getRuleContext(Attribute_defContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessParser.SEMICOLON, i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public Program_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterProgram_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitProgram_def(this);
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
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					attribute_def();
					setState(61);
					match(SEMICOLON);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					function_def();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(74);
				class_def();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			main_def();
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
		public TerminalNode CLASS() { return getToken(FreedomLessLessParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessParser.ID, 0); }
		public TerminalNode OPEN_KEY() { return getToken(FreedomLessLessParser.OPEN_KEY, 0); }
		public Class_members_defContext class_members_def() {
			return getRuleContext(Class_members_defContext.class,0);
		}
		public TerminalNode CLOSE_KEY() { return getToken(FreedomLessLessParser.CLOSE_KEY, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CLASS);
			setState(83);
			match(ID);
			setState(84);
			match(OPEN_KEY);
			setState(85);
			class_members_def();
			setState(86);
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
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterClass_members_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitClass_members_def(this);
		}
	}

	public final Class_members_defContext class_members_def() throws RecognitionException {
		Class_members_defContext _localctx = new Class_members_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_members_def);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				private_def();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				public_def();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(90);
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
		public TerminalNode PUBLIC() { return getToken(FreedomLessLessParser.PUBLIC, 0); }
		public Class_scope_defContext class_scope_def() {
			return getRuleContext(Class_scope_defContext.class,0);
		}
		public Public_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_public_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterPublic_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitPublic_def(this);
		}
	}

	public final Public_defContext public_def() throws RecognitionException {
		Public_defContext _localctx = new Public_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_public_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(PUBLIC);
			setState(96);
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
		public TerminalNode PRIVATE() { return getToken(FreedomLessLessParser.PRIVATE, 0); }
		public Class_scope_defContext class_scope_def() {
			return getRuleContext(Class_scope_defContext.class,0);
		}
		public Private_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_private_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterPrivate_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitPrivate_def(this);
		}
	}

	public final Private_defContext private_def() throws RecognitionException {
		Private_defContext _localctx = new Private_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_private_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PRIVATE);
			setState(99);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessParser.SEMICOLON, i);
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
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterClass_scope_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitClass_scope_def(this);
		}
	}

	public final Class_scope_defContext class_scope_def() throws RecognitionException {
		Class_scope_defContext _localctx = new Class_scope_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_scope_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					attribute_def();
					setState(102);
					match(SEMICOLON);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << DOUBLE_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << VOID_T) | (1L << CLASS))) != 0)) {
				{
				{
				setState(109);
				function_def();
				}
				}
				setState(114);
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
		public List<TerminalNode> ID() { return getTokens(FreedomLessLessParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FreedomLessLessParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FreedomLessLessParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FreedomLessLessParser.ASSIGN, i);
		}
		public List<Valued_expression_defContext> valued_expression_def() {
			return getRuleContexts(Valued_expression_defContext.class);
		}
		public Valued_expression_defContext valued_expression_def(int i) {
			return getRuleContext(Valued_expression_defContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FreedomLessLessParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FreedomLessLessParser.COMMA, i);
		}
		public List<TerminalNode> OPEN_BRAK() { return getTokens(FreedomLessLessParser.OPEN_BRAK); }
		public TerminalNode OPEN_BRAK(int i) {
			return getToken(FreedomLessLessParser.OPEN_BRAK, i);
		}
		public List<TerminalNode> INT() { return getTokens(FreedomLessLessParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FreedomLessLessParser.INT, i);
		}
		public List<TerminalNode> CLOSE_BRAK() { return getTokens(FreedomLessLessParser.CLOSE_BRAK); }
		public TerminalNode CLOSE_BRAK(int i) {
			return getToken(FreedomLessLessParser.CLOSE_BRAK, i);
		}
		public List<TerminalNode> MULT() { return getTokens(FreedomLessLessParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(FreedomLessLessParser.MULT, i);
		}
		public Attribute_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterAttribute_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitAttribute_def(this);
		}
	}

	public final Attribute_defContext attribute_def() throws RecognitionException {
		Attribute_defContext _localctx = new Attribute_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute_def);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				type_def();
				setState(116);
				match(ID);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(117);
					match(ASSIGN);
					setState(118);
					valued_expression_def();
					}
				}

				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(121);
					match(COMMA);
					setState(122);
					match(ID);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(123);
						match(ASSIGN);
						setState(124);
						valued_expression_def();
						}
					}

					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				type_def();
				setState(133);
				match(ID);
				setState(134);
				match(OPEN_BRAK);
				setState(135);
				match(INT);
				setState(136);
				match(CLOSE_BRAK);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(137);
					match(ASSIGN);
					setState(138);
					valued_expression_def();
					}
				}

				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(141);
					match(COMMA);
					setState(142);
					match(ID);
					setState(143);
					match(OPEN_BRAK);
					setState(144);
					match(INT);
					setState(145);
					match(CLOSE_BRAK);
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(146);
						match(ASSIGN);
						setState(147);
						valued_expression_def();
						}
					}

					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				type_def();
				setState(156);
				match(MULT);
				setState(157);
				match(ID);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(158);
					match(ASSIGN);
					setState(159);
					valued_expression_def();
					}
				}

				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(162);
					match(COMMA);
					setState(163);
					match(MULT);
					setState(164);
					match(ID);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(165);
						match(ASSIGN);
						setState(166);
						valued_expression_def();
						}
					}

					}
					}
					setState(173);
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
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessParser.OPEN_PAR, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessParser.CLOSE_PAR, 0); }
		public TerminalNode MULT() { return getToken(FreedomLessLessParser.MULT, 0); }
		public TerminalNode REF() { return getToken(FreedomLessLessParser.REF, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessParser.ID, 0); }
		public Auto_increm_opContext auto_increm_op() {
			return getRuleContext(Auto_increm_opContext.class,0);
		}
		public TerminalNode OPEN_BRAK() { return getToken(FreedomLessLessParser.OPEN_BRAK, 0); }
		public TerminalNode INT() { return getToken(FreedomLessLessParser.INT, 0); }
		public TerminalNode CLOSE_BRAK() { return getToken(FreedomLessLessParser.CLOSE_BRAK, 0); }
		public TerminalNode ASSIGN() { return getToken(FreedomLessLessParser.ASSIGN, 0); }
		public Auto_assign_opContext auto_assign_op() {
			return getRuleContext(Auto_assign_opContext.class,0);
		}
		public Valued_expression_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valued_expression_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterValued_expression_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitValued_expression_def(this);
		}
	}

	public final Valued_expression_defContext valued_expression_def() throws RecognitionException {
		Valued_expression_defContext _localctx = new Valued_expression_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valued_expression_def);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				value_def();
				setState(177);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				function_call_def();
				setState(180);
				operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==REF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				match(OPEN_PAR);
				setState(184);
				valued_expression_def();
				setState(185);
				match(CLOSE_PAR);
				setState(186);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(ID);
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
				case AUTOPLUS:
				case AUTOMINUS:
				case AUTOMULT:
				case AUTODIV:
					{
					{
					setState(191);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSIGN:
						{
						setState(189);
						match(ASSIGN);
						}
						break;
					case AUTOPLUS:
					case AUTOMINUS:
					case AUTOMULT:
					case AUTODIV:
						{
						setState(190);
						auto_assign_op();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(193);
					valued_expression_def();
					}
					}
					break;
				case INCREM:
				case DECREM:
					{
					setState(194);
					auto_increm_op();
					}
					break;
				case OPEN_BRAK:
					{
					setState(195);
					match(OPEN_BRAK);
					setState(196);
					match(INT);
					setState(197);
					match(CLOSE_BRAK);
					}
					break;
				case PLUS:
				case MINUS:
				case MULT:
				case DIV:
				case LESS:
				case BIGGER:
				case LESS_EQ:
				case BIGGER_EQ:
				case EQUALS:
				case NOT_EQUALS:
				case AND:
				case OR:
				case CLOSE_PAR:
				case COMMA:
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(200);
				operation();
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
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
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
						setState(203);
						logical_op();
						}
						break;
					case PLUS:
					case MINUS:
					case MULT:
					case DIV:
						{
						setState(204);
						arithmetic_op();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(207);
					valued_expression_def();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public TerminalNode DELETE() { return getToken(FreedomLessLessParser.DELETE, 0); }
		public List<TerminalNode> ID() { return getTokens(FreedomLessLessParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FreedomLessLessParser.ID, i);
		}
		public TerminalNode FREE() { return getToken(FreedomLessLessParser.FREE, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(FreedomLessLessParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(FreedomLessLessParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(FreedomLessLessParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(FreedomLessLessParser.CLOSE_PAR, i);
		}
		public TerminalNode NEW() { return getToken(FreedomLessLessParser.NEW, 0); }
		public List<Argument_defContext> argument_def() {
			return getRuleContexts(Argument_defContext.class);
		}
		public Argument_defContext argument_def(int i) {
			return getRuleContext(Argument_defContext.class,i);
		}
		public TerminalNode MALLOC() { return getToken(FreedomLessLessParser.MALLOC, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(FreedomLessLessParser.SIZEOF, 0); }
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FreedomLessLessParser.MULT, 0); }
		public TerminalNode OPEN_BRAK() { return getToken(FreedomLessLessParser.OPEN_BRAK, 0); }
		public TerminalNode INT() { return getToken(FreedomLessLessParser.INT, 0); }
		public TerminalNode CLOSE_BRAK() { return getToken(FreedomLessLessParser.CLOSE_BRAK, 0); }
		public List<TerminalNode> ARROW() { return getTokens(FreedomLessLessParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(FreedomLessLessParser.ARROW, i);
		}
		public Function_call_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterFunction_call_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitFunction_call_def(this);
		}
	}

	public final Function_call_defContext function_call_def() throws RecognitionException {
		Function_call_defContext _localctx = new Function_call_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call_def);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(DELETE);
				setState(215);
				match(ID);
				}
				break;
			case FREE:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(FREE);
				setState(217);
				match(OPEN_PAR);
				setState(218);
				match(ID);
				setState(219);
				match(CLOSE_PAR);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(NEW);
				setState(221);
				match(ID);
				setState(222);
				match(OPEN_PAR);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NEW - 25)) | (1L << (FREE - 25)) | (1L << (MALLOC - 25)) | (1L << (DELETE - 25)) | (1L << (SIZEOF - 25)) | (1L << (MULT - 25)) | (1L << (REF - 25)) | (1L << (NULL - 25)) | (1L << (INT - 25)) | (1L << (INTEGER - 25)) | (1L << (BOOLEAN - 25)) | (1L << (STRING - 25)) | (1L << (CHAR - 25)) | (1L << (FLOATING - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(223);
					argument_def();
					}
				}

				setState(226);
				match(CLOSE_PAR);
				}
				break;
			case MALLOC:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(MALLOC);
				setState(228);
				match(OPEN_PAR);
				setState(229);
				valued_expression_def();
				setState(230);
				match(CLOSE_PAR);
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(SIZEOF);
				setState(233);
				match(OPEN_PAR);
				setState(234);
				type_def();
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(235);
					match(MULT);
					}
					break;
				case OPEN_BRAK:
					{
					setState(236);
					match(OPEN_BRAK);
					setState(237);
					match(INT);
					setState(238);
					match(CLOSE_BRAK);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(241);
				match(CLOSE_PAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(243);
					match(ID);
					setState(244);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==ARROW) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(247);
				match(ID);
				setState(248);
				match(OPEN_PAR);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NEW - 25)) | (1L << (FREE - 25)) | (1L << (MALLOC - 25)) | (1L << (DELETE - 25)) | (1L << (SIZEOF - 25)) | (1L << (MULT - 25)) | (1L << (REF - 25)) | (1L << (NULL - 25)) | (1L << (INT - 25)) | (1L << (INTEGER - 25)) | (1L << (BOOLEAN - 25)) | (1L << (STRING - 25)) | (1L << (CHAR - 25)) | (1L << (FLOATING - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(249);
					argument_def();
					}
				}

				setState(252);
				match(CLOSE_PAR);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==ARROW) {
					{
					{
					setState(253);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==ARROW) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(254);
					match(ID);
					setState(255);
					match(OPEN_PAR);
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NEW - 25)) | (1L << (FREE - 25)) | (1L << (MALLOC - 25)) | (1L << (DELETE - 25)) | (1L << (SIZEOF - 25)) | (1L << (MULT - 25)) | (1L << (REF - 25)) | (1L << (NULL - 25)) | (1L << (INT - 25)) | (1L << (INTEGER - 25)) | (1L << (BOOLEAN - 25)) | (1L << (STRING - 25)) | (1L << (CHAR - 25)) | (1L << (FLOATING - 25)) | (1L << (ID - 25)))) != 0)) {
						{
						setState(256);
						argument_def();
						}
					}

					setState(259);
					match(CLOSE_PAR);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		public List<TerminalNode> COMMA() { return getTokens(FreedomLessLessParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FreedomLessLessParser.COMMA, i);
		}
		public Argument_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterArgument_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitArgument_def(this);
		}
	}

	public final Argument_defContext argument_def() throws RecognitionException {
		Argument_defContext _localctx = new Argument_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argument_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			valued_expression_def();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(268);
				match(COMMA);
				setState(269);
				valued_expression_def();
				}
				}
				setState(274);
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
		public TerminalNode VOID_T() { return getToken(FreedomLessLessParser.VOID_T, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessParser.ID, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessParser.CLOSE_PAR, 0); }
		public Block_defContext block_def() {
			return getRuleContext(Block_defContext.class,0);
		}
		public Param_defContext param_def() {
			return getRuleContext(Param_defContext.class,0);
		}
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FreedomLessLessParser.MULT, 0); }
		public TerminalNode OPEN_BRAK() { return getToken(FreedomLessLessParser.OPEN_BRAK, 0); }
		public TerminalNode INT() { return getToken(FreedomLessLessParser.INT, 0); }
		public TerminalNode CLOSE_BRAK() { return getToken(FreedomLessLessParser.CLOSE_BRAK, 0); }
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_def);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(VOID_T);
				setState(276);
				match(ID);
				setState(277);
				match(OPEN_PAR);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << DOUBLE_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << CLASS))) != 0)) {
					{
					setState(278);
					param_def();
					}
				}

				setState(281);
				match(CLOSE_PAR);
				setState(282);
				block_def();
				}
				break;
			case INT_T:
			case DOUBLE_T:
			case CHAR_T:
			case BOOL_T:
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				type_def();
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(284);
					match(MULT);
					}
					break;
				case OPEN_BRAK:
					{
					setState(285);
					match(OPEN_BRAK);
					setState(286);
					match(INT);
					setState(287);
					match(CLOSE_BRAK);
					}
					break;
				case ID:
					break;
				default:
					break;
				}
				setState(290);
				match(ID);
				setState(291);
				match(OPEN_PAR);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << DOUBLE_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << CLASS))) != 0)) {
					{
					setState(292);
					param_def();
					}
				}

				setState(295);
				match(CLOSE_PAR);
				setState(296);
				block_def();
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
		public TerminalNode MULT() { return getToken(FreedomLessLessParser.MULT, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FreedomLessLessParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FreedomLessLessParser.COMMA, i);
		}
		public List<Param_defContext> param_def() {
			return getRuleContexts(Param_defContext.class);
		}
		public Param_defContext param_def(int i) {
			return getRuleContext(Param_defContext.class,i);
		}
		public TerminalNode OPEN_BRAK() { return getToken(FreedomLessLessParser.OPEN_BRAK, 0); }
		public TerminalNode INT() { return getToken(FreedomLessLessParser.INT, 0); }
		public TerminalNode CLOSE_BRAK() { return getToken(FreedomLessLessParser.CLOSE_BRAK, 0); }
		public Param_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterParam_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitParam_def(this);
		}
	}

	public final Param_defContext param_def() throws RecognitionException {
		Param_defContext _localctx = new Param_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_def);
		int _la;
		try {
			int _alt;
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				type_def();
				setState(301);
				match(MULT);
				setState(302);
				match(ID);
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						match(COMMA);
						setState(304);
						param_def();
						}
						} 
					}
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				type_def();
				setState(311);
				match(ID);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRAK) {
					{
					setState(312);
					match(OPEN_BRAK);
					setState(313);
					match(INT);
					setState(314);
					match(CLOSE_BRAK);
					}
				}

				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(317);
						match(COMMA);
						setState(318);
						param_def();
						}
						} 
					}
					setState(323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		public TerminalNode OPEN_KEY() { return getToken(FreedomLessLessParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(FreedomLessLessParser.CLOSE_KEY, 0); }
		public List<Valueless_expression_defContext> valueless_expression_def() {
			return getRuleContexts(Valueless_expression_defContext.class);
		}
		public Valueless_expression_defContext valueless_expression_def(int i) {
			return getRuleContext(Valueless_expression_defContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessParser.SEMICOLON, i);
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
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterBlock_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitBlock_def(this);
		}
	}

	public final Block_defContext block_def() throws RecognitionException {
		Block_defContext _localctx = new Block_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(OPEN_KEY);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << DOUBLE_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << CLASS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << FREE) | (1L << MALLOC) | (1L << DELETE) | (1L << SIZEOF) | (1L << MULT))) != 0) || _la==ID) {
				{
				setState(331);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_T:
				case DOUBLE_T:
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
					setState(327);
					valueless_expression_def();
					setState(328);
					match(SEMICOLON);
					}
					break;
				case IF:
				case FOR:
				case WHILE:
				case SWITCH:
					{
					setState(330);
					struct_def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
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
		public TerminalNode BREAK() { return getToken(FreedomLessLessParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(FreedomLessLessParser.CONTINUE, 0); }
		public Attribute_defContext attribute_def() {
			return getRuleContext(Attribute_defContext.class,0);
		}
		public Function_call_defContext function_call_def() {
			return getRuleContext(Function_call_defContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(FreedomLessLessParser.RETURN, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FreedomLessLessParser.MULT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessParser.OPEN_PAR, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessParser.ID, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessParser.CLOSE_PAR, 0); }
		public Auto_increm_opContext auto_increm_op() {
			return getRuleContext(Auto_increm_opContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FreedomLessLessParser.ASSIGN, 0); }
		public Auto_assign_opContext auto_assign_op() {
			return getRuleContext(Auto_assign_opContext.class,0);
		}
		public Valueless_expression_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueless_expression_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterValueless_expression_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitValueless_expression_def(this);
		}
	}

	public final Valueless_expression_defContext valueless_expression_def() throws RecognitionException {
		Valueless_expression_defContext _localctx = new Valueless_expression_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valueless_expression_def);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(BREAK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(CONTINUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				attribute_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				function_call_def();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				match(RETURN);
				setState(343);
				valued_expression_def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(344);
					match(MULT);
					setState(345);
					match(OPEN_PAR);
					setState(346);
					match(ID);
					setState(347);
					match(CLOSE_PAR);
					}
					break;
				case ID:
					{
					setState(348);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
				case AUTOPLUS:
				case AUTOMINUS:
				case AUTOMULT:
				case AUTODIV:
					{
					setState(353);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSIGN:
						{
						setState(351);
						match(ASSIGN);
						}
						break;
					case AUTOPLUS:
					case AUTOMINUS:
					case AUTOMULT:
					case AUTODIV:
						{
						setState(352);
						auto_assign_op();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(355);
					valued_expression_def();
					}
					break;
				case INCREM:
				case DECREM:
					{
					setState(356);
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
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterStruct_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitStruct_def(this);
		}
	}

	public final Struct_defContext struct_def() throws RecognitionException {
		Struct_defContext _localctx = new Struct_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_struct_def);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				if_def();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				for_def();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				while_def();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				switch_def();
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
		public TerminalNode IF() { return getToken(FreedomLessLessParser.IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessParser.OPEN_PAR, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessParser.CLOSE_PAR, 0); }
		public List<Block_defContext> block_def() {
			return getRuleContexts(Block_defContext.class);
		}
		public Block_defContext block_def(int i) {
			return getRuleContext(Block_defContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FreedomLessLessParser.ELSE, 0); }
		public If_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterIf_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitIf_def(this);
		}
	}

	public final If_defContext if_def() throws RecognitionException {
		If_defContext _localctx = new If_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IF);
			setState(368);
			match(OPEN_PAR);
			setState(369);
			valued_expression_def();
			setState(370);
			match(CLOSE_PAR);
			setState(371);
			block_def();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(372);
				match(ELSE);
				setState(373);
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
		public TerminalNode FOR() { return getToken(FreedomLessLessParser.FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessParser.OPEN_PAR, 0); }
		public List<Valued_attribute_defContext> valued_attribute_def() {
			return getRuleContexts(Valued_attribute_defContext.class);
		}
		public Valued_attribute_defContext valued_attribute_def(int i) {
			return getRuleContext(Valued_attribute_defContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessParser.SEMICOLON, i);
		}
		public List<Valued_expression_defContext> valued_expression_def() {
			return getRuleContexts(Valued_expression_defContext.class);
		}
		public Valued_expression_defContext valued_expression_def(int i) {
			return getRuleContext(Valued_expression_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessParser.CLOSE_PAR, 0); }
		public Block_defContext block_def() {
			return getRuleContext(Block_defContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FreedomLessLessParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FreedomLessLessParser.COMMA, i);
		}
		public For_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterFor_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitFor_def(this);
		}
	}

	public final For_defContext for_def() throws RecognitionException {
		For_defContext _localctx = new For_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(FOR);
			setState(377);
			match(OPEN_PAR);
			setState(378);
			valued_attribute_def();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(379);
				match(COMMA);
				setState(380);
				valued_attribute_def();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(SEMICOLON);
			setState(387);
			valued_expression_def();
			setState(388);
			match(SEMICOLON);
			setState(389);
			valued_expression_def();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				valued_expression_def();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(CLOSE_PAR);
			setState(398);
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
		public TerminalNode ASSIGN() { return getToken(FreedomLessLessParser.ASSIGN, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FreedomLessLessParser.MULT, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessParser.ID, 0); }
		public TerminalNode OPEN_BRAK() { return getToken(FreedomLessLessParser.OPEN_BRAK, 0); }
		public TerminalNode INT() { return getToken(FreedomLessLessParser.INT, 0); }
		public TerminalNode CLOSE_BRAK() { return getToken(FreedomLessLessParser.CLOSE_BRAK, 0); }
		public Valued_attribute_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valued_attribute_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterValued_attribute_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitValued_attribute_def(this);
		}
	}

	public final Valued_attribute_defContext valued_attribute_def() throws RecognitionException {
		Valued_attribute_defContext _localctx = new Valued_attribute_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valued_attribute_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			type_def();
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				{
				setState(401);
				match(MULT);
				setState(402);
				match(ID);
				}
				break;
			case ID:
				{
				setState(403);
				match(ID);
				setState(404);
				match(OPEN_BRAK);
				setState(405);
				match(INT);
				setState(406);
				match(CLOSE_BRAK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(409);
			match(ASSIGN);
			setState(410);
			valued_expression_def();
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
		public TerminalNode WHILE() { return getToken(FreedomLessLessParser.WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessParser.OPEN_PAR, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessParser.CLOSE_PAR, 0); }
		public Block_defContext block_def() {
			return getRuleContext(Block_defContext.class,0);
		}
		public While_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterWhile_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitWhile_def(this);
		}
	}

	public final While_defContext while_def() throws RecognitionException {
		While_defContext _localctx = new While_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(WHILE);
			setState(413);
			match(OPEN_PAR);
			setState(414);
			valued_expression_def();
			setState(415);
			match(CLOSE_PAR);
			setState(416);
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
		public TerminalNode SWITCH() { return getToken(FreedomLessLessParser.SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessParser.OPEN_PAR, 0); }
		public Valued_expression_defContext valued_expression_def() {
			return getRuleContext(Valued_expression_defContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_KEY() { return getToken(FreedomLessLessParser.OPEN_KEY, 0); }
		public Switch_default_defContext switch_default_def() {
			return getRuleContext(Switch_default_defContext.class,0);
		}
		public TerminalNode CLOSE_KEY() { return getToken(FreedomLessLessParser.CLOSE_KEY, 0); }
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
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterSwitch_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitSwitch_def(this);
		}
	}

	public final Switch_defContext switch_def() throws RecognitionException {
		Switch_defContext _localctx = new Switch_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switch_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(SWITCH);
			setState(419);
			match(OPEN_PAR);
			setState(420);
			valued_expression_def();
			setState(421);
			match(CLOSE_PAR);
			setState(422);
			match(OPEN_KEY);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(423);
				switch_case_def();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			switch_default_def();
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

	public static class Switch_case_defContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FreedomLessLessParser.CASE, 0); }
		public Value_defContext value_def() {
			return getRuleContext(Value_defContext.class,0);
		}
		public TerminalNode TWOPOINTS() { return getToken(FreedomLessLessParser.TWOPOINTS, 0); }
		public TerminalNode BREAK() { return getToken(FreedomLessLessParser.BREAK, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessParser.SEMICOLON, i);
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
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterSwitch_case_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitSwitch_case_def(this);
		}
	}

	public final Switch_case_defContext switch_case_def() throws RecognitionException {
		Switch_case_defContext _localctx = new Switch_case_defContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switch_case_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(CASE);
			setState(433);
			value_def();
			setState(434);
			match(TWOPOINTS);
			setState(439); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(439);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_T:
					case DOUBLE_T:
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
						setState(435);
						valueless_expression_def();
						setState(436);
						match(SEMICOLON);
						}
						break;
					case IF:
					case FOR:
					case WHILE:
					case SWITCH:
						{
						setState(438);
						struct_def();
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
				setState(441); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(443);
			match(BREAK);
			setState(444);
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
		public TerminalNode DEFAULT() { return getToken(FreedomLessLessParser.DEFAULT, 0); }
		public TerminalNode TWOPOINTS() { return getToken(FreedomLessLessParser.TWOPOINTS, 0); }
		public TerminalNode BREAK() { return getToken(FreedomLessLessParser.BREAK, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(FreedomLessLessParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FreedomLessLessParser.SEMICOLON, i);
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
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterSwitch_default_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitSwitch_default_def(this);
		}
	}

	public final Switch_default_defContext switch_default_def() throws RecognitionException {
		Switch_default_defContext _localctx = new Switch_default_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_default_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(DEFAULT);
			setState(447);
			match(TWOPOINTS);
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(452);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_T:
					case DOUBLE_T:
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
						setState(448);
						valueless_expression_def();
						setState(449);
						match(SEMICOLON);
						}
						break;
					case IF:
					case FOR:
					case WHILE:
					case SWITCH:
						{
						setState(451);
						struct_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(457);
			match(BREAK);
			setState(458);
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
		public TerminalNode VOID_T() { return getToken(FreedomLessLessParser.VOID_T, 0); }
		public TerminalNode MAIN() { return getToken(FreedomLessLessParser.MAIN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FreedomLessLessParser.OPEN_PAR, 0); }
		public TerminalNode INT_T() { return getToken(FreedomLessLessParser.INT_T, 0); }
		public List<TerminalNode> ID() { return getTokens(FreedomLessLessParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FreedomLessLessParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(FreedomLessLessParser.COMMA, 0); }
		public TerminalNode CHAR_T() { return getToken(FreedomLessLessParser.CHAR_T, 0); }
		public List<TerminalNode> MULT() { return getTokens(FreedomLessLessParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(FreedomLessLessParser.MULT, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FreedomLessLessParser.CLOSE_PAR, 0); }
		public Block_defContext block_def() {
			return getRuleContext(Block_defContext.class,0);
		}
		public Main_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterMain_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitMain_def(this);
		}
	}

	public final Main_defContext main_def() throws RecognitionException {
		Main_defContext _localctx = new Main_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_main_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(VOID_T);
			setState(461);
			match(MAIN);
			setState(462);
			match(OPEN_PAR);
			setState(463);
			match(INT_T);
			setState(464);
			match(ID);
			setState(465);
			match(COMMA);
			setState(466);
			match(CHAR_T);
			setState(467);
			match(MULT);
			setState(468);
			match(MULT);
			setState(469);
			match(ID);
			setState(470);
			match(CLOSE_PAR);
			setState(471);
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
		public TerminalNode INT_T() { return getToken(FreedomLessLessParser.INT_T, 0); }
		public TerminalNode DOUBLE_T() { return getToken(FreedomLessLessParser.DOUBLE_T, 0); }
		public TerminalNode CHAR_T() { return getToken(FreedomLessLessParser.CHAR_T, 0); }
		public TerminalNode BOOL_T() { return getToken(FreedomLessLessParser.BOOL_T, 0); }
		public TerminalNode CLASS() { return getToken(FreedomLessLessParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessParser.ID, 0); }
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitType_def(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type_def);
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(INT_T);
				}
				break;
			case DOUBLE_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(DOUBLE_T);
				}
				break;
			case CHAR_T:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				match(CHAR_T);
				}
				break;
			case BOOL_T:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				match(BOOL_T);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(477);
				match(CLASS);
				setState(478);
				match(ID);
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
		public TerminalNode INT() { return getToken(FreedomLessLessParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(FreedomLessLessParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(FreedomLessLessParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(FreedomLessLessParser.INTEGER, 0); }
		public TerminalNode FLOATING() { return getToken(FreedomLessLessParser.FLOATING, 0); }
		public TerminalNode BOOLEAN() { return getToken(FreedomLessLessParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(FreedomLessLessParser.NULL, 0); }
		public Value_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterValue_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitValue_def(this);
		}
	}

	public final Value_defContext value_def() throws RecognitionException {
		Value_defContext _localctx = new Value_defContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_value_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (NULL - 60)) | (1L << (INT - 60)) | (1L << (INTEGER - 60)) | (1L << (BOOLEAN - 60)) | (1L << (STRING - 60)) | (1L << (CHAR - 60)) | (1L << (FLOATING - 60)))) != 0)) ) {
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

	public static class Logical_opContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(FreedomLessLessParser.LESS, 0); }
		public TerminalNode BIGGER() { return getToken(FreedomLessLessParser.BIGGER, 0); }
		public TerminalNode LESS_EQ() { return getToken(FreedomLessLessParser.LESS_EQ, 0); }
		public TerminalNode BIGGER_EQ() { return getToken(FreedomLessLessParser.BIGGER_EQ, 0); }
		public TerminalNode EQUALS() { return getToken(FreedomLessLessParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(FreedomLessLessParser.NOT_EQUALS, 0); }
		public TerminalNode AND() { return getToken(FreedomLessLessParser.AND, 0); }
		public TerminalNode OR() { return getToken(FreedomLessLessParser.OR, 0); }
		public Logical_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterLogical_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitLogical_op(this);
		}
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logical_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << BIGGER) | (1L << LESS_EQ) | (1L << BIGGER_EQ) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << AND) | (1L << OR))) != 0)) ) {
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

	public static class Arithmetic_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FreedomLessLessParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FreedomLessLessParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(FreedomLessLessParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FreedomLessLessParser.DIV, 0); }
		public Arithmetic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterArithmetic_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitArithmetic_op(this);
		}
	}

	public final Arithmetic_opContext arithmetic_op() throws RecognitionException {
		Arithmetic_opContext _localctx = new Arithmetic_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithmetic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV))) != 0)) ) {
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

	public static class Auto_assign_opContext extends ParserRuleContext {
		public TerminalNode AUTOPLUS() { return getToken(FreedomLessLessParser.AUTOPLUS, 0); }
		public TerminalNode AUTOMINUS() { return getToken(FreedomLessLessParser.AUTOMINUS, 0); }
		public TerminalNode AUTOMULT() { return getToken(FreedomLessLessParser.AUTOMULT, 0); }
		public TerminalNode AUTODIV() { return getToken(FreedomLessLessParser.AUTODIV, 0); }
		public Auto_assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auto_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterAuto_assign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitAuto_assign_op(this);
		}
	}

	public final Auto_assign_opContext auto_assign_op() throws RecognitionException {
		Auto_assign_opContext _localctx = new Auto_assign_opContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_auto_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTOPLUS) | (1L << AUTOMINUS) | (1L << AUTOMULT) | (1L << AUTODIV))) != 0)) ) {
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

	public static class Auto_increm_opContext extends ParserRuleContext {
		public TerminalNode INCREM() { return getToken(FreedomLessLessParser.INCREM, 0); }
		public TerminalNode DECREM() { return getToken(FreedomLessLessParser.DECREM, 0); }
		public Auto_increm_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auto_increm_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).enterAuto_increm_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreedomLessLessListener ) ((FreedomLessLessListener)listener).exitAuto_increm_op(this);
		}
	}

	public final Auto_increm_opContext auto_increm_op() throws RecognitionException {
		Auto_increm_opContext _localctx = new Auto_increm_opContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_auto_increm_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if ( !(_la==INCREM || _la==DECREM) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u01ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f"+
		"\2\16\2Q\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4^\n\4\5\4"+
		"`\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7"+
		"\7\7q\n\7\f\7\16\7t\13\7\3\b\3\b\3\b\3\b\5\bz\n\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0080\n\b\7\b\u0082\n\b\f\b\16\b\u0085\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u008e\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0097\n\b\7\b\u0099\n"+
		"\b\f\b\16\b\u009c\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a3\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00aa\n\b\7\b\u00ac\n\b\f\b\16\b\u00af\13\b\5\b\u00b1\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c2\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c9\n\t\3\t\5\t\u00cc\n\t\3\n\3\n\5\n\u00d0"+
		"\n\n\3\n\3\n\7\n\u00d4\n\n\f\n\16\n\u00d7\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00e3\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f2\n\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00f8\n\13\3\13\3\13\3\13\5\13\u00fd\n\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0104\n\13\3\13\7\13\u0107\n\13\f\13\16\13\u010a\13\13\5\13\u010c"+
		"\n\13\3\f\3\f\3\f\7\f\u0111\n\f\f\f\16\f\u0114\13\f\3\r\3\r\3\r\3\r\5"+
		"\r\u011a\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0123\n\r\3\r\3\r\3\r\5\r"+
		"\u0128\n\r\3\r\3\r\3\r\5\r\u012d\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u0134"+
		"\n\16\f\16\16\16\u0137\13\16\3\16\3\16\3\16\3\16\3\16\5\16\u013e\n\16"+
		"\3\16\3\16\7\16\u0142\n\16\f\16\16\16\u0145\13\16\5\16\u0147\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u014e\n\17\f\17\16\17\u0151\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0160\n\20"+
		"\3\20\3\20\5\20\u0164\n\20\3\20\3\20\5\20\u0168\n\20\5\20\u016a\n\20\3"+
		"\21\3\21\3\21\3\21\5\21\u0170\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0179\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u0180\n\23\f\23\16\23\u0183"+
		"\13\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u018b\n\23\f\23\16\23\u018e"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u019a\n"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\7\26\u01ab\n\26\f\26\16\26\u01ae\13\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\6\27\u01ba\n\27\r\27\16\27\u01bb\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01c7\n\30\f\30\16\30\u01ca\13"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01e2\n\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\t\4\2##%%\4\2\3\3&&\3\2>"+
		"D\3\2-\64\3\2!$\3\2),\3\2\'(\2\u021a\2C\3\2\2\2\4T\3\2\2\2\6_\3\2\2\2"+
		"\ba\3\2\2\2\nd\3\2\2\2\fl\3\2\2\2\16\u00b0\3\2\2\2\20\u00cb\3\2\2\2\22"+
		"\u00d5\3\2\2\2\24\u010b\3\2\2\2\26\u010d\3\2\2\2\30\u012c\3\2\2\2\32\u0146"+
		"\3\2\2\2\34\u0148\3\2\2\2\36\u0169\3\2\2\2 \u016f\3\2\2\2\"\u0171\3\2"+
		"\2\2$\u017a\3\2\2\2&\u0192\3\2\2\2(\u019e\3\2\2\2*\u01a4\3\2\2\2,\u01b2"+
		"\3\2\2\2.\u01c0\3\2\2\2\60\u01ce\3\2\2\2\62\u01e1\3\2\2\2\64\u01e3\3\2"+
		"\2\2\66\u01e5\3\2\2\28\u01e7\3\2\2\2:\u01e9\3\2\2\2<\u01eb\3\2\2\2>?\5"+
		"\16\b\2?@\7<\2\2@B\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3"+
		"\2\2\2EC\3\2\2\2FH\5\30\r\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO"+
		"\3\2\2\2KI\3\2\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P"+
		"R\3\2\2\2QO\3\2\2\2RS\5\60\31\2S\3\3\2\2\2TU\7\r\2\2UV\7E\2\2VW\7\67\2"+
		"\2WX\5\6\4\2XY\78\2\2Y\5\3\2\2\2Z`\5\n\6\2[]\5\b\5\2\\^\5\n\6\2]\\\3\2"+
		"\2\2]^\3\2\2\2^`\3\2\2\2_Z\3\2\2\2_[\3\2\2\2`\7\3\2\2\2ab\7\16\2\2bc\5"+
		"\f\7\2c\t\3\2\2\2de\7\17\2\2ef\5\f\7\2f\13\3\2\2\2gh\5\16\b\2hi\7<\2\2"+
		"ik\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mr\3\2\2\2nl\3\2\2\2"+
		"oq\5\30\r\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tr\3\2\2"+
		"\2uv\5\62\32\2vy\7E\2\2wx\7 \2\2xz\5\20\t\2yw\3\2\2\2yz\3\2\2\2z\u0083"+
		"\3\2\2\2{|\7;\2\2|\177\7E\2\2}~\7 \2\2~\u0080\5\20\t\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081{\3\2\2\2\u0082\u0085\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u00b1\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\5\62\32\2\u0087\u0088\7E\2\2\u0088\u0089\79\2\2\u0089"+
		"\u008a\7?\2\2\u008a\u008d\7:\2\2\u008b\u008c\7 \2\2\u008c\u008e\5\20\t"+
		"\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u009a\3\2\2\2\u008f\u0090"+
		"\7;\2\2\u0090\u0091\7E\2\2\u0091\u0092\79\2\2\u0092\u0093\7?\2\2\u0093"+
		"\u0096\7:\2\2\u0094\u0095\7 \2\2\u0095\u0097\5\20\t\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u008f\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00b1\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\62\32\2\u009e\u009f\7#\2\2\u009f"+
		"\u00a2\7E\2\2\u00a0\u00a1\7 \2\2\u00a1\u00a3\5\20\t\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ad\3\2\2\2\u00a4\u00a5\7;\2\2\u00a5"+
		"\u00a6\7#\2\2\u00a6\u00a9\7E\2\2\u00a7\u00a8\7 \2\2\u00a8\u00aa\5\20\t"+
		"\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a4"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0u\3\2\2\2\u00b0\u0086\3\2\2\2"+
		"\u00b0\u009d\3\2\2\2\u00b1\17\3\2\2\2\u00b2\u00b3\5\64\33\2\u00b3\u00b4"+
		"\5\22\n\2\u00b4\u00cc\3\2\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\5\22\n"+
		"\2\u00b7\u00cc\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9\u00ba\7\65\2\2\u00ba"+
		"\u00bb\5\20\t\2\u00bb\u00bc\7\66\2\2\u00bc\u00bd\5\22\n\2\u00bd\u00cc"+
		"\3\2\2\2\u00be\u00c8\7E\2\2\u00bf\u00c2\7 \2\2\u00c0\u00c2\5:\36\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c9\5\20"+
		"\t\2\u00c4\u00c9\5<\37\2\u00c5\u00c6\79\2\2\u00c6\u00c7\7?\2\2\u00c7\u00c9"+
		"\7:\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\5\22\n\2\u00cb\u00b2\3"+
		"\2\2\2\u00cb\u00b5\3\2\2\2\u00cb\u00b8\3\2\2\2\u00cb\u00be\3\2\2\2\u00cc"+
		"\21\3\2\2\2\u00cd\u00d0\5\66\34\2\u00ce\u00d0\58\35\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5\20\t\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\23\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9"+
		"\7\36\2\2\u00d9\u010c\7E\2\2\u00da\u00db\7\34\2\2\u00db\u00dc\7\65\2\2"+
		"\u00dc\u00dd\7E\2\2\u00dd\u010c\7\66\2\2\u00de\u00df\7\33\2\2\u00df\u00e0"+
		"\7E\2\2\u00e0\u00e2\7\65\2\2\u00e1\u00e3\5\26\f\2\u00e2\u00e1\3\2\2\2"+
		"\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u010c\7\66\2\2\u00e5\u00e6"+
		"\7\35\2\2\u00e6\u00e7\7\65\2\2\u00e7\u00e8\5\20\t\2\u00e8\u00e9\7\66\2"+
		"\2\u00e9\u010c\3\2\2\2\u00ea\u00eb\7\37\2\2\u00eb\u00ec\7\65\2\2\u00ec"+
		"\u00f1\5\62\32\2\u00ed\u00f2\7#\2\2\u00ee\u00ef\79\2\2\u00ef\u00f0\7?"+
		"\2\2\u00f0\u00f2\7:\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\66\2\2\u00f4\u010c\3"+
		"\2\2\2\u00f5\u00f6\7E\2\2\u00f6\u00f8\t\3\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7E\2\2\u00fa\u00fc\7\65"+
		"\2\2\u00fb\u00fd\5\26\f\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0108\7\66\2\2\u00ff\u0100\t\3\2\2\u0100\u0101\7"+
		"E\2\2\u0101\u0103\7\65\2\2\u0102\u0104\5\26\f\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\7\66\2\2\u0106\u00ff\3"+
		"\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u00d8\3\2\2\2\u010b\u00da\3\2"+
		"\2\2\u010b\u00de\3\2\2\2\u010b\u00e5\3\2\2\2\u010b\u00ea\3\2\2\2\u010b"+
		"\u00f7\3\2\2\2\u010c\25\3\2\2\2\u010d\u0112\5\20\t\2\u010e\u010f\7;\2"+
		"\2\u010f\u0111\5\20\t\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\27\3\2\2\2\u0114\u0112\3\2\2"+
		"\2\u0115\u0116\7\13\2\2\u0116\u0117\7E\2\2\u0117\u0119\7\65\2\2\u0118"+
		"\u011a\5\32\16\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\u011c\7\66\2\2\u011c\u012d\5\34\17\2\u011d\u0122\5\62\32"+
		"\2\u011e\u0123\7#\2\2\u011f\u0120\79\2\2\u0120\u0121\7?\2\2\u0121\u0123"+
		"\7:\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0125\7E\2\2\u0125\u0127\7\65\2\2\u0126\u0128\5\32"+
		"\16\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\7\66\2\2\u012a\u012b\5\34\17\2\u012b\u012d\3\2\2\2\u012c\u0115"+
		"\3\2\2\2\u012c\u011d\3\2\2\2\u012d\31\3\2\2\2\u012e\u012f\5\62\32\2\u012f"+
		"\u0130\7#\2\2\u0130\u0135\7E\2\2\u0131\u0132\7;\2\2\u0132\u0134\5\32\16"+
		"\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0147\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\5\62\32\2"+
		"\u0139\u013d\7E\2\2\u013a\u013b\79\2\2\u013b\u013c\7?\2\2\u013c\u013e"+
		"\7:\2\2\u013d\u013a\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0143\3\2\2\2\u013f"+
		"\u0140\7;\2\2\u0140\u0142\5\32\16\2\u0141\u013f\3\2\2\2\u0142\u0145\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u012e\3\2\2\2\u0146\u0138\3\2\2\2\u0147\33\3\2\2"+
		"\2\u0148\u014f\7\67\2\2\u0149\u014a\5\36\20\2\u014a\u014b\7<\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014e\5 \21\2\u014d\u0149\3\2\2\2\u014d\u014c\3\2"+
		"\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\78\2\2\u0153\35\3\2\2\2"+
		"\u0154\u016a\7\27\2\2\u0155\u016a\7\30\2\2\u0156\u016a\5\16\b\2\u0157"+
		"\u016a\5\24\13\2\u0158\u0159\7\32\2\2\u0159\u016a\5\20\t\2\u015a\u015b"+
		"\7#\2\2\u015b\u015c\7\65\2\2\u015c\u015d\7E\2\2\u015d\u0160\7\66\2\2\u015e"+
		"\u0160\7E\2\2\u015f\u015a\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0167\3\2"+
		"\2\2\u0161\u0164\7 \2\2\u0162\u0164\5:\36\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\5\20\t\2\u0166\u0168\5"+
		"<\37\2\u0167\u0163\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0154\3\2\2\2\u0169\u0155\3\2\2\2\u0169\u0156\3\2\2\2\u0169\u0157\3\2"+
		"\2\2\u0169\u0158\3\2\2\2\u0169\u015f\3\2\2\2\u016a\37\3\2\2\2\u016b\u0170"+
		"\5\"\22\2\u016c\u0170\5$\23\2\u016d\u0170\5(\25\2\u016e\u0170\5*\26\2"+
		"\u016f\u016b\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e"+
		"\3\2\2\2\u0170!\3\2\2\2\u0171\u0172\7\21\2\2\u0172\u0173\7\65\2\2\u0173"+
		"\u0174\5\20\t\2\u0174\u0175\7\66\2\2\u0175\u0178\5\34\17\2\u0176\u0177"+
		"\7\22\2\2\u0177\u0179\5\34\17\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2"+
		"\2\u0179#\3\2\2\2\u017a\u017b\7\23\2\2\u017b\u017c\7\65\2\2\u017c\u0181"+
		"\5&\24\2\u017d\u017e\7;\2\2\u017e\u0180\5&\24\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7<\2\2\u0185\u0186\5\20\t\2\u0186"+
		"\u0187\7<\2\2\u0187\u018c\5\20\t\2\u0188\u0189\7;\2\2\u0189\u018b\5\20"+
		"\t\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\66"+
		"\2\2\u0190\u0191\5\34\17\2\u0191%\3\2\2\2\u0192\u0199\5\62\32\2\u0193"+
		"\u0194\7#\2\2\u0194\u019a\7E\2\2\u0195\u0196\7E\2\2\u0196\u0197\79\2\2"+
		"\u0197\u0198\7?\2\2\u0198\u019a\7:\2\2\u0199\u0193\3\2\2\2\u0199\u0195"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7 \2\2\u019c\u019d\5\20\t\2\u019d"+
		"\'\3\2\2\2\u019e\u019f\7\24\2\2\u019f\u01a0\7\65\2\2\u01a0\u01a1\5\20"+
		"\t\2\u01a1\u01a2\7\66\2\2\u01a2\u01a3\5\34\17\2\u01a3)\3\2\2\2\u01a4\u01a5"+
		"\7\25\2\2\u01a5\u01a6\7\65\2\2\u01a6\u01a7\5\20\t\2\u01a7\u01a8\7\66\2"+
		"\2\u01a8\u01ac\7\67\2\2\u01a9\u01ab\5,\27\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\5.\30\2\u01b0\u01b1\78\2\2\u01b1"+
		"+\3\2\2\2\u01b2\u01b3\7\26\2\2\u01b3\u01b4\5\64\33\2\u01b4\u01b9\7=\2"+
		"\2\u01b5\u01b6\5\36\20\2\u01b6\u01b7\7<\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01ba\5 \21\2\u01b9\u01b5\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\7\27\2\2\u01be\u01bf\7<\2\2\u01bf-\3\2\2\2\u01c0\u01c1\7\31\2\2"+
		"\u01c1\u01c8\7=\2\2\u01c2\u01c3\5\36\20\2\u01c3\u01c4\7<\2\2\u01c4\u01c7"+
		"\3\2\2\2\u01c5\u01c7\5 \21\2\u01c6\u01c2\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7\27\2\2\u01cc\u01cd\7<\2\2\u01cd"+
		"/\3\2\2\2\u01ce\u01cf\7\13\2\2\u01cf\u01d0\7\20\2\2\u01d0\u01d1\7\65\2"+
		"\2\u01d1\u01d2\7\4\2\2\u01d2\u01d3\7E\2\2\u01d3\u01d4\7;\2\2\u01d4\u01d5"+
		"\7\t\2\2\u01d5\u01d6\7#\2\2\u01d6\u01d7\7#\2\2\u01d7\u01d8\7E\2\2\u01d8"+
		"\u01d9\7\66\2\2\u01d9\u01da\5\34\17\2\u01da\61\3\2\2\2\u01db\u01e2\7\4"+
		"\2\2\u01dc\u01e2\7\7\2\2\u01dd\u01e2\7\t\2\2\u01de\u01e2\7\n\2\2\u01df"+
		"\u01e0\7\r\2\2\u01e0\u01e2\7E\2\2\u01e1\u01db\3\2\2\2\u01e1\u01dc\3\2"+
		"\2\2\u01e1\u01dd\3\2\2\2\u01e1\u01de\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\63\3\2\2\2\u01e3\u01e4\t\4\2\2\u01e4\65\3\2\2\2\u01e5\u01e6\t\5\2\2\u01e6"+
		"\67\3\2\2\2\u01e7\u01e8\t\6\2\2\u01e89\3\2\2\2\u01e9\u01ea\t\7\2\2\u01ea"+
		";\3\2\2\2\u01eb\u01ec\t\b\2\2\u01ec=\3\2\2\29CIO]_lry\177\u0083\u008d"+
		"\u0096\u009a\u00a2\u00a9\u00ad\u00b0\u00c1\u00c8\u00cb\u00cf\u00d5\u00e2"+
		"\u00f1\u00f7\u00fc\u0103\u0108\u010b\u0112\u0119\u0122\u0127\u012c\u0135"+
		"\u013d\u0143\u0146\u014d\u014f\u015f\u0163\u0167\u0169\u016f\u0178\u0181"+
		"\u018c\u0199\u01ac\u01b9\u01bb\u01c6\u01c8\u01e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}