package no.uib.inf225.java_formatter.rules;

import no.uib.inf225.java_formatter.GlobalQuickConfig;
import no.uib.inf225.java_formatter.util.Ansi;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

public class JavaFormatter {

    private static boolean isOnNewLine = true;

    // Holders for current- and previous token / rule
    private static String previousToken = "";
    private static final Stack<Class<?>> ruleStack = new Stack<>();
    private static Class<?> previousRule = null;
    private static Class<?> currentRule = null;

    private static FileOutputStream output;
    private static final IStyle STYLE = GlobalQuickConfig.getFormattingStyle();

    String temp = "  LiteralContext PrimitiveTypeContext NumericTypeContext  IntegralTypeContext FloatingPointTypeContext ReferenceTypeContext ClassOrInterfaceTypeContext ClassTypeContext ClassType_lf OrInterfaceTypeContext ClassType_lfno OrInterfaceTypeContext InterfaceTypeContext InterfaceType_lf OrInterfaceTypeContext InterfaceType_lfno OrInterfaceTypeContext TypeVariableContext ArrayTypeContext DimsContext TypeParameterContext TypeParameterModifierContext TypeBoundContext AdditionalBoundContext TypeArgumentsContext TypeArgumentListContext TypeArgumentContext WildcardContext WildcardBoundsContext ModuleNameContext PackageNameContext TypeNameContext PackageOrTypeNameContext ExpressionNameContext MethodNameContext AmbiguousNameContext ModularCompilationContext PackageDeclarationContext PackageModifierContext ImportDeclarationContext SingleTypeImportDeclarationContext TypeImportOnDemandDeclarationContext SingleStaticImportDeclarationContext StaticImportOnDemandDeclarationContext TypeDeclarationContext ModuleDeclarationContext ModuleDirectiveContext RequiresModifierContext ClassDeclarationContext NormalClassDeclarationContext ClassModifierContext TypeParametersContext TypeParameterListContext Supe Context SuperinterfacesContext InterfaceTypeListContext ClassBodyContext ClassBodyDeclarationContext ClassMemberDeclarationContext FieldDeclarationContext FieldModifierContext VariableDeclaratorListContext VariableDeclaratorContext VariableDeclaratorIdContext VariableInitializerContext UnannTypeContext UnannPrimitiveTypeContext UnannReferenceTypeContext UnannClassOrInterfaceTypeContext UnannClassTypeContext UnannClassType_lf_unannClassOrInterfaceTypeContext UnannClassType_lfno_unannClassOrInterfaceTypeContext UnannInterfaceTypeContext UnannInterfaceType_lf_unannClassOrInterfaceTypeContext UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext UnannTypeVariableContext UnannArrayTypeContext MethodDeclarationContext MethodModifierContext MethodHeaderContext ResultContext MethodDeclaratorContext FormalParameterListContext FormalParametersContext FormalParameterContext VariableModifierContext LastFormalParameterContext ReceiverParameterContext Throws_Context ExceptionTypeListContext ExceptionTypeContext MethodBodyContext InstanceInitializerContext StaticInitializerContext ConstructorDeclarationContext ConstructorModifierContext ConstructorDeclaratorContext SimpleTypeNameContext ConstructorBodyContext ExplicitConstructorInvocationContext EnumDeclarationContext EnumBodyContext EnumConstantListContext EnumConstantContext EnumConstantModifierContext EnumBodyDeclarationsContext InterfaceDeclarationContext NormalInterfaceDeclarationContext InterfaceModifierContext ExtendsInterfacesContext InterfaceBodyContext InterfaceMemberDeclarationContext ConstantDeclarationContext ConstantModifierContext InterfaceMethodDeclarationContext InterfaceMethodModifierContext AnnotationTypeDeclarationContext AnnotationTypeBodyContext AnnotationTypeMemberDeclarationContext AnnotationTypeElementDeclarationContext AnnotationTypeElementModifierContext DefaultValueContext AnnotationContext NormalAnnotationContext ElementValuePairListContext ElementValuePairContext ElementValueContext ElementValueArrayInitializerContext ElementValueListContext MarkerAnnotationContext SingleElementAnnotationContext ArrayInitializerContext VariableInitializerListContext BlockContext BlockStatementsContext BlockStatementContext LocalVariableDeclarationStatementContext LocalVariableDeclarationContext StatementContext StatementNoShortIfContext StatementWithoutTrailingSubstatementContext EmptyStatementContext LabeledStatementContext LabeledStatementNoShortIfContext ExpressionStatementContext StatementExpressionContext IfThenStatementContext IfThenElseStatementContext IfThenElseStatementNoShortIfContext AssertStatementContext SwitchStatementContext SwitchBlockContext SwitchBlockStatementGroupContext SwitchLabelsContext SwitchLabelContext EnumConstantNameContext WhileStatementContext WhileStatementNoShortIfContext DoStatementContext ForStatementContext ForStatementNoShortIfContext BasicForStatementContext BasicForStatementNoShortIfContext ForInitContext ForUpdateContext StatementExpressionListContext EnhancedForStatementContext EnhancedForStatementNoShortIfContext BreakStatementContext ContinueStatementContext ReturnStatementContext ThrowStatementContext SynchronizedStatementContext TryStatementContext CatchesContext CatchClauseContext CatchFormalParameterContext CatchTypeContext Finally_Context TryWithResourcesStatementContext ResourceSpecificationContext ResourceListContext ResourceContext VariableAccessContext PrimaryContext PrimaryNoNewArrayContext PrimaryNoNewArray_lf_arrayAccessContext PrimaryNoNewArray_lfno_arrayAccessContext PrimaryNoNewArray_lf_primaryContext PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext PrimaryNoNewArray_lfno_primaryContext PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ClassLiteralContext ClassInstanceCreationExpressionContext ClassInstanceCreationExpression_lf_primaryContext ClassInstanceCreationExpression_lfno_primaryContext TypeArgumentsOrDiamondContext FieldAccessContext FieldAccess_lf_primaryContext FieldAccess_lfno_primaryContext ArrayAccessContext ArrayAccess_lf_primaryContext ArrayAccess_lfno_primaryContext MethodInvocationContext MethodInvocation_lf_primaryContext MethodInvocation_lfno_primaryContext ArgumentListContext MethodReferenceContext MethodReference_lf_primaryContext MethodReference_lfno_primaryContext ArrayCreationExpressionContext DimExprsContext DimExprContext ConstantExpressionContext ExpressionContext LambdaExpressionContext LambdaParametersContext InferredFormalParameterListContext LambdaBodyContext AssignmentExpressionContext AssignmentContext LeftHandSideContext AssignmentOperatorContext ConditionalExpressionContext ConditionalOrExpressionContext ConditionalAndExpressionContext InclusiveOrExpressionContext ExclusiveOrExpressionContext AndExpressionContext EqualityExpressionContext RelationalExpressionContext ShiftExpressionContext AdditiveExpressionContext MultiplicativeExpressionContext UnaryExpressionContext PreIncrementExpressionContext PreDecrementExpressionContext UnaryExpressionNotPlusMinusContext PostfixExpressionContext PostIncrementExpressionContext PostIncrementExpression_lf_postfixExpressionContext PostDecrementExpressionContext PostDecrementExpression_lf_postfixExpressionContext CastExpressionContext IdentifierContext ";
    StringBuilder sb = new StringBuilder();


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

