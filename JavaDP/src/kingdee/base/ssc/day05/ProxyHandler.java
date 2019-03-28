package kingdee.base.ssc.day05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler<T> implements InvocationHandler {
    private T obj;
    public ProxyHandler(T obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置事件");
        Object objReturn = method.invoke(obj,args);
        System.out.println("后置事件");
        return objReturn;
    }
}
