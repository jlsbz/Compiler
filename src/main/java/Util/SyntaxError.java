package Util;

public class SyntaxError extends Error
{
    public SyntaxError(int line, String msg)
    {
        super(String.format("Syntax Error at %s: %s", line, msg));
    }
}