    public void enterRule(Class<?> cl) {
        currentRule = cl;
        ruleStack.push(currentRule);
        if (STYLE.shouldBeNewLineBeforeRule(currentRule)) writeToOutput(newIndentedLine());
        tempPrint(currentRule.getSimpleName());
    }

    public void exitRule() {
        previousRule = ruleStack.pop();
        tempPrint(previousRule.getSimpleName());
        if (STYLE.shouldBeNewLineAfterRule(previousRule)) writeToOutput(newIndentedLine());
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
        String currentToken = node.getText();

        STYLE.manageIndentation(previousToken, currentToken);
        if (STYLE.shouldBeNewLineAfterToken(previousToken)) writeToOutput(newIndentedLine());
        if (!isOnNewLine) writeToOutput(STYLE.insertSpace(previousRule, currentRule, previousToken, currentToken));

        writeToOutput(currentToken);
        isOnNewLine = false;

        STYLE.checkForSpecialCase(previousToken, currentToken);

        previousToken = currentToken;
    }

    private String newIndentedLine() {
        if (STYLE.override_noNewLine()) return "";
        isOnNewLine = true;
        return STYLE.getNewIndentedLine();
    }




    private void tempPrint(String cl) {
        if (temp.contains(cl)) sb.append(Ansi.RED).append(";").append(cl).append("-")
                .append(STYLE.TEMP_getIndentLevel()).append(";");
    }

}
