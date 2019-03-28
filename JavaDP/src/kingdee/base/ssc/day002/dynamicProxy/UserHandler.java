package kingdee.base.ssc.day002.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserHandler implements InvocationHandler {
    private UserInfo userImpl;
    public UserHandler(UserInfo userImpl){
        this.userImpl= userImpl;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;

        Method meth = userImpl.getClass().getMethod(method.getName());
        object = meth.invoke(userImpl,args);
        return object;
    }
}
