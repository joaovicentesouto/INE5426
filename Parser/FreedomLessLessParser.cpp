
// Generated from FreedomLessLess.g4 by ANTLR 4.7.1


#include "FreedomLessLessListener.h"

#include "FreedomLessLessParser.h"


using namespace antlrcpp;
using namespace antlr4;

FreedomLessLessParser::FreedomLessLessParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

FreedomLessLessParser::~FreedomLessLessParser() {
  delete _interpreter;
}

std::string FreedomLessLessParser::getGrammarFileName() const {
  return "FreedomLessLess.g4";
}

const std::vector<std::string>& FreedomLessLessParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& FreedomLessLessParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- Program_defContext ------------------------------------------------------------------

FreedomLessLessParser::Program_defContext::Program_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FreedomLessLessParser::Import_defContext* FreedomLessLessParser::Program_defContext::import_def() {
  return getRuleContext<FreedomLessLessParser::Import_defContext>(0);
}

std::vector<FreedomLessLessParser::Class_defContext *> FreedomLessLessParser::Program_defContext::class_def() {
  return getRuleContexts<FreedomLessLessParser::Class_defContext>();
}

FreedomLessLessParser::Class_defContext* FreedomLessLessParser::Program_defContext::class_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Class_defContext>(i);
}

std::vector<FreedomLessLessParser::Function_defContext *> FreedomLessLessParser::Program_defContext::function_def() {
  return getRuleContexts<FreedomLessLessParser::Function_defContext>();
}

FreedomLessLessParser::Function_defContext* FreedomLessLessParser::Program_defContext::function_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Function_defContext>(i);
}

FreedomLessLessParser::Main_defContext* FreedomLessLessParser::Program_defContext::main_def() {
  return getRuleContext<FreedomLessLessParser::Main_defContext>(0);
}


size_t FreedomLessLessParser::Program_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleProgram_def;
}

void FreedomLessLessParser::Program_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterProgram_def(this);
}

void FreedomLessLessParser::Program_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitProgram_def(this);
}

FreedomLessLessParser::Program_defContext* FreedomLessLessParser::program_def() {
  Program_defContext *_localctx = _tracker.createInstance<Program_defContext>(_ctx, getState());
  enterRule(_localctx, 0, FreedomLessLessParser::RuleProgram_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(63);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FreedomLessLessParser::IMPORT) {
      setState(62);
      import_def();
    }
    setState(68);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(65);
        class_def(); 
      }
      setState(70);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx);
    }
    setState(74);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(71);
        function_def(); 
      }
      setState(76);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx);
    }
    setState(78);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FreedomLessLessParser::VOID_T) {
      setState(77);
      main_def();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Import_defContext ------------------------------------------------------------------

FreedomLessLessParser::Import_defContext::Import_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Import_defContext::IMPORT() {
  return getTokens(FreedomLessLessParser::IMPORT);
}

tree::TerminalNode* FreedomLessLessParser::Import_defContext::IMPORT(size_t i) {
  return getToken(FreedomLessLessParser::IMPORT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Import_defContext::STRING() {
  return getTokens(FreedomLessLessParser::STRING);
}

tree::TerminalNode* FreedomLessLessParser::Import_defContext::STRING(size_t i) {
  return getToken(FreedomLessLessParser::STRING, i);
}


size_t FreedomLessLessParser::Import_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleImport_def;
}

void FreedomLessLessParser::Import_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterImport_def(this);
}

void FreedomLessLessParser::Import_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitImport_def(this);
}

FreedomLessLessParser::Import_defContext* FreedomLessLessParser::import_def() {
  Import_defContext *_localctx = _tracker.createInstance<Import_defContext>(_ctx, getState());
  enterRule(_localctx, 2, FreedomLessLessParser::RuleImport_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(82); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(80);
      match(FreedomLessLessParser::IMPORT);
      setState(81);
      match(FreedomLessLessParser::STRING);
      setState(84); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == FreedomLessLessParser::IMPORT);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Class_defContext ------------------------------------------------------------------

FreedomLessLessParser::Class_defContext::Class_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Class_defContext::CLASS() {
  return getToken(FreedomLessLessParser::CLASS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Class_defContext::ID() {
  return getToken(FreedomLessLessParser::ID, 0);
}

tree::TerminalNode* FreedomLessLessParser::Class_defContext::OPEN_KEY() {
  return getToken(FreedomLessLessParser::OPEN_KEY, 0);
}

FreedomLessLessParser::Class_members_defContext* FreedomLessLessParser::Class_defContext::class_members_def() {
  return getRuleContext<FreedomLessLessParser::Class_members_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Class_defContext::CLOSE_KEY() {
  return getToken(FreedomLessLessParser::CLOSE_KEY, 0);
}


size_t FreedomLessLessParser::Class_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleClass_def;
}

void FreedomLessLessParser::Class_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClass_def(this);
}

void FreedomLessLessParser::Class_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClass_def(this);
}

FreedomLessLessParser::Class_defContext* FreedomLessLessParser::class_def() {
  Class_defContext *_localctx = _tracker.createInstance<Class_defContext>(_ctx, getState());
  enterRule(_localctx, 4, FreedomLessLessParser::RuleClass_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(86);
    match(FreedomLessLessParser::CLASS);
    setState(87);
    match(FreedomLessLessParser::ID);
    setState(88);
    match(FreedomLessLessParser::OPEN_KEY);
    setState(89);
    class_members_def();
    setState(90);
    match(FreedomLessLessParser::CLOSE_KEY);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Class_members_defContext ------------------------------------------------------------------

FreedomLessLessParser::Class_members_defContext::Class_members_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FreedomLessLessParser::Private_defContext* FreedomLessLessParser::Class_members_defContext::private_def() {
  return getRuleContext<FreedomLessLessParser::Private_defContext>(0);
}

FreedomLessLessParser::Public_defContext* FreedomLessLessParser::Class_members_defContext::public_def() {
  return getRuleContext<FreedomLessLessParser::Public_defContext>(0);
}


size_t FreedomLessLessParser::Class_members_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleClass_members_def;
}

void FreedomLessLessParser::Class_members_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClass_members_def(this);
}

void FreedomLessLessParser::Class_members_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClass_members_def(this);
}

FreedomLessLessParser::Class_members_defContext* FreedomLessLessParser::class_members_def() {
  Class_members_defContext *_localctx = _tracker.createInstance<Class_members_defContext>(_ctx, getState());
  enterRule(_localctx, 6, FreedomLessLessParser::RuleClass_members_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(97);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case FreedomLessLessParser::PRIVATE: {
        enterOuterAlt(_localctx, 1);
        setState(92);
        private_def();
        break;
      }

      case FreedomLessLessParser::PUBLIC: {
        enterOuterAlt(_localctx, 2);
        setState(93);
        public_def();
        setState(95);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == FreedomLessLessParser::PRIVATE) {
          setState(94);
          private_def();
        }
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Public_defContext ------------------------------------------------------------------

FreedomLessLessParser::Public_defContext::Public_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Public_defContext::PUBLIC() {
  return getToken(FreedomLessLessParser::PUBLIC, 0);
}

FreedomLessLessParser::Class_scope_defContext* FreedomLessLessParser::Public_defContext::class_scope_def() {
  return getRuleContext<FreedomLessLessParser::Class_scope_defContext>(0);
}


size_t FreedomLessLessParser::Public_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RulePublic_def;
}

void FreedomLessLessParser::Public_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPublic_def(this);
}

void FreedomLessLessParser::Public_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPublic_def(this);
}

FreedomLessLessParser::Public_defContext* FreedomLessLessParser::public_def() {
  Public_defContext *_localctx = _tracker.createInstance<Public_defContext>(_ctx, getState());
  enterRule(_localctx, 8, FreedomLessLessParser::RulePublic_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(99);
    match(FreedomLessLessParser::PUBLIC);
    setState(100);
    class_scope_def();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Private_defContext ------------------------------------------------------------------

FreedomLessLessParser::Private_defContext::Private_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Private_defContext::PRIVATE() {
  return getToken(FreedomLessLessParser::PRIVATE, 0);
}

FreedomLessLessParser::Class_scope_defContext* FreedomLessLessParser::Private_defContext::class_scope_def() {
  return getRuleContext<FreedomLessLessParser::Class_scope_defContext>(0);
}


size_t FreedomLessLessParser::Private_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RulePrivate_def;
}

void FreedomLessLessParser::Private_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPrivate_def(this);
}

void FreedomLessLessParser::Private_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPrivate_def(this);
}

FreedomLessLessParser::Private_defContext* FreedomLessLessParser::private_def() {
  Private_defContext *_localctx = _tracker.createInstance<Private_defContext>(_ctx, getState());
  enterRule(_localctx, 10, FreedomLessLessParser::RulePrivate_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(102);
    match(FreedomLessLessParser::PRIVATE);
    setState(103);
    class_scope_def();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Class_scope_defContext ------------------------------------------------------------------

FreedomLessLessParser::Class_scope_defContext::Class_scope_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<FreedomLessLessParser::Attribute_defContext *> FreedomLessLessParser::Class_scope_defContext::attribute_def() {
  return getRuleContexts<FreedomLessLessParser::Attribute_defContext>();
}

FreedomLessLessParser::Attribute_defContext* FreedomLessLessParser::Class_scope_defContext::attribute_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Attribute_defContext>(i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Class_scope_defContext::SEMICOLON() {
  return getTokens(FreedomLessLessParser::SEMICOLON);
}

tree::TerminalNode* FreedomLessLessParser::Class_scope_defContext::SEMICOLON(size_t i) {
  return getToken(FreedomLessLessParser::SEMICOLON, i);
}

std::vector<FreedomLessLessParser::Function_defContext *> FreedomLessLessParser::Class_scope_defContext::function_def() {
  return getRuleContexts<FreedomLessLessParser::Function_defContext>();
}

FreedomLessLessParser::Function_defContext* FreedomLessLessParser::Class_scope_defContext::function_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Function_defContext>(i);
}


size_t FreedomLessLessParser::Class_scope_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleClass_scope_def;
}

void FreedomLessLessParser::Class_scope_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClass_scope_def(this);
}

void FreedomLessLessParser::Class_scope_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClass_scope_def(this);
}

