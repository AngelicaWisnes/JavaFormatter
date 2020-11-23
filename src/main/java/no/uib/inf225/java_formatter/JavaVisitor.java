package no.uib.inf225.java_formatter;

import no.uib.inf225.java_formatter.Java9Parser.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaVisitor extends Java9BaseVisitor<Object> {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaVisitor.class);


    @Override
    public Object visitLiteral(LiteralContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitPrimitiveType(PrimitiveTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimitiveType(ctx);
    }

    @Override
    public Object visitNumericType(NumericTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitNumericType(ctx);
    }

    @Override
    public Object visitIntegralType(IntegralTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitIntegralType(ctx);
    }

    @Override
    public Object visitFloatingPointType(FloatingPointTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFloatingPointType(ctx);
    }

    @Override
    public Object visitReferenceType(ReferenceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitReferenceType(ctx);
    }

    @Override
    public Object visitClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassOrInterfaceType(ctx);
    }

    @Override
    public Object visitClassType(ClassTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassType(ctx);
    }

    @Override
    public Object visitClassType_lf_classOrInterfaceType(ClassType_lf_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassType_lf_classOrInterfaceType(ctx);
    }

    @Override
    public Object visitClassType_lfno_classOrInterfaceType(ClassType_lfno_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassType_lfno_classOrInterfaceType(ctx);
    }

    @Override
    public Object visitInterfaceType(InterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceType(ctx);
    }

    @Override
    public Object visitInterfaceType_lf_classOrInterfaceType(InterfaceType_lf_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceType_lf_classOrInterfaceType(ctx);
    }

    @Override
    public Object visitInterfaceType_lfno_classOrInterfaceType(InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceType_lfno_classOrInterfaceType(ctx);
    }

    @Override
    public Object visitTypeVariable(TypeVariableContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeVariable(ctx);
    }

    @Override
    public Object visitArrayType(ArrayTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitArrayType(ctx);
    }

    @Override
    public Object visitDims(DimsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitDims(ctx);
    }

    @Override
    public Object visitTypeParameter(TypeParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeParameter(ctx);
    }

    @Override
    public Object visitTypeParameterModifier(TypeParameterModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeParameterModifier(ctx);
    }

    @Override
    public Object visitTypeBound(TypeBoundContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeBound(ctx);
    }

    @Override
    public Object visitAdditionalBound(AdditionalBoundContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAdditionalBound(ctx);
    }

    @Override
    public Object visitTypeArguments(TypeArgumentsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeArguments(ctx);
    }

    @Override
    public Object visitTypeArgumentList(TypeArgumentListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeArgumentList(ctx);
    }

    @Override
    public Object visitTypeArgument(TypeArgumentContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeArgument(ctx);
    }

    @Override
    public Object visitWildcard(WildcardContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitWildcard(ctx);
    }

    @Override
    public Object visitWildcardBounds(WildcardBoundsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitWildcardBounds(ctx);
    }

    @Override
    public Object visitModuleName(ModuleNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitModuleName(ctx);
    }

    @Override
    public Object visitPackageName(PackageNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPackageName(ctx);
    }

    @Override
    public Object visitTypeName(TypeNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeName(ctx);
    }

    @Override
    public Object visitPackageOrTypeName(PackageOrTypeNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPackageOrTypeName(ctx);
    }

    @Override
    public Object visitExpressionName(ExpressionNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitExpressionName(ctx);
    }

    @Override
    public Object visitMethodName(MethodNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodName(ctx);
    }

    @Override
    public Object visitAmbiguousName(AmbiguousNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAmbiguousName(ctx);
    }

    @Override
    public Object visitCompilationUnit(CompilationUnitContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitCompilationUnit(ctx);
    }

    @Override
    public Object visitOrdinaryCompilation(OrdinaryCompilationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitOrdinaryCompilation(ctx);
    }

    @Override
    public Object visitModularCompilation(ModularCompilationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitModularCompilation(ctx);
    }

    @Override
    public Object visitPackageDeclaration(PackageDeclarationContext ctx) {
        TerminalNode node = ctx.PACKAGE();
        String text = node.getText();
        String method = Thread.currentThread().getStackTrace()[1].getMethodName().toUpperCase() + text;
        //LOGGER.trace("Method: {} - {}", method, text);
        return text + " " + super.visitPackageDeclaration(ctx);
    }

    @Override
    public Object visitPackageModifier(PackageModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPackageModifier(ctx);
    }

    @Override
    public Object visitImportDeclaration(ImportDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitImportDeclaration(ctx);
    }

    @Override
    public Object visitSingleTypeImportDeclaration(SingleTypeImportDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSingleTypeImportDeclaration(ctx);
    }

    @Override
    public Object visitTypeImportOnDemandDeclaration(TypeImportOnDemandDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeImportOnDemandDeclaration(ctx);
    }

    @Override
    public Object visitSingleStaticImportDeclaration(SingleStaticImportDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSingleStaticImportDeclaration(ctx);
    }

    @Override
    public Object visitStaticImportOnDemandDeclaration(StaticImportOnDemandDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitStaticImportOnDemandDeclaration(ctx);
    }

    @Override
    public Object visitTypeDeclaration(TypeDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeDeclaration(ctx);
    }

    @Override
    public Object visitModuleDeclaration(ModuleDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitModuleDeclaration(ctx);
    }

    @Override
    public Object visitModuleDirective(ModuleDirectiveContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitModuleDirective(ctx);
    }

    @Override
    public Object visitRequiresModifier(RequiresModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitRequiresModifier(ctx);
    }

    @Override
    public Object visitClassDeclaration(ClassDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public Object visitNormalClassDeclaration(NormalClassDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitNormalClassDeclaration(ctx);
    }

    @Override
    public Object visitClassModifier(ClassModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassModifier(ctx);
    }

    @Override
    public Object visitTypeParameters(TypeParametersContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeParameters(ctx);
    }

    @Override
    public Object visitTypeParameterList(TypeParameterListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeParameterList(ctx);
    }

    @Override
    public Object visitSuperclass(SuperclassContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSuperclass(ctx);
    }

    @Override
    public Object visitSuperinterfaces(SuperinterfacesContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSuperinterfaces(ctx);
    }

    @Override
    public Object visitInterfaceTypeList(InterfaceTypeListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceTypeList(ctx);
    }

    @Override
    public Object visitClassBody(ClassBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassBody(ctx);
    }

    @Override
    public Object visitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassBodyDeclaration(ctx);
    }

    @Override
    public Object visitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassMemberDeclaration(ctx);
    }

    @Override
    public Object visitFieldDeclaration(FieldDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFieldDeclaration(ctx);
    }

    @Override
    public Object visitFieldModifier(FieldModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFieldModifier(ctx);
    }

    @Override
    public Object visitVariableDeclaratorList(VariableDeclaratorListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitVariableDeclaratorList(ctx);
    }

    @Override
    public Object visitVariableDeclarator(VariableDeclaratorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitVariableDeclarator(ctx);
    }

    @Override
    public Object visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitVariableDeclaratorId(ctx);
    }

    @Override
    public Object visitVariableInitializer(VariableInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitVariableInitializer(ctx);
    }

    @Override
    public Object visitUnannType(UnannTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannType(ctx);
    }

    @Override
    public Object visitUnannPrimitiveType(UnannPrimitiveTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannPrimitiveType(ctx);
    }

    @Override
    public Object visitUnannReferenceType(UnannReferenceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannReferenceType(ctx);
    }

    @Override
    public Object visitUnannClassOrInterfaceType(UnannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannClassOrInterfaceType(ctx);
    }

    @Override
    public Object visitUnannClassType(UnannClassTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannClassType(ctx);
    }

    @Override
    public Object visitUnannClassType_lf_unannClassOrInterfaceType(UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannClassType_lf_unannClassOrInterfaceType(ctx);
    }

    @Override
    public Object visitUnannClassType_lfno_unannClassOrInterfaceType(UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannClassType_lfno_unannClassOrInterfaceType(ctx);
    }

    @Override
    public Object visitUnannInterfaceType(UnannInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannInterfaceType(ctx);
    }

    @Override
    public Object visitUnannInterfaceType_lf_unannClassOrInterfaceType(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannInterfaceType_lf_unannClassOrInterfaceType(ctx);
    }

    @Override
    public Object visitUnannInterfaceType_lfno_unannClassOrInterfaceType(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannInterfaceType_lfno_unannClassOrInterfaceType(ctx);
    }

    @Override
    public Object visitUnannTypeVariable(UnannTypeVariableContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannTypeVariable(ctx);
    }

    @Override
    public Object visitUnannArrayType(UnannArrayTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnannArrayType(ctx);
    }

    @Override
    public Object visitMethodDeclaration(MethodDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public Object visitMethodModifier(MethodModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodModifier(ctx);
    }

    @Override
    public Object visitMethodHeader(MethodHeaderContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodHeader(ctx);
    }

    @Override
    public Object visitResult(ResultContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitResult(ctx);
    }

    @Override
    public Object visitMethodDeclarator(MethodDeclaratorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodDeclarator(ctx);
    }

    @Override
    public Object visitFormalParameterList(FormalParameterListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public Object visitFormalParameters(FormalParametersContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFormalParameters(ctx);
    }

    @Override
    public Object visitFormalParameter(FormalParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFormalParameter(ctx);
    }

    @Override
    public Object visitVariableModifier(VariableModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitVariableModifier(ctx);
    }

    @Override
    public Object visitLastFormalParameter(LastFormalParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLastFormalParameter(ctx);
    }

    @Override
    public Object visitReceiverParameter(ReceiverParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitReceiverParameter(ctx);
    }

    @Override
    public Object visitThrows_(Throws_Context ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitThrows_(ctx);
    }

    @Override
    public Object visitExceptionTypeList(ExceptionTypeListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitExceptionTypeList(ctx);
    }

    @Override
    public Object visitExceptionType(ExceptionTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitExceptionType(ctx);
    }

    @Override
    public Object visitMethodBody(MethodBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodBody(ctx);
    }

    @Override
    public Object visitInstanceInitializer(InstanceInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInstanceInitializer(ctx);
    }

    @Override
    public Object visitStaticInitializer(StaticInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitStaticInitializer(ctx);
    }

    @Override
    public Object visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public Object visitConstructorModifier(ConstructorModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConstructorModifier(ctx);
    }

    @Override
    public Object visitConstructorDeclarator(ConstructorDeclaratorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConstructorDeclarator(ctx);
    }

    @Override
    public Object visitSimpleTypeName(SimpleTypeNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSimpleTypeName(ctx);
    }

    @Override
    public Object visitConstructorBody(ConstructorBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConstructorBody(ctx);
    }

    @Override
    public Object visitExplicitConstructorInvocation(ExplicitConstructorInvocationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitExplicitConstructorInvocation(ctx);
    }

    @Override
    public Object visitEnumDeclaration(EnumDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEnumDeclaration(ctx);
    }

    @Override
    public Object visitEnumBody(EnumBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEnumBody(ctx);
    }

    @Override
    public Object visitEnumConstantList(EnumConstantListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEnumConstantList(ctx);
    }

    @Override
    public Object visitEnumConstant(EnumConstantContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEnumConstant(ctx);
    }

    @Override
    public Object visitEnumConstantModifier(EnumConstantModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEnumConstantModifier(ctx);
    }

    @Override
    public Object visitEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEnumBodyDeclarations(ctx);
    }

    @Override
    public Object visitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceDeclaration(ctx);
    }

    @Override
    public Object visitNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitNormalInterfaceDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceModifier(InterfaceModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceModifier(ctx);
    }

    @Override
    public Object visitExtendsInterfaces(ExtendsInterfacesContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitExtendsInterfaces(ctx);
    }

    @Override
    public Object visitInterfaceBody(InterfaceBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceBody(ctx);
    }

    @Override
    public Object visitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceMemberDeclaration(ctx);
    }

    @Override
    public Object visitConstantDeclaration(ConstantDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConstantDeclaration(ctx);
    }

    @Override
    public Object visitConstantModifier(ConstantModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConstantModifier(ctx);
    }

    @Override
    public Object visitInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceMethodDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceMethodModifier(InterfaceMethodModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInterfaceMethodModifier(ctx);
    }

    @Override
    public Object visitAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAnnotationTypeDeclaration(ctx);
    }

    @Override
    public Object visitAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAnnotationTypeBody(ctx);
    }

    @Override
    public Object visitAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAnnotationTypeMemberDeclaration(ctx);
    }

    @Override
    public Object visitAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public Object visitAnnotationTypeElementModifier(AnnotationTypeElementModifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAnnotationTypeElementModifier(ctx);
    }

    @Override
    public Object visitDefaultValue(DefaultValueContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitDefaultValue(ctx);
    }

    @Override
    public Object visitAnnotation(AnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAnnotation(ctx);
    }

    @Override
    public Object visitNormalAnnotation(NormalAnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitNormalAnnotation(ctx);
    }

    @Override
    public Object visitElementValuePairList(ElementValuePairListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitElementValuePairList(ctx);
    }

    @Override
    public Object visitElementValuePair(ElementValuePairContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitElementValuePair(ctx);
    }

    @Override
    public Object visitElementValue(ElementValueContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitElementValue(ctx);
    }

    @Override
    public Object visitElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitElementValueArrayInitializer(ctx);
    }

    @Override
    public Object visitElementValueList(ElementValueListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitElementValueList(ctx);
    }

    @Override
    public Object visitMarkerAnnotation(MarkerAnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMarkerAnnotation(ctx);
    }

    @Override
    public Object visitSingleElementAnnotation(SingleElementAnnotationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSingleElementAnnotation(ctx);
    }

    @Override
    public Object visitArrayInitializer(ArrayInitializerContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitArrayInitializer(ctx);
    }

    @Override
    public Object visitVariableInitializerList(VariableInitializerListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitVariableInitializerList(ctx);
    }

    @Override
    public Object visitBlock(BlockContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitBlock(ctx);
    }

    @Override
    public Object visitBlockStatements(BlockStatementsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitBlockStatements(ctx);
    }

    @Override
    public Object visitBlockStatement(BlockStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitBlockStatement(ctx);
    }

    @Override
    public Object visitLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLocalVariableDeclarationStatement(ctx);
    }

    @Override
    public Object visitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLocalVariableDeclaration(ctx);
    }

    @Override
    public Object visitStatement(StatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitStatementNoShortIf(StatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitStatementNoShortIf(ctx);
    }

    @Override
    public Object visitStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitStatementWithoutTrailingSubstatement(ctx);
    }

    @Override
    public Object visitEmptyStatement(EmptyStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEmptyStatement(ctx);
    }

    @Override
    public Object visitLabeledStatement(LabeledStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLabeledStatement(ctx);
    }

    @Override
    public Object visitLabeledStatementNoShortIf(LabeledStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLabeledStatementNoShortIf(ctx);
    }

    @Override
    public Object visitExpressionStatement(ExpressionStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitExpressionStatement(ctx);
    }

    @Override
    public Object visitStatementExpression(StatementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitStatementExpression(ctx);
    }

    @Override
    public Object visitIfThenStatement(IfThenStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitIfThenStatement(ctx);
    }

    @Override
    public Object visitIfThenElseStatement(IfThenElseStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitIfThenElseStatement(ctx);
    }

    @Override
    public Object visitIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitIfThenElseStatementNoShortIf(ctx);
    }

    @Override
    public Object visitAssertStatement(AssertStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAssertStatement(ctx);
    }

    @Override
    public Object visitSwitchStatement(SwitchStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSwitchStatement(ctx);
    }

    @Override
    public Object visitSwitchBlock(SwitchBlockContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSwitchBlock(ctx);
    }

    @Override
    public Object visitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public Object visitSwitchLabels(SwitchLabelsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSwitchLabels(ctx);
    }

    @Override
    public Object visitSwitchLabel(SwitchLabelContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSwitchLabel(ctx);
    }

    @Override
    public Object visitEnumConstantName(EnumConstantNameContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEnumConstantName(ctx);
    }

    @Override
    public Object visitWhileStatement(WhileStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Object visitWhileStatementNoShortIf(WhileStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitWhileStatementNoShortIf(ctx);
    }

    @Override
    public Object visitDoStatement(DoStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitDoStatement(ctx);
    }

    @Override
    public Object visitForStatement(ForStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitForStatement(ctx);
    }

    @Override
    public Object visitForStatementNoShortIf(ForStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitForStatementNoShortIf(ctx);
    }

    @Override
    public Object visitBasicForStatement(BasicForStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitBasicForStatement(ctx);
    }

    @Override
    public Object visitBasicForStatementNoShortIf(BasicForStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitBasicForStatementNoShortIf(ctx);
    }

    @Override
    public Object visitForInit(ForInitContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitForInit(ctx);
    }

    @Override
    public Object visitForUpdate(ForUpdateContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitForUpdate(ctx);
    }

    @Override
    public Object visitStatementExpressionList(StatementExpressionListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitStatementExpressionList(ctx);
    }

    @Override
    public Object visitEnhancedForStatement(EnhancedForStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEnhancedForStatement(ctx);
    }

    @Override
    public Object visitEnhancedForStatementNoShortIf(EnhancedForStatementNoShortIfContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEnhancedForStatementNoShortIf(ctx);
    }

    @Override
    public Object visitBreakStatement(BreakStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitBreakStatement(ctx);
    }

    @Override
    public Object visitContinueStatement(ContinueStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitContinueStatement(ctx);
    }

    @Override
    public Object visitReturnStatement(ReturnStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitReturnStatement(ctx);
    }

    @Override
    public Object visitThrowStatement(ThrowStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitThrowStatement(ctx);
    }

    @Override
    public Object visitSynchronizedStatement(SynchronizedStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitSynchronizedStatement(ctx);
    }

    @Override
    public Object visitTryStatement(TryStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTryStatement(ctx);
    }

    @Override
    public Object visitCatches(CatchesContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitCatches(ctx);
    }

    @Override
    public Object visitCatchClause(CatchClauseContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitCatchClause(ctx);
    }

    @Override
    public Object visitCatchFormalParameter(CatchFormalParameterContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitCatchFormalParameter(ctx);
    }

    @Override
    public Object visitCatchType(CatchTypeContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitCatchType(ctx);
    }

    @Override
    public Object visitFinally_(Finally_Context ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFinally_(ctx);
    }

    @Override
    public Object visitTryWithResourcesStatement(TryWithResourcesStatementContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTryWithResourcesStatement(ctx);
    }

    @Override
    public Object visitResourceSpecification(ResourceSpecificationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitResourceSpecification(ctx);
    }

    @Override
    public Object visitResourceList(ResourceListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitResourceList(ctx);
    }

    @Override
    public Object visitResource(ResourceContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitResource(ctx);
    }

    @Override
    public Object visitVariableAccess(VariableAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitVariableAccess(ctx);
    }

    @Override
    public Object visitPrimary(PrimaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimary(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray(PrimaryNoNewArrayContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimaryNoNewArray(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lf_arrayAccess(PrimaryNoNewArray_lf_arrayAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimaryNoNewArray_lf_arrayAccess(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lfno_arrayAccess(PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimaryNoNewArray_lfno_arrayAccess(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lf_primary(PrimaryNoNewArray_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimaryNoNewArray_lf_primary(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lfno_primary(PrimaryNoNewArray_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimaryNoNewArray_lfno_primary(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ctx);
    }

    @Override
    public Object visitClassLiteral(ClassLiteralContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassLiteral(ctx);
    }

    @Override
    public Object visitClassInstanceCreationExpression(ClassInstanceCreationExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassInstanceCreationExpression(ctx);
    }

    @Override
    public Object visitClassInstanceCreationExpression_lf_primary(ClassInstanceCreationExpression_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassInstanceCreationExpression_lf_primary(ctx);
    }

    @Override
    public Object visitClassInstanceCreationExpression_lfno_primary(ClassInstanceCreationExpression_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitClassInstanceCreationExpression_lfno_primary(ctx);
    }

    @Override
    public Object visitTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public Object visitFieldAccess(FieldAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFieldAccess(ctx);
    }

    @Override
    public Object visitFieldAccess_lf_primary(FieldAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFieldAccess_lf_primary(ctx);
    }

    @Override
    public Object visitFieldAccess_lfno_primary(FieldAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitFieldAccess_lfno_primary(ctx);
    }

    @Override
    public Object visitArrayAccess(ArrayAccessContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitArrayAccess(ctx);
    }

    @Override
    public Object visitArrayAccess_lf_primary(ArrayAccess_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitArrayAccess_lf_primary(ctx);
    }

    @Override
    public Object visitArrayAccess_lfno_primary(ArrayAccess_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitArrayAccess_lfno_primary(ctx);
    }

    @Override
    public Object visitMethodInvocation(MethodInvocationContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodInvocation(ctx);
    }

    @Override
    public Object visitMethodInvocation_lf_primary(MethodInvocation_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodInvocation_lf_primary(ctx);
    }

    @Override
    public Object visitMethodInvocation_lfno_primary(MethodInvocation_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodInvocation_lfno_primary(ctx);
    }

    @Override
    public Object visitArgumentList(ArgumentListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitArgumentList(ctx);
    }

    @Override
    public Object visitMethodReference(MethodReferenceContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodReference(ctx);
    }

    @Override
    public Object visitMethodReference_lf_primary(MethodReference_lf_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodReference_lf_primary(ctx);
    }

    @Override
    public Object visitMethodReference_lfno_primary(MethodReference_lfno_primaryContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMethodReference_lfno_primary(ctx);
    }

    @Override
    public Object visitArrayCreationExpression(ArrayCreationExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitArrayCreationExpression(ctx);
    }

    @Override
    public Object visitDimExprs(DimExprsContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitDimExprs(ctx);
    }

    @Override
    public Object visitDimExpr(DimExprContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitDimExpr(ctx);
    }

    @Override
    public Object visitConstantExpression(ConstantExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConstantExpression(ctx);
    }

    @Override
    public Object visitExpression(ExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitLambdaExpression(LambdaExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLambdaExpression(ctx);
    }

    @Override
    public Object visitLambdaParameters(LambdaParametersContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLambdaParameters(ctx);
    }

    @Override
    public Object visitInferredFormalParameterList(InferredFormalParameterListContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInferredFormalParameterList(ctx);
    }

    @Override
    public Object visitLambdaBody(LambdaBodyContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLambdaBody(ctx);
    }

    @Override
    public Object visitAssignmentExpression(AssignmentExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAssignmentExpression(ctx);
    }

    @Override
    public Object visitAssignment(AssignmentContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAssignment(ctx);
    }

    @Override
    public Object visitLeftHandSide(LeftHandSideContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitLeftHandSide(ctx);
    }

    @Override
    public Object visitAssignmentOperator(AssignmentOperatorContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAssignmentOperator(ctx);
    }

    @Override
    public Object visitConditionalExpression(ConditionalExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConditionalExpression(ctx);
    }

    @Override
    public Object visitConditionalOrExpression(ConditionalOrExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConditionalOrExpression(ctx);
    }

    @Override
    public Object visitConditionalAndExpression(ConditionalAndExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitConditionalAndExpression(ctx);
    }

    @Override
    public Object visitInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitInclusiveOrExpression(ctx);
    }

    @Override
    public Object visitExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitExclusiveOrExpression(ctx);
    }

    @Override
    public Object visitAndExpression(AndExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAndExpression(ctx);
    }

    @Override
    public Object visitEqualityExpression(EqualityExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitEqualityExpression(ctx);
    }

    @Override
    public Object visitRelationalExpression(RelationalExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitRelationalExpression(ctx);
    }

    @Override
    public Object visitShiftExpression(ShiftExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitShiftExpression(ctx);
    }

    @Override
    public Object visitAdditiveExpression(AdditiveExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitAdditiveExpression(ctx);
    }

    @Override
    public Object visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitMultiplicativeExpression(ctx);
    }

    @Override
    public Object visitUnaryExpression(UnaryExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public Object visitPreIncrementExpression(PreIncrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPreIncrementExpression(ctx);
    }

    @Override
    public Object visitPreDecrementExpression(PreDecrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPreDecrementExpression(ctx);
    }

    @Override
    public Object visitUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinusContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitUnaryExpressionNotPlusMinus(ctx);
    }

    @Override
    public Object visitPostfixExpression(PostfixExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPostfixExpression(ctx);
    }

    @Override
    public Object visitPostIncrementExpression(PostIncrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPostIncrementExpression(ctx);
    }

    @Override
    public Object visitPostIncrementExpression_lf_postfixExpression(PostIncrementExpression_lf_postfixExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPostIncrementExpression_lf_postfixExpression(ctx);
    }

    @Override
    public Object visitPostDecrementExpression(PostDecrementExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPostDecrementExpression(ctx);
    }

    @Override
    public Object visitPostDecrementExpression_lf_postfixExpression(PostDecrementExpression_lf_postfixExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitPostDecrementExpression_lf_postfixExpression(ctx);
    }

    @Override
    public Object visitCastExpression(CastExpressionContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitCastExpression(ctx);
    }

    @Override
    public Object visitIdentifier(IdentifierContext ctx) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitIdentifier(ctx);
    }

    @Override
    public Object visit(ParseTree tree) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.clone();
    }

    @Override
    public String toString() {
        //TerminalNode node = ctx.identifier().Identifier();
        String text = ""; //node.getText();
        //LOGGER.trace("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        return super.toString();
    }
}
