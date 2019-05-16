package ASTNode;

import FrontEnd.ASTVisitor;

public abstract class ASTNode
{
<<<<<<< HEAD
    public Location loc;
=======
    public int line;
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
    public boolean outInfluence = false;

    //public Location getLocation()
    //{
    //    return config;
   // }


    abstract public void accept(ASTVisitor visitor);
}