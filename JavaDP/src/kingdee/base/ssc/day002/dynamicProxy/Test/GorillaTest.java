package kingdee.base.ssc.day002.dynamicProxy.Test;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) throws IllegalArgumentException
 *
 * loader:　　一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
 *
 * interfaces:　　一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，
 *          那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
 *
 * h:　　一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
 *
 * */

public class GorillaTest {
    @Test
    public void test(){
        Gorilla gorilla = new Gorilla("chengsipeng");
        GorillaHandler<Gorilla> gorillaGorillaHandler = new GorillaHandler<>(gorilla);
        Object object = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Sleeping.class,Leaning.class},gorillaGorillaHandler);
        System.out.println("test--object"+object.getClass().getName());
        Leaning leaning = (Leaning) object;
        leaning.starding();
        Sleeping sleeping = (Sleeping) object;
        sleeping.sleep();
    }
}
