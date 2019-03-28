package kingdee.base.ssc.day002.interpreter;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test(){
        Calculator calculator = new Calculator("a*b");
        double d = calculator.calculating();
        System.out.println(d);
    }

}