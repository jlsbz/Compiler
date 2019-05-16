import ASTNode.ProgramNode;
import FrontEnd.*;
import BackEnd.*;
import MStarTree.*;
import Scope.Scope;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import IR.*;

import java.io.*;

public class Main {
    private static ProgramNode prog;
    private static Scope globalScope;
    private static IRRoot irRoot;


    public static void main(String[] args) throws Exception {
        try {
            compile();
        } catch (Error error) {
            System.err.println(error.getMessage());
            System.exit(1);
        }
    }

    private static void compile() throws Exception {
        boolean isSystemin = true;
        boolean isSystemout = true;

        String inFile = "test/program.txt";
        InputStream inS;
        if (isSystemin) inS = System.in;
        else inS = new FileInputStream(inFile);
        CharStream input = CharStreams.fromStream(inS);
        MStarTreeLexer lexer = new MStarTreeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MStarTreeParser parser = new MStarTreeParser(tokens);
        ParseTree tree = parser.program();
        ASTBuilder astBuilder = new ASTBuilder();
        prog = (ProgramNode) astBuilder.visit(tree);

        ClassFunctionBuilder globalScopeBuilder = new ClassFunctionBuilder();
        globalScopeBuilder.visit(prog);
        globalScope = globalScopeBuilder.getScope();
        new ClassVarMemBuilder(globalScope).visit(prog);
        new SemanticChecker(globalScope).visit(prog);

        //prog.printInformation(0);

        IRBuilder irBuilder = new IRBuilder(globalScope);
        irBuilder.visit(prog);
        irRoot = irBuilder.getIrRoot();
        new BinaryOpTransformer(irRoot).run();

        String outFile = "test/13.asm";
        PrintStream outS;
        if (isSystemout) outS = System.out;
        else outS = new PrintStream(new FileOutputStream(outFile));
        new FunctionInLineOptimizer(irRoot).run();
        new GlobalVarProcessor(irRoot).run();
        new RegisterAllocator(irRoot).run();
        new NASMTransformer(irRoot).run();
        new NASMPrinter(outS).visit(irRoot);
    }

}