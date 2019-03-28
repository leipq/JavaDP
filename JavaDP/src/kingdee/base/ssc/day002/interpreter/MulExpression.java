package kingdee.base.ssc.day002.interpreter;
/**
 * 乘法解析器
 * */
public class MulExpression extends  OperatorExpression {
    public MulExpression(Expression left, Expression right){
        super(left,right);
    }
    @Override
    public double interpret(Context context) {
        return this.left.interpret(context) * this.right.interpret(context);
    }
}
