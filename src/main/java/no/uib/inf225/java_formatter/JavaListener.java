package no.uib.inf225.java_formatter;

import no.uib.inf225.java_formatter.Java9Parser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaListener extends Java9BaseListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaListener.class);


    @Override
    public void enterLiteral(LiteralContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLiteral(ctx);
    }

    @Override
    public void exitLiteral(LiteralContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLiteral(ctx);
    }

    @Override
    public void enterPrimitiveType(PrimitiveTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimitiveType(ctx);
    }

    @Override
    public void exitPrimitiveType(PrimitiveTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimitiveType(ctx);
    }

    @Override
    public void enterNumericType(NumericTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterNumericType(ctx);
    }

    @Override
    public void exitNumericType(NumericTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitNumericType(ctx);
    }

    @Override
    public void enterIntegralType(IntegralTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterIntegralType(ctx);
    }

    @Override
    public void exitIntegralType(IntegralTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitIntegralType(ctx);
    }

    @Override
    public void enterFloatingPointType(FloatingPointTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFloatingPointType(ctx);
    }

    @Override
    public void exitFloatingPointType(FloatingPointTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFloatingPointType(ctx);
    }

    @Override
    public void enterReferenceType(ReferenceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterReferenceType(ctx);
    }

    @Override
    public void exitReferenceType(ReferenceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitReferenceType(ctx);
    }

    @Override
    public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassOrInterfaceType(ctx);
    }

    @Override
    public void exitClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassOrInterfaceType(ctx);
    }

    @Override
    public void enterClassType(ClassTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassType(ctx);
    }

    @Override
    public void exitClassType(ClassTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassType(ctx);
    }

    @Override
    public void enterClassType_lf_classOrInterfaceType(ClassType_lf_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassType_lf_classOrInterfaceType(ctx);
    }

    @Override
    public void exitClassType_lf_classOrInterfaceType(ClassType_lf_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassType_lf_classOrInterfaceType(ctx);
    }

    @Override
    public void enterClassType_lfno_classOrInterfaceType(ClassType_lfno_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassType_lfno_classOrInterfaceType(ctx);
    }

    @Override
    public void exitClassType_lfno_classOrInterfaceType(ClassType_lfno_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassType_lfno_classOrInterfaceType(ctx);
    }

    @Override
    public void enterInterfaceType(InterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceType(ctx);
    }

    @Override
    public void exitInterfaceType(InterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceType(ctx);
    }

    @Override
    public void enterInterfaceType_lf_classOrInterfaceType(InterfaceType_lf_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceType_lf_classOrInterfaceType(ctx);
    }

    @Override
    public void exitInterfaceType_lf_classOrInterfaceType(InterfaceType_lf_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceType_lf_classOrInterfaceType(ctx);
    }

    @Override
    public void enterInterfaceType_lfno_classOrInterfaceType(InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceType_lfno_classOrInterfaceType(ctx);
    }

    @Override
    public void exitInterfaceType_lfno_classOrInterfaceType(InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceType_lfno_classOrInterfaceType(ctx);
    }

    @Override
    public void enterTypeVariable(TypeVariableContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeVariable(ctx);
    }

    @Override
    public void exitTypeVariable(TypeVariableContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeVariable(ctx);
    }

    @Override
    public void enterArrayType(ArrayTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterArrayType(ctx);
    }

    @Override
    public void exitArrayType(ArrayTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitArrayType(ctx);
    }

    @Override
    public void enterDims(DimsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterDims(ctx);
    }

    @Override
    public void exitDims(DimsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitDims(ctx);
    }

    @Override
    public void enterTypeParameter(TypeParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeParameter(ctx);
    }

    @Override
    public void exitTypeParameter(TypeParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeParameter(ctx);
    }

    @Override
    public void enterTypeParameterModifier(TypeParameterModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeParameterModifier(ctx);
    }

    @Override
    public void exitTypeParameterModifier(TypeParameterModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeParameterModifier(ctx);
    }

    @Override
    public void enterTypeBound(TypeBoundContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeBound(ctx);
    }

    @Override
    public void exitTypeBound(TypeBoundContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeBound(ctx);
    }

    @Override
    public void enterAdditionalBound(AdditionalBoundContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAdditionalBound(ctx);
    }

    @Override
    public void exitAdditionalBound(AdditionalBoundContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAdditionalBound(ctx);
    }

    @Override
    public void enterTypeArguments(TypeArgumentsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeArguments(ctx);
    }

    @Override
    public void exitTypeArguments(TypeArgumentsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeArguments(ctx);
    }

    @Override
    public void enterTypeArgumentList(TypeArgumentListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeArgumentList(ctx);
    }

    @Override
    public void exitTypeArgumentList(TypeArgumentListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeArgumentList(ctx);
    }

    @Override
    public void enterTypeArgument(TypeArgumentContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeArgument(ctx);
    }

    @Override
    public void exitTypeArgument(TypeArgumentContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeArgument(ctx);
    }

    @Override
    public void enterWildcard(WildcardContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterWildcard(ctx);
    }

    @Override
    public void exitWildcard(WildcardContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitWildcard(ctx);
    }

    @Override
    public void enterWildcardBounds(WildcardBoundsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterWildcardBounds(ctx);
    }

    @Override
    public void exitWildcardBounds(WildcardBoundsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitWildcardBounds(ctx);
    }

    @Override
    public void enterModuleName(ModuleNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterModuleName(ctx);
    }

    @Override
    public void exitModuleName(ModuleNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitModuleName(ctx);
    }

    @Override
    public void enterPackageName(PackageNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPackageName(ctx);
    }

    @Override
    public void exitPackageName(PackageNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPackageName(ctx);
    }

    @Override
    public void enterTypeName(TypeNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeName(ctx);
    }

    @Override
    public void exitTypeName(TypeNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeName(ctx);
    }

    @Override
    public void enterPackageOrTypeName(PackageOrTypeNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPackageOrTypeName(ctx);
    }

    @Override
    public void exitPackageOrTypeName(PackageOrTypeNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPackageOrTypeName(ctx);
    }

    @Override
    public void enterExpressionName(ExpressionNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterExpressionName(ctx);
    }

    @Override
    public void exitExpressionName(ExpressionNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitExpressionName(ctx);
    }

    @Override
    public void enterMethodName(MethodNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodName(ctx);
    }

    @Override
    public void exitMethodName(MethodNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodName(ctx);
    }

    @Override
    public void enterAmbiguousName(AmbiguousNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAmbiguousName(ctx);
    }

    @Override
    public void exitAmbiguousName(AmbiguousNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAmbiguousName(ctx);
    }

    @Override
    public void enterCompilationUnit(CompilationUnitContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterCompilationUnit(ctx);
    }

    @Override
    public void exitCompilationUnit(CompilationUnitContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitCompilationUnit(ctx);
    }

    @Override
    public void enterOrdinaryCompilation(OrdinaryCompilationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterOrdinaryCompilation(ctx);
    }

    @Override
    public void exitOrdinaryCompilation(OrdinaryCompilationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitOrdinaryCompilation(ctx);
    }

    @Override
    public void enterModularCompilation(ModularCompilationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterModularCompilation(ctx);
    }

    @Override
    public void exitModularCompilation(ModularCompilationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitModularCompilation(ctx);
    }

    @Override
    public void enterPackageDeclaration(PackageDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPackageDeclaration(ctx);
    }

    @Override
    public void exitPackageDeclaration(PackageDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPackageDeclaration(ctx);
    }

    @Override
    public void enterPackageModifier(PackageModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPackageModifier(ctx);
    }

    @Override
    public void exitPackageModifier(PackageModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPackageModifier(ctx);
    }

    @Override
    public void enterImportDeclaration(ImportDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterImportDeclaration(ctx);
    }

    @Override
    public void exitImportDeclaration(ImportDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitImportDeclaration(ctx);
    }

    @Override
    public void enterSingleTypeImportDeclaration(SingleTypeImportDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSingleTypeImportDeclaration(ctx);
    }

    @Override
    public void exitSingleTypeImportDeclaration(SingleTypeImportDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSingleTypeImportDeclaration(ctx);
    }

    @Override
    public void enterTypeImportOnDemandDeclaration(TypeImportOnDemandDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeImportOnDemandDeclaration(ctx);
    }

    @Override
    public void exitTypeImportOnDemandDeclaration(TypeImportOnDemandDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeImportOnDemandDeclaration(ctx);
    }

    @Override
    public void enterSingleStaticImportDeclaration(SingleStaticImportDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSingleStaticImportDeclaration(ctx);
    }

    @Override
    public void exitSingleStaticImportDeclaration(SingleStaticImportDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSingleStaticImportDeclaration(ctx);
    }

    @Override
    public void enterStaticImportOnDemandDeclaration(StaticImportOnDemandDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterStaticImportOnDemandDeclaration(ctx);
    }

    @Override
    public void exitStaticImportOnDemandDeclaration(StaticImportOnDemandDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitStaticImportOnDemandDeclaration(ctx);
    }

    @Override
    public void enterTypeDeclaration(TypeDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeDeclaration(ctx);
    }

    @Override
    public void exitTypeDeclaration(TypeDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeDeclaration(ctx);
    }

    @Override
    public void enterModuleDeclaration(ModuleDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterModuleDeclaration(ctx);
    }

    @Override
    public void exitModuleDeclaration(ModuleDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitModuleDeclaration(ctx);
    }

    @Override
    public void enterModuleDirective(ModuleDirectiveContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterModuleDirective(ctx);
    }

    @Override
    public void exitModuleDirective(ModuleDirectiveContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitModuleDirective(ctx);
    }

    @Override
    public void enterRequiresModifier(RequiresModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterRequiresModifier(ctx);
    }

    @Override
    public void exitRequiresModifier(RequiresModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitRequiresModifier(ctx);
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassDeclaration(ctx);
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassDeclaration(ctx);
    }

    @Override
    public void enterNormalClassDeclaration(NormalClassDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterNormalClassDeclaration(ctx);
    }

    @Override
    public void exitNormalClassDeclaration(NormalClassDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitNormalClassDeclaration(ctx);
    }

    @Override
    public void enterClassModifier(ClassModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassModifier(ctx);
    }

    @Override
    public void exitClassModifier(ClassModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassModifier(ctx);
    }

    @Override
    public void enterTypeParameters(TypeParametersContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeParameters(ctx);
    }

    @Override
    public void exitTypeParameters(TypeParametersContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeParameters(ctx);
    }

    @Override
    public void enterTypeParameterList(TypeParameterListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeParameterList(ctx);
    }

    @Override
    public void exitTypeParameterList(TypeParameterListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeParameterList(ctx);
    }

    @Override
    public void enterSuperclass(SuperclassContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSuperclass(ctx);
    }

    @Override
    public void exitSuperclass(SuperclassContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSuperclass(ctx);
    }

    @Override
    public void enterSuperinterfaces(SuperinterfacesContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSuperinterfaces(ctx);
    }

    @Override
    public void exitSuperinterfaces(SuperinterfacesContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSuperinterfaces(ctx);
    }

    @Override
    public void enterInterfaceTypeList(InterfaceTypeListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceTypeList(ctx);
    }

    @Override
    public void exitInterfaceTypeList(InterfaceTypeListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceTypeList(ctx);
    }

    @Override
    public void enterClassBody(ClassBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassBody(ctx);
    }

    @Override
    public void exitClassBody(ClassBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassBody(ctx);
    }

    @Override
    public void enterClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassBodyDeclaration(ctx);
    }

    @Override
    public void exitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassBodyDeclaration(ctx);
    }

    @Override
    public void enterClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassMemberDeclaration(ctx);
    }

    @Override
    public void exitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassMemberDeclaration(ctx);
    }

    @Override
    public void enterFieldDeclaration(FieldDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFieldDeclaration(ctx);
    }

    @Override
    public void exitFieldDeclaration(FieldDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFieldDeclaration(ctx);
    }

    @Override
    public void enterFieldModifier(FieldModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFieldModifier(ctx);
    }

    @Override
    public void exitFieldModifier(FieldModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFieldModifier(ctx);
    }

    @Override
    public void enterVariableDeclaratorList(VariableDeclaratorListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterVariableDeclaratorList(ctx);
    }

    @Override
    public void exitVariableDeclaratorList(VariableDeclaratorListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitVariableDeclaratorList(ctx);
    }

    @Override
    public void enterVariableDeclarator(VariableDeclaratorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterVariableDeclarator(ctx);
    }

    @Override
    public void exitVariableDeclarator(VariableDeclaratorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitVariableDeclarator(ctx);
    }

    @Override
    public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterVariableDeclaratorId(ctx);
    }

    @Override
    public void exitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitVariableDeclaratorId(ctx);
    }

    @Override
    public void enterVariableInitializer(VariableInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterVariableInitializer(ctx);
    }

    @Override
    public void exitVariableInitializer(VariableInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitVariableInitializer(ctx);
    }

    @Override
    public void enterUnannType(UnannTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannType(ctx);
    }

    @Override
    public void exitUnannType(UnannTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannType(ctx);
    }

    @Override
    public void enterUnannPrimitiveType(UnannPrimitiveTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannPrimitiveType(ctx);
    }

    @Override
    public void exitUnannPrimitiveType(UnannPrimitiveTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannPrimitiveType(ctx);
    }

    @Override
    public void enterUnannReferenceType(UnannReferenceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannReferenceType(ctx);
    }

    @Override
    public void exitUnannReferenceType(UnannReferenceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannReferenceType(ctx);
    }

    @Override
    public void enterUnannClassOrInterfaceType(UnannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannClassOrInterfaceType(ctx);
    }

    @Override
    public void exitUnannClassOrInterfaceType(UnannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannClassOrInterfaceType(ctx);
    }

    @Override
    public void enterUnannClassType(UnannClassTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannClassType(ctx);
    }

    @Override
    public void exitUnannClassType(UnannClassTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannClassType(ctx);
    }

    @Override
    public void enterUnannClassType_lf_unannClassOrInterfaceType(UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannClassType_lf_unannClassOrInterfaceType(ctx);
    }

    @Override
    public void exitUnannClassType_lf_unannClassOrInterfaceType(UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannClassType_lf_unannClassOrInterfaceType(ctx);
    }

    @Override
    public void enterUnannClassType_lfno_unannClassOrInterfaceType(UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannClassType_lfno_unannClassOrInterfaceType(ctx);
    }

    @Override
    public void exitUnannClassType_lfno_unannClassOrInterfaceType(UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannClassType_lfno_unannClassOrInterfaceType(ctx);
    }

    @Override
    public void enterUnannInterfaceType(UnannInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannInterfaceType(ctx);
    }

    @Override
    public void exitUnannInterfaceType(UnannInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannInterfaceType(ctx);
    }

    @Override
    public void enterUnannInterfaceType_lf_unannClassOrInterfaceType(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannInterfaceType_lf_unannClassOrInterfaceType(ctx);
    }

    @Override
    public void exitUnannInterfaceType_lf_unannClassOrInterfaceType(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannInterfaceType_lf_unannClassOrInterfaceType(ctx);
    }

    @Override
    public void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannInterfaceType_lfno_unannClassOrInterfaceType(ctx);
    }

    @Override
    public void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannInterfaceType_lfno_unannClassOrInterfaceType(ctx);
    }

    @Override
    public void enterUnannTypeVariable(UnannTypeVariableContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannTypeVariable(ctx);
    }

    @Override
    public void exitUnannTypeVariable(UnannTypeVariableContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannTypeVariable(ctx);
    }

    @Override
    public void enterUnannArrayType(UnannArrayTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnannArrayType(ctx);
    }

    @Override
    public void exitUnannArrayType(UnannArrayTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnannArrayType(ctx);
    }

    @Override
    public void enterMethodDeclaration(MethodDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        (new UppercaseMethodListener()).enterMethodDeclaration(ctx);
        //super.enterMethodDeclaration(ctx);
    }

    @Override
    public void exitMethodDeclaration(MethodDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodDeclaration(ctx);
    }

    @Override
    public void enterMethodModifier(MethodModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodModifier(ctx);
    }

    @Override
    public void exitMethodModifier(MethodModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodModifier(ctx);
    }

    @Override
    public void enterMethodHeader(MethodHeaderContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodHeader(ctx);
    }

    @Override
    public void exitMethodHeader(MethodHeaderContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodHeader(ctx);
    }

    @Override
    public void enterResult(ResultContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterResult(ctx);
    }

    @Override
    public void exitResult(ResultContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitResult(ctx);
    }

    @Override
    public void enterMethodDeclarator(MethodDeclaratorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodDeclarator(ctx);
    }

    @Override
    public void exitMethodDeclarator(MethodDeclaratorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodDeclarator(ctx);
    }

    @Override
    public void enterFormalParameterList(FormalParameterListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFormalParameterList(ctx);
    }

    @Override
    public void exitFormalParameterList(FormalParameterListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFormalParameterList(ctx);
    }

    @Override
    public void enterFormalParameters(FormalParametersContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFormalParameters(ctx);
    }

    @Override
    public void exitFormalParameters(FormalParametersContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFormalParameters(ctx);
    }

    @Override
    public void enterFormalParameter(FormalParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFormalParameter(ctx);
    }

    @Override
    public void exitFormalParameter(FormalParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFormalParameter(ctx);
    }

    @Override
    public void enterVariableModifier(VariableModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterVariableModifier(ctx);
    }

    @Override
    public void exitVariableModifier(VariableModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitVariableModifier(ctx);
    }

    @Override
    public void enterLastFormalParameter(LastFormalParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLastFormalParameter(ctx);
    }

    @Override
    public void exitLastFormalParameter(LastFormalParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLastFormalParameter(ctx);
    }

    @Override
    public void enterReceiverParameter(ReceiverParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterReceiverParameter(ctx);
    }

    @Override
    public void exitReceiverParameter(ReceiverParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitReceiverParameter(ctx);
    }

    @Override
    public void enterThrows_(Throws_Context ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterThrows_(ctx);
    }

    @Override
    public void exitThrows_(Throws_Context ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitThrows_(ctx);
    }

    @Override
    public void enterExceptionTypeList(ExceptionTypeListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterExceptionTypeList(ctx);
    }

    @Override
    public void exitExceptionTypeList(ExceptionTypeListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitExceptionTypeList(ctx);
    }

    @Override
    public void enterExceptionType(ExceptionTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterExceptionType(ctx);
    }

    @Override
    public void exitExceptionType(ExceptionTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitExceptionType(ctx);
    }

    @Override
    public void enterMethodBody(MethodBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodBody(ctx);
    }

    @Override
    public void exitMethodBody(MethodBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodBody(ctx);
    }

    @Override
    public void enterInstanceInitializer(InstanceInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInstanceInitializer(ctx);
    }

    @Override
    public void exitInstanceInitializer(InstanceInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInstanceInitializer(ctx);
    }

    @Override
    public void enterStaticInitializer(StaticInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterStaticInitializer(ctx);
    }

    @Override
    public void exitStaticInitializer(StaticInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitStaticInitializer(ctx);
    }

    @Override
    public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConstructorDeclaration(ctx);
    }

    @Override
    public void exitConstructorDeclaration(ConstructorDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConstructorDeclaration(ctx);
    }

    @Override
    public void enterConstructorModifier(ConstructorModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConstructorModifier(ctx);
    }

    @Override
    public void exitConstructorModifier(ConstructorModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConstructorModifier(ctx);
    }

    @Override
    public void enterConstructorDeclarator(ConstructorDeclaratorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConstructorDeclarator(ctx);
    }

    @Override
    public void exitConstructorDeclarator(ConstructorDeclaratorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConstructorDeclarator(ctx);
    }

    @Override
    public void enterSimpleTypeName(SimpleTypeNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSimpleTypeName(ctx);
    }

    @Override
    public void exitSimpleTypeName(SimpleTypeNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSimpleTypeName(ctx);
    }

    @Override
    public void enterConstructorBody(ConstructorBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConstructorBody(ctx);
    }

    @Override
    public void exitConstructorBody(ConstructorBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConstructorBody(ctx);
    }

    @Override
    public void enterExplicitConstructorInvocation(ExplicitConstructorInvocationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterExplicitConstructorInvocation(ctx);
    }

    @Override
    public void exitExplicitConstructorInvocation(ExplicitConstructorInvocationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitExplicitConstructorInvocation(ctx);
    }

    @Override
    public void enterEnumDeclaration(EnumDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEnumDeclaration(ctx);
    }

    @Override
    public void exitEnumDeclaration(EnumDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEnumDeclaration(ctx);
    }

    @Override
    public void enterEnumBody(EnumBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEnumBody(ctx);
    }

    @Override
    public void exitEnumBody(EnumBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEnumBody(ctx);
    }

    @Override
    public void enterEnumConstantList(EnumConstantListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEnumConstantList(ctx);
    }

    @Override
    public void exitEnumConstantList(EnumConstantListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEnumConstantList(ctx);
    }

    @Override
    public void enterEnumConstant(EnumConstantContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEnumConstant(ctx);
    }

    @Override
    public void exitEnumConstant(EnumConstantContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEnumConstant(ctx);
    }

    @Override
    public void enterEnumConstantModifier(EnumConstantModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEnumConstantModifier(ctx);
    }

    @Override
    public void exitEnumConstantModifier(EnumConstantModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEnumConstantModifier(ctx);
    }

    @Override
    public void enterEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEnumBodyDeclarations(ctx);
    }

    @Override
    public void exitEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEnumBodyDeclarations(ctx);
    }

    @Override
    public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceDeclaration(ctx);
    }

    @Override
    public void exitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceDeclaration(ctx);
    }

    @Override
    public void enterNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterNormalInterfaceDeclaration(ctx);
    }

    @Override
    public void exitNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitNormalInterfaceDeclaration(ctx);
    }

    @Override
    public void enterInterfaceModifier(InterfaceModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceModifier(ctx);
    }

    @Override
    public void exitInterfaceModifier(InterfaceModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceModifier(ctx);
    }

    @Override
    public void enterExtendsInterfaces(ExtendsInterfacesContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterExtendsInterfaces(ctx);
    }

    @Override
    public void exitExtendsInterfaces(ExtendsInterfacesContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitExtendsInterfaces(ctx);
    }

    @Override
    public void enterInterfaceBody(InterfaceBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceBody(ctx);
    }

    @Override
    public void exitInterfaceBody(InterfaceBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceBody(ctx);
    }

    @Override
    public void enterInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceMemberDeclaration(ctx);
    }

    @Override
    public void exitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceMemberDeclaration(ctx);
    }

    @Override
    public void enterConstantDeclaration(ConstantDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConstantDeclaration(ctx);
    }

    @Override
    public void exitConstantDeclaration(ConstantDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConstantDeclaration(ctx);
    }

    @Override
    public void enterConstantModifier(ConstantModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConstantModifier(ctx);
    }

    @Override
    public void exitConstantModifier(ConstantModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConstantModifier(ctx);
    }

    @Override
    public void enterInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void exitInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void enterInterfaceMethodModifier(InterfaceMethodModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInterfaceMethodModifier(ctx);
    }

    @Override
    public void exitInterfaceMethodModifier(InterfaceMethodModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInterfaceMethodModifier(ctx);
    }

    @Override
    public void enterAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAnnotationTypeDeclaration(ctx);
    }

    @Override
    public void exitAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAnnotationTypeDeclaration(ctx);
    }

    @Override
    public void enterAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAnnotationTypeBody(ctx);
    }

    @Override
    public void exitAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAnnotationTypeBody(ctx);
    }

    @Override
    public void enterAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAnnotationTypeMemberDeclaration(ctx);
    }

    @Override
    public void exitAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAnnotationTypeMemberDeclaration(ctx);
    }

    @Override
    public void enterAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public void exitAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public void enterAnnotationTypeElementModifier(AnnotationTypeElementModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAnnotationTypeElementModifier(ctx);
    }

    @Override
    public void exitAnnotationTypeElementModifier(AnnotationTypeElementModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAnnotationTypeElementModifier(ctx);
    }

    @Override
    public void enterDefaultValue(DefaultValueContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterDefaultValue(ctx);
    }

    @Override
    public void exitDefaultValue(DefaultValueContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitDefaultValue(ctx);
    }

    @Override
    public void enterAnnotation(AnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAnnotation(ctx);
    }

    @Override
    public void exitAnnotation(AnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAnnotation(ctx);
    }

    @Override
    public void enterNormalAnnotation(NormalAnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterNormalAnnotation(ctx);
    }

    @Override
    public void exitNormalAnnotation(NormalAnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitNormalAnnotation(ctx);
    }

    @Override
    public void enterElementValuePairList(ElementValuePairListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterElementValuePairList(ctx);
    }

    @Override
    public void exitElementValuePairList(ElementValuePairListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitElementValuePairList(ctx);
    }

    @Override
    public void enterElementValuePair(ElementValuePairContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterElementValuePair(ctx);
    }

    @Override
    public void exitElementValuePair(ElementValuePairContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitElementValuePair(ctx);
    }

    @Override
    public void enterElementValue(ElementValueContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterElementValue(ctx);
    }

    @Override
    public void exitElementValue(ElementValueContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitElementValue(ctx);
    }

    @Override
    public void enterElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterElementValueArrayInitializer(ctx);
    }

    @Override
    public void exitElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitElementValueArrayInitializer(ctx);
    }

    @Override
    public void enterElementValueList(ElementValueListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterElementValueList(ctx);
    }

    @Override
    public void exitElementValueList(ElementValueListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitElementValueList(ctx);
    }

    @Override
    public void enterMarkerAnnotation(MarkerAnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMarkerAnnotation(ctx);
    }

    @Override
    public void exitMarkerAnnotation(MarkerAnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMarkerAnnotation(ctx);
    }

    @Override
    public void enterSingleElementAnnotation(SingleElementAnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSingleElementAnnotation(ctx);
    }

    @Override
    public void exitSingleElementAnnotation(SingleElementAnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSingleElementAnnotation(ctx);
    }

    @Override
    public void enterArrayInitializer(ArrayInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterArrayInitializer(ctx);
    }

    @Override
    public void exitArrayInitializer(ArrayInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitArrayInitializer(ctx);
    }

    @Override
    public void enterVariableInitializerList(VariableInitializerListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterVariableInitializerList(ctx);
    }

    @Override
    public void exitVariableInitializerList(VariableInitializerListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitVariableInitializerList(ctx);
    }

    @Override
    public void enterBlock(BlockContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(BlockContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitBlock(ctx);
    }

    @Override
    public void enterBlockStatements(BlockStatementsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterBlockStatements(ctx);
    }

    @Override
    public void exitBlockStatements(BlockStatementsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitBlockStatements(ctx);
    }

    @Override
    public void enterBlockStatement(BlockStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterBlockStatement(ctx);
    }

    @Override
    public void exitBlockStatement(BlockStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitBlockStatement(ctx);
    }

    @Override
    public void enterLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLocalVariableDeclarationStatement(ctx);
    }

    @Override
    public void exitLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLocalVariableDeclarationStatement(ctx);
    }

    @Override
    public void enterLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLocalVariableDeclaration(ctx);
    }

    @Override
    public void exitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLocalVariableDeclaration(ctx);
    }

    @Override
    public void enterStatement(StatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(StatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitStatement(ctx);
    }

    @Override
    public void enterStatementNoShortIf(StatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterStatementNoShortIf(ctx);
    }

    @Override
    public void exitStatementNoShortIf(StatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitStatementNoShortIf(ctx);
    }

    @Override
    public void enterStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterStatementWithoutTrailingSubstatement(ctx);
    }

    @Override
    public void exitStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitStatementWithoutTrailingSubstatement(ctx);
    }

    @Override
    public void enterEmptyStatement(EmptyStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEmptyStatement(ctx);
    }

    @Override
    public void exitEmptyStatement(EmptyStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEmptyStatement(ctx);
    }

    @Override
    public void enterLabeledStatement(LabeledStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLabeledStatement(ctx);
    }

    @Override
    public void exitLabeledStatement(LabeledStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLabeledStatement(ctx);
    }

    @Override
    public void enterLabeledStatementNoShortIf(LabeledStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLabeledStatementNoShortIf(ctx);
    }

    @Override
    public void exitLabeledStatementNoShortIf(LabeledStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLabeledStatementNoShortIf(ctx);
    }

    @Override
    public void enterExpressionStatement(ExpressionStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterExpressionStatement(ctx);
    }

    @Override
    public void exitExpressionStatement(ExpressionStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitExpressionStatement(ctx);
    }

    @Override
    public void enterStatementExpression(StatementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterStatementExpression(ctx);
    }

    @Override
    public void exitStatementExpression(StatementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitStatementExpression(ctx);
    }

    @Override
    public void enterIfThenStatement(IfThenStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterIfThenStatement(ctx);
    }

    @Override
    public void exitIfThenStatement(IfThenStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitIfThenStatement(ctx);
    }

    @Override
    public void enterIfThenElseStatement(IfThenElseStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterIfThenElseStatement(ctx);
    }

    @Override
    public void exitIfThenElseStatement(IfThenElseStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitIfThenElseStatement(ctx);
    }

    @Override
    public void enterIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterIfThenElseStatementNoShortIf(ctx);
    }

    @Override
    public void exitIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitIfThenElseStatementNoShortIf(ctx);
    }

    @Override
    public void enterAssertStatement(AssertStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAssertStatement(ctx);
    }

    @Override
    public void exitAssertStatement(AssertStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAssertStatement(ctx);
    }

    @Override
    public void enterSwitchStatement(SwitchStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSwitchStatement(ctx);
    }

    @Override
    public void exitSwitchStatement(SwitchStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSwitchStatement(ctx);
    }

    @Override
    public void enterSwitchBlock(SwitchBlockContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSwitchBlock(ctx);
    }

    @Override
    public void exitSwitchBlock(SwitchBlockContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSwitchBlock(ctx);
    }

    @Override
    public void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSwitchBlockStatementGroup(ctx);
    }

    @Override
    public void exitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public void enterSwitchLabels(SwitchLabelsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSwitchLabels(ctx);
    }

    @Override
    public void exitSwitchLabels(SwitchLabelsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSwitchLabels(ctx);
    }

    @Override
    public void enterSwitchLabel(SwitchLabelContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSwitchLabel(ctx);
    }

    @Override
    public void exitSwitchLabel(SwitchLabelContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSwitchLabel(ctx);
    }

    @Override
    public void enterEnumConstantName(EnumConstantNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEnumConstantName(ctx);
    }

    @Override
    public void exitEnumConstantName(EnumConstantNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEnumConstantName(ctx);
    }

    @Override
    public void enterWhileStatement(WhileStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterWhileStatement(ctx);
    }

    @Override
    public void exitWhileStatement(WhileStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitWhileStatement(ctx);
    }

    @Override
    public void enterWhileStatementNoShortIf(WhileStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterWhileStatementNoShortIf(ctx);
    }

    @Override
    public void exitWhileStatementNoShortIf(WhileStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitWhileStatementNoShortIf(ctx);
    }

    @Override
    public void enterDoStatement(DoStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterDoStatement(ctx);
    }

    @Override
    public void exitDoStatement(DoStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitDoStatement(ctx);
    }

    @Override
    public void enterForStatement(ForStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterForStatement(ctx);
    }

    @Override
    public void exitForStatement(ForStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitForStatement(ctx);
    }

    @Override
    public void enterForStatementNoShortIf(ForStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterForStatementNoShortIf(ctx);
    }

    @Override
    public void exitForStatementNoShortIf(ForStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitForStatementNoShortIf(ctx);
    }

    @Override
    public void enterBasicForStatement(BasicForStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterBasicForStatement(ctx);
    }

    @Override
    public void exitBasicForStatement(BasicForStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitBasicForStatement(ctx);
    }

    @Override
    public void enterBasicForStatementNoShortIf(BasicForStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterBasicForStatementNoShortIf(ctx);
    }

    @Override
    public void exitBasicForStatementNoShortIf(BasicForStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitBasicForStatementNoShortIf(ctx);
    }

    @Override
    public void enterForInit(ForInitContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterForInit(ctx);
    }

    @Override
    public void exitForInit(ForInitContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitForInit(ctx);
    }

    @Override
    public void enterForUpdate(ForUpdateContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterForUpdate(ctx);
    }

    @Override
    public void exitForUpdate(ForUpdateContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitForUpdate(ctx);
    }

    @Override
    public void enterStatementExpressionList(StatementExpressionListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterStatementExpressionList(ctx);
    }

    @Override
    public void exitStatementExpressionList(StatementExpressionListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitStatementExpressionList(ctx);
    }

    @Override
    public void enterEnhancedForStatement(EnhancedForStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEnhancedForStatement(ctx);
    }

    @Override
    public void exitEnhancedForStatement(EnhancedForStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEnhancedForStatement(ctx);
    }

    @Override
    public void enterEnhancedForStatementNoShortIf(EnhancedForStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEnhancedForStatementNoShortIf(ctx);
    }

    @Override
    public void exitEnhancedForStatementNoShortIf(EnhancedForStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEnhancedForStatementNoShortIf(ctx);
    }

    @Override
    public void enterBreakStatement(BreakStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterBreakStatement(ctx);
    }

    @Override
    public void exitBreakStatement(BreakStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitBreakStatement(ctx);
    }

    @Override
    public void enterContinueStatement(ContinueStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterContinueStatement(ctx);
    }

    @Override
    public void exitContinueStatement(ContinueStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitContinueStatement(ctx);
    }

    @Override
    public void enterReturnStatement(ReturnStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterReturnStatement(ctx);
    }

    @Override
    public void exitReturnStatement(ReturnStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitReturnStatement(ctx);
    }

    @Override
    public void enterThrowStatement(ThrowStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterThrowStatement(ctx);
    }

    @Override
    public void exitThrowStatement(ThrowStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitThrowStatement(ctx);
    }

    @Override
    public void enterSynchronizedStatement(SynchronizedStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterSynchronizedStatement(ctx);
    }

    @Override
    public void exitSynchronizedStatement(SynchronizedStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitSynchronizedStatement(ctx);
    }

    @Override
    public void enterTryStatement(TryStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTryStatement(ctx);
    }

    @Override
    public void exitTryStatement(TryStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTryStatement(ctx);
    }

    @Override
    public void enterCatches(CatchesContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterCatches(ctx);
    }

    @Override
    public void exitCatches(CatchesContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitCatches(ctx);
    }

    @Override
    public void enterCatchClause(CatchClauseContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterCatchClause(ctx);
    }

    @Override
    public void exitCatchClause(CatchClauseContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitCatchClause(ctx);
    }

    @Override
    public void enterCatchFormalParameter(CatchFormalParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterCatchFormalParameter(ctx);
    }

    @Override
    public void exitCatchFormalParameter(CatchFormalParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitCatchFormalParameter(ctx);
    }

    @Override
    public void enterCatchType(CatchTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterCatchType(ctx);
    }

    @Override
    public void exitCatchType(CatchTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitCatchType(ctx);
    }

    @Override
    public void enterFinally_(Finally_Context ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFinally_(ctx);
    }

    @Override
    public void exitFinally_(Finally_Context ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFinally_(ctx);
    }

    @Override
    public void enterTryWithResourcesStatement(TryWithResourcesStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTryWithResourcesStatement(ctx);
    }

    @Override
    public void exitTryWithResourcesStatement(TryWithResourcesStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTryWithResourcesStatement(ctx);
    }

    @Override
    public void enterResourceSpecification(ResourceSpecificationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterResourceSpecification(ctx);
    }

    @Override
    public void exitResourceSpecification(ResourceSpecificationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitResourceSpecification(ctx);
    }

    @Override
    public void enterResourceList(ResourceListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterResourceList(ctx);
    }

    @Override
    public void exitResourceList(ResourceListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitResourceList(ctx);
    }

    @Override
    public void enterResource(ResourceContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterResource(ctx);
    }

    @Override
    public void exitResource(ResourceContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitResource(ctx);
    }

    @Override
    public void enterVariableAccess(VariableAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterVariableAccess(ctx);
    }

    @Override
    public void exitVariableAccess(VariableAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitVariableAccess(ctx);
    }

    @Override
    public void enterPrimary(PrimaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimary(ctx);
    }

    @Override
    public void exitPrimary(PrimaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimary(ctx);
    }

    @Override
    public void enterPrimaryNoNewArray(PrimaryNoNewArrayContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimaryNoNewArray(ctx);
    }

    @Override
    public void exitPrimaryNoNewArray(PrimaryNoNewArrayContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimaryNoNewArray(ctx);
    }

    @Override
    public void enterPrimaryNoNewArray_lf_arrayAccess(PrimaryNoNewArray_lf_arrayAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimaryNoNewArray_lf_arrayAccess(ctx);
    }

    @Override
    public void exitPrimaryNoNewArray_lf_arrayAccess(PrimaryNoNewArray_lf_arrayAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimaryNoNewArray_lf_arrayAccess(ctx);
    }

    @Override
    public void enterPrimaryNoNewArray_lfno_arrayAccess(PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimaryNoNewArray_lfno_arrayAccess(ctx);
    }

    @Override
    public void exitPrimaryNoNewArray_lfno_arrayAccess(PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimaryNoNewArray_lfno_arrayAccess(ctx);
    }

    @Override
    public void enterPrimaryNoNewArray_lf_primary(PrimaryNoNewArray_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimaryNoNewArray_lf_primary(ctx);
    }

    @Override
    public void exitPrimaryNoNewArray_lf_primary(PrimaryNoNewArray_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimaryNoNewArray_lf_primary(ctx);
    }

    @Override
    public void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ctx);
    }

    @Override
    public void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ctx);
    }

    @Override
    public void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ctx);
    }

    @Override
    public void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ctx);
    }

    @Override
    public void enterPrimaryNoNewArray_lfno_primary(PrimaryNoNewArray_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimaryNoNewArray_lfno_primary(ctx);
    }

    @Override
    public void exitPrimaryNoNewArray_lfno_primary(PrimaryNoNewArray_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimaryNoNewArray_lfno_primary(ctx);
    }

    @Override
    public void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ctx);
    }

    @Override
    public void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ctx);
    }

    @Override
    public void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ctx);
    }

    @Override
    public void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ctx);
    }

    @Override
    public void enterClassLiteral(ClassLiteralContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassLiteral(ctx);
    }

    @Override
    public void exitClassLiteral(ClassLiteralContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassLiteral(ctx);
    }

    @Override
    public void enterClassInstanceCreationExpression(ClassInstanceCreationExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassInstanceCreationExpression(ctx);
    }

    @Override
    public void exitClassInstanceCreationExpression(ClassInstanceCreationExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassInstanceCreationExpression(ctx);
    }

    @Override
    public void enterClassInstanceCreationExpression_lf_primary(ClassInstanceCreationExpression_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassInstanceCreationExpression_lf_primary(ctx);
    }

    @Override
    public void exitClassInstanceCreationExpression_lf_primary(ClassInstanceCreationExpression_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassInstanceCreationExpression_lf_primary(ctx);
    }

    @Override
    public void enterClassInstanceCreationExpression_lfno_primary(ClassInstanceCreationExpression_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterClassInstanceCreationExpression_lfno_primary(ctx);
    }

    @Override
    public void exitClassInstanceCreationExpression_lfno_primary(ClassInstanceCreationExpression_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitClassInstanceCreationExpression_lfno_primary(ctx);
    }

    @Override
    public void enterTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void exitTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void enterFieldAccess(FieldAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFieldAccess(ctx);
    }

    @Override
    public void exitFieldAccess(FieldAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFieldAccess(ctx);
    }

    @Override
    public void enterFieldAccess_lf_primary(FieldAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFieldAccess_lf_primary(ctx);
    }

    @Override
    public void exitFieldAccess_lf_primary(FieldAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFieldAccess_lf_primary(ctx);
    }

    @Override
    public void enterFieldAccess_lfno_primary(FieldAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterFieldAccess_lfno_primary(ctx);
    }

    @Override
    public void exitFieldAccess_lfno_primary(FieldAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitFieldAccess_lfno_primary(ctx);
    }

    @Override
    public void enterArrayAccess(ArrayAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterArrayAccess(ctx);
    }

    @Override
    public void exitArrayAccess(ArrayAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitArrayAccess(ctx);
    }

    @Override
    public void enterArrayAccess_lf_primary(ArrayAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterArrayAccess_lf_primary(ctx);
    }

    @Override
    public void exitArrayAccess_lf_primary(ArrayAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitArrayAccess_lf_primary(ctx);
    }

    @Override
    public void enterArrayAccess_lfno_primary(ArrayAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterArrayAccess_lfno_primary(ctx);
    }

    @Override
    public void exitArrayAccess_lfno_primary(ArrayAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitArrayAccess_lfno_primary(ctx);
    }

    @Override
    public void enterMethodInvocation(MethodInvocationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodInvocation(ctx);
    }

    @Override
    public void exitMethodInvocation(MethodInvocationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodInvocation(ctx);
    }

    @Override
    public void enterMethodInvocation_lf_primary(MethodInvocation_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodInvocation_lf_primary(ctx);
    }

    @Override
    public void exitMethodInvocation_lf_primary(MethodInvocation_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodInvocation_lf_primary(ctx);
    }

    @Override
    public void enterMethodInvocation_lfno_primary(MethodInvocation_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodInvocation_lfno_primary(ctx);
    }

    @Override
    public void exitMethodInvocation_lfno_primary(MethodInvocation_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodInvocation_lfno_primary(ctx);
    }

    @Override
    public void enterArgumentList(ArgumentListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterArgumentList(ctx);
    }

    @Override
    public void exitArgumentList(ArgumentListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitArgumentList(ctx);
    }

    @Override
    public void enterMethodReference(MethodReferenceContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodReference(ctx);
    }

    @Override
    public void exitMethodReference(MethodReferenceContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodReference(ctx);
    }

    @Override
    public void enterMethodReference_lf_primary(MethodReference_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodReference_lf_primary(ctx);
    }

    @Override
    public void exitMethodReference_lf_primary(MethodReference_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodReference_lf_primary(ctx);
    }

    @Override
    public void enterMethodReference_lfno_primary(MethodReference_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMethodReference_lfno_primary(ctx);
    }

    @Override
    public void exitMethodReference_lfno_primary(MethodReference_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMethodReference_lfno_primary(ctx);
    }

    @Override
    public void enterArrayCreationExpression(ArrayCreationExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterArrayCreationExpression(ctx);
    }

    @Override
    public void exitArrayCreationExpression(ArrayCreationExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitArrayCreationExpression(ctx);
    }

    @Override
    public void enterDimExprs(DimExprsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterDimExprs(ctx);
    }

    @Override
    public void exitDimExprs(DimExprsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitDimExprs(ctx);
    }

    @Override
    public void enterDimExpr(DimExprContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterDimExpr(ctx);
    }

    @Override
    public void exitDimExpr(DimExprContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitDimExpr(ctx);
    }

    @Override
    public void enterConstantExpression(ConstantExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConstantExpression(ctx);
    }

    @Override
    public void exitConstantExpression(ConstantExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConstantExpression(ctx);
    }

    @Override
    public void enterExpression(ExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(ExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitExpression(ctx);
    }

    @Override
    public void enterLambdaExpression(LambdaExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLambdaExpression(ctx);
    }

    @Override
    public void exitLambdaExpression(LambdaExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLambdaExpression(ctx);
    }

    @Override
    public void enterLambdaParameters(LambdaParametersContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLambdaParameters(ctx);
    }

    @Override
    public void exitLambdaParameters(LambdaParametersContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLambdaParameters(ctx);
    }

    @Override
    public void enterInferredFormalParameterList(InferredFormalParameterListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInferredFormalParameterList(ctx);
    }

    @Override
    public void exitInferredFormalParameterList(InferredFormalParameterListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInferredFormalParameterList(ctx);
    }

    @Override
    public void enterLambdaBody(LambdaBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLambdaBody(ctx);
    }

    @Override
    public void exitLambdaBody(LambdaBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLambdaBody(ctx);
    }

    @Override
    public void enterAssignmentExpression(AssignmentExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAssignmentExpression(ctx);
    }

    @Override
    public void exitAssignmentExpression(AssignmentExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAssignmentExpression(ctx);
    }

    @Override
    public void enterAssignment(AssignmentContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAssignment(ctx);
    }

    @Override
    public void exitAssignment(AssignmentContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAssignment(ctx);
    }

    @Override
    public void enterLeftHandSide(LeftHandSideContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterLeftHandSide(ctx);
    }

    @Override
    public void exitLeftHandSide(LeftHandSideContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitLeftHandSide(ctx);
    }

    @Override
    public void enterAssignmentOperator(AssignmentOperatorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAssignmentOperator(ctx);
    }

    @Override
    public void exitAssignmentOperator(AssignmentOperatorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAssignmentOperator(ctx);
    }

    @Override
    public void enterConditionalExpression(ConditionalExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConditionalExpression(ctx);
    }

    @Override
    public void exitConditionalExpression(ConditionalExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConditionalExpression(ctx);
    }

    @Override
    public void enterConditionalOrExpression(ConditionalOrExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConditionalOrExpression(ctx);
    }

    @Override
    public void exitConditionalOrExpression(ConditionalOrExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConditionalOrExpression(ctx);
    }

    @Override
    public void enterConditionalAndExpression(ConditionalAndExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterConditionalAndExpression(ctx);
    }

    @Override
    public void exitConditionalAndExpression(ConditionalAndExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitConditionalAndExpression(ctx);
    }

    @Override
    public void enterInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterInclusiveOrExpression(ctx);
    }

    @Override
    public void exitInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitInclusiveOrExpression(ctx);
    }

    @Override
    public void enterExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterExclusiveOrExpression(ctx);
    }

    @Override
    public void exitExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitExclusiveOrExpression(ctx);
    }

    @Override
    public void enterAndExpression(AndExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAndExpression(ctx);
    }

    @Override
    public void exitAndExpression(AndExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAndExpression(ctx);
    }

    @Override
    public void enterEqualityExpression(EqualityExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEqualityExpression(ctx);
    }

    @Override
    public void exitEqualityExpression(EqualityExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEqualityExpression(ctx);
    }

    @Override
    public void enterRelationalExpression(RelationalExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterRelationalExpression(ctx);
    }

    @Override
    public void exitRelationalExpression(RelationalExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitRelationalExpression(ctx);
    }

    @Override
    public void enterShiftExpression(ShiftExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterShiftExpression(ctx);
    }

    @Override
    public void exitShiftExpression(ShiftExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitShiftExpression(ctx);
    }

    @Override
    public void enterAdditiveExpression(AdditiveExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterAdditiveExpression(ctx);
    }

    @Override
    public void exitAdditiveExpression(AdditiveExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitAdditiveExpression(ctx);
    }

    @Override
    public void enterMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterMultiplicativeExpression(ctx);
    }

    @Override
    public void exitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitMultiplicativeExpression(ctx);
    }

    @Override
    public void enterUnaryExpression(UnaryExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnaryExpression(ctx);
    }

    @Override
    public void exitUnaryExpression(UnaryExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnaryExpression(ctx);
    }

    @Override
    public void enterPreIncrementExpression(PreIncrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPreIncrementExpression(ctx);
    }

    @Override
    public void exitPreIncrementExpression(PreIncrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPreIncrementExpression(ctx);
    }

    @Override
    public void enterPreDecrementExpression(PreDecrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPreDecrementExpression(ctx);
    }

    @Override
    public void exitPreDecrementExpression(PreDecrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPreDecrementExpression(ctx);
    }

    @Override
    public void enterUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinusContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterUnaryExpressionNotPlusMinus(ctx);
    }

    @Override
    public void exitUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinusContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitUnaryExpressionNotPlusMinus(ctx);
    }

    @Override
    public void enterPostfixExpression(PostfixExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPostfixExpression(ctx);
    }

    @Override
    public void exitPostfixExpression(PostfixExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPostfixExpression(ctx);
    }

    @Override
    public void enterPostIncrementExpression(PostIncrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPostIncrementExpression(ctx);
    }

    @Override
    public void exitPostIncrementExpression(PostIncrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPostIncrementExpression(ctx);
    }

    @Override
    public void enterPostIncrementExpression_lf_postfixExpression(PostIncrementExpression_lf_postfixExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPostIncrementExpression_lf_postfixExpression(ctx);
    }

    @Override
    public void exitPostIncrementExpression_lf_postfixExpression(PostIncrementExpression_lf_postfixExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPostIncrementExpression_lf_postfixExpression(ctx);
    }

    @Override
    public void enterPostDecrementExpression(PostDecrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPostDecrementExpression(ctx);
    }

    @Override
    public void exitPostDecrementExpression(PostDecrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPostDecrementExpression(ctx);
    }

    @Override
    public void enterPostDecrementExpression_lf_postfixExpression(PostDecrementExpression_lf_postfixExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterPostDecrementExpression_lf_postfixExpression(ctx);
    }

    @Override
    public void exitPostDecrementExpression_lf_postfixExpression(PostDecrementExpression_lf_postfixExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitPostDecrementExpression_lf_postfixExpression(ctx);
    }

    @Override
    public void enterCastExpression(CastExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterCastExpression(ctx);
    }

    @Override
    public void exitCastExpression(CastExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitCastExpression(ctx);
    }

    @Override
    public void enterIdentifier(IdentifierContext ctx) {
        TerminalNode node = ctx.Identifier();
        String text = node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterIdentifier(ctx);
    }

    @Override
    public void exitIdentifier(IdentifierContext ctx) {
        TerminalNode node = ctx.Identifier();
        String text = node.getText();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitIdentifier(ctx);
    }





    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();

        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.visitErrorNode(node);
    }





    @Override
    public int hashCode() {
        LOGGER.trace("Method: {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        String text = obj.toString();

        LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        LOGGER.trace("Method: {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return super.clone();
    }

    @Override
    public String toString() {
        LOGGER.trace("Method: {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        LOGGER.trace("Method: {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        super.finalize();
    }
}
