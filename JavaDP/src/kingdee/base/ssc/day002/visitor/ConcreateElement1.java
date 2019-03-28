package kingdee.base.ssc.day002.visitor;

public class ConcreateElement1 extends Element {
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("ConcreateElement1");
    }
}
