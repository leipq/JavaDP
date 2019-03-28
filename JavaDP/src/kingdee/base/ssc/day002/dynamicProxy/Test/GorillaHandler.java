package kingdee.base.ssc.day002.dynamicProxy.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Object invoke(Object proxy, Method method, Object[] args) throws Throwable
 *
 * proxy:　　指代我们所代理的那个真实对象
 * method:　　指代的是我们所要调用真实对象的某个方法的Method对象
 * args:　　指代的是调用真实对象某个方法时接受的参数
 *
 * */

public class GorillaHandler<T> implements InvocationHandler {
    private T target;
    public GorillaHandler(T target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy"+proxy.getClass().getName()+"--执行了"+method.getName());
        Object object = method.invoke(target,args);
        return object;
    }
}
