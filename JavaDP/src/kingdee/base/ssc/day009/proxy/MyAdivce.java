package kingdee.base.ssc.day009.proxy;

import java.lang.reflect.Method;

public class MyAdivce implements Advice {
    @Override
    public void beforeMethod(Object target, Method method, Object[] args) {
        System.out.println("beforeMethod happened...");
    }

    @Override
    public void afterMethod(Object target, Method method, Object[] args) {
        System.out.println("afterMethod happened...");
        throw new RuntimeException("I am happened Exception...");
    }

    @Override
    public void exceptionMethod(Object target, Method method, Object[] args) {
        System.out.println("exceptionMethod happened...");
    }

    @Override
    public void runningMethod(Object target, Method method, Object[] args) {
        System.out.println("runningMethod happened...");
    }
}
