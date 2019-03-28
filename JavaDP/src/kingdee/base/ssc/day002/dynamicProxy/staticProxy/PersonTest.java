package kingdee.base.ssc.day002.dynamicProxy.staticProxy;

import org.junit.Test;

public class PersonTest {
    @Test
    public void test(){
        Student student = new Student("leipq");
        StudentProxy studentProxy = new StudentProxy(student);
        studentProxy.giveMoney();
    }
}
