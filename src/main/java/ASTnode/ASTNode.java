package ASTNode;

import FrontEnd.ASTVisitor;

public abstract class ASTNode
{
    public Location loc;
    public boolean outInfluence = false;

    //public Location getLocation()
    //{
    //    return config;
   // }


    abstract public void accept(ASTVisitor visitor);
}