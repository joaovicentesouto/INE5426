// Generated from FreedomLessLess.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

class SymbolEntry
{

	public String type; //! func, attr, class
	public String id;

	public String c_scope;
	public String f_scope;
	
	public String permission;

	public ArrayList<String> features;

	public boolean valid;

	public SymbolEntry() {}
};

interface ScopeInformation {
	public String type();
	public String c_scope();
	public String f_scope();
	public String permission();
}

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FreedomLessLessParser extends Parser {

	private static ArrayList<SymbolEntry> _symbolTable;

	public void lookUpTable(SymbolEntry entry)
	{
		SymbolEntry temp;
		
		for (int i = 0; i < _symbolTable.size(); i++)
		{
			temp = _symbolTable.get(i);
			
			if (temp.id != entry.id)
				continue;

			if (entry.valid) //! Definitions
			{
				//! Inside Global Definition
				if (entry.c_scope == "null" && entry.f_scope == "null")
				{
					//! Another definition || Same IDs and diff types
					if (temp.valid || entry.type != temp.type)
						throw new NoViableAltException(this);
					
					//! Different features -> error
					if (entry.features.equals(temp.features))
						throw new NoViableAltException(this);

					_symbolTable.remove(i);
					_symbolTable.add(entry);
					return;
				}
				
				//! Inside Global Function Definition
				else if (entry.c_scope == "null" && entry.f_scope != "null")
				{	
					if (temp.valid && temp.c_scope == "null" && temp.f_scope == "null")
						return;
				
				}
				
				//! Inside Global Class Definition
				else if (entry.c_scope != "null" && entry.f_scope == "null")
				{
					
					return;
				}
				
				//! Inside Function Class Definition
				else if (entry.c_scope != "null" && entry.f_scope != "null")
				{
					
					return;
				}
				
				//! Never
				throw new NoViableAltException(this);
				
			}
			else //! Use
			{
				return;
			}
		}
		
		//! Not found/match
		return;
	}

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
	public static class Program_defContext extends ParserRuleContext implements ScopeInformation {
		public Main_defContext main_def() {
			return getRuleContext(Main_defContext.class,0);
		}
		public List<Attribute_defContext> attribute_def() {
			return getRuleContexts(Attribute_defContext.class);
		}
		public Attribute_defContext attribute_def(int i) {
			return getRuleContext(Attribute_defContext.class,i);
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
			_permission = "null";
			_c_scope = "null";
			_f_scope = "null";
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "call";  }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
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
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					attribute_def();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					function_def();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(72);
				class_def();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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

	public static class Class_defContext extends ParserRuleContext implements ScopeInformation {
		public TerminalNode CLASS() { return getToken(FreedomLessLessParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessParser.ID, 0); }
		public TerminalNode OPEN_KEY() { return getToken(FreedomLessLessParser.OPEN_KEY, 0); }
		public Class_members_defContext class_members_def() {
			return getRuleContext(Class_members_defContext.class,0);
		}
		public TerminalNode CLOSE_KEY() { return getToken(FreedomLessLessParser.CLOSE_KEY, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
			_permission = "public";
			_c_scope = "null";
			_f_scope = "null";
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
		
		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "class"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(CLASS);
			setState(81);
			match(ID);
			
			//! Define name of the class ***CLASS
			_localctx._c_scope = _localctx.ID().getSymbol().getText();
			
			SymbolEntry entry = new SymbolEntry();

			entry.c_scope = _localctx.c_scope();
			entry.f_scope = _localctx.f_scope();
			entry.features.add("null");
			entry.permission = _localctx.permission();
			entry.id = _localctx.ID().getSymbol().getText();
			entry.type = _localctx.type();
			entry.valid = true;

			lookUpTable(entry);
			
			setState(82);
			match(OPEN_KEY);
			setState(83);
			class_members_def();
			setState(84);
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

	public static class Class_members_defContext extends ParserRuleContext implements ScopeInformation {
		public Private_defContext private_def() {
			return getRuleContext(Private_defContext.class,0);
		}
		public Public_defContext public_def() {
			return getRuleContext(Public_defContext.class,0);
		}
		public Class_members_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
			_permission = "null";
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = "null";
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
		
		@Override
		public String type() 		 { return "class"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Class_members_defContext class_members_def() throws RecognitionException {
		Class_members_defContext _localctx = new Class_members_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_members_def);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{	
				setState(86);
				private_def();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				public_def();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{	
					setState(88);
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

	public static class Public_defContext extends ParserRuleContext implements ScopeInformation {
		public TerminalNode PUBLIC() { return getToken(FreedomLessLessParser.PUBLIC, 0); }
		public Class_scope_defContext class_scope_def() {
			return getRuleContext(Class_scope_defContext.class,0);
		}
		public Public_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
			_permission = "public";
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = "null";
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
		
		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "class"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Public_defContext public_def() throws RecognitionException {
		Public_defContext _localctx = new Public_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_public_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(PUBLIC);
			setState(94);
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

	public static class Private_defContext extends ParserRuleContext implements ScopeInformation {
		public TerminalNode PRIVATE() { return getToken(FreedomLessLessParser.PRIVATE, 0); }
		public Class_scope_defContext class_scope_def() {
			return getRuleContext(Class_scope_defContext.class,0);
		}
		public Private_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
			_permission = "private";
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = "null";
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
		
		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "class"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Private_defContext private_def() throws RecognitionException {
		Private_defContext _localctx = new Private_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_private_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PRIVATE);
			setState(97);
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

	public static class Class_scope_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = "null";
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
		
		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "class"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Class_scope_defContext class_scope_def() throws RecognitionException {
		Class_scope_defContext _localctx = new Class_scope_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_scope_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			
			//! Attributes
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					attribute_def();
					setState(100);
					match(SEMICOLON);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			
			//! Functions
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << DOUBLE_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << VOID_T) | (1L << CLASS))) != 0)) {
				{
				{
				setState(107);
				function_def();
				}
				}
				setState(112);
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

	public static class Attribute_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).c_scope();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "variable"; }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Attribute_defContext attribute_def() throws RecognitionException {
		Attribute_defContext _localctx = new Attribute_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute_def);
		int _la;
		
		SymbolEntry entry;
		
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				type_def();

				setState(114);
				match(ID);

				//*********
				
				entry = new SymbolEntry();

				entry.c_scope = _localctx.c_scope();
				entry.f_scope = _localctx.f_scope();
				entry.features.add(_localctx.type_def().type());
				entry.permission = _localctx.permission();
				entry.id = _localctx.ID(1).getSymbol().getText();
				entry.type = _localctx.type();
				entry.valid = true;

				lookUpTable(entry);

				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(115);
					match(ASSIGN);
					setState(116);
					valued_expression_def();
					}
				}

				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					match(ID);

					//*********
				
					entry = new SymbolEntry();

					entry.c_scope = _localctx.c_scope();
					entry.f_scope = _localctx.f_scope();
					entry.features.add(_localctx.type_def().type());
					entry.permission = _localctx.permission();
					entry.id = _localctx.ID(2).getSymbol().getText();
					entry.type = _localctx.type();
					entry.valid = true;

					lookUpTable(entry);

					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(121);
						match(ASSIGN);
						setState(122);
						valued_expression_def();
						}
					}

					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				type_def();
				setState(131);
				match(ID);

				//*********
				
				entry = new SymbolEntry();

				entry.c_scope = _localctx.c_scope();
				entry.f_scope = _localctx.f_scope();
				entry.features.add(_localctx.type_def().type());
				entry.permission = _localctx.permission();
				entry.id = _localctx.ID(3).getSymbol().getText();
				entry.type = _localctx.type();
				entry.valid = true;

				lookUpTable(entry);

				setState(132);
				match(OPEN_BRAK);
				setState(133);
				match(INT);
				setState(134);
				match(CLOSE_BRAK);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(135);
					match(ASSIGN);
					setState(136);
					valued_expression_def();
					}
				}

				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(139);
					match(COMMA);
					setState(140);
					match(ID);

					//*********
				
					entry = new SymbolEntry();

					entry.c_scope = _localctx.c_scope();
					entry.f_scope = _localctx.f_scope();
					entry.features.add(_localctx.type_def().type());
					entry.permission = _localctx.permission();
					entry.id = _localctx.ID(4).getSymbol().getText();
					entry.type = _localctx.type();
					entry.valid = true;

					lookUpTable(entry);

					setState(141);
					match(OPEN_BRAK);
					setState(142);
					match(INT);
					setState(143);
					match(CLOSE_BRAK);
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(144);
						match(ASSIGN);
						setState(145);
						valued_expression_def();
						}
					}

					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				type_def();
				setState(154);
				match(MULT);
				setState(155);
				match(ID);

				//*********
				
				entry = new SymbolEntry();

				entry.c_scope = _localctx.c_scope();
				entry.f_scope = _localctx.f_scope();
				entry.features.add(_localctx.type_def().type());
				entry.permission = _localctx.permission();
				entry.id = _localctx.ID(5).getSymbol().getText();
				entry.type = _localctx.type();
				entry.valid = true;

				lookUpTable(entry);

				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(156);
					match(ASSIGN);
					setState(157);
					valued_expression_def();
					}
				}

				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(160);
					match(COMMA);
					setState(161);
					match(MULT);
					setState(162);
					match(ID);

					//*********
				
					entry = new SymbolEntry();

					entry.c_scope = _localctx.c_scope();
					entry.f_scope = _localctx.f_scope();
					entry.features.add(_localctx.type_def().type());
					entry.permission = _localctx.permission();
					entry.id = _localctx.ID(6).getSymbol().getText();
					entry.type = _localctx.type();
					entry.valid = true;

					lookUpTable(entry);

					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(163);
						match(ASSIGN);
						setState(164);
						valued_expression_def();
						}
					}

					}
					}
					setState(171);
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

	public static class Valued_expression_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "value"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Valued_expression_defContext valued_expression_def() throws RecognitionException {
		Valued_expression_defContext _localctx = new Valued_expression_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valued_expression_def);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				value_def();
				setState(175);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				function_call_def();
				setState(178);
				operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==REF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				match(OPEN_PAR);
				setState(182);
				valued_expression_def();
				setState(183);
				match(CLOSE_PAR);
				setState(184);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(ID);
				
				//**************

				SymbolEntry entry = new SymbolEntry();

				entry.permission = _localctx.permission();
				entry.c_scope = _localctx.c_scope();
				entry.f_scope = _localctx.f_scope();
				entry.features.add("null");
