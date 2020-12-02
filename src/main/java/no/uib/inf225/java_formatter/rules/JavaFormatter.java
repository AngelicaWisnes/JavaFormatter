package no.uib.inf225.java_formatter.rules;

import no.uib.inf225.java_formatter.GlobalQuickConfig;
import no.uib.inf225.java_formatter.Java9Parser;
import no.uib.inf225.java_formatter.util.Ansi;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class JavaFormatter {

    private static boolean isOnNewLine = true;
    private static boolean isNegativeNumber = false;
    private static boolean override_noNewLine = false;
    private static String override_closingToken = "";

    // Holders for current- and previous token
    private static String previousToken = "";
    private static String currentToken = "";
    private static final Stack<Class<?>> ruleStack = new Stack<>();
    private static Class<?> previousRule = null;
    private static Class<?> currentRule = null;
    private static int indentLevel = 0;

    private static FileOutputStream output;
    private static final IStyle STYLE = GlobalQuickConfig.getFormattingStyle();

    String temp = "  LiteralContext PrimitiveTypeContext NumericTypeContext  IntegralTypeContext FloatingPointTypeContext ReferenceTypeContext ClassOrInterfaceTypeContext ClassTypeContext ClassType_lf OrInterfaceTypeContext ClassType_lfno OrInterfaceTypeContext InterfaceTypeContext InterfaceType_lf OrInterfaceTypeContext InterfaceType_lfno OrInterfaceTypeContext TypeVariableContext ArrayTypeContext DimsContext TypeParameterContext TypeParameterModifierContext TypeBoundContext AdditionalBoundContext TypeArgumentsContext TypeArgumentListContext TypeArgumentContext WildcardContext WildcardBoundsContext ModuleNameContext PackageNameContext TypeNameContext PackageOrTypeNameContext ExpressionNameContext MethodNameContext AmbiguousNameContext ModularCompilationContext PackageDeclarationContext PackageModifierContext ImportDeclarationContext SingleTypeImportDeclarationContext TypeImportOnDemandDeclarationContext SingleStaticImportDeclarationContext StaticImportOnDemandDeclarationContext TypeDeclarationContext ModuleDeclarationContext ModuleDirectiveContext RequiresModifierContext ClassDeclarationContext NormalClassDeclarationContext ClassModifierContext TypeParametersContext TypeParameterListContext Supe Context SuperinterfacesContext InterfaceTypeListContext ClassBodyContext ClassBodyDeclarationContext ClassMemberDeclarationContext FieldDeclarationContext FieldModifierContext VariableDeclaratorListContext VariableDeclaratorContext VariableDeclaratorIdContext VariableInitializerContext UnannTypeContext UnannPrimitiveTypeContext UnannReferenceTypeContext UnannClassOrInterfaceTypeContext UnannClassTypeContext UnannClassType_lf_unannClassOrInterfaceTypeContext UnannClassType_lfno_unannClassOrInterfaceTypeContext UnannInterfaceTypeContext UnannInterfaceType_lf_unannClassOrInterfaceTypeContext UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext UnannTypeVariableContext UnannArrayTypeContext MethodDeclarationContext MethodModifierContext MethodHeaderContext ResultContext MethodDeclaratorContext FormalParameterListContext FormalParametersContext FormalParameterContext VariableModifierContext LastFormalParameterContext ReceiverParameterContext Throws_Context ExceptionTypeListContext ExceptionTypeContext MethodBodyContext InstanceInitializerContext StaticInitializerContext ConstructorDeclarationContext ConstructorModifierContext ConstructorDeclaratorContext SimpleTypeNameContext ConstructorBodyContext ExplicitConstructorInvocationContext EnumDeclarationContext EnumBodyContext EnumConstantListContext EnumConstantContext EnumConstantModifierContext EnumBodyDeclarationsContext InterfaceDeclarationContext NormalInterfaceDeclarationContext InterfaceModifierContext ExtendsInterfacesContext InterfaceBodyContext InterfaceMemberDeclarationContext ConstantDeclarationContext ConstantModifierContext InterfaceMethodDeclarationContext InterfaceMethodModifierContext AnnotationTypeDeclarationContext AnnotationTypeBodyContext AnnotationTypeMemberDeclarationContext AnnotationTypeElementDeclarationContext AnnotationTypeElementModifierContext DefaultValueContext AnnotationContext NormalAnnotationContext ElementValuePairListContext ElementValuePairContext ElementValueContext ElementValueArrayInitializerContext ElementValueListContext MarkerAnnotationContext SingleElementAnnotationContext ArrayInitializerContext VariableInitializerListContext BlockContext BlockStatementsContext BlockStatementContext LocalVariableDeclarationStatementContext LocalVariableDeclarationContext StatementContext StatementNoShortIfContext StatementWithoutTrailingSubstatementContext EmptyStatementContext LabeledStatementContext LabeledStatementNoShortIfContext ExpressionStatementContext StatementExpressionContext IfThenStatementContext IfThenElseStatementContext IfThenElseStatementNoShortIfContext AssertStatementContext SwitchStatementContext SwitchBlockContext SwitchBlockStatementGroupContext SwitchLabelsContext SwitchLabelContext EnumConstantNameContext WhileStatementContext WhileStatementNoShortIfContext DoStatementContext ForStatementContext ForStatementNoShortIfContext BasicForStatementContext BasicForStatementNoShortIfContext ForInitContext ForUpdateContext StatementExpressionListContext EnhancedForStatementContext EnhancedForStatementNoShortIfContext BreakStatementContext ContinueStatementContext ReturnStatementContext ThrowStatementContext SynchronizedStatementContext TryStatementContext CatchesContext CatchClauseContext CatchFormalParameterContext CatchTypeContext Finally_Context TryWithResourcesStatementContext ResourceSpecificationContext ResourceListContext ResourceContext VariableAccessContext PrimaryContext PrimaryNoNewArrayContext PrimaryNoNewArray_lf_arrayAccessContext PrimaryNoNewArray_lfno_arrayAccessContext PrimaryNoNewArray_lf_primaryContext PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext PrimaryNoNewArray_lfno_primaryContext PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ClassLiteralContext ClassInstanceCreationExpressionContext ClassInstanceCreationExpression_lf_primaryContext ClassInstanceCreationExpression_lfno_primaryContext TypeArgumentsOrDiamondContext FieldAccessContext FieldAccess_lf_primaryContext FieldAccess_lfno_primaryContext ArrayAccessContext ArrayAccess_lf_primaryContext ArrayAccess_lfno_primaryContext MethodInvocationContext MethodInvocation_lf_primaryContext MethodInvocation_lfno_primaryContext ArgumentListContext MethodReferenceContext MethodReference_lf_primaryContext MethodReference_lfno_primaryContext ArrayCreationExpressionContext DimExprsContext DimExprContext ConstantExpressionContext ExpressionContext LambdaExpressionContext LambdaParametersContext InferredFormalParameterListContext LambdaBodyContext AssignmentExpressionContext AssignmentContext LeftHandSideContext AssignmentOperatorContext ConditionalExpressionContext ConditionalOrExpressionContext ConditionalAndExpressionContext InclusiveOrExpressionContext ExclusiveOrExpressionContext AndExpressionContext EqualityExpressionContext RelationalExpressionContext ShiftExpressionContext AdditiveExpressionContext MultiplicativeExpressionContext UnaryExpressionContext PreIncrementExpressionContext PreDecrementExpressionContext UnaryExpressionNotPlusMinusContext PostfixExpressionContext PostIncrementExpressionContext PostIncrementExpression_lf_postfixExpressionContext PostDecrementExpressionContext PostDecrementExpression_lf_postfixExpressionContext CastExpressionContext IdentifierContext ";
    StringBuilder sb = new StringBuilder();

    // Style-constants
    private static final String INDENT = STYLE.getToken_indent();
    private static final String SINGLE_SPACE = STYLE.getToken_singleSpace();
    private static final String NEW_LINE = STYLE.getToken_newLine();

    // Spacing
    private static final Set<String> noSpaceAroundToken = STYLE.getSet_noSpaceAroundToken();
    private static final Set<String> noSpaceBeforeToken = STYLE.getSet_noSpaceBeforeToken();
    private static final Set<String> noSpaceAfterToken = STYLE.getSet_noSpaceAfterToken();
    private static final Set<Class<?>> noSpaceBeforeRule = STYLE.getSet_noSpaceBeforeRule();
    private static final Set<Class<?>> noSpaceAfterRule = STYLE.getSet_noSpaceAfterRule();
    private static final Set<Class<?>> noSpaceAroundRule = STYLE.getSet_noSpaceAroundRule();
    private static final Set<Class<?>> forceSpaceBeforeRule = STYLE.getSet_forceSpaceBeforeRule();

    // Indentation
    private static final Set<String> unindentBeforeToken = STYLE.getSet_unindentBeforeToken();
    private static final Set<String> indentAfterToken = STYLE.getSet_indentAfterToken();
    private static final Set<Class<?>> indentedRule = STYLE.getSet_indentedRule();

    // New-line
    private static final Set<String> newLineAfterToken = STYLE.getSet_newLineAfterToken();
    private static final Set<Class<?>> newLineBeforeRule = STYLE.getSet_newLineBeforeRule();
    private static final Set<Class<?>> newLineAfterRule = STYLE.getSet_newLineAfterRule();
    private static final Set<Class<?>> newLineBeforeAndAfterRule = STYLE.getSet_newLineAroundRule();

    // Special cases
    private static final Map<String, String> interpretAsLiteral = STYLE.getMap_interpretAsLiteral();
    private static final Set<String> interpretAsLiteral_keySet = interpretAsLiteral.keySet();


    public JavaFormatter(final FileOutputStream fileOutput) {
        output = fileOutput;
    }

    private void writeToOutput(String text) {
        try {
            sb.append(Ansi.GREEN).append(text);
            output.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void tempPrint(String cl) {
        if (temp.contains(cl)) sb.append(Ansi.RED).append(";").append(cl).append("-").append(indentLevel).append(";");
    }


    public void enterRule(Class<?> cl) {
        currentRule = cl;
        ruleStack.push(currentRule);
        //if (indentedRule.contains(currentRule)) indentLevel++;
        if (shouldBeNewLineBeforeRule()) writeToOutput(newIndentedLine());
        tempPrint(currentRule.getSimpleName());
    }

    public void exitRule() {
        previousRule = ruleStack.pop();
        tempPrint(previousRule.getSimpleName());
        //if (indentedRule.contains(previousRule)) indentLevel--;
        if (shouldBeNewLineAfterRule()) writeToOutput(newIndentedLine());
    }

    public void visitTerminal(TerminalNode node) {
        // Check for EOF
        if (endOfFile(node)) {
            writeToOutput(newIndentedLine());
            System.out.println(sb.toString());
            return;
        }

        generateText(node);
    }

    private boolean endOfFile(TerminalNode node) {
        return node.getSymbol().getType() == Recognizer.EOF;
    }

    private void generateText(TerminalNode node) {
        currentToken = node.getText();

        if (indentAfterToken.contains(previousToken)) indentLevel++;
        if (unindentBeforeToken.contains(currentToken)) indentLevel--;
        if (newLineAfterToken.contains(previousToken)) writeToOutput(newIndentedLine());

        if (shouldBeSpace()) writeToOutput(SINGLE_SPACE);
        isNegativeNumber = false;

        writeToOutput(currentToken);
        isOnNewLine = false;

        checkForSpecialCase();

        previousToken = currentToken;
    }

    private void checkForSpecialCase() {
        if (interpretAsLiteral_keySet.contains(currentToken)) {
            override_noNewLine = true;
            override_closingToken = interpretAsLiteral.get(currentToken);
        }
        if (currentToken.equals(override_closingToken)) {
            override_noNewLine = false;
            override_closingToken = "";
        }
        if ((previousToken.equals("=") && currentToken.equals("-")) ||
            (previousToken.equals("==") && currentToken.equals("-"))) isNegativeNumber = true;
    }

    private String newIndentedLine() {
        if (override_noNewLine) return "";
        isOnNewLine = true;
        return NEW_LINE + INDENT.repeat(indentLevel);
    }

    private boolean shouldBeSpace() {
        boolean shouldBeForced = forceSpaceBeforeRule.contains(currentRule);

        boolean shouldBeNearToken = !noSpaceAroundToken.contains(currentToken) &&
                                    !noSpaceAroundToken.contains(previousToken) &&
                                    !noSpaceBeforeToken.contains(currentToken) &&
                                    !noSpaceAfterToken.contains(previousToken);

        boolean shouldBeNearRule = !noSpaceBeforeRule.contains(currentRule) &&
                                   !noSpaceAfterRule.contains(previousRule) &&
                                   !noSpaceAroundRule.contains(currentRule) &&
                                   !noSpaceAroundRule.contains(previousRule);

        boolean isBetweenTwoIdentifiers = previousRule != null &&
                                          previousRule.equals(Java9Parser.IdentifierContext.class) &&
                                          currentRule.equals(Java9Parser.IdentifierContext.class);

        return shouldBeForced
               || (!isOnNewLine &&
                   !isNegativeNumber &&
                   shouldBeNearToken &&
                   shouldBeNearRule &&
                   !isBetweenTwoIdentifiers);
        // && !interpretAsLiteralRules.contains(node.getParent().getClass());
    }

    private boolean shouldBeNewLineBeforeRule() {
        return newLineBeforeRule.contains(currentRule) ||
               newLineBeforeAndAfterRule.contains(currentRule);
        //     || newLineAfterToken.contains(previousToken);
    }

    private boolean shouldBeNewLineAfterRule() {
        return newLineAfterRule.contains(previousRule) ||
               newLineBeforeAndAfterRule.contains(previousRule);
        //     || newLineAfterToken.contains(previousToken);
    }

}
