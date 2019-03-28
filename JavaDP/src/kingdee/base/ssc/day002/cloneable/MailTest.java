package kingdee.base.ssc.day002.cloneable;

import org.junit.Test;

import java.util.ArrayList;

/**
 *
 * 优点：
 *         1，使用原型模型创建一个对象比直接new一个对象更有效率，因为它直接操作内存中的二进制流，
 *         特别是复制大对象时，性能的差别非常明显。
 *         2，隐藏了制造新实例的复杂性，使得创建对象就像我们在编辑文档时的复制粘贴一样简单。
 *
 * 缺点：
 *         1，由于使用原型模式复制对象时不会调用类的构造方法，所以原型模式无法和单例模式组合使用，
 *         因为原型类需要将clone方法的作用域修改为public类型，那么单例模式的条件就无法满足了。
 *         2，使用原型模式时不能有final对象。
 *         3，Object类的clone方法只会拷贝对象中的基本数据类型，对于数组，引用对象等只能另行拷贝。
 *         这里涉及到深拷贝和浅拷贝的概念。
 * 深拷贝与浅拷贝：
 *      浅拷贝：
 *         将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的（这样不安全）。
 *
 *      深拷贝：
 *         将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
 *          那么深拷贝如何具体实现呢？
 *          请看例子中的 ArrayList<String> 属性
 *
 * */

public class MailTest {
    @Test
    public void test (){
        int i = 0;
        int MAX_COUNT = 10;
        EventTemplate et =
                new EventTemplate("邀请函（不变）", "婚嫁生日啥的....（不变部分）");
        Mail mail = new Mail(et);
        ArrayList<String> list = new ArrayList<>();
        list.add("leipq");
        list.add("wangli");
        mail.setList(list);
        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            cloneMail.setContent(i+"XXX先生（女士）（变化部分）" + mail.getTail());
            cloneMail.setReceiver("每个人的邮箱地址"+i+"...com（变化部分）");
            if(cloneMail.getList() == mail.getList()){
                System.out.println("对象相等");
            }else{
                System.out.println("对象不相等");
            }
            cloneMail.sendMail(cloneMail);
            i++;
        }

    }
}
