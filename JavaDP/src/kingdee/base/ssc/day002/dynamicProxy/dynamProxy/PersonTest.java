package kingdee.base.ssc.day002.dynamicProxy.dynamProxy;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 * 上面说到，动态代理的优势在于可以很方便的对代理类的函数进行统一的处理，
 * 而不用修改每个代理类中的方法。是因为所有被代理执行的方法，
 * 都是通过在InvocationHandler中的invoke方法调用的，所以我们只要在invoke方法中统一处理，
 * 就可以对所有被代理的方法进行相同的操作了。例如，这里的方法计时，
 * 所有的被代理对象执行的方法都会被计时，然而我只做了很少的代码量。
 *
 * 动态代理的过程，代理对象和被代理对象的关系不像静态代理那样一目了然，
 * 清晰明了。因为动态代理的过程中，我们并没有实际看到代理类，
 * 也没有很清晰地的看到代理类的具体样子，而且动态代理中被代理对象和代理对象是通过InvocationHandler来完成的代理过程的，
 * 其中具体是怎样操作的，为什么代理对象执行的方法都会通过InvocationHandler中的invoke方法来执行。带着这些问题，
 * 我们就需要对java动态代理的源码进行简要的分析，弄清楚其中缘由。
 *
 * */

public class PersonTest {
    @Test
    public void test1()throws Exception{
        //创建student对象
        Student student = new Student("leipq");
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler invocationHandler = new StudentHandler(student);
        //生成Person的动态代理类
        Class<?> clazz = Proxy.getProxyClass(Person.class.getClassLoader(), new Class<?>[] {Person.class});
        //获取Person动态代理类的一个带InvocationHandler的构造器
        Constructor constructor = clazz.getConstructor(InvocationHandler.class);
        //通过构造器反射出一个Person的动态代理对象
        Person stuProxy = (Person) constructor.newInstance(invocationHandler);
        stuProxy.giveMoney();
    }
    @Test
    public void test2(){
        Student student = new Student("leipq");
        InvocationHandler invocationHandler = new StudentHandler(student);
        Person person = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class[]{Person.class},
                invocationHandler);
        person.giveMoney();
    }
}
