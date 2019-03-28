package kingdee.base.ssc.day002.decorate;

import org.junit.Test;

public class PersonTest {
    @Test
    public void test(){

        NewPerson newPerson = new NewPerson(new OldPerson(new SouPerson()));
        newPerson.doSomthing();
    }
}
