package kingdee.base.ssc.day002.interpreter;

/**
 *
 * 除法
* */
public class DivExpression extends OperatorExpression {
    DivExpression(Expression left,Expression right){
        super(left,right);
    }
    @Override
    public double interpret(Context context) {
        return this.left.interpret(context) / this.right.interpret(context);
    }
}
