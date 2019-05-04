package kingdee.base.ssc.day009.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class MyProxy {


    public static void main(String[] args) {
        List list  = (List) getProxy(new ArrayList<String>(),new MyAdivce());
        list.add("leipq");
        list.add("wangli");
    }

    public static Object getProxy(Object target,Advice advice) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
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
                }
        );
    }

}
