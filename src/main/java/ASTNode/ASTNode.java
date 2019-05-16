package ASTNode;

import FrontEnd.ASTVisitor;

public abstract class ASTNode
{
    public int line;
    public boolean outInfluence = false;

    //public Location getLocation()
    //{
    //    return config;
   // }


    abstract public void accept(ASTVisitor visitor);
}