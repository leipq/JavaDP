package kingdee.base.ssc.day002.interpreter;
/**
 * 加法解析器
 * */
public class AddExpression extends OperatorExpression {
    public AddExpression(Expression left, Expression right) {
       super(left,right);
    }

    public double interpret(Context context)
    {
        return this.left.interpret(context) + this.right.interpret(context);
    }
}
