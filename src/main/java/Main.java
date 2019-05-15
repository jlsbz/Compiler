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

public class Main
{
    private static ProgramNode prog;
    private static Scope globalScope;
    private static IRRoot irRoot;

    public static void main(String[] args) throws Exception
    {
        try {
            compile();
        }
        catch (Error e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    private static void compile() throws Exception
    {
        buildAST();
        semanticCheck();
        buildIR();
        generateCode();
    }

    private static void buildAST() throws Exception
    {
        String inFile = "test/program.txt";
        inFile = null;
        InputStream inS;
        if (inFile == null) inS = System.in;
        else inS = new FileInputStream(inFile);
        CharStream input = CharStreams.fromStream(inS);
        MStarTreeLexer lexer = new MStarTreeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MStarTreeParser parser = new MStarTreeParser(tokens);
        ParseTree tree = parser.program();
        ASTBuilder astBuilder = new ASTBuilder();
        prog = (ProgramNode) astBuilder.visit(tree);
    }

    private static void semanticCheck()
    {
        ClassFunctionBuilder globalScopeBuilder = new ClassFunctionBuilder();
        globalScopeBuilder.visit(prog);
        globalScope = globalScopeBuilder.getScope();
        new ClassVarMemBuilder(globalScope).visit(prog);
        new SemanticChecker(globalScope).visit(prog);
    }

    private static void buildIR()
    {
        IRBuilder irBuilder = new IRBuilder(globalScope);
        irBuilder.visit(prog);
        irRoot = irBuilder.getIrRoot();
        new BinaryOpTransformer(irRoot).run();
    }

    private static void generateCode() throws Exception
    {
        String outFile = "test/2.asm";
        outFile = null;
        PrintStream outS;
        if (outFile == null) outS = System.out;
        else outS = new PrintStream(new FileOutputStream(outFile));
        new FunctionInLineOptimizer(irRoot).run();
        new GlobalVarProcessor(irRoot).run();
        new RegisterAllocator(irRoot).run();
        new NASMTransformer(irRoot).run();
        new NASMPrinter(outS).visit(irRoot);
    }
}
