package Util;

import ASTNode.Location;

public class SyntaxError extends Error
{
    public SyntaxError(Location loc, String msg)
    {
        super(String.format("Syntax Error at %s: %s", loc.toString(), msg));
    }
}
