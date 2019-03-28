package kingdee.base.ssc.day002.strategy;

public class ConcreteStrategy1 implements IStrategy {
    @Override
    public void doSomeThing() {
        System.out.println("ConcreteStrategy1 running ... ");
    }
}
