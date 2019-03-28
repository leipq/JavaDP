package kingdee.base.ssc.day002.interpreter;

public abstract class OperatorExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public OperatorExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
}
