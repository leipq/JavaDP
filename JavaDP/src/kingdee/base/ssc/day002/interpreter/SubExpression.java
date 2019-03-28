package kingdee.base.ssc.day002.interpreter;

public class SubExpression extends  OperatorExpression {
        public SubExpression(Expression left , Expression right){
            super(left,right);
        }
        public double interpret(Context context){
            return this.left.interpret(context) - this.right.interpret(context);
        }
}
