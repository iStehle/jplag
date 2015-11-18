/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jplag.csharp4;

import jplag.csharp4.grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author stehle
 */
class JplagCSharp4Listener implements CSharp4Listener, CSharpTokenConstants {

    private jplag.csharp4.Parser jplagParser;

    public JplagCSharp4Listener(jplag.csharp4.Parser jplag) {

        jplagParser = jplag;
    }

    @Override
    public void visitTerminal(TerminalNode tn) {
        if (tn.getText().equals("else")) {
            jplagParser.add(_ELSE, tn.getSymbol());
        }
        //t
    }

    @Override
    public void visitErrorNode(ErrorNode en) {
        //t
    }

    @Override
    public void enterEveryRule(ParserRuleContext prc) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext prc) {
        //t
    }

    @Override
    public void enterParenthesized_expression(CSharp4Parser.Parenthesized_expressionContext ctx) {
       
    }

    @Override
    public void exitParenthesized_expression(CSharp4Parser.Parenthesized_expressionContext ctx) {
       
    }

    @Override
    public void enterTry_statement(CSharp4Parser.Try_statementContext ctx) {
        jplagParser.add(_TRY, ctx.getStart());

    }

    @Override
    public void exitTry_statement(CSharp4Parser.Try_statementContext ctx) {
       
    }

    @Override
    public void enterQuery_expression(CSharp4Parser.Query_expressionContext ctx) {
       
    }

    @Override
    public void exitQuery_expression(CSharp4Parser.Query_expressionContext ctx) {
       
    }

    @Override
    public void enterMethod_modifier_unsafe(CSharp4Parser.Method_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitMethod_modifier_unsafe(CSharp4Parser.Method_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterOperator_modifier_unsafe(CSharp4Parser.Operator_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitOperator_modifier_unsafe(CSharp4Parser.Operator_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterSelect_contextual_keyword(CSharp4Parser.Select_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitSelect_contextual_keyword(CSharp4Parser.Select_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterAll_member_modifier(CSharp4Parser.All_member_modifierContext ctx) {
       
    }

    @Override
    public void exitAll_member_modifier(CSharp4Parser.All_member_modifierContext ctx) {
       
    }

    @Override
    public void enterStatement_expression_list(CSharp4Parser.Statement_expression_listContext ctx) {
       
    }

    @Override
    public void exitStatement_expression_list(CSharp4Parser.Statement_expression_listContext ctx) {
       
    }

    @Override
    public void enterCast_expression(CSharp4Parser.Cast_expressionContext ctx) {
       
    }

    @Override
    public void exitCast_expression(CSharp4Parser.Cast_expressionContext ctx) {
       
    }

    @Override
    public void enterNumeric_type(CSharp4Parser.Numeric_typeContext ctx) {
       
    }

    @Override
    public void exitNumeric_type(CSharp4Parser.Numeric_typeContext ctx) {
       
    }

    @Override
    public void enterEquality_expression(CSharp4Parser.Equality_expressionContext ctx) {
       
    }

    @Override
    public void exitEquality_expression(CSharp4Parser.Equality_expressionContext ctx) {
       
    }

    @Override
    public void enterEnum_modifier(CSharp4Parser.Enum_modifierContext ctx) {
       
    }

    @Override
    public void exitEnum_modifier(CSharp4Parser.Enum_modifierContext ctx) {
       
    }

    @Override
    public void enterLet_contextual_keyword(CSharp4Parser.Let_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitLet_contextual_keyword(CSharp4Parser.Let_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterDim_separators(CSharp4Parser.Dim_separatorsContext ctx) {
       
    }

    @Override
    public void exitDim_separators(CSharp4Parser.Dim_separatorsContext ctx) {
       
    }

    @Override
    public void enterExplicit_anonymous_function_parameter_list(CSharp4Parser.Explicit_anonymous_function_parameter_listContext ctx) {
       
    }

    @Override
    public void exitExplicit_anonymous_function_parameter_list(CSharp4Parser.Explicit_anonymous_function_parameter_listContext ctx) {
       
    }

    @Override
    public void enterNon_assignment_expression(CSharp4Parser.Non_assignment_expressionContext ctx) {
       
    }

    @Override
    public void exitNon_assignment_expression(CSharp4Parser.Non_assignment_expressionContext ctx) {
       
    }

    @Override
    public void enterLocal_variable_declaration(CSharp4Parser.Local_variable_declarationContext ctx) {
       
    }

    @Override
    public void exitLocal_variable_declaration(CSharp4Parser.Local_variable_declarationContext ctx) {
       
    }

    @Override
    public void enterDestructor_definition(CSharp4Parser.Destructor_definitionContext ctx) {
       
    }

    @Override
    public void exitDestructor_definition(CSharp4Parser.Destructor_definitionContext ctx) {
       
    }

    @Override
    public void enterEquals_contextual_keyword(CSharp4Parser.Equals_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitEquals_contextual_keyword(CSharp4Parser.Equals_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterClass_declaration(CSharp4Parser.Class_declarationContext ctx) {
        jplagParser.add(_CLASS_BEGIN, ctx.getStart());
    }

    @Override
    public void exitClass_declaration(CSharp4Parser.Class_declarationContext ctx) {
        jplagParser.add(_CLASS_END, ctx.getStop());
    }

    @Override
    public void enterQuery_body(CSharp4Parser.Query_bodyContext ctx) {
       
    }

    @Override
    public void exitQuery_body(CSharp4Parser.Query_bodyContext ctx) {
       
    }

    @Override
    public void enterBase_access(CSharp4Parser.Base_accessContext ctx) {
       
    }

    @Override
    public void exitBase_access(CSharp4Parser.Base_accessContext ctx) {
       
    }

    @Override
    public void enterMember_access2(CSharp4Parser.Member_access2Context ctx) {
       
    }

    @Override
    public void exitMember_access2(CSharp4Parser.Member_access2Context ctx) {
       
    }

    @Override
    public void enterConstant_declarators(CSharp4Parser.Constant_declaratorsContext ctx) {
       
    }

    @Override
    public void exitConstant_declarators(CSharp4Parser.Constant_declaratorsContext ctx) {
       
    }

    @Override
    public void enterReturn_type(CSharp4Parser.Return_typeContext ctx) {
       
    }

    @Override
    public void exitReturn_type(CSharp4Parser.Return_typeContext ctx) {
       
    }

    @Override
    public void enterConditional_and_expression(CSharp4Parser.Conditional_and_expressionContext ctx) {
       
    }

    @Override
    public void exitConditional_and_expression(CSharp4Parser.Conditional_and_expressionContext ctx) {
       
    }

    @Override
    public void enterRank_specifiers(CSharp4Parser.Rank_specifiersContext ctx) {
       
    }

    @Override
    public void exitRank_specifiers(CSharp4Parser.Rank_specifiersContext ctx) {
       
    }

    @Override
    public void enterEnum_member_declarations(CSharp4Parser.Enum_member_declarationsContext ctx) {
       
    }

    @Override
    public void exitEnum_member_declarations(CSharp4Parser.Enum_member_declarationsContext ctx) {
       
    }

    @Override
    public void enterFrom_clause(CSharp4Parser.From_clauseContext ctx) {
       
    }

    @Override
    public void exitFrom_clause(CSharp4Parser.From_clauseContext ctx) {
       
    }

    @Override
    public void enterType_parameter(CSharp4Parser.Type_parameterContext ctx) {
       
    }

    @Override
    public void exitType_parameter(CSharp4Parser.Type_parameterContext ctx) {
       
    }

    @Override
    public void enterUsing_alias_directive(CSharp4Parser.Using_alias_directiveContext ctx) {
       
    }

    @Override
    public void exitUsing_alias_directive(CSharp4Parser.Using_alias_directiveContext ctx) {
       
    }

    @Override
    public void enterDynamic_contextual_keyword(CSharp4Parser.Dynamic_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitDynamic_contextual_keyword(CSharp4Parser.Dynamic_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterIndexer_modifiers(CSharp4Parser.Indexer_modifiersContext ctx) {
       
    }

    @Override
    public void exitIndexer_modifiers(CSharp4Parser.Indexer_modifiersContext ctx) {
       
    }

    @Override
    public void enterFloating_point_type(CSharp4Parser.Floating_point_typeContext ctx) {
       
    }

    @Override
    public void exitFloating_point_type(CSharp4Parser.Floating_point_typeContext ctx) {
       
    }

    @Override
    public void enterType_argument_list_opt(CSharp4Parser.Type_argument_list_optContext ctx) {
       
    }

    @Override
    public void exitType_argument_list_opt(CSharp4Parser.Type_argument_list_optContext ctx) {
       
    }

    @Override
    public void enterProperty_declaration(CSharp4Parser.Property_declarationContext ctx) {
       jplagParser.add(_PROPERTY, ctx.getStart()); 
    }

    @Override
    public void exitProperty_declaration(CSharp4Parser.Property_declarationContext ctx) {
       
    }

    @Override
    public void enterAttribute_section(CSharp4Parser.Attribute_sectionContext ctx) {
       
    }

    @Override
    public void exitAttribute_section(CSharp4Parser.Attribute_sectionContext ctx) {
       
    }

    @Override
    public void enterConditional_or_expression(CSharp4Parser.Conditional_or_expressionContext ctx) {
       
    }

    @Override
    public void exitConditional_or_expression(CSharp4Parser.Conditional_or_expressionContext ctx) {
       
    }

    @Override
    public void enterClass_body(CSharp4Parser.Class_bodyContext ctx) {
      jplagParser.add(_CLASS_BEGIN, ctx.getStart()); 
    }

    @Override
    public void exitClass_body(CSharp4Parser.Class_bodyContext ctx) {
       jplagParser.add(_CLASS_END, ctx.getStop()); 
    }

    @Override
    public void enterPre_decrement_expression(CSharp4Parser.Pre_decrement_expressionContext ctx) {
       
    }

    @Override
    public void exitPre_decrement_expression(CSharp4Parser.Pre_decrement_expressionContext ctx) {
       
    }

    @Override
    public void enterLocal_constant_declaration(CSharp4Parser.Local_constant_declarationContext ctx) {
       
    }

    @Override
    public void exitLocal_constant_declaration(CSharp4Parser.Local_constant_declarationContext ctx) {
       
    }

    @Override
    public void enterUnsafe_statement(CSharp4Parser.Unsafe_statementContext ctx) {
       jplagParser.add(_UNSAFE, ctx.getStart());
    }

    @Override
    public void exitUnsafe_statement(CSharp4Parser.Unsafe_statementContext ctx) {
       
    }

    @Override
    public void enterAttribute_arguments(CSharp4Parser.Attribute_argumentsContext ctx) {
       
    }

    @Override
    public void exitAttribute_arguments(CSharp4Parser.Attribute_argumentsContext ctx) {
       
    }

    @Override
    public void enterAlias_contextual_keyword(CSharp4Parser.Alias_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitAlias_contextual_keyword(CSharp4Parser.Alias_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterRight_shift(CSharp4Parser.Right_shiftContext ctx) {
       
    }

    @Override
    public void exitRight_shift(CSharp4Parser.Right_shiftContext ctx) {
       
    }

    @Override
    public void enterAttribute_name(CSharp4Parser.Attribute_nameContext ctx) {
       
    }

    @Override
    public void exitAttribute_name(CSharp4Parser.Attribute_nameContext ctx) {
       
    }

    @Override
    public void enterClass_definition(CSharp4Parser.Class_definitionContext ctx) {
       
    }

    @Override
    public void exitClass_definition(CSharp4Parser.Class_definitionContext ctx) {
       
    }

    @Override
    public void enterMethod_invocation2(CSharp4Parser.Method_invocation2Context ctx) {
       
    }

    @Override
    public void exitMethod_invocation2(CSharp4Parser.Method_invocation2Context ctx) {
       
    }

    @Override
    public void enterWhere_contextual_keyword(CSharp4Parser.Where_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitWhere_contextual_keyword(CSharp4Parser.Where_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterChecked_statement(CSharp4Parser.Checked_statementContext ctx) {
        jplagParser.add(_CHECKED, ctx.getStart());
    }

    @Override
    public void exitChecked_statement(CSharp4Parser.Checked_statementContext ctx) {
       
    }

    @Override
    public void enterMember_name(CSharp4Parser.Member_nameContext ctx) {
       
    }

    @Override
    public void exitMember_name(CSharp4Parser.Member_nameContext ctx) {
       
    }

    @Override
    public void enterExpression(CSharp4Parser.ExpressionContext ctx) {
       
    }

    @Override
    public void exitExpression(CSharp4Parser.ExpressionContext ctx) {
       
    }

    @Override
    public void enterStackalloc_initializer(CSharp4Parser.Stackalloc_initializerContext ctx) {
       
    }

    @Override
    public void exitStackalloc_initializer(CSharp4Parser.Stackalloc_initializerContext ctx) {
       
    }

    @Override
    public void enterBody(CSharp4Parser.BodyContext ctx) {
       
    }

    @Override
    public void exitBody(CSharp4Parser.BodyContext ctx) {
       
    }

    @Override
    public void enterField_modifier_unsafe(CSharp4Parser.Field_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitField_modifier_unsafe(CSharp4Parser.Field_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterType_parameter_list(CSharp4Parser.Type_parameter_listContext ctx) {
       
    }

    @Override
    public void exitType_parameter_list(CSharp4Parser.Type_parameter_listContext ctx) {
       
    }

    @Override
    public void enterReference_type(CSharp4Parser.Reference_typeContext ctx) {
       
    }

    @Override
    public void exitReference_type(CSharp4Parser.Reference_typeContext ctx) {
       
    }

    @Override
    public void enterNon_array_type(CSharp4Parser.Non_array_typeContext ctx) {
       
    }

    @Override
    public void exitNon_array_type(CSharp4Parser.Non_array_typeContext ctx) {
       
    }

    @Override
    public void enterNamespace_name(CSharp4Parser.Namespace_nameContext ctx) {
       
    }

    @Override
    public void exitNamespace_name(CSharp4Parser.Namespace_nameContext ctx) {
       
    }

    @Override
    public void enterScan_for_cast_generic_precedence(CSharp4Parser.Scan_for_cast_generic_precedenceContext ctx) {
       
    }

    @Override
    public void exitScan_for_cast_generic_precedence(CSharp4Parser.Scan_for_cast_generic_precedenceContext ctx) {
       
    }

    @Override
    public void enterAnonymous_object_creation_expression(CSharp4Parser.Anonymous_object_creation_expressionContext ctx) {
       
    }

    @Override
    public void exitAnonymous_object_creation_expression(CSharp4Parser.Anonymous_object_creation_expressionContext ctx) {
       
    }

    @Override
    public void enterDelegate_modifier_unsafe(CSharp4Parser.Delegate_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitDelegate_modifier_unsafe(CSharp4Parser.Delegate_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterAccessor_declarations(CSharp4Parser.Accessor_declarationsContext ctx) {
       
    }

    @Override
    public void exitAccessor_declarations(CSharp4Parser.Accessor_declarationsContext ctx) {
       
    }

    @Override
    public void enterEnum_body(CSharp4Parser.Enum_bodyContext ctx) {
       jplagParser.add(_ENUM, ctx.getStart());
    }

    @Override
    public void exitEnum_body(CSharp4Parser.Enum_bodyContext ctx) {
       
    }

    @Override
    public void enterConversion_operator_declarator(CSharp4Parser.Conversion_operator_declaratorContext ctx) {
       
    }

    @Override
    public void exitConversion_operator_declarator(CSharp4Parser.Conversion_operator_declaratorContext ctx) {
       
    }

    @Override
    public void enterInterface_member_declarations(CSharp4Parser.Interface_member_declarationsContext ctx) {
       
    }

    @Override
    public void exitInterface_member_declarations(CSharp4Parser.Interface_member_declarationsContext ctx) {
       
    }

    @Override
    public void enterStruct_modifier(CSharp4Parser.Struct_modifierContext ctx) {
       
    }

    @Override
    public void exitStruct_modifier(CSharp4Parser.Struct_modifierContext ctx) {
       
    }

    @Override
    public void enterOn_contextual_keyword(CSharp4Parser.On_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitOn_contextual_keyword(CSharp4Parser.On_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterImplicit_anonymous_function_parameter_list(CSharp4Parser.Implicit_anonymous_function_parameter_listContext ctx) {
       
    }

    @Override
    public void exitImplicit_anonymous_function_parameter_list(CSharp4Parser.Implicit_anonymous_function_parameter_listContext ctx) {
       
    }

    @Override
    public void enterCommon_member_declaration(CSharp4Parser.Common_member_declarationContext ctx) {
       
    }

    @Override
    public void exitCommon_member_declaration(CSharp4Parser.Common_member_declarationContext ctx) {
       
    }

    @Override
    public void enterInto_contextual_keyword(CSharp4Parser.Into_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitInto_contextual_keyword(CSharp4Parser.Into_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterOperator_body(CSharp4Parser.Operator_bodyContext ctx) {
       jplagParser.add(_OPERATOR, ctx.getStart()); 
    }

    @Override
    public void exitOperator_body(CSharp4Parser.Operator_bodyContext ctx) {
       
    }

    @Override
    public void enterFor_iterator(CSharp4Parser.For_iteratorContext ctx) {
       
    }

    @Override
    public void exitFor_iterator(CSharp4Parser.For_iteratorContext ctx) {
       
    }

    @Override
    public void enterDefault_argument(CSharp4Parser.Default_argumentContext ctx) {
       
    }

    @Override
    public void exitDefault_argument(CSharp4Parser.Default_argumentContext ctx) {
       
    }

    @Override
    public void enterObject_creation_expression(CSharp4Parser.Object_creation_expressionContext ctx) {
       jplagParser.add(_OBJECT_CREATION, ctx.getStart());
    }

    @Override
    public void exitObject_creation_expression(CSharp4Parser.Object_creation_expressionContext ctx) {
       
    }

    @Override
    public void enterConstructor_modifiers(CSharp4Parser.Constructor_modifiersContext ctx) {
       
    }

    @Override
    public void exitConstructor_modifiers(CSharp4Parser.Constructor_modifiersContext ctx) {
       
    }

    @Override
    public void enterStatic_constructor_declaration(CSharp4Parser.Static_constructor_declarationContext ctx) {
       
    }

    @Override
    public void exitStatic_constructor_declaration(CSharp4Parser.Static_constructor_declarationContext ctx) {
       
    }

    @Override
    public void enterInterface_modifier_unsafe(CSharp4Parser.Interface_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitInterface_modifier_unsafe(CSharp4Parser.Interface_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterBoolean_literal(CSharp4Parser.Boolean_literalContext ctx) {
       
    }

    @Override
    public void exitBoolean_literal(CSharp4Parser.Boolean_literalContext ctx) {
       
    }

    @Override
    public void enterSimple_name(CSharp4Parser.Simple_nameContext ctx) {
       
    }

    @Override
    public void exitSimple_name(CSharp4Parser.Simple_nameContext ctx) {
       
    }

    @Override
    public void enterConstructor_declarator(CSharp4Parser.Constructor_declaratorContext ctx) {
       
    }

    @Override
    public void exitConstructor_declarator(CSharp4Parser.Constructor_declaratorContext ctx) {
       
    }

    @Override
    public void enterVariable_initializer(CSharp4Parser.Variable_initializerContext ctx) {
       
    }

    @Override
    public void exitVariable_initializer(CSharp4Parser.Variable_initializerContext ctx) {
       
    }

    @Override
    public void enterInterface_base(CSharp4Parser.Interface_baseContext ctx) {
       
    }

    @Override
    public void exitInterface_base(CSharp4Parser.Interface_baseContext ctx) {
       
    }

    @Override
    public void enterEnum_definition(CSharp4Parser.Enum_definitionContext ctx) {
       
    }

    @Override
    public void exitEnum_definition(CSharp4Parser.Enum_definitionContext ctx) {
       
    }

    @Override
    public void enterAdd_contextual_keyword(CSharp4Parser.Add_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitAdd_contextual_keyword(CSharp4Parser.Add_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterFixed_size_buffer_declaration(CSharp4Parser.Fixed_size_buffer_declarationContext ctx) {
       
    }

    @Override
    public void exitFixed_size_buffer_declaration(CSharp4Parser.Fixed_size_buffer_declarationContext ctx) {
       
    }

    @Override
    public void enterIsType(CSharp4Parser.IsTypeContext ctx) {
       
    }

    @Override
    public void exitIsType(CSharp4Parser.IsTypeContext ctx) {
       
    }

    @Override
    public void enterConstructor_modifier_unsafe(CSharp4Parser.Constructor_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitConstructor_modifier_unsafe(CSharp4Parser.Constructor_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterVariable_declarators(CSharp4Parser.Variable_declaratorsContext ctx) {
       
    }

    @Override
    public void exitVariable_declarators(CSharp4Parser.Variable_declaratorsContext ctx) {
       
    }

    @Override
    public void enterObject_or_collection_initializer(CSharp4Parser.Object_or_collection_initializerContext ctx) {
       
    }

    @Override
    public void exitObject_or_collection_initializer(CSharp4Parser.Object_or_collection_initializerContext ctx) {
       
    }

    @Override
    public void enterArray_initializer(CSharp4Parser.Array_initializerContext ctx) {
       
    }

    @Override
    public void exitArray_initializer(CSharp4Parser.Array_initializerContext ctx) {
       
    }

    @Override
    public void enterFixed_pointer_declarator(CSharp4Parser.Fixed_pointer_declaratorContext ctx) {
       
    }

    @Override
    public void exitFixed_pointer_declarator(CSharp4Parser.Fixed_pointer_declaratorContext ctx) {
       
    }

    @Override
    public void enterLocal_variable_initializer_unsafe(CSharp4Parser.Local_variable_initializer_unsafeContext ctx) {
       
    }

    @Override
    public void exitLocal_variable_initializer_unsafe(CSharp4Parser.Local_variable_initializer_unsafeContext ctx) {
       
    }

    @Override
    public void enterMethod_member_name(CSharp4Parser.Method_member_nameContext ctx) {
       
    }

    @Override
    public void exitMethod_member_name(CSharp4Parser.Method_member_nameContext ctx) {
       
    }

    @Override
    public void enterOrderby_clause(CSharp4Parser.Orderby_clauseContext ctx) {
       
    }

    @Override
    public void exitOrderby_clause(CSharp4Parser.Orderby_clauseContext ctx) {
       
    }

    @Override
    public void enterArray_type(CSharp4Parser.Array_typeContext ctx) {
       
    }

    @Override
    public void exitArray_type(CSharp4Parser.Array_typeContext ctx) {
       
    }

    @Override
    public void enterQualified_alias_member(CSharp4Parser.Qualified_alias_memberContext ctx) {
       
    }

    @Override
    public void exitQualified_alias_member(CSharp4Parser.Qualified_alias_memberContext ctx) {
       
    }

    @Override
    public void enterStatement_list(CSharp4Parser.Statement_listContext ctx) {
       
    }

    @Override
    public void exitStatement_list(CSharp4Parser.Statement_listContext ctx) {
       
    }

    @Override
    public void enterWhere_clause(CSharp4Parser.Where_clauseContext ctx) {
       
    }

    @Override
    public void exitWhere_clause(CSharp4Parser.Where_clauseContext ctx) {
       
    }

    @Override
    public void enterTypeof_expression(CSharp4Parser.Typeof_expressionContext ctx) {
       
    }

    @Override
    public void exitTypeof_expression(CSharp4Parser.Typeof_expressionContext ctx) {
       
    }

    @Override
    public void enterEvent_modifier_unsafe(CSharp4Parser.Event_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitEvent_modifier_unsafe(CSharp4Parser.Event_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterPrimary_no_array_creation_expression_unsafe(CSharp4Parser.Primary_no_array_creation_expression_unsafeContext ctx) {
       
    }

    @Override
    public void exitPrimary_no_array_creation_expression_unsafe(CSharp4Parser.Primary_no_array_creation_expression_unsafeContext ctx) {
       
    }

    @Override
    public void enterDelegate_definition(CSharp4Parser.Delegate_definitionContext ctx) {
       
    }

    @Override
    public void exitDelegate_definition(CSharp4Parser.Delegate_definitionContext ctx) {
       
    }

    @Override
    public void enterType_parameter_constraints_clauses(CSharp4Parser.Type_parameter_constraints_clausesContext ctx) {
       
    }

    @Override
    public void exitType_parameter_constraints_clauses(CSharp4Parser.Type_parameter_constraints_clausesContext ctx) {
       
    }

    @Override
    public void enterIndexer_declarator(CSharp4Parser.Indexer_declaratorContext ctx) {
       
    }

    @Override
    public void exitIndexer_declarator(CSharp4Parser.Indexer_declaratorContext ctx) {
       
    }

    @Override
    public void enterStruct_modifier_unsafe(CSharp4Parser.Struct_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitStruct_modifier_unsafe(CSharp4Parser.Struct_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterGeneral_catch_clause(CSharp4Parser.General_catch_clauseContext ctx) {
       
    }

    @Override
    public void exitGeneral_catch_clause(CSharp4Parser.General_catch_clauseContext ctx) {
       
    }

    @Override
    public void enterArgument_value(CSharp4Parser.Argument_valueContext ctx) {
       
    }

    @Override
    public void exitArgument_value(CSharp4Parser.Argument_valueContext ctx) {
       
    }

    @Override
    public void enterGlobal_attribute_sections(CSharp4Parser.Global_attribute_sectionsContext ctx) {
       
    }

    @Override
    public void exitGlobal_attribute_sections(CSharp4Parser.Global_attribute_sectionsContext ctx) {
       
    }

    @Override
    public void enterAttributes(CSharp4Parser.AttributesContext ctx) {
       
    }

    @Override
    public void exitAttributes(CSharp4Parser.AttributesContext ctx) {
       
    }

    @Override
    public void enterType_unsafe(CSharp4Parser.Type_unsafeContext ctx) {
       
    }

    @Override
    public void exitType_unsafe(CSharp4Parser.Type_unsafeContext ctx) {
       
    }

    @Override
    public void enterPositional_argument_list(CSharp4Parser.Positional_argument_listContext ctx) {
       
    }

    @Override
    public void exitPositional_argument_list(CSharp4Parser.Positional_argument_listContext ctx) {
       
    }

    @Override
    public void enterMethod_header(CSharp4Parser.Method_headerContext ctx) {
       
    }

    @Override
    public void exitMethod_header(CSharp4Parser.Method_headerContext ctx) {
       
    }

    @Override
    public void enterInterface_modifiers(CSharp4Parser.Interface_modifiersContext ctx) {
       
    }

    @Override
    public void exitInterface_modifiers(CSharp4Parser.Interface_modifiersContext ctx) {
       
    }

    @Override
    public void enterAdd_accessor_declaration(CSharp4Parser.Add_accessor_declarationContext ctx) {
       
    }

    @Override
    public void exitAdd_accessor_declaration(CSharp4Parser.Add_accessor_declarationContext ctx) {
       
    }

    @Override
    public void enterRemove_accessor_declaration(CSharp4Parser.Remove_accessor_declarationContext ctx) {
       
    }

    @Override
    public void exitRemove_accessor_declaration(CSharp4Parser.Remove_accessor_declarationContext ctx) {
       
    }

    @Override
    public void enterDelegate_creation_expression(CSharp4Parser.Delegate_creation_expressionContext ctx) {
       jplagParser.add(_DELEGATE, ctx.getStart());
    }

    @Override
    public void exitDelegate_creation_expression(CSharp4Parser.Delegate_creation_expressionContext ctx) {
       
    }

    @Override
    public void enterStruct_body(CSharp4Parser.Struct_bodyContext ctx) {
       jplagParser.add(_STRUCT_BEGIN, ctx.getStart());
    }

    @Override
    public void exitStruct_body(CSharp4Parser.Struct_bodyContext ctx) {
       jplagParser.add(_STRUCT_END, ctx.getStop());
    }

    @Override
    public void enterMember_access(CSharp4Parser.Member_accessContext ctx) {
       
    }

    @Override
    public void exitMember_access(CSharp4Parser.Member_accessContext ctx) {
       
    }

    @Override
    public void enterInterface_indexer_declaration2(CSharp4Parser.Interface_indexer_declaration2Context ctx) {
       
    }

    @Override
    public void exitInterface_indexer_declaration2(CSharp4Parser.Interface_indexer_declaration2Context ctx) {
       
    }

    @Override
    public void enterConstructor_initializer(CSharp4Parser.Constructor_initializerContext ctx) {
       
    }

    @Override
    public void exitConstructor_initializer(CSharp4Parser.Constructor_initializerContext ctx) {
       
    }

    @Override
    public void enterYield_statement(CSharp4Parser.Yield_statementContext ctx) {
       
    }

    @Override
    public void exitYield_statement(CSharp4Parser.Yield_statementContext ctx) {
       
    }

    @Override
    public void enterFixed_pointer_initializer(CSharp4Parser.Fixed_pointer_initializerContext ctx) {
       
    }

    @Override
    public void exitFixed_pointer_initializer(CSharp4Parser.Fixed_pointer_initializerContext ctx) {
       
    }

    @Override
    public void enterArgument_name(CSharp4Parser.Argument_nameContext ctx) {
       
    }

    @Override
    public void exitArgument_name(CSharp4Parser.Argument_nameContext ctx) {
       
    }

    @Override
    public void enterIs_disambiguation_token(CSharp4Parser.Is_disambiguation_tokenContext ctx) {
       
    }

    @Override
    public void exitIs_disambiguation_token(CSharp4Parser.Is_disambiguation_tokenContext ctx) {
       
    }

    @Override
    public void enterIndexer_declaration2(CSharp4Parser.Indexer_declaration2Context ctx) {
       
    }

    @Override
    public void exitIndexer_declaration2(CSharp4Parser.Indexer_declaration2Context ctx) {
       
    }

    @Override
    public void enterShift_expression(CSharp4Parser.Shift_expressionContext ctx) {
       
    }

    @Override
    public void exitShift_expression(CSharp4Parser.Shift_expressionContext ctx) {
       
    }

    @Override
    public void enterAnonymous_function_signature(CSharp4Parser.Anonymous_function_signatureContext ctx) {
       
    }

    @Override
    public void exitAnonymous_function_signature(CSharp4Parser.Anonymous_function_signatureContext ctx) {
       
    }

    @Override
    public void enterMethod_declaration(CSharp4Parser.Method_declarationContext ctx) {
       
    }

    @Override
    public void exitMethod_declaration(CSharp4Parser.Method_declarationContext ctx) {
       
    }

    @Override
    public void enterEnum_modifiers(CSharp4Parser.Enum_modifiersContext ctx) {
       
    }

    @Override
    public void exitEnum_modifiers(CSharp4Parser.Enum_modifiersContext ctx) {
       
    }

    @Override
    public void enterShift_disambiguation_token(CSharp4Parser.Shift_disambiguation_tokenContext ctx) {
       
    }

    @Override
    public void exitShift_disambiguation_token(CSharp4Parser.Shift_disambiguation_tokenContext ctx) {
       
    }

    @Override
    public void enterEvent_modifiers(CSharp4Parser.Event_modifiersContext ctx) {
       
    }

    @Override
    public void exitEvent_modifiers(CSharp4Parser.Event_modifiersContext ctx) {
       
    }

    @Override
    public void enterSwitch_sections(CSharp4Parser.Switch_sectionsContext ctx) {
       
    }

    @Override
    public void exitSwitch_sections(CSharp4Parser.Switch_sectionsContext ctx) {
       
    }

    @Override
    public void enterAttribute_target_specifier(CSharp4Parser.Attribute_target_specifierContext ctx) {
       
    }

    @Override
    public void exitAttribute_target_specifier(CSharp4Parser.Attribute_target_specifierContext ctx) {
       
    }

    @Override
    public void enterConstant_expression(CSharp4Parser.Constant_expressionContext ctx) {
       
    }

    @Override
    public void exitConstant_expression(CSharp4Parser.Constant_expressionContext ctx) {
       
    }

    @Override
    public void enterStatic_constructor_modifiers(CSharp4Parser.Static_constructor_modifiersContext ctx) {
       
    }

    @Override
    public void exitStatic_constructor_modifiers(CSharp4Parser.Static_constructor_modifiersContext ctx) {
       
    }

    @Override
    public void enterRelational_expression(CSharp4Parser.Relational_expressionContext ctx) {
       
    }

    @Override
    public void exitRelational_expression(CSharp4Parser.Relational_expressionContext ctx) {
       
    }

    @Override
    public void enterUsing_namespace_directive(CSharp4Parser.Using_namespace_directiveContext ctx) {
       
    }

    @Override
    public void exitUsing_namespace_directive(CSharp4Parser.Using_namespace_directiveContext ctx) {
       
    }

    @Override
    public void enterSet_accessor_declaration(CSharp4Parser.Set_accessor_declarationContext ctx) {
       
    }

    @Override
    public void exitSet_accessor_declaration(CSharp4Parser.Set_accessor_declarationContext ctx) {
       
    }

    @Override
    public void enterQualified_identifier(CSharp4Parser.Qualified_identifierContext ctx) {
       
    }

    @Override
    public void exitQualified_identifier(CSharp4Parser.Qualified_identifierContext ctx) {
       
    }

    @Override
    public void enterUnbound_type_name(CSharp4Parser.Unbound_type_nameContext ctx) {
       
    }

    @Override
    public void exitUnbound_type_name(CSharp4Parser.Unbound_type_nameContext ctx) {
       
    }

    @Override
    public void enterFor_condition(CSharp4Parser.For_conditionContext ctx) {
       
    }

    @Override
    public void exitFor_condition(CSharp4Parser.For_conditionContext ctx) {
       
    }

    @Override
    public void enterNamespace_member_declarations(CSharp4Parser.Namespace_member_declarationsContext ctx) {
       
    }

    @Override
    public void exitNamespace_member_declarations(CSharp4Parser.Namespace_member_declarationsContext ctx) {
       
    }

    @Override
    public void enterPrimary_expression_start(CSharp4Parser.Primary_expression_startContext ctx) {
       
    }

    @Override
    public void exitPrimary_expression_start(CSharp4Parser.Primary_expression_startContext ctx) {
       
    }

    @Override
    public void enterCatch_clauses(CSharp4Parser.Catch_clausesContext ctx) {
        jplagParser.add(_CATCH_BEGIN, ctx.getStart());
    }

    @Override
    public void exitCatch_clauses(CSharp4Parser.Catch_clausesContext ctx) {
        jplagParser.add(_CATCH_END, ctx.getStop());
    }

    @Override
    public void enterNamespace_body(CSharp4Parser.Namespace_bodyContext ctx) {
        jplagParser.add(_NAMESPACE_BEGIN, ctx.getStart());
    }

    @Override
    public void exitNamespace_body(CSharp4Parser.Namespace_bodyContext ctx) {
       jplagParser.add(_NAMESPACE_END, ctx.getStop());
    }

    @Override
    public void enterUsing_statement(CSharp4Parser.Using_statementContext ctx) {
            jplagParser.add(_USING, ctx.getStart()); 
 
    }

    @Override
    public void exitUsing_statement(CSharp4Parser.Using_statementContext ctx) {
       
    }

    @Override
    public void enterExplicit_anonymous_function_signature(CSharp4Parser.Explicit_anonymous_function_signatureContext ctx) {
       
    }

    @Override
    public void exitExplicit_anonymous_function_signature(CSharp4Parser.Explicit_anonymous_function_signatureContext ctx) {
       
    }

    @Override
    public void enterContinue_statement(CSharp4Parser.Continue_statementContext ctx) {
      jplagParser.add(_CONTINUE, ctx.getStart()); 
    }

    @Override
    public void exitContinue_statement(CSharp4Parser.Continue_statementContext ctx) {
       
    }

    @Override
    public void enterRight_shift_assignment(CSharp4Parser.Right_shift_assignmentContext ctx) {
       
    }

    @Override
    public void exitRight_shift_assignment(CSharp4Parser.Right_shift_assignmentContext ctx) {
       
    }

    @Override
    public void enterSwitch_section(CSharp4Parser.Switch_sectionContext ctx) {
       
    }

    @Override
    public void exitSwitch_section(CSharp4Parser.Switch_sectionContext ctx) {
       
    }

    @Override
    public void enterAttribute_argument_expression(CSharp4Parser.Attribute_argument_expressionContext ctx) {
       
    }

    @Override
    public void exitAttribute_argument_expression(CSharp4Parser.Attribute_argument_expressionContext ctx) {
       
    }

    @Override
    public void enterLambda_expression(CSharp4Parser.Lambda_expressionContext ctx) {
       
    }

    @Override
    public void exitLambda_expression(CSharp4Parser.Lambda_expressionContext ctx) {
       
    }

    @Override
    public void enterBracket_expression(CSharp4Parser.Bracket_expressionContext ctx) {
       
    }

    @Override
    public void exitBracket_expression(CSharp4Parser.Bracket_expressionContext ctx) {
       
    }

    @Override
    public void enterBreak_statement(CSharp4Parser.Break_statementContext ctx) {
      jplagParser.add(_BREAK, ctx.getStart()); 
    }

    @Override
    public void exitBreak_statement(CSharp4Parser.Break_statementContext ctx) {
       
    }

    @Override
    public void enterPrimary_expression(CSharp4Parser.Primary_expressionContext ctx) {
       
    }

    @Override
    public void exitPrimary_expression(CSharp4Parser.Primary_expressionContext ctx) {
       
    }

    @Override
    public void enterAttribute_target(CSharp4Parser.Attribute_targetContext ctx) {
       
    }

    @Override
    public void exitAttribute_target(CSharp4Parser.Attribute_targetContext ctx) {
       
    }

    @Override
    public void enterGroup_clause(CSharp4Parser.Group_clauseContext ctx) {
       
    }

    @Override
    public void exitGroup_clause(CSharp4Parser.Group_clauseContext ctx) {
       
    }

    @Override
    public void enterMember_declarator(CSharp4Parser.Member_declaratorContext ctx) {
       
    }

    @Override
    public void exitMember_declarator(CSharp4Parser.Member_declaratorContext ctx) {
       
    }

    @Override
    public void enterInterface_declaration(CSharp4Parser.Interface_declarationContext ctx) {
       
    }

    @Override
    public void exitInterface_declaration(CSharp4Parser.Interface_declarationContext ctx) {
       
    }

    @Override
    public void enterType(CSharp4Parser.TypeContext ctx) {
       
    }

    @Override
    public void exitType(CSharp4Parser.TypeContext ctx) {
       
    }

    @Override
    public void enterVariable_declarator(CSharp4Parser.Variable_declaratorContext ctx) {
        jplagParser.add(_DECLARE_VAR, ctx.getStart());
    }

    @Override
    public void exitVariable_declarator(CSharp4Parser.Variable_declaratorContext ctx) {
       
    }

    @Override
    public void enterGlobal_attribute_target_specifier(CSharp4Parser.Global_attribute_target_specifierContext ctx) {
       
    }

    @Override
    public void exitGlobal_attribute_target_specifier(CSharp4Parser.Global_attribute_target_specifierContext ctx) {
       
    }

    @Override
    public void enterStruct_member_declarations(CSharp4Parser.Struct_member_declarationsContext ctx) {
       
    }

    @Override
    public void exitStruct_member_declarations(CSharp4Parser.Struct_member_declarationsContext ctx) {
       
    }

    @Override
    public void enterInterface_property_declaration(CSharp4Parser.Interface_property_declarationContext ctx) {
       
    }

    @Override
    public void exitInterface_property_declaration(CSharp4Parser.Interface_property_declarationContext ctx) {
       
    }

    @Override
    public void enterUnary_expression_unsafe(CSharp4Parser.Unary_expression_unsafeContext ctx) {
       
    }

    @Override
    public void exitUnary_expression_unsafe(CSharp4Parser.Unary_expression_unsafeContext ctx) {
       
    }

    @Override
    public void enterField_declaration2(CSharp4Parser.Field_declaration2Context ctx) {
       
    }

    @Override
    public void exitField_declaration2(CSharp4Parser.Field_declaration2Context ctx) {
       
    }

    @Override
    public void enterOrderings(CSharp4Parser.OrderingsContext ctx) {
       
    }

    @Override
    public void exitOrderings(CSharp4Parser.OrderingsContext ctx) {
       
    }

    @Override
    public void enterProperty_modifier(CSharp4Parser.Property_modifierContext ctx) {
       
    }

    @Override
    public void exitProperty_modifier(CSharp4Parser.Property_modifierContext ctx) {
       
    }

    @Override
    public void enterFixed_statement(CSharp4Parser.Fixed_statementContext ctx) {
       jplagParser.add(_FIXED, ctx.getStart());
    }

    @Override
    public void exitFixed_statement(CSharp4Parser.Fixed_statementContext ctx) {
       
    }

    @Override
    public void enterFinally_clause(CSharp4Parser.Finally_clauseContext ctx) {
       
    }

    @Override
    public void exitFinally_clause(CSharp4Parser.Finally_clauseContext ctx) {
       
    }

    @Override
    public void enterIfBodyBlock(CSharp4Parser.IfBodyBlockContext ctx) {
       
    }

    @Override
    public void exitIfBodyBlock(CSharp4Parser.IfBodyBlockContext ctx) {
       
    }

    @Override
    public void enterArgument(CSharp4Parser.ArgumentContext ctx) {
       
    }

    @Override
    public void exitArgument(CSharp4Parser.ArgumentContext ctx) {
       
    }

    @Override
    public void enterNull_coalescing_expression(CSharp4Parser.Null_coalescing_expressionContext ctx) {
       
    }

    @Override
    public void exitNull_coalescing_expression(CSharp4Parser.Null_coalescing_expressionContext ctx) {
       
    }

    @Override
    public void enterConstructor_modifier(CSharp4Parser.Constructor_modifierContext ctx) {
       
    }

    @Override
    public void exitConstructor_modifier(CSharp4Parser.Constructor_modifierContext ctx) {
       
    }

    @Override
    public void enterExclusive_or_expression(CSharp4Parser.Exclusive_or_expressionContext ctx) {
       
    }

    @Override
    public void exitExclusive_or_expression(CSharp4Parser.Exclusive_or_expressionContext ctx) {
       
    }

    @Override
    public void enterVariance_annotation(CSharp4Parser.Variance_annotationContext ctx) {
       
    }

    @Override
    public void exitVariance_annotation(CSharp4Parser.Variance_annotationContext ctx) {
       
    }

    @Override
    public void enterLock_statement(CSharp4Parser.Lock_statementContext ctx) {
             jplagParser.add(_LOCK, ctx.getStart()); 

    }

    @Override
    public void exitLock_statement(CSharp4Parser.Lock_statementContext ctx) {
       
    }

    @Override
    public void enterStatement(CSharp4Parser.StatementContext ctx) {
       
    }

    @Override
    public void exitStatement(CSharp4Parser.StatementContext ctx) {
       
    }

    @Override
    public void enterFixed_size_buffer_modifier(CSharp4Parser.Fixed_size_buffer_modifierContext ctx) {
       
    }

    @Override
    public void exitFixed_size_buffer_modifier(CSharp4Parser.Fixed_size_buffer_modifierContext ctx) {
       
    }

    @Override
    public void enterIndexer_modifier(CSharp4Parser.Indexer_modifierContext ctx) {
       
    }

    @Override
    public void exitIndexer_modifier(CSharp4Parser.Indexer_modifierContext ctx) {
       
    }

    @Override
    public void enterStatic_constructor_body(CSharp4Parser.Static_constructor_bodyContext ctx) {
       jplagParser.add(_STATIC_CONSTR, ctx.getStart());
    }

    @Override
    public void exitStatic_constructor_body(CSharp4Parser.Static_constructor_bodyContext ctx) {
       
    }

    @Override
    public void enterDelegate_modifiers(CSharp4Parser.Delegate_modifiersContext ctx) {
       
    }

    @Override
    public void exitDelegate_modifiers(CSharp4Parser.Delegate_modifiersContext ctx) {
       
    }

    @Override
    public void enterElement_initializer(CSharp4Parser.Element_initializerContext ctx) {
       
    }

    @Override
    public void exitElement_initializer(CSharp4Parser.Element_initializerContext ctx) {
       
    }

    @Override
    public void enterGlobal_attribute_target(CSharp4Parser.Global_attribute_targetContext ctx) {
       
    }

    @Override
    public void exitGlobal_attribute_target(CSharp4Parser.Global_attribute_targetContext ctx) {
       
    }

    @Override
    public void enterResource_acquisition(CSharp4Parser.Resource_acquisitionContext ctx) {
       
    }

    @Override
    public void exitResource_acquisition(CSharp4Parser.Resource_acquisitionContext ctx) {
       
    }

    @Override
    public void enterGlobal_attributes(CSharp4Parser.Global_attributesContext ctx) {
       
    }

    @Override
    public void exitGlobal_attributes(CSharp4Parser.Global_attributesContext ctx) {
       
    }

    @Override
    public void enterSwitch_label(CSharp4Parser.Switch_labelContext ctx) {
       jplagParser.add(_CASE, ctx.getStart());
    }

    @Override
    public void exitSwitch_label(CSharp4Parser.Switch_labelContext ctx) {
       
    }

    @Override
    public void enterDescending_contextual_keyword(CSharp4Parser.Descending_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitDescending_contextual_keyword(CSharp4Parser.Descending_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterParameter_modifier(CSharp4Parser.Parameter_modifierContext ctx) {
       
    }

    @Override
    public void exitParameter_modifier(CSharp4Parser.Parameter_modifierContext ctx) {
       
    }

    @Override
    public void enterEvent_declaration(CSharp4Parser.Event_declarationContext ctx) {
       jplagParser.add(_EVENT, ctx.getStart()); 
    }

    @Override
    public void exitEvent_declaration(CSharp4Parser.Event_declarationContext ctx) {
       
    }

    @Override
    public void enterType_arguments(CSharp4Parser.Type_argumentsContext ctx) {
       
    }

    @Override
    public void exitType_arguments(CSharp4Parser.Type_argumentsContext ctx) {
       
    }

    @Override
    public void enterDeclaration_statement(CSharp4Parser.Declaration_statementContext ctx) {
       
    }

    @Override
    public void exitDeclaration_statement(CSharp4Parser.Declaration_statementContext ctx) {
       
    }

    @Override
    public void enterType_void(CSharp4Parser.Type_voidContext ctx) {
       
    }

    @Override
    public void exitType_void(CSharp4Parser.Type_voidContext ctx) {
       
    }

    @Override
    public void enterUnary_expression(CSharp4Parser.Unary_expressionContext ctx) {
       
    }

    @Override
    public void exitUnary_expression(CSharp4Parser.Unary_expressionContext ctx) {
       
    }

    @Override
    public void enterLet_clause(CSharp4Parser.Let_clauseContext ctx) {
       
    }

    @Override
    public void exitLet_clause(CSharp4Parser.Let_clauseContext ctx) {
       
    }

    @Override
    public void enterGet_contextual_keyword(CSharp4Parser.Get_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitGet_contextual_keyword(CSharp4Parser.Get_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterLocal_variable_type(CSharp4Parser.Local_variable_typeContext ctx) {
       
    }

    @Override
    public void exitLocal_variable_type(CSharp4Parser.Local_variable_typeContext ctx) {
       
    }

    @Override
    public void enterExpression_statement(CSharp4Parser.Expression_statementContext ctx) {
       
    }

    @Override
    public void exitExpression_statement(CSharp4Parser.Expression_statementContext ctx) {
       
    }

    @Override
    public void enterThis_access(CSharp4Parser.This_accessContext ctx) {
       
    }

    @Override
    public void exitThis_access(CSharp4Parser.This_accessContext ctx) {
       
    }

    @Override
    public void enterCollection_initializer(CSharp4Parser.Collection_initializerContext ctx) {
       
    }

    @Override
    public void exitCollection_initializer(CSharp4Parser.Collection_initializerContext ctx) {
       
    }

    @Override
    public void enterOperator_modifiers(CSharp4Parser.Operator_modifiersContext ctx) {
       
    }

    @Override
    public void exitOperator_modifiers(CSharp4Parser.Operator_modifiersContext ctx) {
       
    }

    @Override
    public void enterPointer_type(CSharp4Parser.Pointer_typeContext ctx) {
       
    }

    @Override
    public void exitPointer_type(CSharp4Parser.Pointer_typeContext ctx) {
       
    }

    @Override
    public void enterTyped_member_declaration(CSharp4Parser.Typed_member_declarationContext ctx) {
       
    }

    @Override
    public void exitTyped_member_declaration(CSharp4Parser.Typed_member_declarationContext ctx) {
       
    }

    @Override
    public void enterOperator_declaration2(CSharp4Parser.Operator_declaration2Context ctx) {
       
    }

    @Override
    public void exitOperator_declaration2(CSharp4Parser.Operator_declaration2Context ctx) {
       
    }

    @Override
    public void enterInterface_definition(CSharp4Parser.Interface_definitionContext ctx) {
       
    }

    @Override
    public void exitInterface_definition(CSharp4Parser.Interface_definitionContext ctx) {
       
    }

    @Override
    public void enterProperty_modifier_unsafe(CSharp4Parser.Property_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitProperty_modifier_unsafe(CSharp4Parser.Property_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterExpression_list(CSharp4Parser.Expression_listContext ctx) {
       
    }

    @Override
    public void exitExpression_list(CSharp4Parser.Expression_listContext ctx) {
       
    }

    @Override
    public void enterFixed_size_buffer_modifiers(CSharp4Parser.Fixed_size_buffer_modifiersContext ctx) {
       
    }

    @Override
    public void exitFixed_size_buffer_modifiers(CSharp4Parser.Fixed_size_buffer_modifiersContext ctx) {
       
    }

    @Override
    public void enterEmbedded_statement(CSharp4Parser.Embedded_statementContext ctx) {
       
    }

    @Override
    public void exitEmbedded_statement(CSharp4Parser.Embedded_statementContext ctx) {
       
    }

    @Override
    public void enterFixed_size_buffer_declarators(CSharp4Parser.Fixed_size_buffer_declaratorsContext ctx) {
       
    }

    @Override
    public void exitFixed_size_buffer_declarators(CSharp4Parser.Fixed_size_buffer_declaratorsContext ctx) {
       
    }

    @Override
    public void enterInterface_type(CSharp4Parser.Interface_typeContext ctx) {
       
    }

    @Override
    public void exitInterface_type(CSharp4Parser.Interface_typeContext ctx) {
       
    }

    @Override
    public void enterLocal_variable_declarator(CSharp4Parser.Local_variable_declaratorContext ctx) {
       
    }

    @Override
    public void exitLocal_variable_declarator(CSharp4Parser.Local_variable_declaratorContext ctx) {
       
    }

    @Override
    public void enterOperator_declaration(CSharp4Parser.Operator_declarationContext ctx) {
       
    }

    @Override
    public void exitOperator_declaration(CSharp4Parser.Operator_declarationContext ctx) {
       
    }

    @Override
    public void enterForeach_statement(CSharp4Parser.Foreach_statementContext ctx) {
       jplagParser.add(_FOREACH, ctx.getStart());
    }

    @Override
    public void exitForeach_statement(CSharp4Parser.Foreach_statementContext ctx) {
       
    }

    @Override
    public void enterStruct_definition(CSharp4Parser.Struct_definitionContext ctx) {
       
    }

    @Override
    public void exitStruct_definition(CSharp4Parser.Struct_definitionContext ctx) {
       
    }

    @Override
    public void enterInterface_type_list(CSharp4Parser.Interface_type_listContext ctx) {
       
    }

    @Override
    public void exitInterface_type_list(CSharp4Parser.Interface_type_listContext ctx) {
       
    }

    @Override
    public void enterObject_creation_expression2(CSharp4Parser.Object_creation_expression2Context ctx) {
       
    }

    @Override
    public void exitObject_creation_expression2(CSharp4Parser.Object_creation_expression2Context ctx) {
       
    }

    @Override
    public void enterIndexer_declaration(CSharp4Parser.Indexer_declarationContext ctx) {
       jplagParser.add(_INDEXER, ctx.getStart()); 
    }

    @Override
    public void exitIndexer_declaration(CSharp4Parser.Indexer_declarationContext ctx) {
       
    }

    @Override
    public void enterBase_type(CSharp4Parser.Base_typeContext ctx) {
       
    }

    @Override
    public void exitBase_type(CSharp4Parser.Base_typeContext ctx) {
       
    }

    @Override
    public void enterNon_nullable_value_type(CSharp4Parser.Non_nullable_value_typeContext ctx) {
       
    }

    @Override
    public void exitNon_nullable_value_type(CSharp4Parser.Non_nullable_value_typeContext ctx) {
       
    }

    @Override
    public void enterFrom_contextual_keyword(CSharp4Parser.From_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitFrom_contextual_keyword(CSharp4Parser.From_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterJoin_contextual_keyword(CSharp4Parser.Join_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitJoin_contextual_keyword(CSharp4Parser.Join_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterConstant_declarator(CSharp4Parser.Constant_declaratorContext ctx) {
     jplagParser.add(_DECLARE_CONST, ctx.getStart());  
    }

    @Override
    public void exitConstant_declarator(CSharp4Parser.Constant_declaratorContext ctx) {
       
    }

    @Override
    public void enterUnchecked_expression(CSharp4Parser.Unchecked_expressionContext ctx) {
       
    }

    @Override
    public void exitUnchecked_expression(CSharp4Parser.Unchecked_expressionContext ctx) {
       
    }

    @Override
    public void enterType_name(CSharp4Parser.Type_nameContext ctx) {
       
    }

    @Override
    public void exitType_name(CSharp4Parser.Type_nameContext ctx) {
       
    }

    @Override
    public void enterAscending_contextual_keyword(CSharp4Parser.Ascending_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitAscending_contextual_keyword(CSharp4Parser.Ascending_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterInterface_body(CSharp4Parser.Interface_bodyContext ctx) {
       jplagParser.add(_INTERFACE_BEGIN, ctx.getStart());
    }

    @Override
    public void exitInterface_body(CSharp4Parser.Interface_bodyContext ctx) {
       jplagParser.add(_INTERFACE_END, ctx.getStop());
    }

    @Override
    public void enterInterface_member_declaration(CSharp4Parser.Interface_member_declarationContext ctx) {
       
    }

    @Override
    public void exitInterface_member_declaration(CSharp4Parser.Interface_member_declarationContext ctx) {
       
    }

    @Override
    public void enterCompilation_unit(CSharp4Parser.Compilation_unitContext ctx) {
       
    }

    @Override
    public void exitCompilation_unit(CSharp4Parser.Compilation_unitContext ctx) {
       
    }

    @Override
    public void enterEnum_base(CSharp4Parser.Enum_baseContext ctx) {
       
    }

    @Override
    public void exitEnum_base(CSharp4Parser.Enum_baseContext ctx) {
       
    }

    @Override
    public void enterAnonymous_object_initializer(CSharp4Parser.Anonymous_object_initializerContext ctx) {
       
    }

    @Override
    public void exitAnonymous_object_initializer(CSharp4Parser.Anonymous_object_initializerContext ctx) {
       
    }

    @Override
    public void enterPartial_contextual_keyword(CSharp4Parser.Partial_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitPartial_contextual_keyword(CSharp4Parser.Partial_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterInitializer_value(CSharp4Parser.Initializer_valueContext ctx) {
       
    }

    @Override
    public void exitInitializer_value(CSharp4Parser.Initializer_valueContext ctx) {
       
    }

    @Override
    public void enterNullable_type(CSharp4Parser.Nullable_typeContext ctx) {
       
    }

    @Override
    public void exitNullable_type(CSharp4Parser.Nullable_typeContext ctx) {
       
    }

    @Override
    public void enterSecondary_constraints(CSharp4Parser.Secondary_constraintsContext ctx) {
       
    }

    @Override
    public void exitSecondary_constraints(CSharp4Parser.Secondary_constraintsContext ctx) {
       
    }

    @Override
    public void enterClass_base(CSharp4Parser.Class_baseContext ctx) {
       
    }

    @Override
    public void exitClass_base(CSharp4Parser.Class_baseContext ctx) {
       
    }

    @Override
    public void enterUsing_directive(CSharp4Parser.Using_directiveContext ctx) {
             jplagParser.add(_USING_DIRECTIVE, ctx.getStart()); 

    }

    @Override
    public void exitUsing_directive(CSharp4Parser.Using_directiveContext ctx) {
       
    }

    @Override
    public void enterStruct_member_declaration(CSharp4Parser.Struct_member_declarationContext ctx) {
       
    }

    @Override
    public void exitStruct_member_declaration(CSharp4Parser.Struct_member_declarationContext ctx) {
       
    }

    @Override
    public void enterSelect_or_group_clause(CSharp4Parser.Select_or_group_clauseContext ctx) {
       
    }

    @Override
    public void exitSelect_or_group_clause(CSharp4Parser.Select_or_group_clauseContext ctx) {
       
    }

    @Override
    public void enterDelegate_modifier(CSharp4Parser.Delegate_modifierContext ctx) {
       
    }

    @Override
    public void exitDelegate_modifier(CSharp4Parser.Delegate_modifierContext ctx) {
       
    }

    @Override
    public void enterAssignment(CSharp4Parser.AssignmentContext ctx) {
        jplagParser.add(_ASSIGNMENT, ctx.getStart());
    }

    @Override
    public void exitAssignment(CSharp4Parser.AssignmentContext ctx) {
       
    }

    @Override
    public void enterProperty_modifiers(CSharp4Parser.Property_modifiersContext ctx) {
       
    }

    @Override
    public void exitProperty_modifiers(CSharp4Parser.Property_modifiersContext ctx) {
       
    }

    @Override
    public void enterClass_modifiers(CSharp4Parser.Class_modifiersContext ctx) {
       
    }

    @Override
    public void exitClass_modifiers(CSharp4Parser.Class_modifiersContext ctx) {
       
    }

    @Override
    public void enterIfBodySingle(CSharp4Parser.IfBodySingleContext ctx) {
       
    }

    @Override
    public void exitIfBodySingle(CSharp4Parser.IfBodySingleContext ctx) {
       
    }

    @Override
    public void enterSet_contextual_keyword(CSharp4Parser.Set_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitSet_contextual_keyword(CSharp4Parser.Set_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterUsing_directives(CSharp4Parser.Using_directivesContext ctx) {
       
    }

    @Override
    public void exitUsing_directives(CSharp4Parser.Using_directivesContext ctx) {
       
    }

    @Override
    public void enterElement_initializer_list(CSharp4Parser.Element_initializer_listContext ctx) {
       
    }

    @Override
    public void exitElement_initializer_list(CSharp4Parser.Element_initializer_listContext ctx) {
       
    }

    @Override
    public void enterConstructor_constraint(CSharp4Parser.Constructor_constraintContext ctx) {
       
    }

    @Override
    public void exitConstructor_constraint(CSharp4Parser.Constructor_constraintContext ctx) {
       
    }

    @Override
    public void enterFixed_pointer_declarators(CSharp4Parser.Fixed_pointer_declaratorsContext ctx) {
       
    }

    @Override
    public void exitFixed_pointer_declarators(CSharp4Parser.Fixed_pointer_declaratorsContext ctx) {
       
    }

    @Override
    public void enterJump_statement(CSharp4Parser.Jump_statementContext ctx) {
       
    }

    @Override
    public void exitJump_statement(CSharp4Parser.Jump_statementContext ctx) {
       
    }

    @Override
    public void enterAnonymous_function_body(CSharp4Parser.Anonymous_function_bodyContext ctx) {
       
    }

    @Override
    public void exitAnonymous_function_body(CSharp4Parser.Anonymous_function_bodyContext ctx) {
       
    }

    @Override
    public void enterInterface_accessors(CSharp4Parser.Interface_accessorsContext ctx) {
       
    }

    @Override
    public void exitInterface_accessors(CSharp4Parser.Interface_accessorsContext ctx) {
       
    }

    @Override
    public void enterSpecific_catch_clauses(CSharp4Parser.Specific_catch_clausesContext ctx) {
       
    }

    @Override
    public void exitSpecific_catch_clauses(CSharp4Parser.Specific_catch_clausesContext ctx) {
       
    }

    @Override
    public void enterConstructor_declaration(CSharp4Parser.Constructor_declarationContext ctx) {
       
    }

    @Override
    public void exitConstructor_declaration(CSharp4Parser.Constructor_declarationContext ctx) {
       
    }

    @Override
    public void enterOrdering(CSharp4Parser.OrderingContext ctx) {
       
    }

    @Override
    public void exitOrdering(CSharp4Parser.OrderingContext ctx) {
       
    }

    @Override
    public void enterInterface_method_declaration2(CSharp4Parser.Interface_method_declaration2Context ctx) {
       
    }

    @Override
    public void exitInterface_method_declaration2(CSharp4Parser.Interface_method_declaration2Context ctx) {
       
    }

    @Override
    public void enterSelect_clause(CSharp4Parser.Select_clauseContext ctx) {
       
    }

    @Override
    public void exitSelect_clause(CSharp4Parser.Select_clauseContext ctx) {
       
    }

    @Override
    public void enterIndexer_modifier_unsafe(CSharp4Parser.Indexer_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitIndexer_modifier_unsafe(CSharp4Parser.Indexer_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterStruct_interfaces(CSharp4Parser.Struct_interfacesContext ctx) {
       
    }

    @Override
    public void exitStruct_interfaces(CSharp4Parser.Struct_interfacesContext ctx) {
       
    }

    @Override
    public void enterDo_statement(CSharp4Parser.Do_statementContext ctx) {
      jplagParser.add(_DO, ctx.getStart()); 
    }

    @Override
    public void exitDo_statement(CSharp4Parser.Do_statementContext ctx) {
       
    }

    @Override
    public void enterVariant_type_parameter_list(CSharp4Parser.Variant_type_parameter_listContext ctx) {
       
    }

    @Override
    public void exitVariant_type_parameter_list(CSharp4Parser.Variant_type_parameter_listContext ctx) {
       
    }

    @Override
    public void enterMethod_modifiers(CSharp4Parser.Method_modifiersContext ctx) {
       
    }

    @Override
    public void exitMethod_modifiers(CSharp4Parser.Method_modifiersContext ctx) {
       
    }

    @Override
    public void enterConstructor_declaration2(CSharp4Parser.Constructor_declaration2Context ctx) {
       
    }

    @Override
    public void exitConstructor_declaration2(CSharp4Parser.Constructor_declaration2Context ctx) {
       
    }

    @Override
    public void enterLocal_variable_declarators(CSharp4Parser.Local_variable_declaratorsContext ctx) {
       
    }

    @Override
    public void exitLocal_variable_declarators(CSharp4Parser.Local_variable_declaratorsContext ctx) {
       
    }

    @Override
    public void enterIteration_statement(CSharp4Parser.Iteration_statementContext ctx) {
       
    }

    @Override
    public void exitIteration_statement(CSharp4Parser.Iteration_statementContext ctx) {
       
    }

    @Override
    public void enterVariable_reference(CSharp4Parser.Variable_referenceContext ctx) {
       
    }

    @Override
    public void exitVariable_reference(CSharp4Parser.Variable_referenceContext ctx) {
       
    }

    @Override
    public void enterMethod_member_name2(CSharp4Parser.Method_member_name2Context ctx) {
       
    }

    @Override
    public void exitMethod_member_name2(CSharp4Parser.Method_member_name2Context ctx) {
       
    }

    @Override
    public void enterSimple_type(CSharp4Parser.Simple_typeContext ctx) {
       
    }

    @Override
    public void exitSimple_type(CSharp4Parser.Simple_typeContext ctx) {
       
    }

    @Override
    public void enterCombined_join_clause(CSharp4Parser.Combined_join_clauseContext ctx) {
       
    }

    @Override
    public void exitCombined_join_clause(CSharp4Parser.Combined_join_clauseContext ctx) {
       
    }

    @Override
    public void enterIdentifier(CSharp4Parser.IdentifierContext ctx) {
       
    }

    @Override
    public void exitIdentifier(CSharp4Parser.IdentifierContext ctx) {
       
    }

    @Override
    public void enterBy_contextual_keyword(CSharp4Parser.By_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitBy_contextual_keyword(CSharp4Parser.By_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterArgument_list(CSharp4Parser.Argument_listContext ctx) {
       
    }

    @Override
    public void exitArgument_list(CSharp4Parser.Argument_listContext ctx) {
       
    }

    @Override
    public void enterInterface_property_declaration2(CSharp4Parser.Interface_property_declaration2Context ctx) {
       
    }

    @Override
    public void exitInterface_property_declaration2(CSharp4Parser.Interface_property_declaration2Context ctx) {
       
    }

    @Override
    public void enterType_argument_list(CSharp4Parser.Type_argument_listContext ctx) {
       
    }

    @Override
    public void exitType_argument_list(CSharp4Parser.Type_argument_listContext ctx) {
       
    }

    @Override
    public void enterWhile_statement(CSharp4Parser.While_statementContext ctx) {
      jplagParser.add(_WHILE, ctx.getStart()); 
    }

    @Override
    public void exitWhile_statement(CSharp4Parser.While_statementContext ctx) {
       
    }

    @Override
    public void enterBuffer_element_type(CSharp4Parser.Buffer_element_typeContext ctx) {
       
    }

    @Override
    public void exitBuffer_element_type(CSharp4Parser.Buffer_element_typeContext ctx) {
       
    }

    @Override
    public void enterPositional_argument(CSharp4Parser.Positional_argumentContext ctx) {
       
    }

    @Override
    public void exitPositional_argument(CSharp4Parser.Positional_argumentContext ctx) {
       
    }

    @Override
    public void enterRemove_contextual_keyword(CSharp4Parser.Remove_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitRemove_contextual_keyword(CSharp4Parser.Remove_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterType_parameters(CSharp4Parser.Type_parametersContext ctx) {
       
    }

    @Override
    public void exitType_parameters(CSharp4Parser.Type_parametersContext ctx) {
       
    }

    @Override
    public void enterAnonymous_method_expression(CSharp4Parser.Anonymous_method_expressionContext ctx) {
       
    }

    @Override
    public void exitAnonymous_method_expression(CSharp4Parser.Anonymous_method_expressionContext ctx) {
       
    }

    @Override
    public void enterFixed_parameter(CSharp4Parser.Fixed_parameterContext ctx) {
       
    }

    @Override
    public void exitFixed_parameter(CSharp4Parser.Fixed_parameterContext ctx) {
       
    }

    @Override
    public void enterNamespace_member_declaration(CSharp4Parser.Namespace_member_declarationContext ctx) {
       
    }

    @Override
    public void exitNamespace_member_declaration(CSharp4Parser.Namespace_member_declarationContext ctx) {
       
    }

    @Override
    public void enterConstructor_body(CSharp4Parser.Constructor_bodyContext ctx) {
       jplagParser.add(_CONSTRUCTOR, ctx.getStart());
    }

    @Override
    public void exitConstructor_body(CSharp4Parser.Constructor_bodyContext ctx) {
       
    }

    @Override
    public void enterAccessor_modifier(CSharp4Parser.Accessor_modifierContext ctx) {
       
    }

    @Override
    public void exitAccessor_modifier(CSharp4Parser.Accessor_modifierContext ctx) {
       
    }

    @Override
    public void enterAccessor_body(CSharp4Parser.Accessor_bodyContext ctx) {
       
    }

    @Override
    public void exitAccessor_body(CSharp4Parser.Accessor_bodyContext ctx) {
       
    }

    @Override
    public void enterVariable_initializer_list(CSharp4Parser.Variable_initializer_listContext ctx) {
       
    }

    @Override
    public void exitVariable_initializer_list(CSharp4Parser.Variable_initializer_listContext ctx) {
       
    }

    @Override
    public void enterBoolean_expression(CSharp4Parser.Boolean_expressionContext ctx) {
       
    }

    @Override
    public void exitBoolean_expression(CSharp4Parser.Boolean_expressionContext ctx) {
       
    }

    @Override
    public void enterGet_accessor_declaration(CSharp4Parser.Get_accessor_declarationContext ctx) {
       
    }

    @Override
    public void exitGet_accessor_declaration(CSharp4Parser.Get_accessor_declarationContext ctx) {
       
    }

    @Override
    public void enterAnd_expression(CSharp4Parser.And_expressionContext ctx) {
       
    }

    @Override
    public void exitAnd_expression(CSharp4Parser.And_expressionContext ctx) {
       
    }

    @Override
    public void enterClass_type(CSharp4Parser.Class_typeContext ctx) {
       
    }

    @Override
    public void exitClass_type(CSharp4Parser.Class_typeContext ctx) {
       
    }

    @Override
    public void enterMethod_modifier(CSharp4Parser.Method_modifierContext ctx) {
       
    }

    @Override
    public void exitMethod_modifier(CSharp4Parser.Method_modifierContext ctx) {
       
    }

    @Override
    public void enterClass_member_declaration(CSharp4Parser.Class_member_declarationContext ctx) {
       
    }

    @Override
    public void exitClass_member_declaration(CSharp4Parser.Class_member_declarationContext ctx) {
       
    }

    @Override
    public void enterFixed_size_buffer_declarator(CSharp4Parser.Fixed_size_buffer_declaratorContext ctx) {
       
    }

    @Override
    public void exitFixed_size_buffer_declarator(CSharp4Parser.Fixed_size_buffer_declaratorContext ctx) {
       
    }

    @Override
    public void enterLocal_variable_initializer(CSharp4Parser.Local_variable_initializerContext ctx) {
       
    }

    @Override
    public void exitLocal_variable_initializer(CSharp4Parser.Local_variable_initializerContext ctx) {
       
    }

    @Override
    public void enterExplicit_anonymous_function_parameter(CSharp4Parser.Explicit_anonymous_function_parameterContext ctx) {
       
    }

    @Override
    public void exitExplicit_anonymous_function_parameter(CSharp4Parser.Explicit_anonymous_function_parameterContext ctx) {
       
    }

    @Override
    public void enterArglist(CSharp4Parser.ArglistContext ctx) {
       
    }

    @Override
    public void exitArglist(CSharp4Parser.ArglistContext ctx) {
       
    }

    @Override
    public void enterLabeled_statement(CSharp4Parser.Labeled_statementContext ctx) {
       
    }

    @Override
    public void exitLabeled_statement(CSharp4Parser.Labeled_statementContext ctx) {
       
    }

    @Override
    public void enterNamed_argument(CSharp4Parser.Named_argumentContext ctx) {
       
    }

    @Override
    public void exitNamed_argument(CSharp4Parser.Named_argumentContext ctx) {
       
    }

    @Override
    public void enterDelegate_type(CSharp4Parser.Delegate_typeContext ctx) {
       
    }

    @Override
    public void exitDelegate_type(CSharp4Parser.Delegate_typeContext ctx) {
       
    }

    @Override
    public void enterEnum_declaration(CSharp4Parser.Enum_declarationContext ctx) {
       
    }

    @Override
    public void exitEnum_declaration(CSharp4Parser.Enum_declarationContext ctx) {
       
    }

    @Override
    public void enterClass_modifier_unsafe(CSharp4Parser.Class_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void exitClass_modifier_unsafe(CSharp4Parser.Class_modifier_unsafeContext ctx) {
       
    }

    @Override
    public void enterOverloadable_operator(CSharp4Parser.Overloadable_operatorContext ctx) {
       
    }

    @Override
    public void exitOverloadable_operator(CSharp4Parser.Overloadable_operatorContext ctx) {
       
    }

    @Override
    public void enterImplicit_anonymous_function_parameter(CSharp4Parser.Implicit_anonymous_function_parameterContext ctx) {
       
    }

    @Override
    public void exitImplicit_anonymous_function_parameter(CSharp4Parser.Implicit_anonymous_function_parameterContext ctx) {
       
    }

    @Override
    public void enterEvent_modifier(CSharp4Parser.Event_modifierContext ctx) {
       
    }

    @Override
    public void exitEvent_modifier(CSharp4Parser.Event_modifierContext ctx) {
       
    }

    @Override
    public void enterNamespace_or_type_name(CSharp4Parser.Namespace_or_type_nameContext ctx) {
       
    }

    @Override
    public void exitNamespace_or_type_name(CSharp4Parser.Namespace_or_type_nameContext ctx) {
       
    }

    @Override
    public void enterGoto_statement(CSharp4Parser.Goto_statementContext ctx) {
           jplagParser.add(_GOTO, ctx.getStart()); 
  
    }

    @Override
    public void exitGoto_statement(CSharp4Parser.Goto_statementContext ctx) {
       
    }

    @Override
    public void enterFor_statement(CSharp4Parser.For_statementContext ctx) {
       jplagParser.add(_FOR, ctx.getStart());
    }

    @Override
    public void exitFor_statement(CSharp4Parser.For_statementContext ctx) {
       
    }

    @Override
    public void enterOrdering_direction(CSharp4Parser.Ordering_directionContext ctx) {
       
    }

    @Override
    public void exitOrdering_direction(CSharp4Parser.Ordering_directionContext ctx) {
       
    }

    @Override
    public void enterDelegate_declaration(CSharp4Parser.Delegate_declarationContext ctx) {
       
    }

    @Override
    public void exitDelegate_declaration(CSharp4Parser.Delegate_declarationContext ctx) {
       
    }

    @Override
    public void enterOverloadable_binary_operator(CSharp4Parser.Overloadable_binary_operatorContext ctx) {
       
    }

    @Override
    public void exitOverloadable_binary_operator(CSharp4Parser.Overloadable_binary_operatorContext ctx) {
       
    }

    @Override
    public void enterEvent_accessor_declarations(CSharp4Parser.Event_accessor_declarationsContext ctx) {
       
    }

    @Override
    public void exitEvent_accessor_declarations(CSharp4Parser.Event_accessor_declarationsContext ctx) {
       
    }

    @Override
    public void enterImplicit_anonymous_function_signature(CSharp4Parser.Implicit_anonymous_function_signatureContext ctx) {
       
    }

    @Override
    public void exitImplicit_anonymous_function_signature(CSharp4Parser.Implicit_anonymous_function_signatureContext ctx) {
       
    }

    @Override
    public void enterStruct_member_declaration_unsafe(CSharp4Parser.Struct_member_declaration_unsafeContext ctx) {
       
    }

    @Override
    public void exitStruct_member_declaration_unsafe(CSharp4Parser.Struct_member_declaration_unsafeContext ctx) {
       
    }

    @Override
    public void enterArray_creation_expression(CSharp4Parser.Array_creation_expressionContext ctx) {
        jplagParser.add(_ARRAY_CREATION, ctx.getStart());
    }

    @Override
    public void exitArray_creation_expression(CSharp4Parser.Array_creation_expressionContext ctx) {
       
    }

    @Override
    public void enterType_parameter_constraints(CSharp4Parser.Type_parameter_constraintsContext ctx) {
       
    }

    @Override
    public void exitType_parameter_constraints(CSharp4Parser.Type_parameter_constraintsContext ctx) {
       
    }

    @Override
    public void enterOperator_declarator(CSharp4Parser.Operator_declaratorContext ctx) {
       
    }

    @Override
    public void exitOperator_declarator(CSharp4Parser.Operator_declaratorContext ctx) {
       
    }

    @Override
    public void enterQuery_body_clauses(CSharp4Parser.Query_body_clausesContext ctx) {
       
    }

    @Override
    public void exitQuery_body_clauses(CSharp4Parser.Query_body_clausesContext ctx) {
       
    }

    @Override
    public void enterSizeof_expression(CSharp4Parser.Sizeof_expressionContext ctx) {
       
    }

    @Override
    public void exitSizeof_expression(CSharp4Parser.Sizeof_expressionContext ctx) {
       
    }

    @Override
    public void enterInclusive_or_expression(CSharp4Parser.Inclusive_or_expressionContext ctx) {
       
    }

    @Override
    public void exitInclusive_or_expression(CSharp4Parser.Inclusive_or_expressionContext ctx) {
       
    }

    @Override
    public void enterIf_statement(CSharp4Parser.If_statementContext ctx) {
     jplagParser.add(_IF, ctx.getStart());  
    }

    @Override
    public void exitIf_statement(CSharp4Parser.If_statementContext ctx) {
       jplagParser.add(_END_IF, ctx.getStop());
    }

    @Override
    public void enterEmpty_statement(CSharp4Parser.Empty_statementContext ctx) {
       
    }

    @Override
    public void exitEmpty_statement(CSharp4Parser.Empty_statementContext ctx) {
       
    }

    @Override
    public void enterBlock(CSharp4Parser.BlockContext ctx) {
             jplagParser.add(_L_BRACE, ctx.getStart()); 

    }

    @Override
    public void exitBlock(CSharp4Parser.BlockContext ctx) {
        jplagParser.add(_R_BRACE, ctx.getStop());
    }

    @Override
    public void enterAddressof_expression(CSharp4Parser.Addressof_expressionContext ctx) {
       
    }

    @Override
    public void exitAddressof_expression(CSharp4Parser.Addressof_expressionContext ctx) {
       
    }

    @Override
    public void enterStruct_modifiers(CSharp4Parser.Struct_modifiersContext ctx) {
       
    }

    @Override
    public void exitStruct_modifiers(CSharp4Parser.Struct_modifiersContext ctx) {
       
    }

    @Override
    public void enterConstant_declaration2(CSharp4Parser.Constant_declaration2Context ctx) {
       
    }

    @Override
    public void exitConstant_declaration2(CSharp4Parser.Constant_declaration2Context ctx) {
       
    }

    @Override
    public void enterChecked_expression(CSharp4Parser.Checked_expressionContext ctx) {
       
    }

    @Override
    public void exitChecked_expression(CSharp4Parser.Checked_expressionContext ctx) {
       
    }

    @Override
    public void enterObject_initializer(CSharp4Parser.Object_initializerContext ctx) {
       
    }

    @Override
    public void exitObject_initializer(CSharp4Parser.Object_initializerContext ctx) {
       
    }

    @Override
    public void enterInterface_method_declaration(CSharp4Parser.Interface_method_declarationContext ctx) {
       
    }

    @Override
    public void exitInterface_method_declaration(CSharp4Parser.Interface_method_declarationContext ctx) {
       
    }

    @Override
    public void enterAnonymous_function_parameter_modifier(CSharp4Parser.Anonymous_function_parameter_modifierContext ctx) {
       
    }

    @Override
    public void exitAnonymous_function_parameter_modifier(CSharp4Parser.Anonymous_function_parameter_modifierContext ctx) {
       
    }

    @Override
    public void enterReturn_statement(CSharp4Parser.Return_statementContext ctx) {
            jplagParser.add(_RETURN, ctx.getStart()); 
 
    }

    @Override
    public void exitReturn_statement(CSharp4Parser.Return_statementContext ctx) {
       
    }

    @Override
    public void enterJoin_into_clause(CSharp4Parser.Join_into_clauseContext ctx) {
       
    }

    @Override
    public void exitJoin_into_clause(CSharp4Parser.Join_into_clauseContext ctx) {
       
    }

    @Override
    public void enterInterface_indexer_declaration(CSharp4Parser.Interface_indexer_declarationContext ctx) {
       
    }

    @Override
    public void exitInterface_indexer_declaration(CSharp4Parser.Interface_indexer_declarationContext ctx) {
       
    }

    @Override
    public void enterSelection_statement(CSharp4Parser.Selection_statementContext ctx) {
       
    }

    @Override
    public void exitSelection_statement(CSharp4Parser.Selection_statementContext ctx) {
       
    }

    @Override
    public void enterUnary_operator_declarator(CSharp4Parser.Unary_operator_declaratorContext ctx) {
       
    }

    @Override
    public void exitUnary_operator_declarator(CSharp4Parser.Unary_operator_declaratorContext ctx) {
       
    }

    @Override
    public void enterPointer_indirection_expression(CSharp4Parser.Pointer_indirection_expressionContext ctx) {
       
    }

    @Override
    public void exitPointer_indirection_expression(CSharp4Parser.Pointer_indirection_expressionContext ctx) {
       
    }

    @Override
    public void enterGeneric_dimension_specifier(CSharp4Parser.Generic_dimension_specifierContext ctx) {
       
    }

    @Override
    public void exitGeneric_dimension_specifier(CSharp4Parser.Generic_dimension_specifierContext ctx) {
       
    }

    @Override
    public void enterInterface_event_declaration2(CSharp4Parser.Interface_event_declaration2Context ctx) {
       
    }

    @Override
    public void exitInterface_event_declaration2(CSharp4Parser.Interface_event_declaration2Context ctx) {
       
    }

    @Override
    public void enterExtern_alias_directives(CSharp4Parser.Extern_alias_directivesContext ctx) {
       
    }

    @Override
    public void exitExtern_alias_directives(CSharp4Parser.Extern_alias_directivesContext ctx) {
       
    }

    @Override
    public void enterScan_for_shift_generic_precedence(CSharp4Parser.Scan_for_shift_generic_precedenceContext ctx) {
       
    }

    @Override
    public void exitScan_for_shift_generic_precedence(CSharp4Parser.Scan_for_shift_generic_precedenceContext ctx) {
       
    }

    @Override
    public void enterEnum_member_declaration(CSharp4Parser.Enum_member_declarationContext ctx) {
       
    }

    @Override
    public void exitEnum_member_declaration(CSharp4Parser.Enum_member_declarationContext ctx) {
       
    }

    @Override
    public void enterConditional_expression(CSharp4Parser.Conditional_expressionContext ctx) {
       
    }

    @Override
    public void exitConditional_expression(CSharp4Parser.Conditional_expressionContext ctx) {
       
    }

    @Override
    public void enterPrimary_constraint(CSharp4Parser.Primary_constraintContext ctx) {
       
    }

    @Override
    public void exitPrimary_constraint(CSharp4Parser.Primary_constraintContext ctx) {
       
    }

    @Override
    public void enterUnmanaged_type(CSharp4Parser.Unmanaged_typeContext ctx) {
       
    }

    @Override
    public void exitUnmanaged_type(CSharp4Parser.Unmanaged_typeContext ctx) {
       
    }

    @Override
    public void enterAttribute_list(CSharp4Parser.Attribute_listContext ctx) {
       
    }

    @Override
    public void exitAttribute_list(CSharp4Parser.Attribute_listContext ctx) {
       
    }

    @Override
    public void enterSpecific_catch_clause(CSharp4Parser.Specific_catch_clauseContext ctx) {
       
    }

    @Override
    public void exitSpecific_catch_clause(CSharp4Parser.Specific_catch_clauseContext ctx) {
       
    }

    @Override
    public void enterGlobal_attribute_section(CSharp4Parser.Global_attribute_sectionContext ctx) {
       
    }

    @Override
    public void exitGlobal_attribute_section(CSharp4Parser.Global_attribute_sectionContext ctx) {
       
    }

    @Override
    public void enterDestructor_declaration(CSharp4Parser.Destructor_declarationContext ctx) {
       
    }

    @Override
    public void exitDestructor_declaration(CSharp4Parser.Destructor_declarationContext ctx) {
       
    }

    @Override
    public void enterAll_member_modifiers(CSharp4Parser.All_member_modifiersContext ctx) {
       
    }

    @Override
    public void exitAll_member_modifiers(CSharp4Parser.All_member_modifiersContext ctx) {
       
    }

    @Override
    public void enterPredefined_type(CSharp4Parser.Predefined_typeContext ctx) {
       
    }

    @Override
    public void exitPredefined_type(CSharp4Parser.Predefined_typeContext ctx) {
       
    }

    @Override
    public void enterParameter_array(CSharp4Parser.Parameter_arrayContext ctx) {
       
    }

    @Override
    public void exitParameter_array(CSharp4Parser.Parameter_arrayContext ctx) {
       
    }

    @Override
    public void enterMultiplicative_expression(CSharp4Parser.Multiplicative_expressionContext ctx) {
       
    }

    @Override
    public void exitMultiplicative_expression(CSharp4Parser.Multiplicative_expressionContext ctx) {
       
    }

    @Override
    public void enterQuery_body_clause(CSharp4Parser.Query_body_clauseContext ctx) {
       
    }

    @Override
    public void exitQuery_body_clause(CSharp4Parser.Query_body_clauseContext ctx) {
       
    }

    @Override
    public void enterCommas(CSharp4Parser.CommasContext ctx) {
       
    }

    @Override
    public void exitCommas(CSharp4Parser.CommasContext ctx) {
       
    }

    @Override
    public void enterFor_initializer(CSharp4Parser.For_initializerContext ctx) {
       
    }

    @Override
    public void exitFor_initializer(CSharp4Parser.For_initializerContext ctx) {
       
    }

    @Override
    public void enterDestructor_declaration_unsafe(CSharp4Parser.Destructor_declaration_unsafeContext ctx) {
       
    }

    @Override
    public void exitDestructor_declaration_unsafe(CSharp4Parser.Destructor_declaration_unsafeContext ctx) {
       
    }

    @Override
    public void enterClass_member_declarations(CSharp4Parser.Class_member_declarationsContext ctx) {
       
    }

    @Override
    public void exitClass_member_declarations(CSharp4Parser.Class_member_declarationsContext ctx) {
       
    }

    @Override
    public void enterNamespace_declaration(CSharp4Parser.Namespace_declarationContext ctx) {
       
    }

    @Override
    public void exitNamespace_declaration(CSharp4Parser.Namespace_declarationContext ctx) {
       
    }

    @Override
    public void enterEvent_declaration2(CSharp4Parser.Event_declaration2Context ctx) {
       
    }

    @Override
    public void exitEvent_declaration2(CSharp4Parser.Event_declaration2Context ctx) {
       
    }

    @Override
    public void enterQuery_continuation(CSharp4Parser.Query_continuationContext ctx) {
       
    }

    @Override
    public void exitQuery_continuation(CSharp4Parser.Query_continuationContext ctx) {
       
    }

    @Override
    public void enterUnchecked_statement(CSharp4Parser.Unchecked_statementContext ctx) {
           jplagParser.add(_UNCHECKED, ctx.getStart()); 
  
    }

    @Override
    public void exitUnchecked_statement(CSharp4Parser.Unchecked_statementContext ctx) {
       
    }

    @Override
    public void enterSimple_embedded_statement(CSharp4Parser.Simple_embedded_statementContext ctx) {
       
    }

    @Override
    public void exitSimple_embedded_statement(CSharp4Parser.Simple_embedded_statementContext ctx) {
       
    }

    @Override
    public void enterDefault_value_expression(CSharp4Parser.Default_value_expressionContext ctx) {
       
    }

    @Override
    public void exitDefault_value_expression(CSharp4Parser.Default_value_expressionContext ctx) {
       
    }

    @Override
    public void enterSwitch_block(CSharp4Parser.Switch_blockContext ctx) {
      jplagParser.add(_SWITCH_BEGIN, ctx.getStart()); 
    }

    @Override
    public void exitSwitch_block(CSharp4Parser.Switch_blockContext ctx) {
     jplagParser.add(_SWITCH_END, ctx.getStop());  
    }

    @Override
    public void enterMethod_body(CSharp4Parser.Method_bodyContext ctx) {
       jplagParser.add(_METHOD, ctx.getStart()); 
    }

    @Override
    public void exitMethod_body(CSharp4Parser.Method_bodyContext ctx) {
       
    }

    @Override
    public void enterBinary_operator_declarator(CSharp4Parser.Binary_operator_declaratorContext ctx) {
       
    }

    @Override
    public void exitBinary_operator_declarator(CSharp4Parser.Binary_operator_declaratorContext ctx) {
       
    }

    @Override
    public void enterInterface_modifier(CSharp4Parser.Interface_modifierContext ctx) {
       
    }

    @Override
    public void exitInterface_modifier(CSharp4Parser.Interface_modifierContext ctx) {
       
    }

    @Override
    public void enterType_argument(CSharp4Parser.Type_argumentContext ctx) {
       
    }

    @Override
    public void exitType_argument(CSharp4Parser.Type_argumentContext ctx) {
       
    }

    @Override
    public void enterInterface_event_declaration(CSharp4Parser.Interface_event_declarationContext ctx) {
       
    }

    @Override
    public void exitInterface_event_declaration(CSharp4Parser.Interface_event_declarationContext ctx) {
       
    }

    @Override
    public void enterAdditive_expression(CSharp4Parser.Additive_expressionContext ctx) {
       
    }

    @Override
    public void exitAdditive_expression(CSharp4Parser.Additive_expressionContext ctx) {
       
    }

    @Override
    public void enterMember_initializer(CSharp4Parser.Member_initializerContext ctx) {
       
    }

    @Override
    public void exitMember_initializer(CSharp4Parser.Member_initializerContext ctx) {
       
    }

    @Override
    public void enterStatic_constructor_modifiers_unsafe(CSharp4Parser.Static_constructor_modifiers_unsafeContext ctx) {
       
    }

    @Override
    public void exitStatic_constructor_modifiers_unsafe(CSharp4Parser.Static_constructor_modifiers_unsafeContext ctx) {
       
    }

    @Override
    public void enterThrow_statement(CSharp4Parser.Throw_statementContext ctx) {
          jplagParser.add(_THROW, ctx.getStart()); 
   
    }

    @Override
    public void exitThrow_statement(CSharp4Parser.Throw_statementContext ctx) {
       
    }

    @Override
    public void enterClass_modifier(CSharp4Parser.Class_modifierContext ctx) {
       
    }

    @Override
    public void exitClass_modifier(CSharp4Parser.Class_modifierContext ctx) {
       
    }

    @Override
    public void enterProperty_declaration2(CSharp4Parser.Property_declaration2Context ctx) {
       
    }

    @Override
    public void exitProperty_declaration2(CSharp4Parser.Property_declaration2Context ctx) {
       
    }

    @Override
    public void enterAttribute_sections(CSharp4Parser.Attribute_sectionsContext ctx) {
       
    }

    @Override
    public void exitAttribute_sections(CSharp4Parser.Attribute_sectionsContext ctx) {
       
    }

    @Override
    public void enterStatement_expression(CSharp4Parser.Statement_expressionContext ctx) {
       
    }

    @Override
    public void exitStatement_expression(CSharp4Parser.Statement_expressionContext ctx) {
       
    }

    @Override
    public void enterSwitch_labels(CSharp4Parser.Switch_labelsContext ctx) {
       
    }

    @Override
    public void exitSwitch_labels(CSharp4Parser.Switch_labelsContext ctx) {
       
    }

    @Override
    public void enterFixed_parameters(CSharp4Parser.Fixed_parametersContext ctx) {
       
    }

    @Override
    public void exitFixed_parameters(CSharp4Parser.Fixed_parametersContext ctx) {
       
    }

    @Override
    public void enterAttribute(CSharp4Parser.AttributeContext ctx) {
       jplagParser.add(_ATTRIBUTE, ctx.getStart());
    }

    @Override
    public void exitAttribute(CSharp4Parser.AttributeContext ctx) {
       
    }

    @Override
    public void enterFormal_parameter_list(CSharp4Parser.Formal_parameter_listContext ctx) {
       
    }

    @Override
    public void exitFormal_parameter_list(CSharp4Parser.Formal_parameter_listContext ctx) {
       
    }

    @Override
    public void enterStruct_declaration(CSharp4Parser.Struct_declarationContext ctx) {
       
    }

    @Override
    public void exitStruct_declaration(CSharp4Parser.Struct_declarationContext ctx) {
       
    }

    @Override
    public void enterOrderby_contextual_keyword(CSharp4Parser.Orderby_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitOrderby_contextual_keyword(CSharp4Parser.Orderby_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterRank_specifier(CSharp4Parser.Rank_specifierContext ctx) {
       
    }

    @Override
    public void exitRank_specifier(CSharp4Parser.Rank_specifierContext ctx) {
       
    }

    @Override
    public void enterAssignment_operator(CSharp4Parser.Assignment_operatorContext ctx) {
       
    }

    @Override
    public void exitAssignment_operator(CSharp4Parser.Assignment_operatorContext ctx) {
       
    }

    @Override
    public void enterVariant_type_parameters(CSharp4Parser.Variant_type_parametersContext ctx) {
       
    }

    @Override
    public void exitVariant_type_parameters(CSharp4Parser.Variant_type_parametersContext ctx) {
       
    }

    @Override
    public void enterMember_initializer_list(CSharp4Parser.Member_initializer_listContext ctx) {
       
    }

    @Override
    public void exitMember_initializer_list(CSharp4Parser.Member_initializer_listContext ctx) {
       
    }

    @Override
    public void enterCast_disambiguation_token(CSharp4Parser.Cast_disambiguation_tokenContext ctx) {
       
    }

    @Override
    public void exitCast_disambiguation_token(CSharp4Parser.Cast_disambiguation_tokenContext ctx) {
       
    }

    @Override
    public void enterMember_declarator_list(CSharp4Parser.Member_declarator_listContext ctx) {
       
    }

    @Override
    public void exitMember_declarator_list(CSharp4Parser.Member_declarator_listContext ctx) {
       
    }

    @Override
    public void enterSwitch_statement(CSharp4Parser.Switch_statementContext ctx) {
       
    }

    @Override
    public void exitSwitch_statement(CSharp4Parser.Switch_statementContext ctx) {
       
    }

    @Override
    public void enterMethod_declaration2(CSharp4Parser.Method_declaration2Context ctx) {
       
    }

    @Override
    public void exitMethod_declaration2(CSharp4Parser.Method_declaration2Context ctx) {
       
    }

    @Override
    public void enterNamed_argument_list(CSharp4Parser.Named_argument_listContext ctx) {
       
    }

    @Override
    public void exitNamed_argument_list(CSharp4Parser.Named_argument_listContext ctx) {
       
    }

    @Override
    public void enterKeyword(CSharp4Parser.KeywordContext ctx) {
       
    }

    @Override
    public void exitKeyword(CSharp4Parser.KeywordContext ctx) {
       
    }

    @Override
    public void enterDestructor_body(CSharp4Parser.Destructor_bodyContext ctx) {
      jplagParser.add(_DESTRUCTOR, ctx.getStart());  
    }

    @Override
    public void exitDestructor_body(CSharp4Parser.Destructor_bodyContext ctx) {
       
    }

    @Override
    public void enterYield_contextual_keyword(CSharp4Parser.Yield_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitYield_contextual_keyword(CSharp4Parser.Yield_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterIntegral_type(CSharp4Parser.Integral_typeContext ctx) {
       
    }

    @Override
    public void exitIntegral_type(CSharp4Parser.Integral_typeContext ctx) {
       
    }

    @Override
    public void enterType_parameter_constraints_clause(CSharp4Parser.Type_parameter_constraints_clauseContext ctx) {
       
    }

    @Override
    public void exitType_parameter_constraints_clause(CSharp4Parser.Type_parameter_constraints_clauseContext ctx) {
       
    }

    @Override
    public void enterType_declaration(CSharp4Parser.Type_declarationContext ctx) {
       
    }

    @Override
    public void exitType_declaration(CSharp4Parser.Type_declarationContext ctx) {
       
    }

    @Override
    public void enterOverloadable_unary_operator(CSharp4Parser.Overloadable_unary_operatorContext ctx) {
       
    }

    @Override
    public void exitOverloadable_unary_operator(CSharp4Parser.Overloadable_unary_operatorContext ctx) {
       
    }

    @Override
    public void enterJoin_clause(CSharp4Parser.Join_clauseContext ctx) {
       
    }

    @Override
    public void exitJoin_clause(CSharp4Parser.Join_clauseContext ctx) {
       
    }

    @Override
    public void enterOperator_modifier(CSharp4Parser.Operator_modifierContext ctx) {
       
    }

    @Override
    public void exitOperator_modifier(CSharp4Parser.Operator_modifierContext ctx) {
       
    }

    @Override
    public void enterEmbedded_statement_unsafe(CSharp4Parser.Embedded_statement_unsafeContext ctx) {
       
    }

    @Override
    public void exitEmbedded_statement_unsafe(CSharp4Parser.Embedded_statement_unsafeContext ctx) {
       
    }

    @Override
    public void enterPre_increment_expression(CSharp4Parser.Pre_increment_expressionContext ctx) {
       
    }

    @Override
    public void exitPre_increment_expression(CSharp4Parser.Pre_increment_expressionContext ctx) {
       
    }

    @Override
    public void enterRight_arrow(CSharp4Parser.Right_arrowContext ctx) {
       
    }

    @Override
    public void exitRight_arrow(CSharp4Parser.Right_arrowContext ctx) {
       
    }

    @Override
    public void enterExtern_alias_directive(CSharp4Parser.Extern_alias_directiveContext ctx) {
       
    }

    @Override
    public void exitExtern_alias_directive(CSharp4Parser.Extern_alias_directiveContext ctx) {
       
    }

    @Override
    public void enterGroup_contextual_keyword(CSharp4Parser.Group_contextual_keywordContext ctx) {
       
    }

    @Override
    public void exitGroup_contextual_keyword(CSharp4Parser.Group_contextual_keywordContext ctx) {
       
    }

    @Override
    public void enterLiteral(CSharp4Parser.LiteralContext ctx) {
       
    }

    @Override
    public void exitLiteral(CSharp4Parser.LiteralContext ctx) {
       
    }

}
