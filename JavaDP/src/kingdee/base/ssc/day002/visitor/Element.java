package kingdee.base.ssc.day002.visitor;

public abstract class Element {
    public abstract void accept(IVisitor iVisitor);
    public abstract void doSomething();
}
