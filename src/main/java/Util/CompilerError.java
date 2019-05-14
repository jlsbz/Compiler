package Util;

import ASTNode.Location;

public class CompilerError extends Error
{
    public CompilerError(Location config, String msg)
    {
        super(String.format("Compiler Error at %s: %s", config.toString(), msg));
    }

    public CompilerError(String msg)
    {
        super(String.format("Compiler Error: %s", msg));
    }
}
