package kingdee.base.ssc.day002.dynamicProxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * 定义：
 *    为其他对象提供一种代理以控制对这个对象的访问。在某些情况下，一个对象不适合或者不能直接引用另一个对象，
 *    而代理对象可以在客户端和目标对象之间起到中介的作用
 *
 * 角色：
 * 1，  抽象角色：声明真实对象和代理对象的共同接口。
 * 2，  代理角色：代理对象角色内部含有对真实对象的引用，从而可以操作真实对象，
 * 同时代理对象提供与真实对象相同的接口以便在任何时刻都能代替真实对象。同时，
 * 代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。
 * 3，  真实角色：代理角色所代表的真实对象，是我们最终要引用的对象。
 *
 * 分类：
 * 静态代理
 * 静态代理也就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。
 *
 * 示例：
 *
 * 抽象角色，真实对象和代理对象共同的接口
 *
 * 动态代理
 * 动态代理类的源码是程序在运行期间由JVM根据反射等机制动态生成的，
 * 所以不存在代理类的字节码文件。
 * 代理角色和真实角色的联系在程序运行时确定。
 *
 *
 * 优点：
 *    业务类只需要关注业务逻辑本身，保证了业务类的重用性。这是代理的共有优点。
 *    能够协调调用者和被调用者，在一定程度上降低了系统的耦合度。
 *
 * 缺点：
 *    由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢，例如保护代理。
 *          实现代理模式需要额外的工作，而且有些代理模式的实现过程较为复杂，例如远程代理。
 *
 * 个人感觉上面这个例子描述的不够好，在网上看到一个描述比较好的例子，这里赘述一下：
 *
 * 1、静态代理
 *
 * 静态代理：由程序员创建或特定工具自动生成源代码，也就是在编译时就已经将接口，
 * 被代理类，代理类等确定下来。在程序运行之前，代理类的.class文件就已经生成。
 *
 * 2、静态代理简单实现
 *
 *   根据上面代理模式的类图，来写一个简单的静态代理的例子。
 *   我这儿举一个比较粗糙的例子，假如一个班的同学要向老师交班费，
 *   但是都是通过班长把自己的钱转交给老师。这里，班长就是代理学生上交班费，
 *
 * 班长就是学生的代理。
 *
 *     首先，我们创建一个Person接口。这个接口就是学生（被代理类），
 *     和班长（代理类）的公共接口，他们都有上交班费的行为。这样，
 *     学生上交班费就可以让班长来代理执行。
 *
 * */

public class UserProxyTest {
    @Test
    public void test1(){
        UserInfo userImpl = new UserImpl();
        UserProxy userProxy = new UserProxy(userImpl);
        userProxy.queryUser();
        userProxy.updateUser();
    }
    @Test
    public void test2() {
        UserInfo userImpl =new UserImpl();
        UserHandler handler = new UserHandler(userImpl);
        UserInfo userProxy = (UserInfo)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{UserInfo.class}, handler);
        userProxy.queryUser();
        userProxy.updateUser();
    }
}
