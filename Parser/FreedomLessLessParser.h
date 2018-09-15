
// Generated from FreedomLessLess.g4 by ANTLR 4.7.1

#pragma once


#include "antlr4-runtime.h"




class  FreedomLessLessParser : public antlr4::Parser {
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

  enum {
    RuleProgram_def = 0, RuleImport_def = 1, RuleClass_def = 2, RuleClass_members_def = 3, 
    RulePublic_def = 4, RulePrivate_def = 5, RuleClass_scope_def = 6, RuleAttribute_def = 7, 
    RuleValued_expression_def = 8, RuleOperation = 9, RuleFunction_call_def = 10, 
    RuleArgument_def = 11, RuleFunction_def = 12, RuleParam_def = 13, RuleBlock_def = 14, 
    RuleValueless_expression_def = 15, RuleStruct_def = 16, RuleIf_def = 17, 
    RuleFor_def = 18, RuleValued_attribute_def = 19, RuleWhile_def = 20, 
    RuleSwitch_def = 21, RuleSwitch_case_def = 22, RuleSwitch_default_def = 23, 
    RuleMain_def = 24, RuleType_def = 25, RuleValue_def = 26, RuleLogical_op = 27, 
    RuleArithmetic_op = 28, RuleAuto_assign_op = 29, RuleAuto_increm_op = 30
  };

  FreedomLessLessParser(antlr4::TokenStream *input);
  ~FreedomLessLessParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class Program_defContext;
  class Import_defContext;
  class Class_defContext;
  class Class_members_defContext;
  class Public_defContext;
  class Private_defContext;
  class Class_scope_defContext;
  class Attribute_defContext;
  class Valued_expression_defContext;
  class OperationContext;
  class Function_call_defContext;
  class Argument_defContext;
  class Function_defContext;
  class Param_defContext;
  class Block_defContext;
  class Valueless_expression_defContext;
  class Struct_defContext;
  class If_defContext;
  class For_defContext;
  class Valued_attribute_defContext;
  class While_defContext;
  class Switch_defContext;
  class Switch_case_defContext;
  class Switch_default_defContext;
  class Main_defContext;
  class Type_defContext;
  class Value_defContext;
  class Logical_opContext;
  class Arithmetic_opContext;
  class Auto_assign_opContext;
  class Auto_increm_opContext; 

  class  Program_defContext : public antlr4::ParserRuleContext {
  public:
    Program_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Import_defContext *import_def();
    std::vector<Class_defContext *> class_def();
    Class_defContext* class_def(size_t i);
    std::vector<Function_defContext *> function_def();
    Function_defContext* function_def(size_t i);
    Main_defContext *main_def();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Program_defContext* program_def();

