package kingdee.base.ssc.day002.visitor;

import org.junit.Test;

import java.util.List;

public class Client {
    @Test
    public void test(){
        List<Element> list = ObjectStruture.getList();
        for(Element e: list){
            e.accept(new Visitor());
        }
    }

    @Test
    public void test1(){
        Element element = new ConcreateElement1();
        element.accept(new Visitor());
        IVisitor iVisitor = new Visitor();
        iVisitor.visit(element);
    }
}
