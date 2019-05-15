package Util;

public class CompilerError extends Error
{
    public CompilerError(int line, String msg)
    {
        super(String.format("Compiler Error at %s: %s", line, msg));
    }

    public CompilerError(String msg)
    {
        super(String.format("Compiler Error: %s", msg));
    }
}