//				entry.features.add("arithmetic");
				entry.id = _localctx.ID().getSymbol().getText();
				entry.type = "variable";
				entry.valid = false;

				lookUpTable(entry);

				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
				case AUTOPLUS:
				case AUTOMINUS:
				case AUTOMULT:
				case AUTODIV:
					{
					{
					setState(189);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSIGN:
						{
						setState(187);
						match(ASSIGN);
						}
						break;
					case AUTOPLUS:
					case AUTOMINUS:
					case AUTOMULT:
					case AUTODIV:
						{
						setState(188);
						auto_assign_op();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(191);
					valued_expression_def();
					}
					}
					break;
				case INCREM:
				case DECREM:
					{
					setState(192);
					auto_increm_op();
					}
					break;
				case OPEN_BRAK:
					{
					setState(193);
					match(OPEN_BRAK);
					setState(194);
					match(INT);
					setState(195);
					match(CLOSE_BRAK);
					}
					break;
				case INT_T:
				case DOUBLE_T:
				case CHAR_T:
				case BOOL_T:
				case VOID_T:
				case CLASS:
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
				setState(198);
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

	public static class OperationContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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
		
		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "op"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
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
						setState(201);
						logical_op();
						}
						break;
					case PLUS:
					case MINUS:
					case MULT:
					case DIV:
						{
						setState(202);
						arithmetic_op();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(205);
					valued_expression_def();
					}
					} 
				}
				setState(211);
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

	public static class Function_call_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "call";  }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Function_call_defContext function_call_def() throws RecognitionException {
		Function_call_defContext _localctx = new Function_call_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call_def);
		int _la;
		
		SymbolEntry entry = new SymbolEntry();

		entry.permission = _localctx.permission();
		entry.c_scope = _localctx.c_scope();
		entry.f_scope = _localctx.f_scope();
		entry.valid = false;
		
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(DELETE);
				setState(213);
				match(ID);

				//**************
				
				entry.id = _localctx.ID(1).getSymbol().getText();;
				entry.type = "class";
				entry.features.add("class");
				entry.features.add("null"); //! significa que não conhecemos o ID das class ID.

				lookUpTable(entry);

				}
				break;
			case FREE:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(FREE);
				setState(215);
				match(OPEN_PAR);
				setState(216);
				match(ID);

				//**************
				
				entry.id = _localctx.ID(2).getSymbol().getText();
				entry.type = "variable";
				entry.features.add("null");

				lookUpTable(entry);

				setState(217);
				match(CLOSE_PAR);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(NEW);
				setState(219);
				match(ID);
				
				//**************
				
				entry.id = _localctx.ID(3).getSymbol().getText();
				entry.type = "class";
				entry.features.add("null");

				lookUpTable(entry);
				
				entry = new SymbolEntry();

				entry.permission = _localctx.permission();
				entry.c_scope = _localctx.c_scope();
				entry.f_scope = _localctx.f_scope();
				entry.valid = false;
				
				entry.id = _localctx.ID(3).getSymbol().getText();
				entry.type = "function";
				entry.features.add("class " + entry.id); //! qual o retorno do construtor?

				setState(220);
				match(OPEN_PAR);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NEW - 25)) | (1L << (FREE - 25)) | (1L << (MALLOC - 25)) | (1L << (DELETE - 25)) | (1L << (SIZEOF - 25)) | (1L << (MULT - 25)) | (1L << (REF - 25)) | (1L << (NULL - 25)) | (1L << (INT - 25)) | (1L << (INTEGER - 25)) | (1L << (BOOLEAN - 25)) | (1L << (STRING - 25)) | (1L << (CHAR - 25)) | (1L << (FLOATING - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(221);
					argument_def();
					}
					
					Argument_defContext arg = _localctx.argument_def(1);
					for (Valued_expression_defContext c : arg.valued_expression_def())
						entry.features.add(c.type()); //! mudar o type conforme o tipo das operações???
				}
				
				lookUpTable(entry);

				setState(224);
				match(CLOSE_PAR);
				}
				break;
			case MALLOC:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(MALLOC);
				setState(226);
				match(OPEN_PAR);
				setState(227);
				valued_expression_def();
				
				int error;
				if (_localctx.valued_expression_def().type() != "numeric")
					error = 1;// throw "Error";
				
				setState(228);
				match(CLOSE_PAR);
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(SIZEOF);
				setState(231);
				match(OPEN_PAR);
				setState(232);
				type_def();
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(233);
					match(MULT);
					}
					break;
				case OPEN_BRAK:
					{
					setState(234);
					match(OPEN_BRAK);
					setState(235);
					match(INT);
					setState(236);
					match(CLOSE_BRAK);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(239);
				match(CLOSE_PAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(241);
					match(ID);

					//**************
					
					SymbolEntry entry_aux = new SymbolEntry();

					entry_aux.c_scope = _localctx.c_scope();
					entry_aux.f_scope = _localctx.f_scope();
					entry_aux.permission = _localctx.permission();
					entry_aux.id = _localctx.ID(4).getSymbol().getText();;
					entry_aux.type = "class";
					entry_aux.features.add("null");
					entry_aux.valid = false;

					lookUpTable(entry_aux);

					setState(242);
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
				setState(245);
				match(ID);

				//**************
				
				entry.id = _localctx.ID(5).getSymbol().getText();;
				entry.type = "function";
				entry.features.add("null");
				entry.valid = false;

				setState(246);
				match(OPEN_PAR);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NEW - 25)) | (1L << (FREE - 25)) | (1L << (MALLOC - 25)) | (1L << (DELETE - 25)) | (1L << (SIZEOF - 25)) | (1L << (MULT - 25)) | (1L << (REF - 25)) | (1L << (NULL - 25)) | (1L << (INT - 25)) | (1L << (INTEGER - 25)) | (1L << (BOOLEAN - 25)) | (1L << (STRING - 25)) | (1L << (CHAR - 25)) | (1L << (FLOATING - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					setState(247);
					argument_def();
					}
					
					Argument_defContext arg = _localctx.argument_def(2);
					for (Valued_expression_defContext c : arg.valued_expression_def())
						entry.features.add(c.type()); //! mudar o type conforme o tipo das operações???
				}
				
				lookUpTable(entry);

				setState(250);
				match(CLOSE_PAR);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==ARROW) {
					{
					{
					setState(251);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==ARROW) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(252);
					match(ID);

					//**************
				
					SymbolEntry entry_aux = new SymbolEntry();

					entry_aux.c_scope = _localctx.c_scope();
					entry_aux.f_scope = _localctx.f_scope();
					entry_aux.permission = _localctx.permission();
					entry_aux.id = _localctx.ID(6).getSymbol().getText();
					entry_aux.type = "function";
					entry_aux.features.add("null");
					entry_aux.valid = false;

					setState(253);
					match(OPEN_PAR);
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (NEW - 25)) | (1L << (FREE - 25)) | (1L << (MALLOC - 25)) | (1L << (DELETE - 25)) | (1L << (SIZEOF - 25)) | (1L << (MULT - 25)) | (1L << (REF - 25)) | (1L << (NULL - 25)) | (1L << (INT - 25)) | (1L << (INTEGER - 25)) | (1L << (BOOLEAN - 25)) | (1L << (STRING - 25)) | (1L << (CHAR - 25)) | (1L << (FLOATING - 25)) | (1L << (ID - 25)))) != 0)) {
						{
						setState(254);
						argument_def();
						}
						
						Argument_defContext arg = _localctx.argument_def(3);
						for (Valued_expression_defContext c : arg.valued_expression_def())
							entry_aux.features.add(c.type()); //! mudar o type conforme o tipo das operações???
					}
					
					lookUpTable(entry);

					setState(257);
					match(CLOSE_PAR);
					}
					}
					setState(262);
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

	public static class Argument_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "argument";  }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Argument_defContext argument_def() throws RecognitionException {
		Argument_defContext _localctx = new Argument_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argument_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			valued_expression_def();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				valued_expression_def();
				}
				}
				setState(272);
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

	public static class Function_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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
		
		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "function";  }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	private void getParamsTypes(SymbolEntry entry, Param_defContext p) {
		//! My own name
		entry.features.add(p.type_def().type());
			
		for (Param_defContext aux : p.param_def())
			getParamsTypes(entry, aux);
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_def);
		int _la;
		
		//! One valid function entry per call
		SymbolEntry entry = new SymbolEntry();
		entry.type = _localctx.type();
		entry.permission = _localctx.permission();
		entry.c_scope = _localctx.c_scope();
		entry.f_scope = _localctx.f_scope();
		entry.valid = true;
		
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_T:
				//! Return type
				entry.features.add("void");
				
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(VOID_T);
				setState(274);
				match(ID);
				
				//! Define ID on table
				entry.id = _localctx.ID().getSymbol().getText();
				
				setState(275);
				match(OPEN_PAR);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << DOUBLE_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << CLASS))) != 0)) {
					{
					setState(276);
					param_def();
					}
										
					Param_defContext param = _localctx.param_def();
					getParamsTypes(entry, param);
				}

				setState(279);
				match(CLOSE_PAR);
				
				//! Insert
				lookUpTable(entry);
				
				setState(280);
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
				setState(281);
				type_def();
				
				//! Return type
				entry.features.add(_localctx.type_def().type());
				
				setState(286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(282);
					match(MULT);
					}
					
					//! Return type
					entry.features.clear();
					entry.features.add(_localctx.type_def().type() + " *");
					
					break;
				case OPEN_BRAK:
					{
					setState(283);
					match(OPEN_BRAK);
					setState(284);
					match(INT);
					setState(285);
					match(CLOSE_BRAK);
					}
					
					//! Return type
					entry.features.clear();
					entry.features.add(_localctx.type_def().type() + "[" + _localctx.INT().getSymbol().getText() + "]");
					
					break;
				case ID:
					break;
				default:
					break;
				}
				setState(288);
				match(ID);
				
				//! Id
				entry.id =  _localctx.ID().getSymbol().getText();
				
				setState(289);
				match(OPEN_PAR);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << DOUBLE_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << CLASS))) != 0)) {
					{
					setState(290);
					param_def();
					}
					
					Param_defContext param = _localctx.param_def();
					getParamsTypes(entry, param);
				}

				setState(293);
				match(CLOSE_PAR);
				setState(294);
				
				//! Verify
				lookUpTable(entry);
				
				block_def();
				}
				break;
			default:
				// throw new NoViableAltException(this);
				int x;
				x = 1;
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

	public static class Param_defContext extends ParserRuleContext implements ScopeInformation {
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
			switch (((ScopeInformation) parent).type()) {
				case "program" :
					_c_scope = "null";
					_permission = "public";
					_f_scope = "null";
					break;
				case "class" : 
					_c_scope = ((ScopeInformation) parent).c_scope();
					_permission = ((ScopeInformation) parent).permission();
					_f_scope = "null";
					break;
				case "function" :
					_permission = "private";
					_c_scope = ((ScopeInformation) parent).c_scope();
					_f_scope = ((ScopeInformation) parent).f_scope();
					break;
				default:
					// throw new NoViableAltException(this);
					break;
			}
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
		
		@Override
		public String type() { return "variable"; }
		@Override
		public String c_scope() { return _c_scope; }
		@Override
		public String f_scope() { return _f_scope; }
		@Override
		public String permission() { return _permission; }

		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Param_defContext param_def() throws RecognitionException {
		Param_defContext _localctx = new Param_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_def);
		int _la;
		SymbolEntry entry;
		try {
			int _alt;
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				type_def();
				setState(299);
				match(MULT);
				setState(300);
				match(ID);

				//**************
				
				entry = new SymbolEntry();

				entry.c_scope = _localctx.c_scope();
				entry.f_scope = _localctx.f_scope();
				entry.features.add("null");
				entry.permission = _localctx.permission();
				entry.id = _localctx.ID().getSymbol().getText();;
				entry.type = _localctx.type();
				entry.valid = true;

				lookUpTable(entry);

				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(301);
						match(COMMA);
						setState(302);
						param_def();
						}
						} 
					}
					setState(307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				type_def();
				setState(309);
				match(ID);

				//**************
				
				entry = new SymbolEntry();

				entry.c_scope = _localctx.c_scope();
				entry.f_scope = _localctx.f_scope();
				entry.features.add("null");
				entry.permission = _localctx.permission();
				entry.id = _localctx.ID().getSymbol().getText();;
				entry.type = _localctx.type();
				entry.valid = true;

				lookUpTable(entry);

				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRAK) {
					{
					setState(310);
					match(OPEN_BRAK);
					setState(311);
					match(INT);
					setState(312);
					match(CLOSE_BRAK);
					}
				}

				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315);
						match(COMMA);
						setState(316);
						param_def();
						}
						} 
					}
					setState(321);
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

	public static class Block_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "block"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Block_defContext block_def() throws RecognitionException {
		Block_defContext _localctx = new Block_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(OPEN_KEY);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << DOUBLE_T) | (1L << CHAR_T) | (1L << BOOL_T) | (1L << CLASS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << FREE) | (1L << MALLOC) | (1L << DELETE) | (1L << SIZEOF) | (1L << MULT))) != 0) || _la==ID) {
				{
				setState(329);
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
					setState(325);
					valueless_expression_def();
					setState(326);
					match(SEMICOLON);
					}
					break;
				case IF:
				case FOR:
				case WHILE:
				case SWITCH:
					{
					setState(328);
					struct_def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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

	public static class Valueless_expression_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "valueless"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Valueless_expression_defContext valueless_expression_def() throws RecognitionException {
		Valueless_expression_defContext _localctx = new Valueless_expression_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valueless_expression_def);
		SymbolEntry entry;
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(BREAK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(CONTINUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				attribute_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				function_call_def();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				match(RETURN);
				setState(341);
				valued_expression_def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(342);
					match(MULT);
					setState(343);
					match(OPEN_PAR);
					setState(344);
					match(ID);

					//**************
				
					entry = new SymbolEntry();

					entry.c_scope = _localctx.c_scope();
					entry.f_scope = _localctx.f_scope();
					entry.features.add("null");
					entry.permission = _localctx.permission();
					entry.id = _localctx.ID().getSymbol().getText();;
					entry.type = _localctx.type();
					entry.valid = false;

					lookUpTable(entry);

					setState(345);
					match(CLOSE_PAR);
					}
					break;
				case ID:
					{
					setState(346);
					match(ID);

					//**************
				
					entry = new SymbolEntry();

					entry.c_scope = _localctx.c_scope();
					entry.f_scope = _localctx.f_scope();
					entry.features.add("null");
					entry.permission = _localctx.permission();
					entry.id = _localctx.ID().getSymbol().getText();;
					entry.type = _localctx.type();
					entry.valid = false;

					lookUpTable(entry);

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(355);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
				case AUTOPLUS:
				case AUTOMINUS:
				case AUTOMULT:
				case AUTODIV:
					{
					setState(351);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSIGN:
						{
						setState(349);
						match(ASSIGN);
						}
						break;
					case AUTOPLUS:
					case AUTOMINUS:
					case AUTOMULT:
					case AUTODIV:
						{
						setState(350);
						auto_assign_op();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(353);
					valued_expression_def();
					}
					break;
				case INCREM:
				case DECREM:
					{
					setState(354);
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

	public static class Struct_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "struct"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Struct_defContext struct_def() throws RecognitionException {
		Struct_defContext _localctx = new Struct_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_struct_def);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				if_def();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				for_def();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				while_def();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
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

	public static class If_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "if"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final If_defContext if_def() throws RecognitionException {
		If_defContext _localctx = new If_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(IF);
			setState(366);
			match(OPEN_PAR);
			setState(367);
			valued_expression_def();
			setState(368);
			match(CLOSE_PAR);
			setState(369);
			block_def();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(370);
				match(ELSE);
				setState(371);
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

	public static class For_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "for"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final For_defContext for_def() throws RecognitionException {
		For_defContext _localctx = new For_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(FOR);
			setState(375);
			match(OPEN_PAR);
			setState(376);
			valued_attribute_def();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377);
				match(COMMA);
				setState(378);
				valued_attribute_def();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			match(SEMICOLON);
			setState(385);
			valued_expression_def();
			setState(386);
			match(SEMICOLON);
			setState(387);
			valued_expression_def();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(389);
				valued_expression_def();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(CLOSE_PAR);
			setState(396);
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

	public static class Valued_attribute_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "valued"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Valued_attribute_defContext valued_attribute_def() throws RecognitionException {
		Valued_attribute_defContext _localctx = new Valued_attribute_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valued_attribute_def);
		SymbolEntry entry;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			type_def();
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				{
				setState(399);
				match(MULT);
				setState(400);
				match(ID);

				//**************
				
				entry = new SymbolEntry();

				entry.c_scope = _localctx.c_scope();
				entry.f_scope = _localctx.f_scope();
				entry.features.add("null");
				entry.permission = _localctx.permission();
				entry.id = _localctx.ID().getSymbol().getText();;
				entry.type = _localctx.type();
				entry.valid = true;

				lookUpTable(entry);

				}
				break;
			case ID:
				{
				setState(401);
				match(ID);
				
				//**************
				
				entry = new SymbolEntry();

				entry.c_scope = _localctx.c_scope();
				entry.f_scope = _localctx.f_scope();
				entry.features.add("null");
				entry.permission = _localctx.permission();
				entry.id = _localctx.ID().getSymbol().getText();;
				entry.type = _localctx.type();
				entry.valid = true;

				lookUpTable(entry);

				setState(402);
				match(OPEN_BRAK);
				setState(403);
				match(INT);
				setState(404);
				match(CLOSE_BRAK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(407);
			match(ASSIGN);
			setState(408);
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

	public static class While_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "while"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final While_defContext while_def() throws RecognitionException {
		While_defContext _localctx = new While_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(WHILE);
			setState(411);
			match(OPEN_PAR);
			setState(412);
			valued_expression_def();
			setState(413);
			match(CLOSE_PAR);
			setState(414);
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

	public static class Switch_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "switch"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Switch_defContext switch_def() throws RecognitionException {
		Switch_defContext _localctx = new Switch_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switch_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(SWITCH);
			setState(417);
			match(OPEN_PAR);
			setState(418);
			valued_expression_def();
			setState(419);
			match(CLOSE_PAR);
			setState(420);
			match(OPEN_KEY);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(421);
				switch_case_def();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			switch_default_def();
			setState(428);
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

	public static class Switch_case_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "switch case"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Switch_case_defContext switch_case_def() throws RecognitionException {
		Switch_case_defContext _localctx = new Switch_case_defContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switch_case_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(CASE);
			setState(431);
			value_def();
			setState(432);
			match(TWOPOINTS);
			setState(437); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(437);
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
						setState(433);
						valueless_expression_def();
						setState(434);
						match(SEMICOLON);
						}
						break;
					case IF:
					case FOR:
					case WHILE:
					case SWITCH:
						{
						setState(436);
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
				setState(439); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(441);
			match(BREAK);
			setState(442);
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

	public static class Switch_default_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "switch default"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Switch_default_defContext switch_default_def() throws RecognitionException {
		Switch_default_defContext _localctx = new Switch_default_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_default_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(DEFAULT);
			setState(445);
			match(TWOPOINTS);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(450);
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
						setState(446);
						valueless_expression_def();
						setState(447);
						match(SEMICOLON);
						}
						break;
					case IF:
					case FOR:
					case WHILE:
					case SWITCH:
						{
						setState(449);
						struct_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(455);
			match(BREAK);
			setState(456);
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

	public static class Main_defContext extends ParserRuleContext implements ScopeInformation {
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
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).c_scope();
			_f_scope = ((ScopeInformation) parent).f_scope();
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "main"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Main_defContext main_def() throws RecognitionException {
		Main_defContext _localctx = new Main_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_main_def);
		SymbolEntry entry;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(VOID_T);
			setState(459);
			match(MAIN);
			setState(460);
			match(OPEN_PAR);
			setState(461);
			match(INT_T);
			setState(462);
			match(ID);

			//**************
				
			entry = new SymbolEntry();

			entry.c_scope = _localctx.c_scope();
			entry.f_scope = _localctx.f_scope();
			entry.features.add("null");
			entry.permission = _localctx.permission();
			entry.id = _localctx.ID(0).getSymbol().getText();;
			entry.type = _localctx.type();
			entry.valid = true;

			lookUpTable(entry);
			setState(463);
			match(COMMA);
			setState(464);
			match(CHAR_T);
			setState(465);
			match(MULT);
			setState(466);
			match(MULT);
			setState(467);
			match(ID);

			//**************
				
			entry = new SymbolEntry();

			entry.c_scope = _localctx.c_scope();
			entry.f_scope = _localctx.f_scope();
			entry.features.add("null");
			entry.permission = _localctx.permission();
			entry.id = _localctx.ID(1).getSymbol().getText();;
			entry.type = _localctx.type();
			entry.valid = true;

			lookUpTable(entry);
			setState(468);
			match(CLOSE_PAR);
			setState(469);
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

	public static class Type_defContext extends ParserRuleContext implements ScopeInformation {
		public TerminalNode INT_T() { return getToken(FreedomLessLessParser.INT_T, 0); }
		public TerminalNode DOUBLE_T() { return getToken(FreedomLessLessParser.DOUBLE_T, 0); }
		public TerminalNode CHAR_T() { return getToken(FreedomLessLessParser.CHAR_T, 0); }
		public TerminalNode BOOL_T() { return getToken(FreedomLessLessParser.BOOL_T, 0); }
		public TerminalNode CLASS() { return getToken(FreedomLessLessParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(FreedomLessLessParser.ID, 0); }
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
			_permission = ((ScopeInformation) parent).permission();
			_c_scope = ((ScopeInformation) parent).permission();;
			_f_scope = ((ScopeInformation) parent).permission();;
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return _type; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
		public String _type = "type";
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type_def);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(INT_T);
				
				//! Define type
				_localctx._type = "int";
				}
				break;
			case DOUBLE_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(DOUBLE_T);
				
				//! Define type
				_localctx._type = "double";
				}
				break;
			case CHAR_T:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(CHAR_T);
				
				//! Define type
				_localctx._type = "char";
				}
				break;
			case BOOL_T:
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				match(BOOL_T);
				
				//! Define type
				_localctx._type = "bool";
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(475);
				match(CLASS);
				setState(476);
				match(ID);
				
				//! Define type
				_localctx._type = "class" + _localctx.ID().getSymbol().getText();;
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

	public static class Value_defContext extends ParserRuleContext implements ScopeInformation {
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return _type; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
		public String _type;
		public String _value;
	}

	public final Value_defContext value_def() throws RecognitionException {
		Value_defContext _localctx = new Value_defContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_value_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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

	public static class Logical_opContext extends ParserRuleContext implements ScopeInformation {
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "op"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logical_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
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

	public static class Arithmetic_opContext extends ParserRuleContext implements ScopeInformation {
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "arithmetic"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Arithmetic_opContext arithmetic_op() throws RecognitionException {
		Arithmetic_opContext _localctx = new Arithmetic_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithmetic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
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

	public static class Auto_assign_opContext extends ParserRuleContext implements ScopeInformation {
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

		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "auto assign"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Auto_assign_opContext auto_assign_op() throws RecognitionException {
		Auto_assign_opContext _localctx = new Auto_assign_opContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_auto_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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

	public static class Auto_increm_opContext extends ParserRuleContext implements ScopeInformation {
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
		//! Our session
		
		//! Methods
		@Override
		public String type() 		 { return "auto incre"; 	   }
		@Override
		public String c_scope() 	 { return _c_scope;    }
		@Override
		public String f_scope() 	 { return _f_scope;    }
		@Override
		public String permission() { return _permission; }

		//! Attributes
		public String _permission;
		public String _c_scope;
		public String _f_scope;
	}

	public final Auto_increm_opContext auto_increm_op() throws RecognitionException {
		Auto_increm_opContext _localctx = new Auto_increm_opContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_auto_increm_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u01ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2"+
		"O\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\\\n\4\5\4^\n\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\7\7\7o"+
		"\n\7\f\7\16\7r\13\7\3\b\3\b\3\b\3\b\5\bx\n\b\3\b\3\b\3\b\3\b\5\b~\n\b"+
		"\7\b\u0080\n\b\f\b\16\b\u0083\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0095\n\b\7\b\u0097\n\b\f\b\16\b"+
		"\u009a\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00a8\n\b\7\b\u00aa\n\b\f\b\16\b\u00ad\13\b\5\b\u00af\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c0\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00c7\n\t\3\t\5\t\u00ca\n\t\3\n\3\n\5\n\u00ce\n\n\3\n"+
		"\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00e1\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f0\n\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00f6\n\13\3\13\3\13\3\13\5\13\u00fb\n\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0102\n\13\3\13\7\13\u0105\n\13\f\13\16\13\u0108\13\13\5\13\u010a"+
		"\n\13\3\f\3\f\3\f\7\f\u010f\n\f\f\f\16\f\u0112\13\f\3\r\3\r\3\r\3\r\5"+
		"\r\u0118\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0121\n\r\3\r\3\r\3\r\5\r"+
		"\u0126\n\r\3\r\3\r\3\r\5\r\u012b\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u0132"+
		"\n\16\f\16\16\16\u0135\13\16\3\16\3\16\3\16\3\16\3\16\5\16\u013c\n\16"+
		"\3\16\3\16\7\16\u0140\n\16\f\16\16\16\u0143\13\16\5\16\u0145\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u014c\n\17\f\17\16\17\u014f\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u015e\n\20"+
		"\3\20\3\20\5\20\u0162\n\20\3\20\3\20\5\20\u0166\n\20\5\20\u0168\n\20\3"+
		"\21\3\21\3\21\3\21\5\21\u016e\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0177\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u017e\n\23\f\23\16\23\u0181"+
		"\13\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0189\n\23\f\23\16\23\u018c"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0198\n"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\7\26\u01a9\n\26\f\26\16\26\u01ac\13\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\6\27\u01b8\n\27\r\27\16\27\u01b9\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01c5\n\30\f\30\16\30\u01c8\13"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01e0\n\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\t\4\2##%%\4\2\3\3&&\3\2>"+
		"D\3\2-\64\3\2!$\3\2),\3\2\'(\2\u0218\2A\3\2\2\2\4R\3\2\2\2\6]\3\2\2\2"+
		"\b_\3\2\2\2\nb\3\2\2\2\fj\3\2\2\2\16\u00ae\3\2\2\2\20\u00c9\3\2\2\2\22"+
		"\u00d3\3\2\2\2\24\u0109\3\2\2\2\26\u010b\3\2\2\2\30\u012a\3\2\2\2\32\u0144"+
		"\3\2\2\2\34\u0146\3\2\2\2\36\u0167\3\2\2\2 \u016d\3\2\2\2\"\u016f\3\2"+
		"\2\2$\u0178\3\2\2\2&\u0190\3\2\2\2(\u019c\3\2\2\2*\u01a2\3\2\2\2,\u01b0"+
		"\3\2\2\2.\u01be\3\2\2\2\60\u01cc\3\2\2\2\62\u01df\3\2\2\2\64\u01e1\3\2"+
		"\2\2\66\u01e3\3\2\2\28\u01e5\3\2\2\2:\u01e7\3\2\2\2<\u01e9\3\2\2\2>@\5"+
		"\16\b\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF"+
		"\5\30\r\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2"+
		"JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2"+
		"PQ\5\60\31\2Q\3\3\2\2\2RS\7\r\2\2ST\7E\2\2TU\7\67\2\2UV\5\6\4\2VW\78\2"+
		"\2W\5\3\2\2\2X^\5\n\6\2Y[\5\b\5\2Z\\\5\n\6\2[Z\3\2\2\2[\\\3\2\2\2\\^\3"+
		"\2\2\2]X\3\2\2\2]Y\3\2\2\2^\7\3\2\2\2_`\7\16\2\2`a\5\f\7\2a\t\3\2\2\2"+
		"bc\7\17\2\2cd\5\f\7\2d\13\3\2\2\2ef\5\16\b\2fg\7<\2\2gi\3\2\2\2he\3\2"+
		"\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kp\3\2\2\2lj\3\2\2\2mo\5\30\r\2nm\3"+
		"\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rp\3\2\2\2st\5\62\32\2"+
		"tw\7E\2\2uv\7 \2\2vx\5\20\t\2wu\3\2\2\2wx\3\2\2\2x\u0081\3\2\2\2yz\7;"+
		"\2\2z}\7E\2\2{|\7 \2\2|~\5\20\t\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177"+
		"y\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u00af\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\62\32\2\u0085\u0086\7"+
		"E\2\2\u0086\u0087\79\2\2\u0087\u0088\7?\2\2\u0088\u008b\7:\2\2\u0089\u008a"+
		"\7 \2\2\u008a\u008c\5\20\t\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0098\3\2\2\2\u008d\u008e\7;\2\2\u008e\u008f\7E\2\2\u008f\u0090\79\2"+
		"\2\u0090\u0091\7?\2\2\u0091\u0094\7:\2\2\u0092\u0093\7 \2\2\u0093\u0095"+
		"\5\20\t\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2"+
		"\u0096\u008d\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u00af\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\5\62\32\2"+
		"\u009c\u009d\7#\2\2\u009d\u00a0\7E\2\2\u009e\u009f\7 \2\2\u009f\u00a1"+
		"\5\20\t\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ab\3\2\2\2"+
		"\u00a2\u00a3\7;\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a7\7E\2\2\u00a5\u00a6"+
		"\7 \2\2\u00a6\u00a8\5\20\t\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a2\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"s\3\2\2\2\u00ae\u0084\3\2\2\2\u00ae\u009b\3\2\2\2\u00af\17\3\2\2\2\u00b0"+
		"\u00b1\5\64\33\2\u00b1\u00b2\5\22\n\2\u00b2\u00ca\3\2\2\2\u00b3\u00b4"+
		"\5\24\13\2\u00b4\u00b5\5\22\n\2\u00b5\u00ca\3\2\2\2\u00b6\u00b7\t\2\2"+
		"\2\u00b7\u00b8\7\65\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00ba\7\66\2\2\u00ba"+
		"\u00bb\5\22\n\2\u00bb\u00ca\3\2\2\2\u00bc\u00c6\7E\2\2\u00bd\u00c0\7 "+
		"\2\2\u00be\u00c0\5:\36\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c7\5\20\t\2\u00c2\u00c7\5<\37\2\u00c3\u00c4\7"+
		"9\2\2\u00c4\u00c5\7?\2\2\u00c5\u00c7\7:\2\2\u00c6\u00bf\3\2\2\2\u00c6"+
		"\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00ca\5\22\n\2\u00c9\u00b0\3\2\2\2\u00c9\u00b3\3\2\2\2\u00c9"+
		"\u00b6\3\2\2\2\u00c9\u00bc\3\2\2\2\u00ca\21\3\2\2\2\u00cb\u00ce\5\66\34"+
		"\2\u00cc\u00ce\58\35\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\5\20\t\2\u00d0\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2"+
		"\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\23"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\36\2\2\u00d7\u010a\7E\2\2\u00d8"+
		"\u00d9\7\34\2\2\u00d9\u00da\7\65\2\2\u00da\u00db\7E\2\2\u00db\u010a\7"+
		"\66\2\2\u00dc\u00dd\7\33\2\2\u00dd\u00de\7E\2\2\u00de\u00e0\7\65\2\2\u00df"+
		"\u00e1\5\26\f\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u010a\7\66\2\2\u00e3\u00e4\7\35\2\2\u00e4\u00e5\7\65\2\2"+
		"\u00e5\u00e6\5\20\t\2\u00e6\u00e7\7\66\2\2\u00e7\u010a\3\2\2\2\u00e8\u00e9"+
		"\7\37\2\2\u00e9\u00ea\7\65\2\2\u00ea\u00ef\5\62\32\2\u00eb\u00f0\7#\2"+
		"\2\u00ec\u00ed\79\2\2\u00ed\u00ee\7?\2\2\u00ee\u00f0\7:\2\2\u00ef\u00eb"+
		"\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\7\66\2\2\u00f2\u010a\3\2\2\2\u00f3\u00f4\7E\2\2\u00f4\u00f6\t\3"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\7E\2\2\u00f8\u00fa\7\65\2\2\u00f9\u00fb\5\26\f\2\u00fa\u00f9\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0106\7\66\2\2\u00fd"+
		"\u00fe\t\3\2\2\u00fe\u00ff\7E\2\2\u00ff\u0101\7\65\2\2\u0100\u0102\5\26"+
		"\f\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\7\66\2\2\u0104\u00fd\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u00d6\3\2\2\2\u0109\u00d8\3\2\2\2\u0109\u00dc\3\2\2\2\u0109\u00e3\3\2"+
		"\2\2\u0109\u00e8\3\2\2\2\u0109\u00f5\3\2\2\2\u010a\25\3\2\2\2\u010b\u0110"+
		"\5\20\t\2\u010c\u010d\7;\2\2\u010d\u010f\5\20\t\2\u010e\u010c\3\2\2\2"+
		"\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\27"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\13\2\2\u0114\u0115\7E\2\2\u0115"+
		"\u0117\7\65\2\2\u0116\u0118\5\32\16\2\u0117\u0116\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\66\2\2\u011a\u012b\5\34\17"+
		"\2\u011b\u0120\5\62\32\2\u011c\u0121\7#\2\2\u011d\u011e\79\2\2\u011e\u011f"+
		"\7?\2\2\u011f\u0121\7:\2\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7E\2\2\u0123\u0125\7\65"+
		"\2\2\u0124\u0126\5\32\16\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\7\66\2\2\u0128\u0129\5\34\17\2\u0129\u012b"+
		"\3\2\2\2\u012a\u0113\3\2\2\2\u012a\u011b\3\2\2\2\u012b\31\3\2\2\2\u012c"+
		"\u012d\5\62\32\2\u012d\u012e\7#\2\2\u012e\u0133\7E\2\2\u012f\u0130\7;"+
		"\2\2\u0130\u0132\5\32\16\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0145\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0137\5\62\32\2\u0137\u013b\7E\2\2\u0138\u0139\79\2\2\u0139"+
		"\u013a\7?\2\2\u013a\u013c\7:\2\2\u013b\u0138\3\2\2\2\u013b\u013c\3\2\2"+
		"\2\u013c\u0141\3\2\2\2\u013d\u013e\7;\2\2\u013e\u0140\5\32\16\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u012c\3\2\2\2\u0144"+
		"\u0136\3\2\2\2\u0145\33\3\2\2\2\u0146\u014d\7\67\2\2\u0147\u0148\5\36"+
		"\20\2\u0148\u0149\7<\2\2\u0149\u014c\3\2\2\2\u014a\u014c\5 \21\2\u014b"+
		"\u0147\3\2\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0151\78\2\2\u0151\35\3\2\2\2\u0152\u0168\7\27\2\2\u0153\u0168\7\30\2"+
		"\2\u0154\u0168\5\16\b\2\u0155\u0168\5\24\13\2\u0156\u0157\7\32\2\2\u0157"+
		"\u0168\5\20\t\2\u0158\u0159\7#\2\2\u0159\u015a\7\65\2\2\u015a\u015b\7"+
		"E\2\2\u015b\u015e\7\66\2\2\u015c\u015e\7E\2\2\u015d\u0158\3\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\u0165\3\2\2\2\u015f\u0162\7 \2\2\u0160\u0162\5:\36"+
		"\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0166"+
		"\5\20\t\2\u0164\u0166\5<\37\2\u0165\u0161\3\2\2\2\u0165\u0164\3\2\2\2"+
		"\u0166\u0168\3\2\2\2\u0167\u0152\3\2\2\2\u0167\u0153\3\2\2\2\u0167\u0154"+
		"\3\2\2\2\u0167\u0155\3\2\2\2\u0167\u0156\3\2\2\2\u0167\u015d\3\2\2\2\u0168"+
		"\37\3\2\2\2\u0169\u016e\5\"\22\2\u016a\u016e\5$\23\2\u016b\u016e\5(\25"+
		"\2\u016c\u016e\5*\26\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016c\3\2\2\2\u016e!\3\2\2\2\u016f\u0170\7\21\2\2\u0170"+
		"\u0171\7\65\2\2\u0171\u0172\5\20\t\2\u0172\u0173\7\66\2\2\u0173\u0176"+
		"\5\34\17\2\u0174\u0175\7\22\2\2\u0175\u0177\5\34\17\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177#\3\2\2\2\u0178\u0179\7\23\2\2\u0179\u017a"+
		"\7\65\2\2\u017a\u017f\5&\24\2\u017b\u017c\7;\2\2\u017c\u017e\5&\24\2\u017d"+
		"\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7<\2\2\u0183"+
		"\u0184\5\20\t\2\u0184\u0185\7<\2\2\u0185\u018a\5\20\t\2\u0186\u0187\7"+
		";\2\2\u0187\u0189\5\20\t\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018d\u018e\7\66\2\2\u018e\u018f\5\34\17\2\u018f%\3\2\2\2\u0190\u0197"+
		"\5\62\32\2\u0191\u0192\7#\2\2\u0192\u0198\7E\2\2\u0193\u0194\7E\2\2\u0194"+
		"\u0195\79\2\2\u0195\u0196\7?\2\2\u0196\u0198\7:\2\2\u0197\u0191\3\2\2"+
		"\2\u0197\u0193\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7 \2\2\u019a\u019b"+
		"\5\20\t\2\u019b\'\3\2\2\2\u019c\u019d\7\24\2\2\u019d\u019e\7\65\2\2\u019e"+
		"\u019f\5\20\t\2\u019f\u01a0\7\66\2\2\u01a0\u01a1\5\34\17\2\u01a1)\3\2"+
		"\2\2\u01a2\u01a3\7\25\2\2\u01a3\u01a4\7\65\2\2\u01a4\u01a5\5\20\t\2\u01a5"+
		"\u01a6\7\66\2\2\u01a6\u01aa\7\67\2\2\u01a7\u01a9\5,\27\2\u01a8\u01a7\3"+
		"\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\5.\30\2\u01ae\u01af\78"+
		"\2\2\u01af+\3\2\2\2\u01b0\u01b1\7\26\2\2\u01b1\u01b2\5\64\33\2\u01b2\u01b7"+
		"\7=\2\2\u01b3\u01b4\5\36\20\2\u01b4\u01b5\7<\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b8\5 \21\2\u01b7\u01b3\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\7\27\2\2\u01bc\u01bd\7<\2\2\u01bd-\3\2\2\2\u01be\u01bf\7\31\2\2"+
		"\u01bf\u01c6\7=\2\2\u01c0\u01c1\5\36\20\2\u01c1\u01c2\7<\2\2\u01c2\u01c5"+
		"\3\2\2\2\u01c3\u01c5\5 \21\2\u01c4\u01c0\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7\27\2\2\u01ca\u01cb\7<\2\2\u01cb"+
		"/\3\2\2\2\u01cc\u01cd\7\13\2\2\u01cd\u01ce\7\20\2\2\u01ce\u01cf\7\65\2"+
		"\2\u01cf\u01d0\7\4\2\2\u01d0\u01d1\7E\2\2\u01d1\u01d2\7;\2\2\u01d2\u01d3"+
		"\7\t\2\2\u01d3\u01d4\7#\2\2\u01d4\u01d5\7#\2\2\u01d5\u01d6\7E\2\2\u01d6"+
		"\u01d7\7\66\2\2\u01d7\u01d8\5\34\17\2\u01d8\61\3\2\2\2\u01d9\u01e0\7\4"+
		"\2\2\u01da\u01e0\7\7\2\2\u01db\u01e0\7\t\2\2\u01dc\u01e0\7\n\2\2\u01dd"+
		"\u01de\7\r\2\2\u01de\u01e0\7E\2\2\u01df\u01d9\3\2\2\2\u01df\u01da\3\2"+
		"\2\2\u01df\u01db\3\2\2\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\63\3\2\2\2\u01e1\u01e2\t\4\2\2\u01e2\65\3\2\2\2\u01e3\u01e4\t\5\2\2\u01e4"+
		"\67\3\2\2\2\u01e5\u01e6\t\6\2\2\u01e69\3\2\2\2\u01e7\u01e8\t\7\2\2\u01e8"+
		";\3\2\2\2\u01e9\u01ea\t\b\2\2\u01ea=\3\2\2\29AGM[]jpw}\u0081\u008b\u0094"+
		"\u0098\u00a0\u00a7\u00ab\u00ae\u00bf\u00c6\u00c9\u00cd\u00d3\u00e0\u00ef"+
		"\u00f5\u00fa\u0101\u0106\u0109\u0110\u0117\u0120\u0125\u012a\u0133\u013b"+
		"\u0141\u0144\u014b\u014d\u015d\u0161\u0165\u0167\u016d\u0176\u017f\u018a"+
		"\u0197\u01aa\u01b7\u01b9\u01c4\u01c6\u01df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}