
// Generated from FreedomLessLess.g4 by ANTLR 4.7.1

#pragma once
#include "antlr4-runtime.h"

class  FreedomLessLessLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1,
    INT_T = 2,
    UNSIGNED_T = 3,
    FLOAT_T = 4,
    DOUBLE_T = 5,
    SHORT_T = 6,

    CHAR_T = 7,
    BOOL_T = 8,
    VOID_T = 9,
    IMPORT = 10,
    CLASS = 11,
    PUBLIC = 12,

    PRIVATE = 13,
    MAIN = 14,
    IF = 15,
    ELSE = 16,
    FOR = 17,
    WHILE = 18,
    SWITCH = 19,

    CASE = 20,
    BREAK = 21,
    CONTINUE = 22,
    DEFAULT = 23,
    RETURN = 24,
    ASSIGN = 25,

    PLUS = 26,
    MINUS = 27,
    MULT = 28,
    DIV = 29,
    INCREM = 30,
    DECREM = 31,

    AUTOPLUS = 32,
    AUTOMINUS = 33,
    AUTOMULT = 34,
    AUTODIV = 35,
    LESS = 36,

    BIGGER = 37,
    LESS_EQ = 38,
    BIGGER_EQ = 39,
    EQUALS = 40,
    NOT_EQUALS = 41,

    AND = 42,
    OR = 43,
    OPEN_PAR = 44,
    CLOSE_PAR = 45,
    OPEN_KEY = 46,
    CLOSE_KEY = 47,

    OPEN_BRAK = 48,
    CLOSE_BRAK = 49,
    COMMA = 50,
    SEMICOLON = 51,
    TWOPOINTS = 52,

    BOOLEAN = 53,
    NULL = 54,
    STRING = 55,
    INTEGER = 56,
    FLOATING = 57,
    ID = 58,

    WS = 59,
    LINE_COMMENT = 60,
    COMMENT = 61
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

