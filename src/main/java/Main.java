import ASTnode.*;
import MStarTree.*;
import ASTVisitor.*;
import Scope.*;

public class Main {

    public static void main(String args[]) throws Exception {

        String path = "test/1.txt";
//        String path = "code/new_failure.txt";
        ASTBuilder astBuilder = new ASTBuilder();
        ParentLinker parentLinker = new ParentLinker();
        ScopeTreeBuilder scopeTreeBuilder = new ScopeTreeBuilder();
        TypeDefinitionChecker typeDefinitionChecker = new TypeDefinitionChecker();
        StaticTypeChecker staticTypeChecker = new StaticTypeChecker();
        ClassTypeResolver classTypeResolver = new ClassTypeResolver();

        ProgramNode prog = astBuilder.buildAST(path);

        parentLinker.linkParent(prog);



        ToplevelScope toplevelScope = scopeTreeBuilder.buildScopeTree(prog);

        typeDefinitionChecker.checkTypeDefinition(prog);
        staticTypeChecker.checkStaticType(prog);
        classTypeResolver.resolveClassType(prog);
        //prog.printInformation(0);
    }
}