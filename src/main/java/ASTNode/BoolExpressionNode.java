package ASTNode;
import FrontEnd.ASTVisitor;

public class BoolExpressionNode extends ConstantExpressionNode
{
    public boolean value;

    public BoolExpressionNode(boolean value, Location config)
    {
        this.value = value;
        this.loc = config;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    //public boolean getValue(){return value;}
=======
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦
=======
>>>>>>> parent of 50bb6a7... 举酒欲饮无管弦

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof BoolExpressionNode)) return false;
        return value == ((BoolExpressionNode) obj).value;
    }
}
