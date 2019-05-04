package kingdee.base.ssc.day009.aopFramework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactoryBean {
    private Advice advice;
    private Object target;

    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try{
                    advice.beforeMethod(target,method,args);
                    Object object = method.invoke(target,args);
                    advice.afterMethod(target,method,args);
                    return object;

                }catch (Exception e){
                    advice.exceptionMethod(target,method,args);
                    throw new Exception(e);
                }
            }
        });
    }
}
