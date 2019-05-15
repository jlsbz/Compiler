package Util;

import ASTNode.Location;

public class SemanticError extends Error
{
    public SemanticError(Location config, String msg)
    {
        super(String.format("Semantic Error at %s: %s", config.toString(), msg));
    }

    public SemanticError(String msg)
    {
        super(String.format("Semantic Error: %s", msg));
    }
}
