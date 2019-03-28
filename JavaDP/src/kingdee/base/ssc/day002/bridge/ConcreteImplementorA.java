package kingdee.base.ssc.day002.bridge;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA operationImpl...");
    }
}
