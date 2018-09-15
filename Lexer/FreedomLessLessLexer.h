
// Generated from FreedomLessLess.g4 by ANTLR 4.7.1

#pragma once


#include "antlr4-runtime.h"




class  FreedomLessLessLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1, INT_T = 2, UNSIGNED_T = 3, FLOAT_T = 4, DOUBLE_T = 5, SHORT_T = 6, 
    CHAR_T = 7, BOOL_T = 8, VOID_T = 9, IMPORT = 10, CLASS = 11, PUBLIC = 12, 
    PRIVATE = 13, MAIN = 14, IF = 15, ELSE = 16, FOR = 17, WHILE = 18, SWITCH = 19, 
    CASE = 20, BREAK = 21, CONTINUE = 22, DEFAULT = 23, RETURN = 24, NEW = 25, 
    FREE = 26, MALLOC = 27, DELETE = 28, SIZEOF = 29, ASSIGN = 30, PLUS = 31, 
    MINUS = 32, MULT = 33, DIV = 34, REF = 35, ARROW = 36, INCREM = 37, 
    DECREM = 38, AUTOPLUS = 39, AUTOMINUS = 40, AUTOMULT = 41, AUTODIV = 42, 
    LESS = 43, BIGGER = 44, LESS_EQ = 45, BIGGER_EQ = 46, EQUALS = 47, NOT_EQUALS = 48, 
    AND = 49, OR = 50, OPEN_PAR = 51, CLOSE_PAR = 52, OPEN_KEY = 53, CLOSE_KEY = 54, 
    OPEN_BRAK = 55, CLOSE_BRAK = 56, COMMA = 57, SEMICOLON = 58, TWOPOINTS = 59, 
    NULL = 60, INT = 61, INTEGER = 62, BOOLEAN = 63, STRING = 64, CHAR = 65, 
    FLOATING = 66, ID = 67, COMMENT = 68, WS = 69, LINE_COMMENT = 70
  };

  FreedomLessLessLexer(antlr4::CharStream *input);
  ~FreedomLessLessLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

