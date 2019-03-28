package kingdee.base.ssc.day002.interpreter;
/**
 * Variable 变化的 ,可变的
 *
 * */
public class VariableExpression extends Expression {
    private char key;
    public VariableExpression(char key)
    {
        this.key = key;
    }

    public double interpret(Context context)
    {
        return context.getVariable().get(key);
    }
}
