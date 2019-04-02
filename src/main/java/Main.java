import ASTnode.*;
import MStarTree.*;
import ASTVisitor.*;
import Scope.*;

public class Main {

    public static void main(String args[]) throws Exception {

        //String path = "program.txt";
        String path = "";
        ASTBuilder astBuilder = new ASTBuilder();
        ParentLinker parentLinker = new ParentLinker();
        ScopeTreeBuilder scopeTreeBuilder = new ScopeTreeBuilder();
        TypeDefinitionChecker typeDefinitionChecker = new TypeDefinitionChecker();
        StaticTypeChecker staticTypeChecker = new StaticTypeChecker();
        ClassTypeResolver classTypeResolver = new ClassTypeResolver();

        ProgramNode prog = astBuilder.buildAST(path);

        parentLinker.linkParent(prog);



        Scope toplevelScope = scopeTreeBuilder.buildScopeTree(prog);

        typeDefinitionChecker.checkTypeDefinition(prog);
        staticTypeChecker.checkStaticType(prog);
        classTypeResolver.resolveClassType(prog);
        //prog.printInformation(0);
    }
}