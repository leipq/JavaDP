package kingdee.base.ssc.day002.interpreter;

import java.util.Stack;

public class Calculator {
    private String expression;
    private Context context;

    public Calculator(String expression)
    {
        this.expression = expression;
        this.context = new Context();
    }

    public double calculating() {
        char[] vars = this.expression.toCharArray();
        for (char c : vars)
        {
            if (c == '+' || c == '-' || c == '*' || c == '/')
            {
                continue;
            }
            if (!this.context.getVariable().containsKey(c));
            {

                this.context.getVariable().put(c, 3D );
            }
        }
        Expression left = new VariableExpression(vars[0]);
        Expression right = null;
        Stack<Expression> stack = new Stack<Expression>();
        stack.push(left);
        for (int i = 1; i < vars.length; i += 2) {
            left = stack.pop();
            right = new VariableExpression(vars[i + 1]);
            switch (vars[i]) {
                case '+':
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    stack.push(new SubExpression(left, right));
                    break;
                case '*':
                    stack.push(new MulExpression(left, right));
                    break;
                case '/':
                    stack.push(new DivExpression(left, right));
                    break;
            }
        }
        double value = stack.pop().interpret(this.context);
        stack.clear();
        return value;
    }
}
