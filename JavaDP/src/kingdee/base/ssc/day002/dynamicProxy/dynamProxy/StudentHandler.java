package kingdee.base.ssc.day002.dynamicProxy.dynamProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentHandler<T> implements InvocationHandler {
    private T target;
    public StudentHandler(T target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理执行了"+method.getName()+"方法");
        MonitorUtil.start();
        Object object = method.invoke(target,args);
        MonitorUtil.finish(method.getName());
        return object;
    }
}
