package kingdee.base.ssc.day009.aopFramework;

import java.lang.reflect.Method;

public interface Advice {
    public void beforeMethod(Object target, Method method, Object[] args);
    public void afterMethod(Object target, Method method, Object[] args);
    public void exceptionMethod(Object target, Method method, Object[] args);
    public void runningMethod(Object target, Method method, Object[] args);
}