  class  Import_defContext : public antlr4::ParserRuleContext {
  public:
    Import_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> IMPORT();
    antlr4::tree::TerminalNode* IMPORT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> STRING();
    antlr4::tree::TerminalNode* STRING(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_defContext* import_def();

  class  Class_defContext : public antlr4::ParserRuleContext {
  public:
    Class_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CLASS();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *OPEN_KEY();
    Class_members_defContext *class_members_def();
    antlr4::tree::TerminalNode *CLOSE_KEY();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Class_defContext* class_def();

  class  Class_members_defContext : public antlr4::ParserRuleContext {
  public:
    Class_members_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Private_defContext *private_def();
    Public_defContext *public_def();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Class_members_defContext* class_members_def();

  class  Public_defContext : public antlr4::ParserRuleContext {
  public:
    Public_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PUBLIC();
    Class_scope_defContext *class_scope_def();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Public_defContext* public_def();

  class  Private_defContext : public antlr4::ParserRuleContext {
  public:
    Private_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PRIVATE();
    Class_scope_defContext *class_scope_def();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Private_defContext* private_def();

  class  Class_scope_defContext : public antlr4::ParserRuleContext {
  public:
    Class_scope_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Attribute_defContext *> attribute_def();
    Attribute_defContext* attribute_def(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);
    std::vector<Function_defContext *> function_def();
    Function_defContext* function_def(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Class_scope_defContext* class_scope_def();

  class  Attribute_defContext : public antlr4::ParserRuleContext {
  public:
    Attribute_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Type_defContext *type_def();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ASSIGN();
    antlr4::tree::TerminalNode* ASSIGN(size_t i);
    std::vector<Valued_expression_defContext *> valued_expression_def();
    Valued_expression_defContext* valued_expression_def(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);
    std::vector<antlr4::tree::TerminalNode *> OPEN_BRAK();
    antlr4::tree::TerminalNode* OPEN_BRAK(size_t i);
    std::vector<antlr4::tree::TerminalNode *> INT();
    antlr4::tree::TerminalNode* INT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> CLOSE_BRAK();
    antlr4::tree::TerminalNode* CLOSE_BRAK(size_t i);
    std::vector<antlr4::tree::TerminalNode *> MULT();
    antlr4::tree::TerminalNode* MULT(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Attribute_defContext* attribute_def();

  class  Valued_expression_defContext : public antlr4::ParserRuleContext {
  public:
    Valued_expression_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Value_defContext *value_def();
    OperationContext *operation();
    Function_call_defContext *function_call_def();
    antlr4::tree::TerminalNode *OPEN_PAR();
    Valued_expression_defContext *valued_expression_def();
    antlr4::tree::TerminalNode *CLOSE_PAR();
    antlr4::tree::TerminalNode *MULT();
    antlr4::tree::TerminalNode *REF();
    antlr4::tree::TerminalNode *ID();
    Auto_increm_opContext *auto_increm_op();
    antlr4::tree::TerminalNode *OPEN_BRAK();
    antlr4::tree::TerminalNode *INT();
    antlr4::tree::TerminalNode *CLOSE_BRAK();
    antlr4::tree::TerminalNode *ASSIGN();
    Auto_assign_opContext *auto_assign_op();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Valued_expression_defContext* valued_expression_def();

  class  OperationContext : public antlr4::ParserRuleContext {
  public:
    OperationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Valued_expression_defContext *> valued_expression_def();
    Valued_expression_defContext* valued_expression_def(size_t i);
    std::vector<Logical_opContext *> logical_op();
    Logical_opContext* logical_op(size_t i);
    std::vector<Arithmetic_opContext *> arithmetic_op();
    Arithmetic_opContext* arithmetic_op(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  OperationContext* operation();

  class  Function_call_defContext : public antlr4::ParserRuleContext {
  public:
    Function_call_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *DELETE();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    antlr4::tree::TerminalNode *FREE();
    std::vector<antlr4::tree::TerminalNode *> OPEN_PAR();
    antlr4::tree::TerminalNode* OPEN_PAR(size_t i);
    std::vector<antlr4::tree::TerminalNode *> CLOSE_PAR();
    antlr4::tree::TerminalNode* CLOSE_PAR(size_t i);
    antlr4::tree::TerminalNode *NEW();
    std::vector<Argument_defContext *> argument_def();
    Argument_defContext* argument_def(size_t i);
    antlr4::tree::TerminalNode *MALLOC();
    Valued_expression_defContext *valued_expression_def();
    antlr4::tree::TerminalNode *SIZEOF();
    Type_defContext *type_def();
    std::vector<antlr4::tree::TerminalNode *> MULT();
    antlr4::tree::TerminalNode* MULT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> OPEN_BRAK();
    antlr4::tree::TerminalNode* OPEN_BRAK(size_t i);
    std::vector<antlr4::tree::TerminalNode *> INT();
    antlr4::tree::TerminalNode* INT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> CLOSE_BRAK();
    antlr4::tree::TerminalNode* CLOSE_BRAK(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ARROW();
    antlr4::tree::TerminalNode* ARROW(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_call_defContext* function_call_def();

  class  Argument_defContext : public antlr4::ParserRuleContext {
  public:
    Argument_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Valued_expression_defContext *> valued_expression_def();
    Valued_expression_defContext* valued_expression_def(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Argument_defContext* argument_def();

  class  Function_defContext : public antlr4::ParserRuleContext {
  public:
    Function_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Type_defContext *type_def();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *OPEN_PAR();
    antlr4::tree::TerminalNode *CLOSE_PAR();
    Block_defContext *block_def();
    Param_defContext *param_def();
    std::vector<antlr4::tree::TerminalNode *> MULT();
    antlr4::tree::TerminalNode* MULT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> OPEN_BRAK();
    antlr4::tree::TerminalNode* OPEN_BRAK(size_t i);
    std::vector<antlr4::tree::TerminalNode *> INT();
    antlr4::tree::TerminalNode* INT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> CLOSE_BRAK();
    antlr4::tree::TerminalNode* CLOSE_BRAK(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_defContext* function_def();

  class  Param_defContext : public antlr4::ParserRuleContext {
  public:
    Param_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Type_defContext *type_def();
    antlr4::tree::TerminalNode *ID();
    std::vector<antlr4::tree::TerminalNode *> MULT();
    antlr4::tree::TerminalNode* MULT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);
    std::vector<Param_defContext *> param_def();
    Param_defContext* param_def(size_t i);
    std::vector<antlr4::tree::TerminalNode *> OPEN_BRAK();
    antlr4::tree::TerminalNode* OPEN_BRAK(size_t i);
    std::vector<antlr4::tree::TerminalNode *> INT();
    antlr4::tree::TerminalNode* INT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> CLOSE_BRAK();
    antlr4::tree::TerminalNode* CLOSE_BRAK(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Param_defContext* param_def();

  class  Block_defContext : public antlr4::ParserRuleContext {
  public:
    Block_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OPEN_KEY();
    antlr4::tree::TerminalNode *CLOSE_KEY();
    std::vector<Valueless_expression_defContext *> valueless_expression_def();
    Valueless_expression_defContext* valueless_expression_def(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);
    std::vector<Struct_defContext *> struct_def();
    Struct_defContext* struct_def(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Block_defContext* block_def();

  class  Valueless_expression_defContext : public antlr4::ParserRuleContext {
  public:
    Valueless_expression_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BREAK();
    antlr4::tree::TerminalNode *CONTINUE();
    Attribute_defContext *attribute_def();
    Function_call_defContext *function_call_def();
    antlr4::tree::TerminalNode *RETURN();
    Valued_expression_defContext *valued_expression_def();
    antlr4::tree::TerminalNode *MULT();
    antlr4::tree::TerminalNode *OPEN_PAR();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *CLOSE_PAR();
    Auto_increm_opContext *auto_increm_op();
    antlr4::tree::TerminalNode *ASSIGN();
    Auto_assign_opContext *auto_assign_op();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Valueless_expression_defContext* valueless_expression_def();

  class  Struct_defContext : public antlr4::ParserRuleContext {
  public:
    Struct_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    If_defContext *if_def();
    For_defContext *for_def();
    While_defContext *while_def();
    Switch_defContext *switch_def();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Struct_defContext* struct_def();

  class  If_defContext : public antlr4::ParserRuleContext {
  public:
    If_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IF();
    antlr4::tree::TerminalNode *OPEN_PAR();
    Valued_expression_defContext *valued_expression_def();
    antlr4::tree::TerminalNode *CLOSE_PAR();
    std::vector<Block_defContext *> block_def();
    Block_defContext* block_def(size_t i);
    antlr4::tree::TerminalNode *ELSE();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  If_defContext* if_def();

  class  For_defContext : public antlr4::ParserRuleContext {
  public:
    For_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FOR();
    antlr4::tree::TerminalNode *OPEN_PAR();
    std::vector<Valued_attribute_defContext *> valued_attribute_def();
    Valued_attribute_defContext* valued_attribute_def(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);
    std::vector<Valued_expression_defContext *> valued_expression_def();
    Valued_expression_defContext* valued_expression_def(size_t i);
    antlr4::tree::TerminalNode *CLOSE_PAR();
    Block_defContext *block_def();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  For_defContext* for_def();

  class  Valued_attribute_defContext : public antlr4::ParserRuleContext {
  public:
    Valued_attribute_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ASSIGN();
    Valued_expression_defContext *valued_expression_def();
    Type_defContext *type_def();
    antlr4::tree::TerminalNode *CLASS();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    std::vector<antlr4::tree::TerminalNode *> MULT();
    antlr4::tree::TerminalNode* MULT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> OPEN_BRAK();
    antlr4::tree::TerminalNode* OPEN_BRAK(size_t i);
    std::vector<antlr4::tree::TerminalNode *> INT();
    antlr4::tree::TerminalNode* INT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> CLOSE_BRAK();
    antlr4::tree::TerminalNode* CLOSE_BRAK(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Valued_attribute_defContext* valued_attribute_def();

  class  While_defContext : public antlr4::ParserRuleContext {
  public:
    While_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *WHILE();
    antlr4::tree::TerminalNode *OPEN_PAR();
    Valued_expression_defContext *valued_expression_def();
    antlr4::tree::TerminalNode *CLOSE_PAR();
    Block_defContext *block_def();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  While_defContext* while_def();

  class  Switch_defContext : public antlr4::ParserRuleContext {
  public:
    Switch_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *SWITCH();
    antlr4::tree::TerminalNode *OPEN_PAR();
    Valued_expression_defContext *valued_expression_def();
    antlr4::tree::TerminalNode *CLOSE_PAR();
    antlr4::tree::TerminalNode *OPEN_KEY();
    Switch_default_defContext *switch_default_def();
    antlr4::tree::TerminalNode *CLOSE_KEY();
    std::vector<Switch_case_defContext *> switch_case_def();
    Switch_case_defContext* switch_case_def(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Switch_defContext* switch_def();

  class  Switch_case_defContext : public antlr4::ParserRuleContext {
  public:
    Switch_case_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CASE();
    Value_defContext *value_def();
    antlr4::tree::TerminalNode *TWOPOINTS();
    antlr4::tree::TerminalNode *BREAK();
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);
    std::vector<Valueless_expression_defContext *> valueless_expression_def();
    Valueless_expression_defContext* valueless_expression_def(size_t i);
    std::vector<Struct_defContext *> struct_def();
    Struct_defContext* struct_def(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Switch_case_defContext* switch_case_def();

  class  Switch_default_defContext : public antlr4::ParserRuleContext {
  public:
    Switch_default_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *DEFAULT();
    antlr4::tree::TerminalNode *TWOPOINTS();
    antlr4::tree::TerminalNode *BREAK();
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);
    std::vector<Valueless_expression_defContext *> valueless_expression_def();
    Valueless_expression_defContext* valueless_expression_def(size_t i);
    std::vector<Struct_defContext *> struct_def();
    Struct_defContext* struct_def(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Switch_default_defContext* switch_default_def();

  class  Main_defContext : public antlr4::ParserRuleContext {
  public:
    Main_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *VOID_T();
    antlr4::tree::TerminalNode *MAIN();
    antlr4::tree::TerminalNode *OPEN_PAR();
    antlr4::tree::TerminalNode *INT_T();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    antlr4::tree::TerminalNode *COMMA();
    antlr4::tree::TerminalNode *CHAR_T();
    std::vector<antlr4::tree::TerminalNode *> MULT();
    antlr4::tree::TerminalNode* MULT(size_t i);
    antlr4::tree::TerminalNode *CLOSE_PAR();
    Block_defContext *block_def();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Main_defContext* main_def();

  class  Type_defContext : public antlr4::ParserRuleContext {
  public:
    Type_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *INT_T();
    antlr4::tree::TerminalNode *UNSIGNED_T();
    antlr4::tree::TerminalNode *SHORT_T();
    antlr4::tree::TerminalNode *FLOAT_T();
    antlr4::tree::TerminalNode *DOUBLE_T();
    antlr4::tree::TerminalNode *CHAR_T();
    antlr4::tree::TerminalNode *BOOL_T();
    antlr4::tree::TerminalNode *VOID_T();
    antlr4::tree::TerminalNode *CLASS();
    antlr4::tree::TerminalNode *ID();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Type_defContext* type_def();

  class  Value_defContext : public antlr4::ParserRuleContext {
  public:
    Value_defContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *INT();
    antlr4::tree::TerminalNode *CHAR();
    antlr4::tree::TerminalNode *STRING();
    antlr4::tree::TerminalNode *INTEGER();
    antlr4::tree::TerminalNode *FLOATING();
    antlr4::tree::TerminalNode *BOOLEAN();
    antlr4::tree::TerminalNode *NULL();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Value_defContext* value_def();

  class  Logical_opContext : public antlr4::ParserRuleContext {
  public:
    Logical_opContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LESS();
    antlr4::tree::TerminalNode *BIGGER();
    antlr4::tree::TerminalNode *LESS_EQ();
    antlr4::tree::TerminalNode *BIGGER_EQ();
    antlr4::tree::TerminalNode *EQUALS();
    antlr4::tree::TerminalNode *NOT_EQUALS();
    antlr4::tree::TerminalNode *AND();
    antlr4::tree::TerminalNode *OR();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Logical_opContext* logical_op();

  class  Arithmetic_opContext : public antlr4::ParserRuleContext {
  public:
    Arithmetic_opContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PLUS();
    antlr4::tree::TerminalNode *MINUS();
    antlr4::tree::TerminalNode *MULT();
    antlr4::tree::TerminalNode *DIV();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Arithmetic_opContext* arithmetic_op();

  class  Auto_assign_opContext : public antlr4::ParserRuleContext {
  public:
    Auto_assign_opContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *AUTOPLUS();
    antlr4::tree::TerminalNode *AUTOMINUS();
    antlr4::tree::TerminalNode *AUTOMULT();
    antlr4::tree::TerminalNode *AUTODIV();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Auto_assign_opContext* auto_assign_op();

  class  Auto_increm_opContext : public antlr4::ParserRuleContext {
  public:
    Auto_increm_opContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *INCREM();
    antlr4::tree::TerminalNode *DECREM();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Auto_increm_opContext* auto_increm_op();


private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