FreedomLessLessParser::Class_scope_defContext* FreedomLessLessParser::class_scope_def() {
  Class_scope_defContext *_localctx = _tracker.createInstance<Class_scope_defContext>(_ctx, getState());
  enterRule(_localctx, 12, FreedomLessLessParser::RuleClass_scope_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(110);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(105);
        attribute_def();
        setState(106);
        match(FreedomLessLessParser::SEMICOLON); 
      }
      setState(112);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
    }
    setState(116);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FreedomLessLessParser::INT_T)
      | (1ULL << FreedomLessLessParser::UNSIGNED_T)
      | (1ULL << FreedomLessLessParser::FLOAT_T)
      | (1ULL << FreedomLessLessParser::DOUBLE_T)
      | (1ULL << FreedomLessLessParser::SHORT_T)
      | (1ULL << FreedomLessLessParser::CHAR_T)
      | (1ULL << FreedomLessLessParser::BOOL_T)
      | (1ULL << FreedomLessLessParser::VOID_T)
      | (1ULL << FreedomLessLessParser::CLASS))) != 0)) {
      setState(113);
      function_def();
      setState(118);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Attribute_defContext ------------------------------------------------------------------

FreedomLessLessParser::Attribute_defContext::Attribute_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FreedomLessLessParser::Type_defContext* FreedomLessLessParser::Attribute_defContext::type_def() {
  return getRuleContext<FreedomLessLessParser::Type_defContext>(0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Attribute_defContext::ID() {
  return getTokens(FreedomLessLessParser::ID);
}

tree::TerminalNode* FreedomLessLessParser::Attribute_defContext::ID(size_t i) {
  return getToken(FreedomLessLessParser::ID, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Attribute_defContext::ASSIGN() {
  return getTokens(FreedomLessLessParser::ASSIGN);
}

tree::TerminalNode* FreedomLessLessParser::Attribute_defContext::ASSIGN(size_t i) {
  return getToken(FreedomLessLessParser::ASSIGN, i);
}

std::vector<FreedomLessLessParser::Valued_expression_defContext *> FreedomLessLessParser::Attribute_defContext::valued_expression_def() {
  return getRuleContexts<FreedomLessLessParser::Valued_expression_defContext>();
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::Attribute_defContext::valued_expression_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Attribute_defContext::COMMA() {
  return getTokens(FreedomLessLessParser::COMMA);
}

tree::TerminalNode* FreedomLessLessParser::Attribute_defContext::COMMA(size_t i) {
  return getToken(FreedomLessLessParser::COMMA, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Attribute_defContext::OPEN_BRAK() {
  return getTokens(FreedomLessLessParser::OPEN_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Attribute_defContext::OPEN_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::OPEN_BRAK, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Attribute_defContext::INT() {
  return getTokens(FreedomLessLessParser::INT);
}

tree::TerminalNode* FreedomLessLessParser::Attribute_defContext::INT(size_t i) {
  return getToken(FreedomLessLessParser::INT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Attribute_defContext::CLOSE_BRAK() {
  return getTokens(FreedomLessLessParser::CLOSE_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Attribute_defContext::CLOSE_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::CLOSE_BRAK, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Attribute_defContext::MULT() {
  return getTokens(FreedomLessLessParser::MULT);
}

tree::TerminalNode* FreedomLessLessParser::Attribute_defContext::MULT(size_t i) {
  return getToken(FreedomLessLessParser::MULT, i);
}


size_t FreedomLessLessParser::Attribute_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleAttribute_def;
}

void FreedomLessLessParser::Attribute_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAttribute_def(this);
}

void FreedomLessLessParser::Attribute_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAttribute_def(this);
}

FreedomLessLessParser::Attribute_defContext* FreedomLessLessParser::attribute_def() {
  Attribute_defContext *_localctx = _tracker.createInstance<Attribute_defContext>(_ctx, getState());
  enterRule(_localctx, 14, FreedomLessLessParser::RuleAttribute_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(194);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(119);
      type_def();
      setState(120);
      match(FreedomLessLessParser::ID);
      setState(123);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == FreedomLessLessParser::ASSIGN) {
        setState(121);
        match(FreedomLessLessParser::ASSIGN);
        setState(122);
        valued_expression_def();
      }
      setState(133);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == FreedomLessLessParser::COMMA) {
        setState(125);
        match(FreedomLessLessParser::COMMA);
        setState(126);
        match(FreedomLessLessParser::ID);
        setState(129);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == FreedomLessLessParser::ASSIGN) {
          setState(127);
          match(FreedomLessLessParser::ASSIGN);
          setState(128);
          valued_expression_def();
        }
        setState(135);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(136);
      type_def();
      setState(137);
      match(FreedomLessLessParser::ID);
      setState(141); 
      _errHandler->sync(this);
      _la = _input->LA(1);
      do {
        setState(138);
        match(FreedomLessLessParser::OPEN_BRAK);
        setState(139);
        match(FreedomLessLessParser::INT);
        setState(140);
        match(FreedomLessLessParser::CLOSE_BRAK);
        setState(143); 
        _errHandler->sync(this);
        _la = _input->LA(1);
      } while (_la == FreedomLessLessParser::OPEN_BRAK);
      setState(147);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == FreedomLessLessParser::ASSIGN) {
        setState(145);
        match(FreedomLessLessParser::ASSIGN);
        setState(146);
        valued_expression_def();
      }
      setState(164);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == FreedomLessLessParser::COMMA) {
        setState(149);
        match(FreedomLessLessParser::COMMA);
        setState(150);
        match(FreedomLessLessParser::ID);
        setState(154); 
        _errHandler->sync(this);
        _la = _input->LA(1);
        do {
          setState(151);
          match(FreedomLessLessParser::OPEN_BRAK);
          setState(152);
          match(FreedomLessLessParser::INT);
          setState(153);
          match(FreedomLessLessParser::CLOSE_BRAK);
          setState(156); 
          _errHandler->sync(this);
          _la = _input->LA(1);
        } while (_la == FreedomLessLessParser::OPEN_BRAK);
        setState(160);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == FreedomLessLessParser::ASSIGN) {
          setState(158);
          match(FreedomLessLessParser::ASSIGN);
          setState(159);
          valued_expression_def();
        }
        setState(166);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(167);
      type_def();
      setState(169); 
      _errHandler->sync(this);
      _la = _input->LA(1);
      do {
        setState(168);
        match(FreedomLessLessParser::MULT);
        setState(171); 
        _errHandler->sync(this);
        _la = _input->LA(1);
      } while (_la == FreedomLessLessParser::MULT);
      setState(173);
      match(FreedomLessLessParser::ID);
      setState(176);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == FreedomLessLessParser::ASSIGN) {
        setState(174);
        match(FreedomLessLessParser::ASSIGN);
        setState(175);
        valued_expression_def();
      }
      setState(191);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == FreedomLessLessParser::COMMA) {
        setState(178);
        match(FreedomLessLessParser::COMMA);
        setState(180); 
        _errHandler->sync(this);
        _la = _input->LA(1);
        do {
          setState(179);
          match(FreedomLessLessParser::MULT);
          setState(182); 
          _errHandler->sync(this);
          _la = _input->LA(1);
        } while (_la == FreedomLessLessParser::MULT);
        setState(184);
        match(FreedomLessLessParser::ID);
        setState(187);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == FreedomLessLessParser::ASSIGN) {
          setState(185);
          match(FreedomLessLessParser::ASSIGN);
          setState(186);
          valued_expression_def();
        }
        setState(193);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Valued_expression_defContext ------------------------------------------------------------------

FreedomLessLessParser::Valued_expression_defContext::Valued_expression_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FreedomLessLessParser::Value_defContext* FreedomLessLessParser::Valued_expression_defContext::value_def() {
  return getRuleContext<FreedomLessLessParser::Value_defContext>(0);
}

FreedomLessLessParser::OperationContext* FreedomLessLessParser::Valued_expression_defContext::operation() {
  return getRuleContext<FreedomLessLessParser::OperationContext>(0);
}

FreedomLessLessParser::Function_call_defContext* FreedomLessLessParser::Valued_expression_defContext::function_call_def() {
  return getRuleContext<FreedomLessLessParser::Function_call_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_expression_defContext::OPEN_PAR() {
  return getToken(FreedomLessLessParser::OPEN_PAR, 0);
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::Valued_expression_defContext::valued_expression_def() {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_expression_defContext::CLOSE_PAR() {
  return getToken(FreedomLessLessParser::CLOSE_PAR, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_expression_defContext::MULT() {
  return getToken(FreedomLessLessParser::MULT, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_expression_defContext::REF() {
  return getToken(FreedomLessLessParser::REF, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_expression_defContext::ID() {
  return getToken(FreedomLessLessParser::ID, 0);
}

FreedomLessLessParser::Auto_increm_opContext* FreedomLessLessParser::Valued_expression_defContext::auto_increm_op() {
  return getRuleContext<FreedomLessLessParser::Auto_increm_opContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_expression_defContext::OPEN_BRAK() {
  return getToken(FreedomLessLessParser::OPEN_BRAK, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_expression_defContext::INT() {
  return getToken(FreedomLessLessParser::INT, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_expression_defContext::CLOSE_BRAK() {
  return getToken(FreedomLessLessParser::CLOSE_BRAK, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_expression_defContext::ASSIGN() {
  return getToken(FreedomLessLessParser::ASSIGN, 0);
}

FreedomLessLessParser::Auto_assign_opContext* FreedomLessLessParser::Valued_expression_defContext::auto_assign_op() {
  return getRuleContext<FreedomLessLessParser::Auto_assign_opContext>(0);
}


size_t FreedomLessLessParser::Valued_expression_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleValued_expression_def;
}

void FreedomLessLessParser::Valued_expression_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterValued_expression_def(this);
}

void FreedomLessLessParser::Valued_expression_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitValued_expression_def(this);
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::valued_expression_def() {
  Valued_expression_defContext *_localctx = _tracker.createInstance<Valued_expression_defContext>(_ctx, getState());
  enterRule(_localctx, 16, FreedomLessLessParser::RuleValued_expression_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(220);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 25, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(196);
      value_def();
      setState(197);
      operation();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(199);
      function_call_def();
      setState(200);
      operation();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(202);
      _la = _input->LA(1);
      if (!(_la == FreedomLessLessParser::MULT

      || _la == FreedomLessLessParser::REF)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(203);
      match(FreedomLessLessParser::OPEN_PAR);
      setState(204);
      valued_expression_def();
      setState(205);
      match(FreedomLessLessParser::CLOSE_PAR);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(207);
      match(FreedomLessLessParser::ID);
      setState(217);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case FreedomLessLessParser::ASSIGN:
        case FreedomLessLessParser::AUTOPLUS:
        case FreedomLessLessParser::AUTOMINUS:
        case FreedomLessLessParser::AUTOMULT:
        case FreedomLessLessParser::AUTODIV: {
          setState(210);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case FreedomLessLessParser::ASSIGN: {
              setState(208);
              match(FreedomLessLessParser::ASSIGN);
              break;
            }

            case FreedomLessLessParser::AUTOPLUS:
            case FreedomLessLessParser::AUTOMINUS:
            case FreedomLessLessParser::AUTOMULT:
            case FreedomLessLessParser::AUTODIV: {
              setState(209);
              auto_assign_op();
              break;
            }

          default:
            throw NoViableAltException(this);
          }
          setState(212);
          valued_expression_def();
          break;
        }

        case FreedomLessLessParser::INCREM:
        case FreedomLessLessParser::DECREM: {
          setState(213);
          auto_increm_op();
          break;
        }

        case FreedomLessLessParser::OPEN_BRAK: {
          setState(214);
          match(FreedomLessLessParser::OPEN_BRAK);
          setState(215);
          match(FreedomLessLessParser::INT);
          setState(216);
          match(FreedomLessLessParser::CLOSE_BRAK);
          break;
        }

        case FreedomLessLessParser::PLUS:
        case FreedomLessLessParser::MINUS:
        case FreedomLessLessParser::MULT:
        case FreedomLessLessParser::DIV:
        case FreedomLessLessParser::LESS:
        case FreedomLessLessParser::BIGGER:
        case FreedomLessLessParser::LESS_EQ:
        case FreedomLessLessParser::BIGGER_EQ:
        case FreedomLessLessParser::EQUALS:
        case FreedomLessLessParser::NOT_EQUALS:
        case FreedomLessLessParser::AND:
        case FreedomLessLessParser::OR:
        case FreedomLessLessParser::CLOSE_PAR:
        case FreedomLessLessParser::COMMA:
        case FreedomLessLessParser::SEMICOLON: {
          break;
        }

      default:
        break;
      }
      setState(219);
      operation();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OperationContext ------------------------------------------------------------------

FreedomLessLessParser::OperationContext::OperationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<FreedomLessLessParser::Valued_expression_defContext *> FreedomLessLessParser::OperationContext::valued_expression_def() {
  return getRuleContexts<FreedomLessLessParser::Valued_expression_defContext>();
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::OperationContext::valued_expression_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(i);
}

std::vector<FreedomLessLessParser::Logical_opContext *> FreedomLessLessParser::OperationContext::logical_op() {
  return getRuleContexts<FreedomLessLessParser::Logical_opContext>();
}

FreedomLessLessParser::Logical_opContext* FreedomLessLessParser::OperationContext::logical_op(size_t i) {
  return getRuleContext<FreedomLessLessParser::Logical_opContext>(i);
}

std::vector<FreedomLessLessParser::Arithmetic_opContext *> FreedomLessLessParser::OperationContext::arithmetic_op() {
  return getRuleContexts<FreedomLessLessParser::Arithmetic_opContext>();
}

FreedomLessLessParser::Arithmetic_opContext* FreedomLessLessParser::OperationContext::arithmetic_op(size_t i) {
  return getRuleContext<FreedomLessLessParser::Arithmetic_opContext>(i);
}


size_t FreedomLessLessParser::OperationContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleOperation;
}

void FreedomLessLessParser::OperationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOperation(this);
}

void FreedomLessLessParser::OperationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOperation(this);
}

FreedomLessLessParser::OperationContext* FreedomLessLessParser::operation() {
  OperationContext *_localctx = _tracker.createInstance<OperationContext>(_ctx, getState());
  enterRule(_localctx, 18, FreedomLessLessParser::RuleOperation);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(230);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 27, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(224);
        _errHandler->sync(this);
        switch (_input->LA(1)) {
          case FreedomLessLessParser::LESS:
          case FreedomLessLessParser::BIGGER:
          case FreedomLessLessParser::LESS_EQ:
          case FreedomLessLessParser::BIGGER_EQ:
          case FreedomLessLessParser::EQUALS:
          case FreedomLessLessParser::NOT_EQUALS:
          case FreedomLessLessParser::AND:
          case FreedomLessLessParser::OR: {
            setState(222);
            logical_op();
            break;
          }

          case FreedomLessLessParser::PLUS:
          case FreedomLessLessParser::MINUS:
          case FreedomLessLessParser::MULT:
          case FreedomLessLessParser::DIV: {
            setState(223);
            arithmetic_op();
            break;
          }

        default:
          throw NoViableAltException(this);
        }
        setState(226);
        valued_expression_def(); 
      }
      setState(232);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 27, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Function_call_defContext ------------------------------------------------------------------

FreedomLessLessParser::Function_call_defContext::Function_call_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::DELETE() {
  return getToken(FreedomLessLessParser::DELETE, 0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_call_defContext::ID() {
  return getTokens(FreedomLessLessParser::ID);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::ID(size_t i) {
  return getToken(FreedomLessLessParser::ID, i);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::FREE() {
  return getToken(FreedomLessLessParser::FREE, 0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_call_defContext::OPEN_PAR() {
  return getTokens(FreedomLessLessParser::OPEN_PAR);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::OPEN_PAR(size_t i) {
  return getToken(FreedomLessLessParser::OPEN_PAR, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_call_defContext::CLOSE_PAR() {
  return getTokens(FreedomLessLessParser::CLOSE_PAR);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::CLOSE_PAR(size_t i) {
  return getToken(FreedomLessLessParser::CLOSE_PAR, i);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::NEW() {
  return getToken(FreedomLessLessParser::NEW, 0);
}

std::vector<FreedomLessLessParser::Argument_defContext *> FreedomLessLessParser::Function_call_defContext::argument_def() {
  return getRuleContexts<FreedomLessLessParser::Argument_defContext>();
}

FreedomLessLessParser::Argument_defContext* FreedomLessLessParser::Function_call_defContext::argument_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Argument_defContext>(i);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::MALLOC() {
  return getToken(FreedomLessLessParser::MALLOC, 0);
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::Function_call_defContext::valued_expression_def() {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::SIZEOF() {
  return getToken(FreedomLessLessParser::SIZEOF, 0);
}

FreedomLessLessParser::Type_defContext* FreedomLessLessParser::Function_call_defContext::type_def() {
  return getRuleContext<FreedomLessLessParser::Type_defContext>(0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_call_defContext::MULT() {
  return getTokens(FreedomLessLessParser::MULT);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::MULT(size_t i) {
  return getToken(FreedomLessLessParser::MULT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_call_defContext::OPEN_BRAK() {
  return getTokens(FreedomLessLessParser::OPEN_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::OPEN_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::OPEN_BRAK, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_call_defContext::INT() {
  return getTokens(FreedomLessLessParser::INT);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::INT(size_t i) {
  return getToken(FreedomLessLessParser::INT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_call_defContext::CLOSE_BRAK() {
  return getTokens(FreedomLessLessParser::CLOSE_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::CLOSE_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::CLOSE_BRAK, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_call_defContext::ARROW() {
  return getTokens(FreedomLessLessParser::ARROW);
}

tree::TerminalNode* FreedomLessLessParser::Function_call_defContext::ARROW(size_t i) {
  return getToken(FreedomLessLessParser::ARROW, i);
}


size_t FreedomLessLessParser::Function_call_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleFunction_call_def;
}

void FreedomLessLessParser::Function_call_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunction_call_def(this);
}

void FreedomLessLessParser::Function_call_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunction_call_def(this);
}

FreedomLessLessParser::Function_call_defContext* FreedomLessLessParser::function_call_def() {
  Function_call_defContext *_localctx = _tracker.createInstance<Function_call_defContext>(_ctx, getState());
  enterRule(_localctx, 20, FreedomLessLessParser::RuleFunction_call_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(292);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case FreedomLessLessParser::DELETE: {
        enterOuterAlt(_localctx, 1);
        setState(233);
        match(FreedomLessLessParser::DELETE);
        setState(234);
        match(FreedomLessLessParser::ID);
        break;
      }

      case FreedomLessLessParser::FREE: {
        enterOuterAlt(_localctx, 2);
        setState(235);
        match(FreedomLessLessParser::FREE);
        setState(236);
        match(FreedomLessLessParser::OPEN_PAR);
        setState(237);
        match(FreedomLessLessParser::ID);
        setState(238);
        match(FreedomLessLessParser::CLOSE_PAR);
        break;
      }

      case FreedomLessLessParser::NEW: {
        enterOuterAlt(_localctx, 3);
        setState(239);
        match(FreedomLessLessParser::NEW);
        setState(240);
        match(FreedomLessLessParser::ID);
        setState(241);
        match(FreedomLessLessParser::OPEN_PAR);
        setState(243);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (((((_la - 25) & ~ 0x3fULL) == 0) &&
          ((1ULL << (_la - 25)) & ((1ULL << (FreedomLessLessParser::NEW - 25))
          | (1ULL << (FreedomLessLessParser::FREE - 25))
          | (1ULL << (FreedomLessLessParser::MALLOC - 25))
          | (1ULL << (FreedomLessLessParser::DELETE - 25))
          | (1ULL << (FreedomLessLessParser::SIZEOF - 25))
          | (1ULL << (FreedomLessLessParser::MULT - 25))
          | (1ULL << (FreedomLessLessParser::REF - 25))
          | (1ULL << (FreedomLessLessParser::NULL - 25))
          | (1ULL << (FreedomLessLessParser::INT - 25))
          | (1ULL << (FreedomLessLessParser::INTEGER - 25))
          | (1ULL << (FreedomLessLessParser::BOOLEAN - 25))
          | (1ULL << (FreedomLessLessParser::STRING - 25))
          | (1ULL << (FreedomLessLessParser::CHAR - 25))
          | (1ULL << (FreedomLessLessParser::FLOATING - 25))
          | (1ULL << (FreedomLessLessParser::ID - 25)))) != 0)) {
          setState(242);
          argument_def();
        }
        setState(245);
        match(FreedomLessLessParser::CLOSE_PAR);
        break;
      }

      case FreedomLessLessParser::MALLOC: {
        enterOuterAlt(_localctx, 4);
        setState(246);
        match(FreedomLessLessParser::MALLOC);
        setState(247);
        match(FreedomLessLessParser::OPEN_PAR);
        setState(248);
        valued_expression_def();
        setState(249);
        match(FreedomLessLessParser::CLOSE_PAR);
        break;
      }

      case FreedomLessLessParser::SIZEOF: {
        enterOuterAlt(_localctx, 5);
        setState(251);
        match(FreedomLessLessParser::SIZEOF);
        setState(252);
        match(FreedomLessLessParser::OPEN_PAR);
        setState(253);
        type_def();
        setState(266);
        _errHandler->sync(this);
        switch (_input->LA(1)) {
          case FreedomLessLessParser::MULT: {
            setState(255); 
            _errHandler->sync(this);
            _la = _input->LA(1);
            do {
              setState(254);
              match(FreedomLessLessParser::MULT);
              setState(257); 
              _errHandler->sync(this);
              _la = _input->LA(1);
            } while (_la == FreedomLessLessParser::MULT);
            break;
          }

          case FreedomLessLessParser::OPEN_BRAK: {
            setState(262); 
            _errHandler->sync(this);
            _la = _input->LA(1);
            do {
              setState(259);
              match(FreedomLessLessParser::OPEN_BRAK);
              setState(260);
              match(FreedomLessLessParser::INT);
              setState(261);
              match(FreedomLessLessParser::CLOSE_BRAK);
              setState(264); 
              _errHandler->sync(this);
              _la = _input->LA(1);
            } while (_la == FreedomLessLessParser::OPEN_BRAK);
            break;
          }

          case FreedomLessLessParser::CLOSE_PAR: {
            break;
          }

        default:
          break;
        }
        setState(268);
        match(FreedomLessLessParser::CLOSE_PAR);
        break;
      }

      case FreedomLessLessParser::ID: {
        enterOuterAlt(_localctx, 6);
        setState(272);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 32, _ctx)) {
        case 1: {
          setState(270);
          match(FreedomLessLessParser::ID);
          setState(271);
          _la = _input->LA(1);
          if (!(_la == FreedomLessLessParser::T__0

          || _la == FreedomLessLessParser::ARROW)) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          break;
        }

        }
        setState(274);
        match(FreedomLessLessParser::ID);
        setState(275);
        match(FreedomLessLessParser::OPEN_PAR);
        setState(277);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (((((_la - 25) & ~ 0x3fULL) == 0) &&
          ((1ULL << (_la - 25)) & ((1ULL << (FreedomLessLessParser::NEW - 25))
          | (1ULL << (FreedomLessLessParser::FREE - 25))
          | (1ULL << (FreedomLessLessParser::MALLOC - 25))
          | (1ULL << (FreedomLessLessParser::DELETE - 25))
          | (1ULL << (FreedomLessLessParser::SIZEOF - 25))
          | (1ULL << (FreedomLessLessParser::MULT - 25))
          | (1ULL << (FreedomLessLessParser::REF - 25))
          | (1ULL << (FreedomLessLessParser::NULL - 25))
          | (1ULL << (FreedomLessLessParser::INT - 25))
          | (1ULL << (FreedomLessLessParser::INTEGER - 25))
          | (1ULL << (FreedomLessLessParser::BOOLEAN - 25))
          | (1ULL << (FreedomLessLessParser::STRING - 25))
          | (1ULL << (FreedomLessLessParser::CHAR - 25))
          | (1ULL << (FreedomLessLessParser::FLOATING - 25))
          | (1ULL << (FreedomLessLessParser::ID - 25)))) != 0)) {
          setState(276);
          argument_def();
        }
        setState(279);
        match(FreedomLessLessParser::CLOSE_PAR);
        setState(289);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == FreedomLessLessParser::T__0

        || _la == FreedomLessLessParser::ARROW) {
          setState(280);
          _la = _input->LA(1);
          if (!(_la == FreedomLessLessParser::T__0

          || _la == FreedomLessLessParser::ARROW)) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(281);
          match(FreedomLessLessParser::ID);
          setState(282);
          match(FreedomLessLessParser::OPEN_PAR);
          setState(284);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if (((((_la - 25) & ~ 0x3fULL) == 0) &&
            ((1ULL << (_la - 25)) & ((1ULL << (FreedomLessLessParser::NEW - 25))
            | (1ULL << (FreedomLessLessParser::FREE - 25))
            | (1ULL << (FreedomLessLessParser::MALLOC - 25))
            | (1ULL << (FreedomLessLessParser::DELETE - 25))
            | (1ULL << (FreedomLessLessParser::SIZEOF - 25))
            | (1ULL << (FreedomLessLessParser::MULT - 25))
            | (1ULL << (FreedomLessLessParser::REF - 25))
            | (1ULL << (FreedomLessLessParser::NULL - 25))
            | (1ULL << (FreedomLessLessParser::INT - 25))
            | (1ULL << (FreedomLessLessParser::INTEGER - 25))
            | (1ULL << (FreedomLessLessParser::BOOLEAN - 25))
            | (1ULL << (FreedomLessLessParser::STRING - 25))
            | (1ULL << (FreedomLessLessParser::CHAR - 25))
            | (1ULL << (FreedomLessLessParser::FLOATING - 25))
            | (1ULL << (FreedomLessLessParser::ID - 25)))) != 0)) {
            setState(283);
            argument_def();
          }
          setState(286);
          match(FreedomLessLessParser::CLOSE_PAR);
          setState(291);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Argument_defContext ------------------------------------------------------------------

FreedomLessLessParser::Argument_defContext::Argument_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<FreedomLessLessParser::Valued_expression_defContext *> FreedomLessLessParser::Argument_defContext::valued_expression_def() {
  return getRuleContexts<FreedomLessLessParser::Valued_expression_defContext>();
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::Argument_defContext::valued_expression_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Argument_defContext::COMMA() {
  return getTokens(FreedomLessLessParser::COMMA);
}

tree::TerminalNode* FreedomLessLessParser::Argument_defContext::COMMA(size_t i) {
  return getToken(FreedomLessLessParser::COMMA, i);
}


size_t FreedomLessLessParser::Argument_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleArgument_def;
}

void FreedomLessLessParser::Argument_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArgument_def(this);
}

void FreedomLessLessParser::Argument_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArgument_def(this);
}

FreedomLessLessParser::Argument_defContext* FreedomLessLessParser::argument_def() {
  Argument_defContext *_localctx = _tracker.createInstance<Argument_defContext>(_ctx, getState());
  enterRule(_localctx, 22, FreedomLessLessParser::RuleArgument_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(294);
    valued_expression_def();
    setState(299);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == FreedomLessLessParser::COMMA) {
      setState(295);
      match(FreedomLessLessParser::COMMA);
      setState(296);
      valued_expression_def();
      setState(301);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Function_defContext ------------------------------------------------------------------

FreedomLessLessParser::Function_defContext::Function_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FreedomLessLessParser::Type_defContext* FreedomLessLessParser::Function_defContext::type_def() {
  return getRuleContext<FreedomLessLessParser::Type_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Function_defContext::ID() {
  return getToken(FreedomLessLessParser::ID, 0);
}

tree::TerminalNode* FreedomLessLessParser::Function_defContext::OPEN_PAR() {
  return getToken(FreedomLessLessParser::OPEN_PAR, 0);
}

tree::TerminalNode* FreedomLessLessParser::Function_defContext::CLOSE_PAR() {
  return getToken(FreedomLessLessParser::CLOSE_PAR, 0);
}

FreedomLessLessParser::Block_defContext* FreedomLessLessParser::Function_defContext::block_def() {
  return getRuleContext<FreedomLessLessParser::Block_defContext>(0);
}

FreedomLessLessParser::Param_defContext* FreedomLessLessParser::Function_defContext::param_def() {
  return getRuleContext<FreedomLessLessParser::Param_defContext>(0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_defContext::MULT() {
  return getTokens(FreedomLessLessParser::MULT);
}

tree::TerminalNode* FreedomLessLessParser::Function_defContext::MULT(size_t i) {
  return getToken(FreedomLessLessParser::MULT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_defContext::OPEN_BRAK() {
  return getTokens(FreedomLessLessParser::OPEN_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Function_defContext::OPEN_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::OPEN_BRAK, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_defContext::INT() {
  return getTokens(FreedomLessLessParser::INT);
}

tree::TerminalNode* FreedomLessLessParser::Function_defContext::INT(size_t i) {
  return getToken(FreedomLessLessParser::INT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Function_defContext::CLOSE_BRAK() {
  return getTokens(FreedomLessLessParser::CLOSE_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Function_defContext::CLOSE_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::CLOSE_BRAK, i);
}


size_t FreedomLessLessParser::Function_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleFunction_def;
}

void FreedomLessLessParser::Function_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunction_def(this);
}

void FreedomLessLessParser::Function_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunction_def(this);
}

FreedomLessLessParser::Function_defContext* FreedomLessLessParser::function_def() {
  Function_defContext *_localctx = _tracker.createInstance<Function_defContext>(_ctx, getState());
  enterRule(_localctx, 24, FreedomLessLessParser::RuleFunction_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(302);
    type_def();
    setState(315);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case FreedomLessLessParser::MULT: {
        setState(304); 
        _errHandler->sync(this);
        _la = _input->LA(1);
        do {
          setState(303);
          match(FreedomLessLessParser::MULT);
          setState(306); 
          _errHandler->sync(this);
          _la = _input->LA(1);
        } while (_la == FreedomLessLessParser::MULT);
        break;
      }

      case FreedomLessLessParser::OPEN_BRAK: {
        setState(311); 
        _errHandler->sync(this);
        _la = _input->LA(1);
        do {
          setState(308);
          match(FreedomLessLessParser::OPEN_BRAK);
          setState(309);
          match(FreedomLessLessParser::INT);
          setState(310);
          match(FreedomLessLessParser::CLOSE_BRAK);
          setState(313); 
          _errHandler->sync(this);
          _la = _input->LA(1);
        } while (_la == FreedomLessLessParser::OPEN_BRAK);
        break;
      }

      case FreedomLessLessParser::ID: {
        break;
      }

    default:
      break;
    }
    setState(317);
    match(FreedomLessLessParser::ID);
    setState(318);
    match(FreedomLessLessParser::OPEN_PAR);
    setState(320);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FreedomLessLessParser::INT_T)
      | (1ULL << FreedomLessLessParser::UNSIGNED_T)
      | (1ULL << FreedomLessLessParser::FLOAT_T)
      | (1ULL << FreedomLessLessParser::DOUBLE_T)
      | (1ULL << FreedomLessLessParser::SHORT_T)
      | (1ULL << FreedomLessLessParser::CHAR_T)
      | (1ULL << FreedomLessLessParser::BOOL_T)
      | (1ULL << FreedomLessLessParser::VOID_T)
      | (1ULL << FreedomLessLessParser::CLASS))) != 0)) {
      setState(319);
      param_def();
    }
    setState(322);
    match(FreedomLessLessParser::CLOSE_PAR);
    setState(323);
    block_def();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Param_defContext ------------------------------------------------------------------

FreedomLessLessParser::Param_defContext::Param_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FreedomLessLessParser::Type_defContext* FreedomLessLessParser::Param_defContext::type_def() {
  return getRuleContext<FreedomLessLessParser::Type_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Param_defContext::ID() {
  return getToken(FreedomLessLessParser::ID, 0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Param_defContext::MULT() {
  return getTokens(FreedomLessLessParser::MULT);
}

tree::TerminalNode* FreedomLessLessParser::Param_defContext::MULT(size_t i) {
  return getToken(FreedomLessLessParser::MULT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Param_defContext::COMMA() {
  return getTokens(FreedomLessLessParser::COMMA);
}

tree::TerminalNode* FreedomLessLessParser::Param_defContext::COMMA(size_t i) {
  return getToken(FreedomLessLessParser::COMMA, i);
}

std::vector<FreedomLessLessParser::Param_defContext *> FreedomLessLessParser::Param_defContext::param_def() {
  return getRuleContexts<FreedomLessLessParser::Param_defContext>();
}

FreedomLessLessParser::Param_defContext* FreedomLessLessParser::Param_defContext::param_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Param_defContext>(i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Param_defContext::OPEN_BRAK() {
  return getTokens(FreedomLessLessParser::OPEN_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Param_defContext::OPEN_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::OPEN_BRAK, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Param_defContext::INT() {
  return getTokens(FreedomLessLessParser::INT);
}

tree::TerminalNode* FreedomLessLessParser::Param_defContext::INT(size_t i) {
  return getToken(FreedomLessLessParser::INT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Param_defContext::CLOSE_BRAK() {
  return getTokens(FreedomLessLessParser::CLOSE_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Param_defContext::CLOSE_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::CLOSE_BRAK, i);
}


size_t FreedomLessLessParser::Param_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleParam_def;
}

void FreedomLessLessParser::Param_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterParam_def(this);
}

void FreedomLessLessParser::Param_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitParam_def(this);
}

FreedomLessLessParser::Param_defContext* FreedomLessLessParser::param_def() {
  Param_defContext *_localctx = _tracker.createInstance<Param_defContext>(_ctx, getState());
  enterRule(_localctx, 26, FreedomLessLessParser::RuleParam_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    setState(356);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 46, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(325);
      type_def();
      setState(327); 
      _errHandler->sync(this);
      _la = _input->LA(1);
      do {
        setState(326);
        match(FreedomLessLessParser::MULT);
        setState(329); 
        _errHandler->sync(this);
        _la = _input->LA(1);
      } while (_la == FreedomLessLessParser::MULT);
      setState(331);
      match(FreedomLessLessParser::ID);
      setState(336);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 43, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(332);
          match(FreedomLessLessParser::COMMA);
          setState(333);
          param_def(); 
        }
        setState(338);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 43, _ctx);
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(339);
      type_def();
      setState(340);
      match(FreedomLessLessParser::ID);
      setState(346);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == FreedomLessLessParser::OPEN_BRAK) {
        setState(341);
        match(FreedomLessLessParser::OPEN_BRAK);
        setState(342);
        match(FreedomLessLessParser::INT);
        setState(343);
        match(FreedomLessLessParser::CLOSE_BRAK);
        setState(348);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      setState(353);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 45, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(349);
          match(FreedomLessLessParser::COMMA);
          setState(350);
          param_def(); 
        }
        setState(355);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 45, _ctx);
      }
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Block_defContext ------------------------------------------------------------------

FreedomLessLessParser::Block_defContext::Block_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Block_defContext::OPEN_KEY() {
  return getToken(FreedomLessLessParser::OPEN_KEY, 0);
}

tree::TerminalNode* FreedomLessLessParser::Block_defContext::CLOSE_KEY() {
  return getToken(FreedomLessLessParser::CLOSE_KEY, 0);
}

std::vector<FreedomLessLessParser::Valueless_expression_defContext *> FreedomLessLessParser::Block_defContext::valueless_expression_def() {
  return getRuleContexts<FreedomLessLessParser::Valueless_expression_defContext>();
}

FreedomLessLessParser::Valueless_expression_defContext* FreedomLessLessParser::Block_defContext::valueless_expression_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Valueless_expression_defContext>(i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Block_defContext::SEMICOLON() {
  return getTokens(FreedomLessLessParser::SEMICOLON);
}

tree::TerminalNode* FreedomLessLessParser::Block_defContext::SEMICOLON(size_t i) {
  return getToken(FreedomLessLessParser::SEMICOLON, i);
}

std::vector<FreedomLessLessParser::Struct_defContext *> FreedomLessLessParser::Block_defContext::struct_def() {
  return getRuleContexts<FreedomLessLessParser::Struct_defContext>();
}

FreedomLessLessParser::Struct_defContext* FreedomLessLessParser::Block_defContext::struct_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Struct_defContext>(i);
}


size_t FreedomLessLessParser::Block_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleBlock_def;
}

void FreedomLessLessParser::Block_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlock_def(this);
}

void FreedomLessLessParser::Block_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlock_def(this);
}

FreedomLessLessParser::Block_defContext* FreedomLessLessParser::block_def() {
  Block_defContext *_localctx = _tracker.createInstance<Block_defContext>(_ctx, getState());
  enterRule(_localctx, 28, FreedomLessLessParser::RuleBlock_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(358);
    match(FreedomLessLessParser::OPEN_KEY);
    setState(365);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FreedomLessLessParser::INT_T)
      | (1ULL << FreedomLessLessParser::UNSIGNED_T)
      | (1ULL << FreedomLessLessParser::FLOAT_T)
      | (1ULL << FreedomLessLessParser::DOUBLE_T)
      | (1ULL << FreedomLessLessParser::SHORT_T)
      | (1ULL << FreedomLessLessParser::CHAR_T)
      | (1ULL << FreedomLessLessParser::BOOL_T)
      | (1ULL << FreedomLessLessParser::VOID_T)
      | (1ULL << FreedomLessLessParser::CLASS)
      | (1ULL << FreedomLessLessParser::IF)
      | (1ULL << FreedomLessLessParser::FOR)
      | (1ULL << FreedomLessLessParser::WHILE)
      | (1ULL << FreedomLessLessParser::SWITCH)
      | (1ULL << FreedomLessLessParser::BREAK)
      | (1ULL << FreedomLessLessParser::CONTINUE)
      | (1ULL << FreedomLessLessParser::RETURN)
      | (1ULL << FreedomLessLessParser::NEW)
      | (1ULL << FreedomLessLessParser::FREE)
      | (1ULL << FreedomLessLessParser::MALLOC)
      | (1ULL << FreedomLessLessParser::DELETE)
      | (1ULL << FreedomLessLessParser::SIZEOF)
      | (1ULL << FreedomLessLessParser::MULT))) != 0) || _la == FreedomLessLessParser::ID) {
      setState(363);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case FreedomLessLessParser::INT_T:
        case FreedomLessLessParser::UNSIGNED_T:
        case FreedomLessLessParser::FLOAT_T:
        case FreedomLessLessParser::DOUBLE_T:
        case FreedomLessLessParser::SHORT_T:
        case FreedomLessLessParser::CHAR_T:
        case FreedomLessLessParser::BOOL_T:
        case FreedomLessLessParser::VOID_T:
        case FreedomLessLessParser::CLASS:
        case FreedomLessLessParser::BREAK:
        case FreedomLessLessParser::CONTINUE:
        case FreedomLessLessParser::RETURN:
        case FreedomLessLessParser::NEW:
        case FreedomLessLessParser::FREE:
        case FreedomLessLessParser::MALLOC:
        case FreedomLessLessParser::DELETE:
        case FreedomLessLessParser::SIZEOF:
        case FreedomLessLessParser::MULT:
        case FreedomLessLessParser::ID: {
          setState(359);
          valueless_expression_def();
          setState(360);
          match(FreedomLessLessParser::SEMICOLON);
          break;
        }

        case FreedomLessLessParser::IF:
        case FreedomLessLessParser::FOR:
        case FreedomLessLessParser::WHILE:
        case FreedomLessLessParser::SWITCH: {
          setState(362);
          struct_def();
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(367);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(368);
    match(FreedomLessLessParser::CLOSE_KEY);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Valueless_expression_defContext ------------------------------------------------------------------

FreedomLessLessParser::Valueless_expression_defContext::Valueless_expression_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Valueless_expression_defContext::BREAK() {
  return getToken(FreedomLessLessParser::BREAK, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valueless_expression_defContext::CONTINUE() {
  return getToken(FreedomLessLessParser::CONTINUE, 0);
}

FreedomLessLessParser::Attribute_defContext* FreedomLessLessParser::Valueless_expression_defContext::attribute_def() {
  return getRuleContext<FreedomLessLessParser::Attribute_defContext>(0);
}

FreedomLessLessParser::Function_call_defContext* FreedomLessLessParser::Valueless_expression_defContext::function_call_def() {
  return getRuleContext<FreedomLessLessParser::Function_call_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Valueless_expression_defContext::RETURN() {
  return getToken(FreedomLessLessParser::RETURN, 0);
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::Valueless_expression_defContext::valued_expression_def() {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Valueless_expression_defContext::MULT() {
  return getToken(FreedomLessLessParser::MULT, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valueless_expression_defContext::OPEN_PAR() {
  return getToken(FreedomLessLessParser::OPEN_PAR, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valueless_expression_defContext::ID() {
  return getToken(FreedomLessLessParser::ID, 0);
}

tree::TerminalNode* FreedomLessLessParser::Valueless_expression_defContext::CLOSE_PAR() {
  return getToken(FreedomLessLessParser::CLOSE_PAR, 0);
}

FreedomLessLessParser::Auto_increm_opContext* FreedomLessLessParser::Valueless_expression_defContext::auto_increm_op() {
  return getRuleContext<FreedomLessLessParser::Auto_increm_opContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Valueless_expression_defContext::ASSIGN() {
  return getToken(FreedomLessLessParser::ASSIGN, 0);
}

FreedomLessLessParser::Auto_assign_opContext* FreedomLessLessParser::Valueless_expression_defContext::auto_assign_op() {
  return getRuleContext<FreedomLessLessParser::Auto_assign_opContext>(0);
}


size_t FreedomLessLessParser::Valueless_expression_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleValueless_expression_def;
}

void FreedomLessLessParser::Valueless_expression_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterValueless_expression_def(this);
}

void FreedomLessLessParser::Valueless_expression_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitValueless_expression_def(this);
}

FreedomLessLessParser::Valueless_expression_defContext* FreedomLessLessParser::valueless_expression_def() {
  Valueless_expression_defContext *_localctx = _tracker.createInstance<Valueless_expression_defContext>(_ctx, getState());
  enterRule(_localctx, 30, FreedomLessLessParser::RuleValueless_expression_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(391);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 52, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(370);
      match(FreedomLessLessParser::BREAK);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(371);
      match(FreedomLessLessParser::CONTINUE);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(372);
      attribute_def();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(373);
      function_call_def();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(374);
      match(FreedomLessLessParser::RETURN);
      setState(375);
      valued_expression_def();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(381);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case FreedomLessLessParser::MULT: {
          setState(376);
          match(FreedomLessLessParser::MULT);
          setState(377);
          match(FreedomLessLessParser::OPEN_PAR);
          setState(378);
          match(FreedomLessLessParser::ID);
          setState(379);
          match(FreedomLessLessParser::CLOSE_PAR);
          break;
        }

        case FreedomLessLessParser::ID: {
          setState(380);
          match(FreedomLessLessParser::ID);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(389);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case FreedomLessLessParser::ASSIGN:
        case FreedomLessLessParser::AUTOPLUS:
        case FreedomLessLessParser::AUTOMINUS:
        case FreedomLessLessParser::AUTOMULT:
        case FreedomLessLessParser::AUTODIV: {
          setState(385);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case FreedomLessLessParser::ASSIGN: {
              setState(383);
              match(FreedomLessLessParser::ASSIGN);
              break;
            }

            case FreedomLessLessParser::AUTOPLUS:
            case FreedomLessLessParser::AUTOMINUS:
            case FreedomLessLessParser::AUTOMULT:
            case FreedomLessLessParser::AUTODIV: {
              setState(384);
              auto_assign_op();
              break;
            }

          default:
            throw NoViableAltException(this);
          }
          setState(387);
          valued_expression_def();
          break;
        }

        case FreedomLessLessParser::INCREM:
        case FreedomLessLessParser::DECREM: {
          setState(388);
          auto_increm_op();
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Struct_defContext ------------------------------------------------------------------

FreedomLessLessParser::Struct_defContext::Struct_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FreedomLessLessParser::If_defContext* FreedomLessLessParser::Struct_defContext::if_def() {
  return getRuleContext<FreedomLessLessParser::If_defContext>(0);
}

FreedomLessLessParser::For_defContext* FreedomLessLessParser::Struct_defContext::for_def() {
  return getRuleContext<FreedomLessLessParser::For_defContext>(0);
}

FreedomLessLessParser::While_defContext* FreedomLessLessParser::Struct_defContext::while_def() {
  return getRuleContext<FreedomLessLessParser::While_defContext>(0);
}

FreedomLessLessParser::Switch_defContext* FreedomLessLessParser::Struct_defContext::switch_def() {
  return getRuleContext<FreedomLessLessParser::Switch_defContext>(0);
}


size_t FreedomLessLessParser::Struct_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleStruct_def;
}

void FreedomLessLessParser::Struct_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStruct_def(this);
}

void FreedomLessLessParser::Struct_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStruct_def(this);
}

FreedomLessLessParser::Struct_defContext* FreedomLessLessParser::struct_def() {
  Struct_defContext *_localctx = _tracker.createInstance<Struct_defContext>(_ctx, getState());
  enterRule(_localctx, 32, FreedomLessLessParser::RuleStruct_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(397);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case FreedomLessLessParser::IF: {
        enterOuterAlt(_localctx, 1);
        setState(393);
        if_def();
        break;
      }

      case FreedomLessLessParser::FOR: {
        enterOuterAlt(_localctx, 2);
        setState(394);
        for_def();
        break;
      }

      case FreedomLessLessParser::WHILE: {
        enterOuterAlt(_localctx, 3);
        setState(395);
        while_def();
        break;
      }

      case FreedomLessLessParser::SWITCH: {
        enterOuterAlt(_localctx, 4);
        setState(396);
        switch_def();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- If_defContext ------------------------------------------------------------------

FreedomLessLessParser::If_defContext::If_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::If_defContext::IF() {
  return getToken(FreedomLessLessParser::IF, 0);
}

tree::TerminalNode* FreedomLessLessParser::If_defContext::OPEN_PAR() {
  return getToken(FreedomLessLessParser::OPEN_PAR, 0);
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::If_defContext::valued_expression_def() {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::If_defContext::CLOSE_PAR() {
  return getToken(FreedomLessLessParser::CLOSE_PAR, 0);
}

std::vector<FreedomLessLessParser::Block_defContext *> FreedomLessLessParser::If_defContext::block_def() {
  return getRuleContexts<FreedomLessLessParser::Block_defContext>();
}

FreedomLessLessParser::Block_defContext* FreedomLessLessParser::If_defContext::block_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Block_defContext>(i);
}

tree::TerminalNode* FreedomLessLessParser::If_defContext::ELSE() {
  return getToken(FreedomLessLessParser::ELSE, 0);
}


size_t FreedomLessLessParser::If_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleIf_def;
}

void FreedomLessLessParser::If_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIf_def(this);
}

void FreedomLessLessParser::If_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIf_def(this);
}

FreedomLessLessParser::If_defContext* FreedomLessLessParser::if_def() {
  If_defContext *_localctx = _tracker.createInstance<If_defContext>(_ctx, getState());
  enterRule(_localctx, 34, FreedomLessLessParser::RuleIf_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(399);
    match(FreedomLessLessParser::IF);
    setState(400);
    match(FreedomLessLessParser::OPEN_PAR);
    setState(401);
    valued_expression_def();
    setState(402);
    match(FreedomLessLessParser::CLOSE_PAR);
    setState(403);
    block_def();
    setState(406);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FreedomLessLessParser::ELSE) {
      setState(404);
      match(FreedomLessLessParser::ELSE);
      setState(405);
      block_def();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- For_defContext ------------------------------------------------------------------

FreedomLessLessParser::For_defContext::For_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::For_defContext::FOR() {
  return getToken(FreedomLessLessParser::FOR, 0);
}

tree::TerminalNode* FreedomLessLessParser::For_defContext::OPEN_PAR() {
  return getToken(FreedomLessLessParser::OPEN_PAR, 0);
}

std::vector<FreedomLessLessParser::Valued_attribute_defContext *> FreedomLessLessParser::For_defContext::valued_attribute_def() {
  return getRuleContexts<FreedomLessLessParser::Valued_attribute_defContext>();
}

FreedomLessLessParser::Valued_attribute_defContext* FreedomLessLessParser::For_defContext::valued_attribute_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Valued_attribute_defContext>(i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::For_defContext::SEMICOLON() {
  return getTokens(FreedomLessLessParser::SEMICOLON);
}

tree::TerminalNode* FreedomLessLessParser::For_defContext::SEMICOLON(size_t i) {
  return getToken(FreedomLessLessParser::SEMICOLON, i);
}

std::vector<FreedomLessLessParser::Valued_expression_defContext *> FreedomLessLessParser::For_defContext::valued_expression_def() {
  return getRuleContexts<FreedomLessLessParser::Valued_expression_defContext>();
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::For_defContext::valued_expression_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(i);
}

tree::TerminalNode* FreedomLessLessParser::For_defContext::CLOSE_PAR() {
  return getToken(FreedomLessLessParser::CLOSE_PAR, 0);
}

FreedomLessLessParser::Block_defContext* FreedomLessLessParser::For_defContext::block_def() {
  return getRuleContext<FreedomLessLessParser::Block_defContext>(0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::For_defContext::COMMA() {
  return getTokens(FreedomLessLessParser::COMMA);
}

tree::TerminalNode* FreedomLessLessParser::For_defContext::COMMA(size_t i) {
  return getToken(FreedomLessLessParser::COMMA, i);
}


size_t FreedomLessLessParser::For_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleFor_def;
}

void FreedomLessLessParser::For_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFor_def(this);
}

void FreedomLessLessParser::For_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFor_def(this);
}

FreedomLessLessParser::For_defContext* FreedomLessLessParser::for_def() {
  For_defContext *_localctx = _tracker.createInstance<For_defContext>(_ctx, getState());
  enterRule(_localctx, 36, FreedomLessLessParser::RuleFor_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(408);
    match(FreedomLessLessParser::FOR);
    setState(409);
    match(FreedomLessLessParser::OPEN_PAR);
    setState(410);
    valued_attribute_def();
    setState(415);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == FreedomLessLessParser::COMMA) {
      setState(411);
      match(FreedomLessLessParser::COMMA);
      setState(412);
      valued_attribute_def();
      setState(417);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(418);
    match(FreedomLessLessParser::SEMICOLON);
    setState(419);
    valued_expression_def();
    setState(420);
    match(FreedomLessLessParser::SEMICOLON);
    setState(421);
    valued_expression_def();
    setState(426);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == FreedomLessLessParser::COMMA) {
      setState(422);
      match(FreedomLessLessParser::COMMA);
      setState(423);
      valued_expression_def();
      setState(428);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(429);
    match(FreedomLessLessParser::CLOSE_PAR);
    setState(430);
    block_def();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Valued_attribute_defContext ------------------------------------------------------------------

FreedomLessLessParser::Valued_attribute_defContext::Valued_attribute_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Valued_attribute_defContext::ASSIGN() {
  return getToken(FreedomLessLessParser::ASSIGN, 0);
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::Valued_attribute_defContext::valued_expression_def() {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(0);
}

FreedomLessLessParser::Type_defContext* FreedomLessLessParser::Valued_attribute_defContext::type_def() {
  return getRuleContext<FreedomLessLessParser::Type_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Valued_attribute_defContext::CLASS() {
  return getToken(FreedomLessLessParser::CLASS, 0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Valued_attribute_defContext::ID() {
  return getTokens(FreedomLessLessParser::ID);
}

tree::TerminalNode* FreedomLessLessParser::Valued_attribute_defContext::ID(size_t i) {
  return getToken(FreedomLessLessParser::ID, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Valued_attribute_defContext::MULT() {
  return getTokens(FreedomLessLessParser::MULT);
}

tree::TerminalNode* FreedomLessLessParser::Valued_attribute_defContext::MULT(size_t i) {
  return getToken(FreedomLessLessParser::MULT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Valued_attribute_defContext::OPEN_BRAK() {
  return getTokens(FreedomLessLessParser::OPEN_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Valued_attribute_defContext::OPEN_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::OPEN_BRAK, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Valued_attribute_defContext::INT() {
  return getTokens(FreedomLessLessParser::INT);
}

tree::TerminalNode* FreedomLessLessParser::Valued_attribute_defContext::INT(size_t i) {
  return getToken(FreedomLessLessParser::INT, i);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Valued_attribute_defContext::CLOSE_BRAK() {
  return getTokens(FreedomLessLessParser::CLOSE_BRAK);
}

tree::TerminalNode* FreedomLessLessParser::Valued_attribute_defContext::CLOSE_BRAK(size_t i) {
  return getToken(FreedomLessLessParser::CLOSE_BRAK, i);
}


size_t FreedomLessLessParser::Valued_attribute_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleValued_attribute_def;
}

void FreedomLessLessParser::Valued_attribute_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterValued_attribute_def(this);
}

void FreedomLessLessParser::Valued_attribute_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitValued_attribute_def(this);
}

FreedomLessLessParser::Valued_attribute_defContext* FreedomLessLessParser::valued_attribute_def() {
  Valued_attribute_defContext *_localctx = _tracker.createInstance<Valued_attribute_defContext>(_ctx, getState());
  enterRule(_localctx, 38, FreedomLessLessParser::RuleValued_attribute_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(435);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 57, _ctx)) {
    case 1: {
      setState(432);
      type_def();
      break;
    }

    case 2: {
      setState(433);
      match(FreedomLessLessParser::CLASS);
      setState(434);
      match(FreedomLessLessParser::ID);
      break;
    }

    }
    setState(452);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 60, _ctx)) {
    case 1: {
      setState(440);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == FreedomLessLessParser::MULT) {
        setState(437);
        match(FreedomLessLessParser::MULT);
        setState(442);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      setState(443);
      match(FreedomLessLessParser::ID);
      break;
    }

    case 2: {
      setState(444);
      match(FreedomLessLessParser::ID);
      setState(448); 
      _errHandler->sync(this);
      _la = _input->LA(1);
      do {
        setState(445);
        match(FreedomLessLessParser::OPEN_BRAK);
        setState(446);
        match(FreedomLessLessParser::INT);
        setState(447);
        match(FreedomLessLessParser::CLOSE_BRAK);
        setState(450); 
        _errHandler->sync(this);
        _la = _input->LA(1);
      } while (_la == FreedomLessLessParser::OPEN_BRAK);
      break;
    }

    }
    setState(454);
    match(FreedomLessLessParser::ASSIGN);
    setState(455);
    valued_expression_def();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- While_defContext ------------------------------------------------------------------

FreedomLessLessParser::While_defContext::While_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::While_defContext::WHILE() {
  return getToken(FreedomLessLessParser::WHILE, 0);
}

tree::TerminalNode* FreedomLessLessParser::While_defContext::OPEN_PAR() {
  return getToken(FreedomLessLessParser::OPEN_PAR, 0);
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::While_defContext::valued_expression_def() {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::While_defContext::CLOSE_PAR() {
  return getToken(FreedomLessLessParser::CLOSE_PAR, 0);
}

FreedomLessLessParser::Block_defContext* FreedomLessLessParser::While_defContext::block_def() {
  return getRuleContext<FreedomLessLessParser::Block_defContext>(0);
}


size_t FreedomLessLessParser::While_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleWhile_def;
}

void FreedomLessLessParser::While_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterWhile_def(this);
}

void FreedomLessLessParser::While_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitWhile_def(this);
}

FreedomLessLessParser::While_defContext* FreedomLessLessParser::while_def() {
  While_defContext *_localctx = _tracker.createInstance<While_defContext>(_ctx, getState());
  enterRule(_localctx, 40, FreedomLessLessParser::RuleWhile_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(457);
    match(FreedomLessLessParser::WHILE);
    setState(458);
    match(FreedomLessLessParser::OPEN_PAR);
    setState(459);
    valued_expression_def();
    setState(460);
    match(FreedomLessLessParser::CLOSE_PAR);
    setState(461);
    block_def();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Switch_defContext ------------------------------------------------------------------

FreedomLessLessParser::Switch_defContext::Switch_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Switch_defContext::SWITCH() {
  return getToken(FreedomLessLessParser::SWITCH, 0);
}

tree::TerminalNode* FreedomLessLessParser::Switch_defContext::OPEN_PAR() {
  return getToken(FreedomLessLessParser::OPEN_PAR, 0);
}

FreedomLessLessParser::Valued_expression_defContext* FreedomLessLessParser::Switch_defContext::valued_expression_def() {
  return getRuleContext<FreedomLessLessParser::Valued_expression_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Switch_defContext::CLOSE_PAR() {
  return getToken(FreedomLessLessParser::CLOSE_PAR, 0);
}

tree::TerminalNode* FreedomLessLessParser::Switch_defContext::OPEN_KEY() {
  return getToken(FreedomLessLessParser::OPEN_KEY, 0);
}

FreedomLessLessParser::Switch_default_defContext* FreedomLessLessParser::Switch_defContext::switch_default_def() {
  return getRuleContext<FreedomLessLessParser::Switch_default_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Switch_defContext::CLOSE_KEY() {
  return getToken(FreedomLessLessParser::CLOSE_KEY, 0);
}

std::vector<FreedomLessLessParser::Switch_case_defContext *> FreedomLessLessParser::Switch_defContext::switch_case_def() {
  return getRuleContexts<FreedomLessLessParser::Switch_case_defContext>();
}

FreedomLessLessParser::Switch_case_defContext* FreedomLessLessParser::Switch_defContext::switch_case_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Switch_case_defContext>(i);
}


size_t FreedomLessLessParser::Switch_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleSwitch_def;
}

void FreedomLessLessParser::Switch_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSwitch_def(this);
}

void FreedomLessLessParser::Switch_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSwitch_def(this);
}

FreedomLessLessParser::Switch_defContext* FreedomLessLessParser::switch_def() {
  Switch_defContext *_localctx = _tracker.createInstance<Switch_defContext>(_ctx, getState());
  enterRule(_localctx, 42, FreedomLessLessParser::RuleSwitch_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(463);
    match(FreedomLessLessParser::SWITCH);
    setState(464);
    match(FreedomLessLessParser::OPEN_PAR);
    setState(465);
    valued_expression_def();
    setState(466);
    match(FreedomLessLessParser::CLOSE_PAR);
    setState(467);
    match(FreedomLessLessParser::OPEN_KEY);
    setState(471);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == FreedomLessLessParser::CASE) {
      setState(468);
      switch_case_def();
      setState(473);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(474);
    switch_default_def();
    setState(475);
    match(FreedomLessLessParser::CLOSE_KEY);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Switch_case_defContext ------------------------------------------------------------------

FreedomLessLessParser::Switch_case_defContext::Switch_case_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Switch_case_defContext::CASE() {
  return getToken(FreedomLessLessParser::CASE, 0);
}

FreedomLessLessParser::Value_defContext* FreedomLessLessParser::Switch_case_defContext::value_def() {
  return getRuleContext<FreedomLessLessParser::Value_defContext>(0);
}

tree::TerminalNode* FreedomLessLessParser::Switch_case_defContext::TWOPOINTS() {
  return getToken(FreedomLessLessParser::TWOPOINTS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Switch_case_defContext::BREAK() {
  return getToken(FreedomLessLessParser::BREAK, 0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Switch_case_defContext::SEMICOLON() {
  return getTokens(FreedomLessLessParser::SEMICOLON);
}

tree::TerminalNode* FreedomLessLessParser::Switch_case_defContext::SEMICOLON(size_t i) {
  return getToken(FreedomLessLessParser::SEMICOLON, i);
}

std::vector<FreedomLessLessParser::Valueless_expression_defContext *> FreedomLessLessParser::Switch_case_defContext::valueless_expression_def() {
  return getRuleContexts<FreedomLessLessParser::Valueless_expression_defContext>();
}

FreedomLessLessParser::Valueless_expression_defContext* FreedomLessLessParser::Switch_case_defContext::valueless_expression_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Valueless_expression_defContext>(i);
}

std::vector<FreedomLessLessParser::Struct_defContext *> FreedomLessLessParser::Switch_case_defContext::struct_def() {
  return getRuleContexts<FreedomLessLessParser::Struct_defContext>();
}

FreedomLessLessParser::Struct_defContext* FreedomLessLessParser::Switch_case_defContext::struct_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Struct_defContext>(i);
}


size_t FreedomLessLessParser::Switch_case_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleSwitch_case_def;
}

void FreedomLessLessParser::Switch_case_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSwitch_case_def(this);
}

void FreedomLessLessParser::Switch_case_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSwitch_case_def(this);
}

FreedomLessLessParser::Switch_case_defContext* FreedomLessLessParser::switch_case_def() {
  Switch_case_defContext *_localctx = _tracker.createInstance<Switch_case_defContext>(_ctx, getState());
  enterRule(_localctx, 44, FreedomLessLessParser::RuleSwitch_case_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(477);
    match(FreedomLessLessParser::CASE);
    setState(478);
    value_def();
    setState(479);
    match(FreedomLessLessParser::TWOPOINTS);
    setState(484); 
    _errHandler->sync(this);
    alt = 1;
    do {
      switch (alt) {
        case 1: {
              setState(484);
              _errHandler->sync(this);
              switch (_input->LA(1)) {
                case FreedomLessLessParser::INT_T:
                case FreedomLessLessParser::UNSIGNED_T:
                case FreedomLessLessParser::FLOAT_T:
                case FreedomLessLessParser::DOUBLE_T:
                case FreedomLessLessParser::SHORT_T:
                case FreedomLessLessParser::CHAR_T:
                case FreedomLessLessParser::BOOL_T:
                case FreedomLessLessParser::VOID_T:
                case FreedomLessLessParser::CLASS:
                case FreedomLessLessParser::BREAK:
                case FreedomLessLessParser::CONTINUE:
                case FreedomLessLessParser::RETURN:
                case FreedomLessLessParser::NEW:
                case FreedomLessLessParser::FREE:
                case FreedomLessLessParser::MALLOC:
                case FreedomLessLessParser::DELETE:
                case FreedomLessLessParser::SIZEOF:
                case FreedomLessLessParser::MULT:
                case FreedomLessLessParser::ID: {
                  setState(480);
                  valueless_expression_def();
                  setState(481);
                  match(FreedomLessLessParser::SEMICOLON);
                  break;
                }

                case FreedomLessLessParser::IF:
                case FreedomLessLessParser::FOR:
                case FreedomLessLessParser::WHILE:
                case FreedomLessLessParser::SWITCH: {
                  setState(483);
                  struct_def();
                  break;
                }

              default:
                throw NoViableAltException(this);
              }
              break;
            }

      default:
        throw NoViableAltException(this);
      }
      setState(486); 
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 63, _ctx);
    } while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER);
    setState(488);
    match(FreedomLessLessParser::BREAK);
    setState(489);
    match(FreedomLessLessParser::SEMICOLON);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Switch_default_defContext ------------------------------------------------------------------

FreedomLessLessParser::Switch_default_defContext::Switch_default_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Switch_default_defContext::DEFAULT() {
  return getToken(FreedomLessLessParser::DEFAULT, 0);
}

tree::TerminalNode* FreedomLessLessParser::Switch_default_defContext::TWOPOINTS() {
  return getToken(FreedomLessLessParser::TWOPOINTS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Switch_default_defContext::BREAK() {
  return getToken(FreedomLessLessParser::BREAK, 0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Switch_default_defContext::SEMICOLON() {
  return getTokens(FreedomLessLessParser::SEMICOLON);
}

tree::TerminalNode* FreedomLessLessParser::Switch_default_defContext::SEMICOLON(size_t i) {
  return getToken(FreedomLessLessParser::SEMICOLON, i);
}

std::vector<FreedomLessLessParser::Valueless_expression_defContext *> FreedomLessLessParser::Switch_default_defContext::valueless_expression_def() {
  return getRuleContexts<FreedomLessLessParser::Valueless_expression_defContext>();
}

FreedomLessLessParser::Valueless_expression_defContext* FreedomLessLessParser::Switch_default_defContext::valueless_expression_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Valueless_expression_defContext>(i);
}

std::vector<FreedomLessLessParser::Struct_defContext *> FreedomLessLessParser::Switch_default_defContext::struct_def() {
  return getRuleContexts<FreedomLessLessParser::Struct_defContext>();
}

FreedomLessLessParser::Struct_defContext* FreedomLessLessParser::Switch_default_defContext::struct_def(size_t i) {
  return getRuleContext<FreedomLessLessParser::Struct_defContext>(i);
}


size_t FreedomLessLessParser::Switch_default_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleSwitch_default_def;
}

void FreedomLessLessParser::Switch_default_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSwitch_default_def(this);
}

void FreedomLessLessParser::Switch_default_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSwitch_default_def(this);
}

FreedomLessLessParser::Switch_default_defContext* FreedomLessLessParser::switch_default_def() {
  Switch_default_defContext *_localctx = _tracker.createInstance<Switch_default_defContext>(_ctx, getState());
  enterRule(_localctx, 46, FreedomLessLessParser::RuleSwitch_default_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(491);
    match(FreedomLessLessParser::DEFAULT);
    setState(492);
    match(FreedomLessLessParser::TWOPOINTS);
    setState(499);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 65, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(497);
        _errHandler->sync(this);
        switch (_input->LA(1)) {
          case FreedomLessLessParser::INT_T:
          case FreedomLessLessParser::UNSIGNED_T:
          case FreedomLessLessParser::FLOAT_T:
          case FreedomLessLessParser::DOUBLE_T:
          case FreedomLessLessParser::SHORT_T:
          case FreedomLessLessParser::CHAR_T:
          case FreedomLessLessParser::BOOL_T:
          case FreedomLessLessParser::VOID_T:
          case FreedomLessLessParser::CLASS:
          case FreedomLessLessParser::BREAK:
          case FreedomLessLessParser::CONTINUE:
          case FreedomLessLessParser::RETURN:
          case FreedomLessLessParser::NEW:
          case FreedomLessLessParser::FREE:
          case FreedomLessLessParser::MALLOC:
          case FreedomLessLessParser::DELETE:
          case FreedomLessLessParser::SIZEOF:
          case FreedomLessLessParser::MULT:
          case FreedomLessLessParser::ID: {
            setState(493);
            valueless_expression_def();
            setState(494);
            match(FreedomLessLessParser::SEMICOLON);
            break;
          }

          case FreedomLessLessParser::IF:
          case FreedomLessLessParser::FOR:
          case FreedomLessLessParser::WHILE:
          case FreedomLessLessParser::SWITCH: {
            setState(496);
            struct_def();
            break;
          }

        default:
          throw NoViableAltException(this);
        } 
      }
      setState(501);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 65, _ctx);
    }
    setState(502);
    match(FreedomLessLessParser::BREAK);
    setState(503);
    match(FreedomLessLessParser::SEMICOLON);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Main_defContext ------------------------------------------------------------------

FreedomLessLessParser::Main_defContext::Main_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Main_defContext::VOID_T() {
  return getToken(FreedomLessLessParser::VOID_T, 0);
}

tree::TerminalNode* FreedomLessLessParser::Main_defContext::MAIN() {
  return getToken(FreedomLessLessParser::MAIN, 0);
}

tree::TerminalNode* FreedomLessLessParser::Main_defContext::OPEN_PAR() {
  return getToken(FreedomLessLessParser::OPEN_PAR, 0);
}

tree::TerminalNode* FreedomLessLessParser::Main_defContext::INT_T() {
  return getToken(FreedomLessLessParser::INT_T, 0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Main_defContext::ID() {
  return getTokens(FreedomLessLessParser::ID);
}

tree::TerminalNode* FreedomLessLessParser::Main_defContext::ID(size_t i) {
  return getToken(FreedomLessLessParser::ID, i);
}

tree::TerminalNode* FreedomLessLessParser::Main_defContext::COMMA() {
  return getToken(FreedomLessLessParser::COMMA, 0);
}

tree::TerminalNode* FreedomLessLessParser::Main_defContext::CHAR_T() {
  return getToken(FreedomLessLessParser::CHAR_T, 0);
}

std::vector<tree::TerminalNode *> FreedomLessLessParser::Main_defContext::MULT() {
  return getTokens(FreedomLessLessParser::MULT);
}

tree::TerminalNode* FreedomLessLessParser::Main_defContext::MULT(size_t i) {
  return getToken(FreedomLessLessParser::MULT, i);
}

tree::TerminalNode* FreedomLessLessParser::Main_defContext::CLOSE_PAR() {
  return getToken(FreedomLessLessParser::CLOSE_PAR, 0);
}

FreedomLessLessParser::Block_defContext* FreedomLessLessParser::Main_defContext::block_def() {
  return getRuleContext<FreedomLessLessParser::Block_defContext>(0);
}


size_t FreedomLessLessParser::Main_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleMain_def;
}

void FreedomLessLessParser::Main_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMain_def(this);
}

void FreedomLessLessParser::Main_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMain_def(this);
}

FreedomLessLessParser::Main_defContext* FreedomLessLessParser::main_def() {
  Main_defContext *_localctx = _tracker.createInstance<Main_defContext>(_ctx, getState());
  enterRule(_localctx, 48, FreedomLessLessParser::RuleMain_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(505);
    match(FreedomLessLessParser::VOID_T);
    setState(506);
    match(FreedomLessLessParser::MAIN);
    setState(507);
    match(FreedomLessLessParser::OPEN_PAR);
    setState(508);
    match(FreedomLessLessParser::INT_T);
    setState(509);
    match(FreedomLessLessParser::ID);
    setState(510);
    match(FreedomLessLessParser::COMMA);
    setState(511);
    match(FreedomLessLessParser::CHAR_T);
    setState(512);
    match(FreedomLessLessParser::MULT);
    setState(513);
    match(FreedomLessLessParser::MULT);
    setState(514);
    match(FreedomLessLessParser::ID);
    setState(515);
    match(FreedomLessLessParser::CLOSE_PAR);
    setState(516);
    block_def();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Type_defContext ------------------------------------------------------------------

FreedomLessLessParser::Type_defContext::Type_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::INT_T() {
  return getToken(FreedomLessLessParser::INT_T, 0);
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::UNSIGNED_T() {
  return getToken(FreedomLessLessParser::UNSIGNED_T, 0);
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::SHORT_T() {
  return getToken(FreedomLessLessParser::SHORT_T, 0);
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::FLOAT_T() {
  return getToken(FreedomLessLessParser::FLOAT_T, 0);
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::DOUBLE_T() {
  return getToken(FreedomLessLessParser::DOUBLE_T, 0);
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::CHAR_T() {
  return getToken(FreedomLessLessParser::CHAR_T, 0);
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::BOOL_T() {
  return getToken(FreedomLessLessParser::BOOL_T, 0);
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::VOID_T() {
  return getToken(FreedomLessLessParser::VOID_T, 0);
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::CLASS() {
  return getToken(FreedomLessLessParser::CLASS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Type_defContext::ID() {
  return getToken(FreedomLessLessParser::ID, 0);
}


size_t FreedomLessLessParser::Type_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleType_def;
}

void FreedomLessLessParser::Type_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterType_def(this);
}

void FreedomLessLessParser::Type_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitType_def(this);
}

FreedomLessLessParser::Type_defContext* FreedomLessLessParser::type_def() {
  Type_defContext *_localctx = _tracker.createInstance<Type_defContext>(_ctx, getState());
  enterRule(_localctx, 50, FreedomLessLessParser::RuleType_def);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(528);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case FreedomLessLessParser::INT_T: {
        enterOuterAlt(_localctx, 1);
        setState(518);
        match(FreedomLessLessParser::INT_T);
        break;
      }

      case FreedomLessLessParser::UNSIGNED_T: {
        enterOuterAlt(_localctx, 2);
        setState(519);
        match(FreedomLessLessParser::UNSIGNED_T);
        break;
      }

      case FreedomLessLessParser::SHORT_T: {
        enterOuterAlt(_localctx, 3);
        setState(520);
        match(FreedomLessLessParser::SHORT_T);
        break;
      }

      case FreedomLessLessParser::FLOAT_T: {
        enterOuterAlt(_localctx, 4);
        setState(521);
        match(FreedomLessLessParser::FLOAT_T);
        break;
      }

      case FreedomLessLessParser::DOUBLE_T: {
        enterOuterAlt(_localctx, 5);
        setState(522);
        match(FreedomLessLessParser::DOUBLE_T);
        break;
      }

      case FreedomLessLessParser::CHAR_T: {
        enterOuterAlt(_localctx, 6);
        setState(523);
        match(FreedomLessLessParser::CHAR_T);
        break;
      }

      case FreedomLessLessParser::BOOL_T: {
        enterOuterAlt(_localctx, 7);
        setState(524);
        match(FreedomLessLessParser::BOOL_T);
        break;
      }

      case FreedomLessLessParser::VOID_T: {
        enterOuterAlt(_localctx, 8);
        setState(525);
        match(FreedomLessLessParser::VOID_T);
        break;
      }

      case FreedomLessLessParser::CLASS: {
        enterOuterAlt(_localctx, 9);
        setState(526);
        match(FreedomLessLessParser::CLASS);
        setState(527);
        match(FreedomLessLessParser::ID);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Value_defContext ------------------------------------------------------------------

FreedomLessLessParser::Value_defContext::Value_defContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Value_defContext::INT() {
  return getToken(FreedomLessLessParser::INT, 0);
}

tree::TerminalNode* FreedomLessLessParser::Value_defContext::CHAR() {
  return getToken(FreedomLessLessParser::CHAR, 0);
}

tree::TerminalNode* FreedomLessLessParser::Value_defContext::STRING() {
  return getToken(FreedomLessLessParser::STRING, 0);
}

tree::TerminalNode* FreedomLessLessParser::Value_defContext::INTEGER() {
  return getToken(FreedomLessLessParser::INTEGER, 0);
}

tree::TerminalNode* FreedomLessLessParser::Value_defContext::FLOATING() {
  return getToken(FreedomLessLessParser::FLOATING, 0);
}

tree::TerminalNode* FreedomLessLessParser::Value_defContext::BOOLEAN() {
  return getToken(FreedomLessLessParser::BOOLEAN, 0);
}

tree::TerminalNode* FreedomLessLessParser::Value_defContext::NULL() {
  return getToken(FreedomLessLessParser::NULL, 0);
}


size_t FreedomLessLessParser::Value_defContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleValue_def;
}

void FreedomLessLessParser::Value_defContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterValue_def(this);
}

void FreedomLessLessParser::Value_defContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitValue_def(this);
}

FreedomLessLessParser::Value_defContext* FreedomLessLessParser::value_def() {
  Value_defContext *_localctx = _tracker.createInstance<Value_defContext>(_ctx, getState());
  enterRule(_localctx, 52, FreedomLessLessParser::RuleValue_def);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(530);
    _la = _input->LA(1);
    if (!(((((_la - 60) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 60)) & ((1ULL << (FreedomLessLessParser::NULL - 60))
      | (1ULL << (FreedomLessLessParser::INT - 60))
      | (1ULL << (FreedomLessLessParser::INTEGER - 60))
      | (1ULL << (FreedomLessLessParser::BOOLEAN - 60))
      | (1ULL << (FreedomLessLessParser::STRING - 60))
      | (1ULL << (FreedomLessLessParser::CHAR - 60))
      | (1ULL << (FreedomLessLessParser::FLOATING - 60)))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Logical_opContext ------------------------------------------------------------------

FreedomLessLessParser::Logical_opContext::Logical_opContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Logical_opContext::LESS() {
  return getToken(FreedomLessLessParser::LESS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Logical_opContext::BIGGER() {
  return getToken(FreedomLessLessParser::BIGGER, 0);
}

tree::TerminalNode* FreedomLessLessParser::Logical_opContext::LESS_EQ() {
  return getToken(FreedomLessLessParser::LESS_EQ, 0);
}

tree::TerminalNode* FreedomLessLessParser::Logical_opContext::BIGGER_EQ() {
  return getToken(FreedomLessLessParser::BIGGER_EQ, 0);
}

tree::TerminalNode* FreedomLessLessParser::Logical_opContext::EQUALS() {
  return getToken(FreedomLessLessParser::EQUALS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Logical_opContext::NOT_EQUALS() {
  return getToken(FreedomLessLessParser::NOT_EQUALS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Logical_opContext::AND() {
  return getToken(FreedomLessLessParser::AND, 0);
}

tree::TerminalNode* FreedomLessLessParser::Logical_opContext::OR() {
  return getToken(FreedomLessLessParser::OR, 0);
}


size_t FreedomLessLessParser::Logical_opContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleLogical_op;
}

void FreedomLessLessParser::Logical_opContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLogical_op(this);
}

void FreedomLessLessParser::Logical_opContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLogical_op(this);
}

FreedomLessLessParser::Logical_opContext* FreedomLessLessParser::logical_op() {
  Logical_opContext *_localctx = _tracker.createInstance<Logical_opContext>(_ctx, getState());
  enterRule(_localctx, 54, FreedomLessLessParser::RuleLogical_op);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(532);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FreedomLessLessParser::LESS)
      | (1ULL << FreedomLessLessParser::BIGGER)
      | (1ULL << FreedomLessLessParser::LESS_EQ)
      | (1ULL << FreedomLessLessParser::BIGGER_EQ)
      | (1ULL << FreedomLessLessParser::EQUALS)
      | (1ULL << FreedomLessLessParser::NOT_EQUALS)
      | (1ULL << FreedomLessLessParser::AND)
      | (1ULL << FreedomLessLessParser::OR))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Arithmetic_opContext ------------------------------------------------------------------

FreedomLessLessParser::Arithmetic_opContext::Arithmetic_opContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Arithmetic_opContext::PLUS() {
  return getToken(FreedomLessLessParser::PLUS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Arithmetic_opContext::MINUS() {
  return getToken(FreedomLessLessParser::MINUS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Arithmetic_opContext::MULT() {
  return getToken(FreedomLessLessParser::MULT, 0);
}

tree::TerminalNode* FreedomLessLessParser::Arithmetic_opContext::DIV() {
  return getToken(FreedomLessLessParser::DIV, 0);
}


size_t FreedomLessLessParser::Arithmetic_opContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleArithmetic_op;
}

void FreedomLessLessParser::Arithmetic_opContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArithmetic_op(this);
}

void FreedomLessLessParser::Arithmetic_opContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArithmetic_op(this);
}

FreedomLessLessParser::Arithmetic_opContext* FreedomLessLessParser::arithmetic_op() {
  Arithmetic_opContext *_localctx = _tracker.createInstance<Arithmetic_opContext>(_ctx, getState());
  enterRule(_localctx, 56, FreedomLessLessParser::RuleArithmetic_op);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(534);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FreedomLessLessParser::PLUS)
      | (1ULL << FreedomLessLessParser::MINUS)
      | (1ULL << FreedomLessLessParser::MULT)
      | (1ULL << FreedomLessLessParser::DIV))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Auto_assign_opContext ------------------------------------------------------------------

FreedomLessLessParser::Auto_assign_opContext::Auto_assign_opContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Auto_assign_opContext::AUTOPLUS() {
  return getToken(FreedomLessLessParser::AUTOPLUS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Auto_assign_opContext::AUTOMINUS() {
  return getToken(FreedomLessLessParser::AUTOMINUS, 0);
}

tree::TerminalNode* FreedomLessLessParser::Auto_assign_opContext::AUTOMULT() {
  return getToken(FreedomLessLessParser::AUTOMULT, 0);
}

tree::TerminalNode* FreedomLessLessParser::Auto_assign_opContext::AUTODIV() {
  return getToken(FreedomLessLessParser::AUTODIV, 0);
}


size_t FreedomLessLessParser::Auto_assign_opContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleAuto_assign_op;
}

void FreedomLessLessParser::Auto_assign_opContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAuto_assign_op(this);
}

void FreedomLessLessParser::Auto_assign_opContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAuto_assign_op(this);
}

FreedomLessLessParser::Auto_assign_opContext* FreedomLessLessParser::auto_assign_op() {
  Auto_assign_opContext *_localctx = _tracker.createInstance<Auto_assign_opContext>(_ctx, getState());
  enterRule(_localctx, 58, FreedomLessLessParser::RuleAuto_assign_op);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(536);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FreedomLessLessParser::AUTOPLUS)
      | (1ULL << FreedomLessLessParser::AUTOMINUS)
      | (1ULL << FreedomLessLessParser::AUTOMULT)
      | (1ULL << FreedomLessLessParser::AUTODIV))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Auto_increm_opContext ------------------------------------------------------------------

FreedomLessLessParser::Auto_increm_opContext::Auto_increm_opContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FreedomLessLessParser::Auto_increm_opContext::INCREM() {
  return getToken(FreedomLessLessParser::INCREM, 0);
}

tree::TerminalNode* FreedomLessLessParser::Auto_increm_opContext::DECREM() {
  return getToken(FreedomLessLessParser::DECREM, 0);
}


size_t FreedomLessLessParser::Auto_increm_opContext::getRuleIndex() const {
  return FreedomLessLessParser::RuleAuto_increm_op;
}

void FreedomLessLessParser::Auto_increm_opContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAuto_increm_op(this);
}

void FreedomLessLessParser::Auto_increm_opContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<FreedomLessLessListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAuto_increm_op(this);
}

FreedomLessLessParser::Auto_increm_opContext* FreedomLessLessParser::auto_increm_op() {
  Auto_increm_opContext *_localctx = _tracker.createInstance<Auto_increm_opContext>(_ctx, getState());
  enterRule(_localctx, 60, FreedomLessLessParser::RuleAuto_increm_op);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(538);
    _la = _input->LA(1);
    if (!(_la == FreedomLessLessParser::INCREM

    || _la == FreedomLessLessParser::DECREM)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> FreedomLessLessParser::_decisionToDFA;
atn::PredictionContextCache FreedomLessLessParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN FreedomLessLessParser::_atn;
std::vector<uint16_t> FreedomLessLessParser::_serializedATN;

std::vector<std::string> FreedomLessLessParser::_ruleNames = {
  "program_def", "import_def", "class_def", "class_members_def", "public_def", 
  "private_def", "class_scope_def", "attribute_def", "valued_expression_def", 
  "operation", "function_call_def", "argument_def", "function_def", "param_def", 
  "block_def", "valueless_expression_def", "struct_def", "if_def", "for_def", 
  "valued_attribute_def", "while_def", "switch_def", "switch_case_def", 
  "switch_default_def", "main_def", "type_def", "value_def", "logical_op", 
  "arithmetic_op", "auto_assign_op", "auto_increm_op"
};

std::vector<std::string> FreedomLessLessParser::_literalNames = {
  "", "'.'", "'int'", "'unsigned'", "'float'", "'double'", "'short'", "'char'", 
  "'bool'", "'void'", "'import'", "'class'", "", "", "'main'", "'if'", "'else'", 
  "'for'", "'while'", "'switch'", "'case'", "'break'", "'continue'", "'default'", 
  "'return'", "'new'", "'free'", "'malloc'", "'delete'", "'sizeof'", "'='", 
  "'+'", "'-'", "'*'", "'/'", "'&'", "'->'", "'++'", "'--'", "'+='", "'-='", 
  "'*='", "'/='", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
  "'||'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "';'", "':'", 
  "'null'"
};

std::vector<std::string> FreedomLessLessParser::_symbolicNames = {
  "", "", "INT_T", "UNSIGNED_T", "FLOAT_T", "DOUBLE_T", "SHORT_T", "CHAR_T", 
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

dfa::Vocabulary FreedomLessLessParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> FreedomLessLessParser::_tokenNames;

FreedomLessLessParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x48, 0x21f, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
    0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 
    0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 
    0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 
    0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 0x4, 
    0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 0x9, 0x14, 0x4, 0x15, 
    0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 0x9, 0x17, 0x4, 0x18, 0x9, 
    0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 0x9, 0x1a, 0x4, 0x1b, 0x9, 0x1b, 
    0x4, 0x1c, 0x9, 0x1c, 0x4, 0x1d, 0x9, 0x1d, 0x4, 0x1e, 0x9, 0x1e, 0x4, 
    0x1f, 0x9, 0x1f, 0x4, 0x20, 0x9, 0x20, 0x3, 0x2, 0x5, 0x2, 0x42, 0xa, 
    0x2, 0x3, 0x2, 0x7, 0x2, 0x45, 0xa, 0x2, 0xc, 0x2, 0xe, 0x2, 0x48, 0xb, 
    0x2, 0x3, 0x2, 0x7, 0x2, 0x4b, 0xa, 0x2, 0xc, 0x2, 0xe, 0x2, 0x4e, 0xb, 
    0x2, 0x3, 0x2, 0x5, 0x2, 0x51, 0xa, 0x2, 0x3, 0x3, 0x3, 0x3, 0x6, 0x3, 
    0x55, 0xa, 0x3, 0xd, 0x3, 0xe, 0x3, 0x56, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
    0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x5, 0x5, 
    0x62, 0xa, 0x5, 0x5, 0x5, 0x64, 0xa, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 
    0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x7, 0x8, 
    0x6f, 0xa, 0x8, 0xc, 0x8, 0xe, 0x8, 0x72, 0xb, 0x8, 0x3, 0x8, 0x7, 0x8, 
    0x75, 0xa, 0x8, 0xc, 0x8, 0xe, 0x8, 0x78, 0xb, 0x8, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0x7e, 0xa, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
    0x9, 0x3, 0x9, 0x5, 0x9, 0x84, 0xa, 0x9, 0x7, 0x9, 0x86, 0xa, 0x9, 0xc, 
    0x9, 0xe, 0x9, 0x89, 0xb, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x6, 0x9, 0x90, 0xa, 0x9, 0xd, 0x9, 0xe, 0x9, 0x91, 0x3, 0x9, 
    0x3, 0x9, 0x5, 0x9, 0x96, 0xa, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
    0x9, 0x3, 0x9, 0x6, 0x9, 0x9d, 0xa, 0x9, 0xd, 0x9, 0xe, 0x9, 0x9e, 0x3, 
    0x9, 0x3, 0x9, 0x5, 0x9, 0xa3, 0xa, 0x9, 0x7, 0x9, 0xa5, 0xa, 0x9, 0xc, 
    0x9, 0xe, 0x9, 0xa8, 0xb, 0x9, 0x3, 0x9, 0x3, 0x9, 0x6, 0x9, 0xac, 0xa, 
    0x9, 0xd, 0x9, 0xe, 0x9, 0xad, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 
    0xb3, 0xa, 0x9, 0x3, 0x9, 0x3, 0x9, 0x6, 0x9, 0xb7, 0xa, 0x9, 0xd, 0x9, 
    0xe, 0x9, 0xb8, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0xbe, 0xa, 0x9, 
    0x7, 0x9, 0xc0, 0xa, 0x9, 0xc, 0x9, 0xe, 0x9, 0xc3, 0xb, 0x9, 0x5, 0x9, 
    0xc5, 0xa, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x3, 0xa, 0x5, 0xa, 0xd5, 0xa, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0xdc, 0xa, 0xa, 0x3, 0xa, 0x5, 0xa, 0xdf, 
    0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0xe3, 0xa, 0xb, 0x3, 0xb, 0x3, 
    0xb, 0x7, 0xb, 0xe7, 0xa, 0xb, 0xc, 0xb, 0xe, 0xb, 0xea, 0xb, 0xb, 0x3, 
    0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
    0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0xf6, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x6, 0xc, 0x102, 0xa, 0xc, 0xd, 0xc, 0xe, 0xc, 0x103, 0x3, 
    0xc, 0x3, 0xc, 0x3, 0xc, 0x6, 0xc, 0x109, 0xa, 0xc, 0xd, 0xc, 0xe, 0xc, 
    0x10a, 0x5, 0xc, 0x10d, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
    0xc, 0x5, 0xc, 0x113, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 
    0x118, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 
    0xc, 0x11f, 0xa, 0xc, 0x3, 0xc, 0x7, 0xc, 0x122, 0xa, 0xc, 0xc, 0xc, 
    0xe, 0xc, 0x125, 0xb, 0xc, 0x5, 0xc, 0x127, 0xa, 0xc, 0x3, 0xd, 0x3, 
    0xd, 0x3, 0xd, 0x7, 0xd, 0x12c, 0xa, 0xd, 0xc, 0xd, 0xe, 0xd, 0x12f, 
    0xb, 0xd, 0x3, 0xe, 0x3, 0xe, 0x6, 0xe, 0x133, 0xa, 0xe, 0xd, 0xe, 0xe, 
    0xe, 0x134, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x6, 0xe, 0x13a, 0xa, 0xe, 
    0xd, 0xe, 0xe, 0xe, 0x13b, 0x5, 0xe, 0x13e, 0xa, 0xe, 0x3, 0xe, 0x3, 
    0xe, 0x3, 0xe, 0x5, 0xe, 0x143, 0xa, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 
    0x3, 0xf, 0x3, 0xf, 0x6, 0xf, 0x14a, 0xa, 0xf, 0xd, 0xf, 0xe, 0xf, 0x14b, 
    0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x7, 0xf, 0x151, 0xa, 0xf, 0xc, 0xf, 0xe, 
    0xf, 0x154, 0xb, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 
    0x7, 0xf, 0x15b, 0xa, 0xf, 0xc, 0xf, 0xe, 0xf, 0x15e, 0xb, 0xf, 0x3, 
    0xf, 0x3, 0xf, 0x7, 0xf, 0x162, 0xa, 0xf, 0xc, 0xf, 0xe, 0xf, 0x165, 
    0xb, 0xf, 0x5, 0xf, 0x167, 0xa, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 
    0x3, 0x10, 0x3, 0x10, 0x7, 0x10, 0x16e, 0xa, 0x10, 0xc, 0x10, 0xe, 0x10, 
    0x171, 0xb, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
    0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
    0x11, 0x3, 0x11, 0x5, 0x11, 0x180, 0xa, 0x11, 0x3, 0x11, 0x3, 0x11, 
    0x5, 0x11, 0x184, 0xa, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 0x11, 0x188, 
    0xa, 0x11, 0x5, 0x11, 0x18a, 0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
    0x3, 0x12, 0x5, 0x12, 0x190, 0xa, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 
    0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x5, 0x13, 0x199, 0xa, 0x13, 
    0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x7, 0x14, 0x1a0, 
    0xa, 0x14, 0xc, 0x14, 0xe, 0x14, 0x1a3, 0xb, 0x14, 0x3, 0x14, 0x3, 0x14, 
    0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x7, 0x14, 0x1ab, 0xa, 0x14, 
    0xc, 0x14, 0xe, 0x14, 0x1ae, 0xb, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
    0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x5, 0x15, 0x1b6, 0xa, 0x15, 0x3, 0x15, 
    0x7, 0x15, 0x1b9, 0xa, 0x15, 0xc, 0x15, 0xe, 0x15, 0x1bc, 0xb, 0x15, 
    0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x6, 0x15, 0x1c3, 
    0xa, 0x15, 0xd, 0x15, 0xe, 0x15, 0x1c4, 0x5, 0x15, 0x1c7, 0xa, 0x15, 
    0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 
    0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 
    0x3, 0x17, 0x3, 0x17, 0x7, 0x17, 0x1d8, 0xa, 0x17, 0xc, 0x17, 0xe, 0x17, 
    0x1db, 0xb, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x18, 0x3, 0x18, 
    0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x6, 0x18, 0x1e7, 
    0xa, 0x18, 0xd, 0x18, 0xe, 0x18, 0x1e8, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 
    0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x7, 
    0x19, 0x1f4, 0xa, 0x19, 0xc, 0x19, 0xe, 0x19, 0x1f7, 0xb, 0x19, 0x3, 
    0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 
    0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 
    0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 
    0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x5, 
    0x1b, 0x213, 0xa, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 
    0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x3, 
    0x20, 0x2, 0x2, 0x21, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 
    0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 
    0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x2, 0x9, 
    0x4, 0x2, 0x23, 0x23, 0x25, 0x25, 0x4, 0x2, 0x3, 0x3, 0x26, 0x26, 0x3, 
    0x2, 0x3e, 0x44, 0x3, 0x2, 0x2d, 0x34, 0x3, 0x2, 0x21, 0x24, 0x3, 0x2, 
    0x29, 0x2c, 0x3, 0x2, 0x27, 0x28, 0x2, 0x25a, 0x2, 0x41, 0x3, 0x2, 0x2, 
    0x2, 0x4, 0x54, 0x3, 0x2, 0x2, 0x2, 0x6, 0x58, 0x3, 0x2, 0x2, 0x2, 0x8, 
    0x63, 0x3, 0x2, 0x2, 0x2, 0xa, 0x65, 0x3, 0x2, 0x2, 0x2, 0xc, 0x68, 
    0x3, 0x2, 0x2, 0x2, 0xe, 0x70, 0x3, 0x2, 0x2, 0x2, 0x10, 0xc4, 0x3, 
    0x2, 0x2, 0x2, 0x12, 0xde, 0x3, 0x2, 0x2, 0x2, 0x14, 0xe8, 0x3, 0x2, 
    0x2, 0x2, 0x16, 0x126, 0x3, 0x2, 0x2, 0x2, 0x18, 0x128, 0x3, 0x2, 0x2, 
    0x2, 0x1a, 0x130, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x166, 0x3, 0x2, 0x2, 0x2, 
    0x1e, 0x168, 0x3, 0x2, 0x2, 0x2, 0x20, 0x189, 0x3, 0x2, 0x2, 0x2, 0x22, 
    0x18f, 0x3, 0x2, 0x2, 0x2, 0x24, 0x191, 0x3, 0x2, 0x2, 0x2, 0x26, 0x19a, 
    0x3, 0x2, 0x2, 0x2, 0x28, 0x1b5, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x1cb, 0x3, 
    0x2, 0x2, 0x2, 0x2c, 0x1d1, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x1df, 0x3, 0x2, 
    0x2, 0x2, 0x30, 0x1ed, 0x3, 0x2, 0x2, 0x2, 0x32, 0x1fb, 0x3, 0x2, 0x2, 
    0x2, 0x34, 0x212, 0x3, 0x2, 0x2, 0x2, 0x36, 0x214, 0x3, 0x2, 0x2, 0x2, 
    0x38, 0x216, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x218, 0x3, 0x2, 0x2, 0x2, 0x3c, 
    0x21a, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x21c, 0x3, 0x2, 0x2, 0x2, 0x40, 0x42, 
    0x5, 0x4, 0x3, 0x2, 0x41, 0x40, 0x3, 0x2, 0x2, 0x2, 0x41, 0x42, 0x3, 
    0x2, 0x2, 0x2, 0x42, 0x46, 0x3, 0x2, 0x2, 0x2, 0x43, 0x45, 0x5, 0x6, 
    0x4, 0x2, 0x44, 0x43, 0x3, 0x2, 0x2, 0x2, 0x45, 0x48, 0x3, 0x2, 0x2, 
    0x2, 0x46, 0x44, 0x3, 0x2, 0x2, 0x2, 0x46, 0x47, 0x3, 0x2, 0x2, 0x2, 
    0x47, 0x4c, 0x3, 0x2, 0x2, 0x2, 0x48, 0x46, 0x3, 0x2, 0x2, 0x2, 0x49, 
    0x4b, 0x5, 0x1a, 0xe, 0x2, 0x4a, 0x49, 0x3, 0x2, 0x2, 0x2, 0x4b, 0x4e, 
    0x3, 0x2, 0x2, 0x2, 0x4c, 0x4a, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x4d, 0x3, 
    0x2, 0x2, 0x2, 0x4d, 0x50, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x4c, 0x3, 0x2, 
    0x2, 0x2, 0x4f, 0x51, 0x5, 0x32, 0x1a, 0x2, 0x50, 0x4f, 0x3, 0x2, 0x2, 
    0x2, 0x50, 0x51, 0x3, 0x2, 0x2, 0x2, 0x51, 0x3, 0x3, 0x2, 0x2, 0x2, 
    0x52, 0x53, 0x7, 0xc, 0x2, 0x2, 0x53, 0x55, 0x7, 0x42, 0x2, 0x2, 0x54, 
    0x52, 0x3, 0x2, 0x2, 0x2, 0x55, 0x56, 0x3, 0x2, 0x2, 0x2, 0x56, 0x54, 
    0x3, 0x2, 0x2, 0x2, 0x56, 0x57, 0x3, 0x2, 0x2, 0x2, 0x57, 0x5, 0x3, 
    0x2, 0x2, 0x2, 0x58, 0x59, 0x7, 0xd, 0x2, 0x2, 0x59, 0x5a, 0x7, 0x45, 
    0x2, 0x2, 0x5a, 0x5b, 0x7, 0x37, 0x2, 0x2, 0x5b, 0x5c, 0x5, 0x8, 0x5, 
    0x2, 0x5c, 0x5d, 0x7, 0x38, 0x2, 0x2, 0x5d, 0x7, 0x3, 0x2, 0x2, 0x2, 
    0x5e, 0x64, 0x5, 0xc, 0x7, 0x2, 0x5f, 0x61, 0x5, 0xa, 0x6, 0x2, 0x60, 
    0x62, 0x5, 0xc, 0x7, 0x2, 0x61, 0x60, 0x3, 0x2, 0x2, 0x2, 0x61, 0x62, 
    0x3, 0x2, 0x2, 0x2, 0x62, 0x64, 0x3, 0x2, 0x2, 0x2, 0x63, 0x5e, 0x3, 
    0x2, 0x2, 0x2, 0x63, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x64, 0x9, 0x3, 0x2, 
    0x2, 0x2, 0x65, 0x66, 0x7, 0xe, 0x2, 0x2, 0x66, 0x67, 0x5, 0xe, 0x8, 
    0x2, 0x67, 0xb, 0x3, 0x2, 0x2, 0x2, 0x68, 0x69, 0x7, 0xf, 0x2, 0x2, 
    0x69, 0x6a, 0x5, 0xe, 0x8, 0x2, 0x6a, 0xd, 0x3, 0x2, 0x2, 0x2, 0x6b, 
    0x6c, 0x5, 0x10, 0x9, 0x2, 0x6c, 0x6d, 0x7, 0x3c, 0x2, 0x2, 0x6d, 0x6f, 
    0x3, 0x2, 0x2, 0x2, 0x6e, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x6f, 0x72, 0x3, 
    0x2, 0x2, 0x2, 0x70, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x70, 0x71, 0x3, 0x2, 
    0x2, 0x2, 0x71, 0x76, 0x3, 0x2, 0x2, 0x2, 0x72, 0x70, 0x3, 0x2, 0x2, 
    0x2, 0x73, 0x75, 0x5, 0x1a, 0xe, 0x2, 0x74, 0x73, 0x3, 0x2, 0x2, 0x2, 
    0x75, 0x78, 0x3, 0x2, 0x2, 0x2, 0x76, 0x74, 0x3, 0x2, 0x2, 0x2, 0x76, 
    0x77, 0x3, 0x2, 0x2, 0x2, 0x77, 0xf, 0x3, 0x2, 0x2, 0x2, 0x78, 0x76, 
    0x3, 0x2, 0x2, 0x2, 0x79, 0x7a, 0x5, 0x34, 0x1b, 0x2, 0x7a, 0x7d, 0x7, 
    0x45, 0x2, 0x2, 0x7b, 0x7c, 0x7, 0x20, 0x2, 0x2, 0x7c, 0x7e, 0x5, 0x12, 
    0xa, 0x2, 0x7d, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x7d, 0x7e, 0x3, 0x2, 0x2, 
    0x2, 0x7e, 0x87, 0x3, 0x2, 0x2, 0x2, 0x7f, 0x80, 0x7, 0x3b, 0x2, 0x2, 
    0x80, 0x83, 0x7, 0x45, 0x2, 0x2, 0x81, 0x82, 0x7, 0x20, 0x2, 0x2, 0x82, 
    0x84, 0x5, 0x12, 0xa, 0x2, 0x83, 0x81, 0x3, 0x2, 0x2, 0x2, 0x83, 0x84, 
    0x3, 0x2, 0x2, 0x2, 0x84, 0x86, 0x3, 0x2, 0x2, 0x2, 0x85, 0x7f, 0x3, 
    0x2, 0x2, 0x2, 0x86, 0x89, 0x3, 0x2, 0x2, 0x2, 0x87, 0x85, 0x3, 0x2, 
    0x2, 0x2, 0x87, 0x88, 0x3, 0x2, 0x2, 0x2, 0x88, 0xc5, 0x3, 0x2, 0x2, 
    0x2, 0x89, 0x87, 0x3, 0x2, 0x2, 0x2, 0x8a, 0x8b, 0x5, 0x34, 0x1b, 0x2, 
    0x8b, 0x8f, 0x7, 0x45, 0x2, 0x2, 0x8c, 0x8d, 0x7, 0x39, 0x2, 0x2, 0x8d, 
    0x8e, 0x7, 0x3f, 0x2, 0x2, 0x8e, 0x90, 0x7, 0x3a, 0x2, 0x2, 0x8f, 0x8c, 
    0x3, 0x2, 0x2, 0x2, 0x90, 0x91, 0x3, 0x2, 0x2, 0x2, 0x91, 0x8f, 0x3, 
    0x2, 0x2, 0x2, 0x91, 0x92, 0x3, 0x2, 0x2, 0x2, 0x92, 0x95, 0x3, 0x2, 
    0x2, 0x2, 0x93, 0x94, 0x7, 0x20, 0x2, 0x2, 0x94, 0x96, 0x5, 0x12, 0xa, 
    0x2, 0x95, 0x93, 0x3, 0x2, 0x2, 0x2, 0x95, 0x96, 0x3, 0x2, 0x2, 0x2, 
    0x96, 0xa6, 0x3, 0x2, 0x2, 0x2, 0x97, 0x98, 0x7, 0x3b, 0x2, 0x2, 0x98, 
    0x9c, 0x7, 0x45, 0x2, 0x2, 0x99, 0x9a, 0x7, 0x39, 0x2, 0x2, 0x9a, 0x9b, 
    0x7, 0x3f, 0x2, 0x2, 0x9b, 0x9d, 0x7, 0x3a, 0x2, 0x2, 0x9c, 0x99, 0x3, 
    0x2, 0x2, 0x2, 0x9d, 0x9e, 0x3, 0x2, 0x2, 0x2, 0x9e, 0x9c, 0x3, 0x2, 
    0x2, 0x2, 0x9e, 0x9f, 0x3, 0x2, 0x2, 0x2, 0x9f, 0xa2, 0x3, 0x2, 0x2, 
    0x2, 0xa0, 0xa1, 0x7, 0x20, 0x2, 0x2, 0xa1, 0xa3, 0x5, 0x12, 0xa, 0x2, 
    0xa2, 0xa0, 0x3, 0x2, 0x2, 0x2, 0xa2, 0xa3, 0x3, 0x2, 0x2, 0x2, 0xa3, 
    0xa5, 0x3, 0x2, 0x2, 0x2, 0xa4, 0x97, 0x3, 0x2, 0x2, 0x2, 0xa5, 0xa8, 
    0x3, 0x2, 0x2, 0x2, 0xa6, 0xa4, 0x3, 0x2, 0x2, 0x2, 0xa6, 0xa7, 0x3, 
    0x2, 0x2, 0x2, 0xa7, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xa8, 0xa6, 0x3, 0x2, 
    0x2, 0x2, 0xa9, 0xab, 0x5, 0x34, 0x1b, 0x2, 0xaa, 0xac, 0x7, 0x23, 0x2, 
    0x2, 0xab, 0xaa, 0x3, 0x2, 0x2, 0x2, 0xac, 0xad, 0x3, 0x2, 0x2, 0x2, 
    0xad, 0xab, 0x3, 0x2, 0x2, 0x2, 0xad, 0xae, 0x3, 0x2, 0x2, 0x2, 0xae, 
    0xaf, 0x3, 0x2, 0x2, 0x2, 0xaf, 0xb2, 0x7, 0x45, 0x2, 0x2, 0xb0, 0xb1, 
    0x7, 0x20, 0x2, 0x2, 0xb1, 0xb3, 0x5, 0x12, 0xa, 0x2, 0xb2, 0xb0, 0x3, 
    0x2, 0x2, 0x2, 0xb2, 0xb3, 0x3, 0x2, 0x2, 0x2, 0xb3, 0xc1, 0x3, 0x2, 
    0x2, 0x2, 0xb4, 0xb6, 0x7, 0x3b, 0x2, 0x2, 0xb5, 0xb7, 0x7, 0x23, 0x2, 
    0x2, 0xb6, 0xb5, 0x3, 0x2, 0x2, 0x2, 0xb7, 0xb8, 0x3, 0x2, 0x2, 0x2, 
    0xb8, 0xb6, 0x3, 0x2, 0x2, 0x2, 0xb8, 0xb9, 0x3, 0x2, 0x2, 0x2, 0xb9, 
    0xba, 0x3, 0x2, 0x2, 0x2, 0xba, 0xbd, 0x7, 0x45, 0x2, 0x2, 0xbb, 0xbc, 
    0x7, 0x20, 0x2, 0x2, 0xbc, 0xbe, 0x5, 0x12, 0xa, 0x2, 0xbd, 0xbb, 0x3, 
    0x2, 0x2, 0x2, 0xbd, 0xbe, 0x3, 0x2, 0x2, 0x2, 0xbe, 0xc0, 0x3, 0x2, 
    0x2, 0x2, 0xbf, 0xb4, 0x3, 0x2, 0x2, 0x2, 0xc0, 0xc3, 0x3, 0x2, 0x2, 
    0x2, 0xc1, 0xbf, 0x3, 0x2, 0x2, 0x2, 0xc1, 0xc2, 0x3, 0x2, 0x2, 0x2, 
    0xc2, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xc3, 0xc1, 0x3, 0x2, 0x2, 0x2, 0xc4, 
    0x79, 0x3, 0x2, 0x2, 0x2, 0xc4, 0x8a, 0x3, 0x2, 0x2, 0x2, 0xc4, 0xa9, 
    0x3, 0x2, 0x2, 0x2, 0xc5, 0x11, 0x3, 0x2, 0x2, 0x2, 0xc6, 0xc7, 0x5, 
    0x36, 0x1c, 0x2, 0xc7, 0xc8, 0x5, 0x14, 0xb, 0x2, 0xc8, 0xdf, 0x3, 0x2, 
    0x2, 0x2, 0xc9, 0xca, 0x5, 0x16, 0xc, 0x2, 0xca, 0xcb, 0x5, 0x14, 0xb, 
    0x2, 0xcb, 0xdf, 0x3, 0x2, 0x2, 0x2, 0xcc, 0xcd, 0x9, 0x2, 0x2, 0x2, 
    0xcd, 0xce, 0x7, 0x35, 0x2, 0x2, 0xce, 0xcf, 0x5, 0x12, 0xa, 0x2, 0xcf, 
    0xd0, 0x7, 0x36, 0x2, 0x2, 0xd0, 0xdf, 0x3, 0x2, 0x2, 0x2, 0xd1, 0xdb, 
    0x7, 0x45, 0x2, 0x2, 0xd2, 0xd5, 0x7, 0x20, 0x2, 0x2, 0xd3, 0xd5, 0x5, 
    0x3c, 0x1f, 0x2, 0xd4, 0xd2, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xd3, 0x3, 0x2, 
    0x2, 0x2, 0xd5, 0xd6, 0x3, 0x2, 0x2, 0x2, 0xd6, 0xdc, 0x5, 0x12, 0xa, 
    0x2, 0xd7, 0xdc, 0x5, 0x3e, 0x20, 0x2, 0xd8, 0xd9, 0x7, 0x39, 0x2, 0x2, 
    0xd9, 0xda, 0x7, 0x3f, 0x2, 0x2, 0xda, 0xdc, 0x7, 0x3a, 0x2, 0x2, 0xdb, 
    0xd4, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xd7, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xd8, 
    0x3, 0x2, 0x2, 0x2, 0xdb, 0xdc, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xdd, 0x3, 
    0x2, 0x2, 0x2, 0xdd, 0xdf, 0x5, 0x14, 0xb, 0x2, 0xde, 0xc6, 0x3, 0x2, 
    0x2, 0x2, 0xde, 0xc9, 0x3, 0x2, 0x2, 0x2, 0xde, 0xcc, 0x3, 0x2, 0x2, 
    0x2, 0xde, 0xd1, 0x3, 0x2, 0x2, 0x2, 0xdf, 0x13, 0x3, 0x2, 0x2, 0x2, 
    0xe0, 0xe3, 0x5, 0x38, 0x1d, 0x2, 0xe1, 0xe3, 0x5, 0x3a, 0x1e, 0x2, 
    0xe2, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe2, 0xe1, 0x3, 0x2, 0x2, 0x2, 0xe3, 
    0xe4, 0x3, 0x2, 0x2, 0x2, 0xe4, 0xe5, 0x5, 0x12, 0xa, 0x2, 0xe5, 0xe7, 
    0x3, 0x2, 0x2, 0x2, 0xe6, 0xe2, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xea, 0x3, 
    0x2, 0x2, 0x2, 0xe8, 0xe6, 0x3, 0x2, 0x2, 0x2, 0xe8, 0xe9, 0x3, 0x2, 
    0x2, 0x2, 0xe9, 0x15, 0x3, 0x2, 0x2, 0x2, 0xea, 0xe8, 0x3, 0x2, 0x2, 
    0x2, 0xeb, 0xec, 0x7, 0x1e, 0x2, 0x2, 0xec, 0x127, 0x7, 0x45, 0x2, 0x2, 
    0xed, 0xee, 0x7, 0x1c, 0x2, 0x2, 0xee, 0xef, 0x7, 0x35, 0x2, 0x2, 0xef, 
    0xf0, 0x7, 0x45, 0x2, 0x2, 0xf0, 0x127, 0x7, 0x36, 0x2, 0x2, 0xf1, 0xf2, 
    0x7, 0x1b, 0x2, 0x2, 0xf2, 0xf3, 0x7, 0x45, 0x2, 0x2, 0xf3, 0xf5, 0x7, 
    0x35, 0x2, 0x2, 0xf4, 0xf6, 0x5, 0x18, 0xd, 0x2, 0xf5, 0xf4, 0x3, 0x2, 
    0x2, 0x2, 0xf5, 0xf6, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xf7, 0x3, 0x2, 0x2, 
    0x2, 0xf7, 0x127, 0x7, 0x36, 0x2, 0x2, 0xf8, 0xf9, 0x7, 0x1d, 0x2, 0x2, 
    0xf9, 0xfa, 0x7, 0x35, 0x2, 0x2, 0xfa, 0xfb, 0x5, 0x12, 0xa, 0x2, 0xfb, 
    0xfc, 0x7, 0x36, 0x2, 0x2, 0xfc, 0x127, 0x3, 0x2, 0x2, 0x2, 0xfd, 0xfe, 
    0x7, 0x1f, 0x2, 0x2, 0xfe, 0xff, 0x7, 0x35, 0x2, 0x2, 0xff, 0x10c, 0x5, 
    0x34, 0x1b, 0x2, 0x100, 0x102, 0x7, 0x23, 0x2, 0x2, 0x101, 0x100, 0x3, 
    0x2, 0x2, 0x2, 0x102, 0x103, 0x3, 0x2, 0x2, 0x2, 0x103, 0x101, 0x3, 
    0x2, 0x2, 0x2, 0x103, 0x104, 0x3, 0x2, 0x2, 0x2, 0x104, 0x10d, 0x3, 
    0x2, 0x2, 0x2, 0x105, 0x106, 0x7, 0x39, 0x2, 0x2, 0x106, 0x107, 0x7, 
    0x3f, 0x2, 0x2, 0x107, 0x109, 0x7, 0x3a, 0x2, 0x2, 0x108, 0x105, 0x3, 
    0x2, 0x2, 0x2, 0x109, 0x10a, 0x3, 0x2, 0x2, 0x2, 0x10a, 0x108, 0x3, 
    0x2, 0x2, 0x2, 0x10a, 0x10b, 0x3, 0x2, 0x2, 0x2, 0x10b, 0x10d, 0x3, 
    0x2, 0x2, 0x2, 0x10c, 0x101, 0x3, 0x2, 0x2, 0x2, 0x10c, 0x108, 0x3, 
    0x2, 0x2, 0x2, 0x10c, 0x10d, 0x3, 0x2, 0x2, 0x2, 0x10d, 0x10e, 0x3, 
    0x2, 0x2, 0x2, 0x10e, 0x10f, 0x7, 0x36, 0x2, 0x2, 0x10f, 0x127, 0x3, 
    0x2, 0x2, 0x2, 0x110, 0x111, 0x7, 0x45, 0x2, 0x2, 0x111, 0x113, 0x9, 
    0x3, 0x2, 0x2, 0x112, 0x110, 0x3, 0x2, 0x2, 0x2, 0x112, 0x113, 0x3, 
    0x2, 0x2, 0x2, 0x113, 0x114, 0x3, 0x2, 0x2, 0x2, 0x114, 0x115, 0x7, 
    0x45, 0x2, 0x2, 0x115, 0x117, 0x7, 0x35, 0x2, 0x2, 0x116, 0x118, 0x5, 
    0x18, 0xd, 0x2, 0x117, 0x116, 0x3, 0x2, 0x2, 0x2, 0x117, 0x118, 0x3, 
    0x2, 0x2, 0x2, 0x118, 0x119, 0x3, 0x2, 0x2, 0x2, 0x119, 0x123, 0x7, 
    0x36, 0x2, 0x2, 0x11a, 0x11b, 0x9, 0x3, 0x2, 0x2, 0x11b, 0x11c, 0x7, 
    0x45, 0x2, 0x2, 0x11c, 0x11e, 0x7, 0x35, 0x2, 0x2, 0x11d, 0x11f, 0x5, 
    0x18, 0xd, 0x2, 0x11e, 0x11d, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x11f, 0x3, 
    0x2, 0x2, 0x2, 0x11f, 0x120, 0x3, 0x2, 0x2, 0x2, 0x120, 0x122, 0x7, 
    0x36, 0x2, 0x2, 0x121, 0x11a, 0x3, 0x2, 0x2, 0x2, 0x122, 0x125, 0x3, 
    0x2, 0x2, 0x2, 0x123, 0x121, 0x3, 0x2, 0x2, 0x2, 0x123, 0x124, 0x3, 
    0x2, 0x2, 0x2, 0x124, 0x127, 0x3, 0x2, 0x2, 0x2, 0x125, 0x123, 0x3, 
    0x2, 0x2, 0x2, 0x126, 0xeb, 0x3, 0x2, 0x2, 0x2, 0x126, 0xed, 0x3, 0x2, 
    0x2, 0x2, 0x126, 0xf1, 0x3, 0x2, 0x2, 0x2, 0x126, 0xf8, 0x3, 0x2, 0x2, 
    0x2, 0x126, 0xfd, 0x3, 0x2, 0x2, 0x2, 0x126, 0x112, 0x3, 0x2, 0x2, 0x2, 
    0x127, 0x17, 0x3, 0x2, 0x2, 0x2, 0x128, 0x12d, 0x5, 0x12, 0xa, 0x2, 
    0x129, 0x12a, 0x7, 0x3b, 0x2, 0x2, 0x12a, 0x12c, 0x5, 0x12, 0xa, 0x2, 
    0x12b, 0x129, 0x3, 0x2, 0x2, 0x2, 0x12c, 0x12f, 0x3, 0x2, 0x2, 0x2, 
    0x12d, 0x12b, 0x3, 0x2, 0x2, 0x2, 0x12d, 0x12e, 0x3, 0x2, 0x2, 0x2, 
    0x12e, 0x19, 0x3, 0x2, 0x2, 0x2, 0x12f, 0x12d, 0x3, 0x2, 0x2, 0x2, 0x130, 
    0x13d, 0x5, 0x34, 0x1b, 0x2, 0x131, 0x133, 0x7, 0x23, 0x2, 0x2, 0x132, 
    0x131, 0x3, 0x2, 0x2, 0x2, 0x133, 0x134, 0x3, 0x2, 0x2, 0x2, 0x134, 
    0x132, 0x3, 0x2, 0x2, 0x2, 0x134, 0x135, 0x3, 0x2, 0x2, 0x2, 0x135, 
    0x13e, 0x3, 0x2, 0x2, 0x2, 0x136, 0x137, 0x7, 0x39, 0x2, 0x2, 0x137, 
    0x138, 0x7, 0x3f, 0x2, 0x2, 0x138, 0x13a, 0x7, 0x3a, 0x2, 0x2, 0x139, 
    0x136, 0x3, 0x2, 0x2, 0x2, 0x13a, 0x13b, 0x3, 0x2, 0x2, 0x2, 0x13b, 
    0x139, 0x3, 0x2, 0x2, 0x2, 0x13b, 0x13c, 0x3, 0x2, 0x2, 0x2, 0x13c, 
    0x13e, 0x3, 0x2, 0x2, 0x2, 0x13d, 0x132, 0x3, 0x2, 0x2, 0x2, 0x13d, 
    0x139, 0x3, 0x2, 0x2, 0x2, 0x13d, 0x13e, 0x3, 0x2, 0x2, 0x2, 0x13e, 
    0x13f, 0x3, 0x2, 0x2, 0x2, 0x13f, 0x140, 0x7, 0x45, 0x2, 0x2, 0x140, 
    0x142, 0x7, 0x35, 0x2, 0x2, 0x141, 0x143, 0x5, 0x1c, 0xf, 0x2, 0x142, 
    0x141, 0x3, 0x2, 0x2, 0x2, 0x142, 0x143, 0x3, 0x2, 0x2, 0x2, 0x143, 
    0x144, 0x3, 0x2, 0x2, 0x2, 0x144, 0x145, 0x7, 0x36, 0x2, 0x2, 0x145, 
    0x146, 0x5, 0x1e, 0x10, 0x2, 0x146, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x147, 
    0x149, 0x5, 0x34, 0x1b, 0x2, 0x148, 0x14a, 0x7, 0x23, 0x2, 0x2, 0x149, 
    0x148, 0x3, 0x2, 0x2, 0x2, 0x14a, 0x14b, 0x3, 0x2, 0x2, 0x2, 0x14b, 
    0x149, 0x3, 0x2, 0x2, 0x2, 0x14b, 0x14c, 0x3, 0x2, 0x2, 0x2, 0x14c, 
    0x14d, 0x3, 0x2, 0x2, 0x2, 0x14d, 0x152, 0x7, 0x45, 0x2, 0x2, 0x14e, 
    0x14f, 0x7, 0x3b, 0x2, 0x2, 0x14f, 0x151, 0x5, 0x1c, 0xf, 0x2, 0x150, 
    0x14e, 0x3, 0x2, 0x2, 0x2, 0x151, 0x154, 0x3, 0x2, 0x2, 0x2, 0x152, 
    0x150, 0x3, 0x2, 0x2, 0x2, 0x152, 0x153, 0x3, 0x2, 0x2, 0x2, 0x153, 
    0x167, 0x3, 0x2, 0x2, 0x2, 0x154, 0x152, 0x3, 0x2, 0x2, 0x2, 0x155, 
    0x156, 0x5, 0x34, 0x1b, 0x2, 0x156, 0x15c, 0x7, 0x45, 0x2, 0x2, 0x157, 
    0x158, 0x7, 0x39, 0x2, 0x2, 0x158, 0x159, 0x7, 0x3f, 0x2, 0x2, 0x159, 
    0x15b, 0x7, 0x3a, 0x2, 0x2, 0x15a, 0x157, 0x3, 0x2, 0x2, 0x2, 0x15b, 
    0x15e, 0x3, 0x2, 0x2, 0x2, 0x15c, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x15c, 
    0x15d, 0x3, 0x2, 0x2, 0x2, 0x15d, 0x163, 0x3, 0x2, 0x2, 0x2, 0x15e, 
    0x15c, 0x3, 0x2, 0x2, 0x2, 0x15f, 0x160, 0x7, 0x3b, 0x2, 0x2, 0x160, 
    0x162, 0x5, 0x1c, 0xf, 0x2, 0x161, 0x15f, 0x3, 0x2, 0x2, 0x2, 0x162, 
    0x165, 0x3, 0x2, 0x2, 0x2, 0x163, 0x161, 0x3, 0x2, 0x2, 0x2, 0x163, 
    0x164, 0x3, 0x2, 0x2, 0x2, 0x164, 0x167, 0x3, 0x2, 0x2, 0x2, 0x165, 
    0x163, 0x3, 0x2, 0x2, 0x2, 0x166, 0x147, 0x3, 0x2, 0x2, 0x2, 0x166, 
    0x155, 0x3, 0x2, 0x2, 0x2, 0x167, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x168, 0x16f, 
    0x7, 0x37, 0x2, 0x2, 0x169, 0x16a, 0x5, 0x20, 0x11, 0x2, 0x16a, 0x16b, 
    0x7, 0x3c, 0x2, 0x2, 0x16b, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x16c, 0x16e, 
    0x5, 0x22, 0x12, 0x2, 0x16d, 0x169, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x16c, 
    0x3, 0x2, 0x2, 0x2, 0x16e, 0x171, 0x3, 0x2, 0x2, 0x2, 0x16f, 0x16d, 
    0x3, 0x2, 0x2, 0x2, 0x16f, 0x170, 0x3, 0x2, 0x2, 0x2, 0x170, 0x172, 
    0x3, 0x2, 0x2, 0x2, 0x171, 0x16f, 0x3, 0x2, 0x2, 0x2, 0x172, 0x173, 
    0x7, 0x38, 0x2, 0x2, 0x173, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x174, 0x18a, 
    0x7, 0x17, 0x2, 0x2, 0x175, 0x18a, 0x7, 0x18, 0x2, 0x2, 0x176, 0x18a, 
    0x5, 0x10, 0x9, 0x2, 0x177, 0x18a, 0x5, 0x16, 0xc, 0x2, 0x178, 0x179, 
    0x7, 0x1a, 0x2, 0x2, 0x179, 0x18a, 0x5, 0x12, 0xa, 0x2, 0x17a, 0x17b, 
    0x7, 0x23, 0x2, 0x2, 0x17b, 0x17c, 0x7, 0x35, 0x2, 0x2, 0x17c, 0x17d, 
    0x7, 0x45, 0x2, 0x2, 0x17d, 0x180, 0x7, 0x36, 0x2, 0x2, 0x17e, 0x180, 
    0x7, 0x45, 0x2, 0x2, 0x17f, 0x17a, 0x3, 0x2, 0x2, 0x2, 0x17f, 0x17e, 
    0x3, 0x2, 0x2, 0x2, 0x180, 0x187, 0x3, 0x2, 0x2, 0x2, 0x181, 0x184, 
    0x7, 0x20, 0x2, 0x2, 0x182, 0x184, 0x5, 0x3c, 0x1f, 0x2, 0x183, 0x181, 
    0x3, 0x2, 0x2, 0x2, 0x183, 0x182, 0x3, 0x2, 0x2, 0x2, 0x184, 0x185, 
    0x3, 0x2, 0x2, 0x2, 0x185, 0x188, 0x5, 0x12, 0xa, 0x2, 0x186, 0x188, 
    0x5, 0x3e, 0x20, 0x2, 0x187, 0x183, 0x3, 0x2, 0x2, 0x2, 0x187, 0x186, 
    0x3, 0x2, 0x2, 0x2, 0x188, 0x18a, 0x3, 0x2, 0x2, 0x2, 0x189, 0x174, 
    0x3, 0x2, 0x2, 0x2, 0x189, 0x175, 0x3, 0x2, 0x2, 0x2, 0x189, 0x176, 
    0x3, 0x2, 0x2, 0x2, 0x189, 0x177, 0x3, 0x2, 0x2, 0x2, 0x189, 0x178, 
    0x3, 0x2, 0x2, 0x2, 0x189, 0x17f, 0x3, 0x2, 0x2, 0x2, 0x18a, 0x21, 0x3, 
    0x2, 0x2, 0x2, 0x18b, 0x190, 0x5, 0x24, 0x13, 0x2, 0x18c, 0x190, 0x5, 
    0x26, 0x14, 0x2, 0x18d, 0x190, 0x5, 0x2a, 0x16, 0x2, 0x18e, 0x190, 0x5, 
    0x2c, 0x17, 0x2, 0x18f, 0x18b, 0x3, 0x2, 0x2, 0x2, 0x18f, 0x18c, 0x3, 
    0x2, 0x2, 0x2, 0x18f, 0x18d, 0x3, 0x2, 0x2, 0x2, 0x18f, 0x18e, 0x3, 
    0x2, 0x2, 0x2, 0x190, 0x23, 0x3, 0x2, 0x2, 0x2, 0x191, 0x192, 0x7, 0x11, 
    0x2, 0x2, 0x192, 0x193, 0x7, 0x35, 0x2, 0x2, 0x193, 0x194, 0x5, 0x12, 
    0xa, 0x2, 0x194, 0x195, 0x7, 0x36, 0x2, 0x2, 0x195, 0x198, 0x5, 0x1e, 
    0x10, 0x2, 0x196, 0x197, 0x7, 0x12, 0x2, 0x2, 0x197, 0x199, 0x5, 0x1e, 
    0x10, 0x2, 0x198, 0x196, 0x3, 0x2, 0x2, 0x2, 0x198, 0x199, 0x3, 0x2, 
    0x2, 0x2, 0x199, 0x25, 0x3, 0x2, 0x2, 0x2, 0x19a, 0x19b, 0x7, 0x13, 
    0x2, 0x2, 0x19b, 0x19c, 0x7, 0x35, 0x2, 0x2, 0x19c, 0x1a1, 0x5, 0x28, 
    0x15, 0x2, 0x19d, 0x19e, 0x7, 0x3b, 0x2, 0x2, 0x19e, 0x1a0, 0x5, 0x28, 
    0x15, 0x2, 0x19f, 0x19d, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x1a3, 0x3, 0x2, 
    0x2, 0x2, 0x1a1, 0x19f, 0x3, 0x2, 0x2, 0x2, 0x1a1, 0x1a2, 0x3, 0x2, 
    0x2, 0x2, 0x1a2, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x1a3, 0x1a1, 0x3, 0x2, 
    0x2, 0x2, 0x1a4, 0x1a5, 0x7, 0x3c, 0x2, 0x2, 0x1a5, 0x1a6, 0x5, 0x12, 
    0xa, 0x2, 0x1a6, 0x1a7, 0x7, 0x3c, 0x2, 0x2, 0x1a7, 0x1ac, 0x5, 0x12, 
    0xa, 0x2, 0x1a8, 0x1a9, 0x7, 0x3b, 0x2, 0x2, 0x1a9, 0x1ab, 0x5, 0x12, 
    0xa, 0x2, 0x1aa, 0x1a8, 0x3, 0x2, 0x2, 0x2, 0x1ab, 0x1ae, 0x3, 0x2, 
    0x2, 0x2, 0x1ac, 0x1aa, 0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1ad, 0x3, 0x2, 
    0x2, 0x2, 0x1ad, 0x1af, 0x3, 0x2, 0x2, 0x2, 0x1ae, 0x1ac, 0x3, 0x2, 
    0x2, 0x2, 0x1af, 0x1b0, 0x7, 0x36, 0x2, 0x2, 0x1b0, 0x1b1, 0x5, 0x1e, 
    0x10, 0x2, 0x1b1, 0x27, 0x3, 0x2, 0x2, 0x2, 0x1b2, 0x1b6, 0x5, 0x34, 
    0x1b, 0x2, 0x1b3, 0x1b4, 0x7, 0xd, 0x2, 0x2, 0x1b4, 0x1b6, 0x7, 0x45, 
    0x2, 0x2, 0x1b5, 0x1b2, 0x3, 0x2, 0x2, 0x2, 0x1b5, 0x1b3, 0x3, 0x2, 
    0x2, 0x2, 0x1b6, 0x1c6, 0x3, 0x2, 0x2, 0x2, 0x1b7, 0x1b9, 0x7, 0x23, 
    0x2, 0x2, 0x1b8, 0x1b7, 0x3, 0x2, 0x2, 0x2, 0x1b9, 0x1bc, 0x3, 0x2, 
    0x2, 0x2, 0x1ba, 0x1b8, 0x3, 0x2, 0x2, 0x2, 0x1ba, 0x1bb, 0x3, 0x2, 
    0x2, 0x2, 0x1bb, 0x1bd, 0x3, 0x2, 0x2, 0x2, 0x1bc, 0x1ba, 0x3, 0x2, 
    0x2, 0x2, 0x1bd, 0x1c7, 0x7, 0x45, 0x2, 0x2, 0x1be, 0x1c2, 0x7, 0x45, 
    0x2, 0x2, 0x1bf, 0x1c0, 0x7, 0x39, 0x2, 0x2, 0x1c0, 0x1c1, 0x7, 0x3f, 
    0x2, 0x2, 0x1c1, 0x1c3, 0x7, 0x3a, 0x2, 0x2, 0x1c2, 0x1bf, 0x3, 0x2, 
    0x2, 0x2, 0x1c3, 0x1c4, 0x3, 0x2, 0x2, 0x2, 0x1c4, 0x1c2, 0x3, 0x2, 
    0x2, 0x2, 0x1c4, 0x1c5, 0x3, 0x2, 0x2, 0x2, 0x1c5, 0x1c7, 0x3, 0x2, 
    0x2, 0x2, 0x1c6, 0x1ba, 0x3, 0x2, 0x2, 0x2, 0x1c6, 0x1be, 0x3, 0x2, 
    0x2, 0x2, 0x1c7, 0x1c8, 0x3, 0x2, 0x2, 0x2, 0x1c8, 0x1c9, 0x7, 0x20, 
    0x2, 0x2, 0x1c9, 0x1ca, 0x5, 0x12, 0xa, 0x2, 0x1ca, 0x29, 0x3, 0x2, 
    0x2, 0x2, 0x1cb, 0x1cc, 0x7, 0x14, 0x2, 0x2, 0x1cc, 0x1cd, 0x7, 0x35, 
    0x2, 0x2, 0x1cd, 0x1ce, 0x5, 0x12, 0xa, 0x2, 0x1ce, 0x1cf, 0x7, 0x36, 
    0x2, 0x2, 0x1cf, 0x1d0, 0x5, 0x1e, 0x10, 0x2, 0x1d0, 0x2b, 0x3, 0x2, 
    0x2, 0x2, 0x1d1, 0x1d2, 0x7, 0x15, 0x2, 0x2, 0x1d2, 0x1d3, 0x7, 0x35, 
    0x2, 0x2, 0x1d3, 0x1d4, 0x5, 0x12, 0xa, 0x2, 0x1d4, 0x1d5, 0x7, 0x36, 
    0x2, 0x2, 0x1d5, 0x1d9, 0x7, 0x37, 0x2, 0x2, 0x1d6, 0x1d8, 0x5, 0x2e, 
    0x18, 0x2, 0x1d7, 0x1d6, 0x3, 0x2, 0x2, 0x2, 0x1d8, 0x1db, 0x3, 0x2, 
    0x2, 0x2, 0x1d9, 0x1d7, 0x3, 0x2, 0x2, 0x2, 0x1d9, 0x1da, 0x3, 0x2, 
    0x2, 0x2, 0x1da, 0x1dc, 0x3, 0x2, 0x2, 0x2, 0x1db, 0x1d9, 0x3, 0x2, 
    0x2, 0x2, 0x1dc, 0x1dd, 0x5, 0x30, 0x19, 0x2, 0x1dd, 0x1de, 0x7, 0x38, 
    0x2, 0x2, 0x1de, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x1df, 0x1e0, 0x7, 0x16, 
    0x2, 0x2, 0x1e0, 0x1e1, 0x5, 0x36, 0x1c, 0x2, 0x1e1, 0x1e6, 0x7, 0x3d, 
    0x2, 0x2, 0x1e2, 0x1e3, 0x5, 0x20, 0x11, 0x2, 0x1e3, 0x1e4, 0x7, 0x3c, 
    0x2, 0x2, 0x1e4, 0x1e7, 0x3, 0x2, 0x2, 0x2, 0x1e5, 0x1e7, 0x5, 0x22, 
    0x12, 0x2, 0x1e6, 0x1e2, 0x3, 0x2, 0x2, 0x2, 0x1e6, 0x1e5, 0x3, 0x2, 
    0x2, 0x2, 0x1e7, 0x1e8, 0x3, 0x2, 0x2, 0x2, 0x1e8, 0x1e6, 0x3, 0x2, 
    0x2, 0x2, 0x1e8, 0x1e9, 0x3, 0x2, 0x2, 0x2, 0x1e9, 0x1ea, 0x3, 0x2, 
    0x2, 0x2, 0x1ea, 0x1eb, 0x7, 0x17, 0x2, 0x2, 0x1eb, 0x1ec, 0x7, 0x3c, 
    0x2, 0x2, 0x1ec, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x1ed, 0x1ee, 0x7, 0x19, 
    0x2, 0x2, 0x1ee, 0x1f5, 0x7, 0x3d, 0x2, 0x2, 0x1ef, 0x1f0, 0x5, 0x20, 
    0x11, 0x2, 0x1f0, 0x1f1, 0x7, 0x3c, 0x2, 0x2, 0x1f1, 0x1f4, 0x3, 0x2, 
    0x2, 0x2, 0x1f2, 0x1f4, 0x5, 0x22, 0x12, 0x2, 0x1f3, 0x1ef, 0x3, 0x2, 
    0x2, 0x2, 0x1f3, 0x1f2, 0x3, 0x2, 0x2, 0x2, 0x1f4, 0x1f7, 0x3, 0x2, 
    0x2, 0x2, 0x1f5, 0x1f3, 0x3, 0x2, 0x2, 0x2, 0x1f5, 0x1f6, 0x3, 0x2, 
    0x2, 0x2, 0x1f6, 0x1f8, 0x3, 0x2, 0x2, 0x2, 0x1f7, 0x1f5, 0x3, 0x2, 
    0x2, 0x2, 0x1f8, 0x1f9, 0x7, 0x17, 0x2, 0x2, 0x1f9, 0x1fa, 0x7, 0x3c, 
    0x2, 0x2, 0x1fa, 0x31, 0x3, 0x2, 0x2, 0x2, 0x1fb, 0x1fc, 0x7, 0xb, 0x2, 
    0x2, 0x1fc, 0x1fd, 0x7, 0x10, 0x2, 0x2, 0x1fd, 0x1fe, 0x7, 0x35, 0x2, 
    0x2, 0x1fe, 0x1ff, 0x7, 0x4, 0x2, 0x2, 0x1ff, 0x200, 0x7, 0x45, 0x2, 
    0x2, 0x200, 0x201, 0x7, 0x3b, 0x2, 0x2, 0x201, 0x202, 0x7, 0x9, 0x2, 
    0x2, 0x202, 0x203, 0x7, 0x23, 0x2, 0x2, 0x203, 0x204, 0x7, 0x23, 0x2, 
    0x2, 0x204, 0x205, 0x7, 0x45, 0x2, 0x2, 0x205, 0x206, 0x7, 0x36, 0x2, 
    0x2, 0x206, 0x207, 0x5, 0x1e, 0x10, 0x2, 0x207, 0x33, 0x3, 0x2, 0x2, 
    0x2, 0x208, 0x213, 0x7, 0x4, 0x2, 0x2, 0x209, 0x213, 0x7, 0x5, 0x2, 
    0x2, 0x20a, 0x213, 0x7, 0x8, 0x2, 0x2, 0x20b, 0x213, 0x7, 0x6, 0x2, 
    0x2, 0x20c, 0x213, 0x7, 0x7, 0x2, 0x2, 0x20d, 0x213, 0x7, 0x9, 0x2, 
    0x2, 0x20e, 0x213, 0x7, 0xa, 0x2, 0x2, 0x20f, 0x213, 0x7, 0xb, 0x2, 
    0x2, 0x210, 0x211, 0x7, 0xd, 0x2, 0x2, 0x211, 0x213, 0x7, 0x45, 0x2, 
    0x2, 0x212, 0x208, 0x3, 0x2, 0x2, 0x2, 0x212, 0x209, 0x3, 0x2, 0x2, 
    0x2, 0x212, 0x20a, 0x3, 0x2, 0x2, 0x2, 0x212, 0x20b, 0x3, 0x2, 0x2, 
    0x2, 0x212, 0x20c, 0x3, 0x2, 0x2, 0x2, 0x212, 0x20d, 0x3, 0x2, 0x2, 
    0x2, 0x212, 0x20e, 0x3, 0x2, 0x2, 0x2, 0x212, 0x20f, 0x3, 0x2, 0x2, 
    0x2, 0x212, 0x210, 0x3, 0x2, 0x2, 0x2, 0x213, 0x35, 0x3, 0x2, 0x2, 0x2, 
    0x214, 0x215, 0x9, 0x4, 0x2, 0x2, 0x215, 0x37, 0x3, 0x2, 0x2, 0x2, 0x216, 
    0x217, 0x9, 0x5, 0x2, 0x2, 0x217, 0x39, 0x3, 0x2, 0x2, 0x2, 0x218, 0x219, 
    0x9, 0x6, 0x2, 0x2, 0x219, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x21a, 0x21b, 0x9, 
    0x7, 0x2, 0x2, 0x21b, 0x3d, 0x3, 0x2, 0x2, 0x2, 0x21c, 0x21d, 0x9, 0x8, 
    0x2, 0x2, 0x21d, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x45, 0x41, 0x46, 0x4c, 0x50, 
    0x56, 0x61, 0x63, 0x70, 0x76, 0x7d, 0x83, 0x87, 0x91, 0x95, 0x9e, 0xa2, 
    0xa6, 0xad, 0xb2, 0xb8, 0xbd, 0xc1, 0xc4, 0xd4, 0xdb, 0xde, 0xe2, 0xe8, 
    0xf5, 0x103, 0x10a, 0x10c, 0x112, 0x117, 0x11e, 0x123, 0x126, 0x12d, 
    0x134, 0x13b, 0x13d, 0x142, 0x14b, 0x152, 0x15c, 0x163, 0x166, 0x16d, 
    0x16f, 0x17f, 0x183, 0x187, 0x189, 0x18f, 0x198, 0x1a1, 0x1ac, 0x1b5, 
    0x1ba, 0x1c4, 0x1c6, 0x1d9, 0x1e6, 0x1e8, 0x1f3, 0x1f5, 0x212, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

FreedomLessLessParser::Initializer FreedomLessLessParser::_init;
