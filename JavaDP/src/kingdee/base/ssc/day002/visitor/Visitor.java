package kingdee.base.ssc.day002.visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(Element element) {
        element.doSomething();
    }
}
