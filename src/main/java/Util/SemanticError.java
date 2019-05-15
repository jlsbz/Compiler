package Util;

public class SemanticError extends Error
{
    public SemanticError(int line, String msg)
    {
        super(String.format("Semantic Error at %s: %s", line, msg));
    }

    public SemanticError(String msg)
    {
        super(String.format("Semantic Error: %s", msg));
    }
}
