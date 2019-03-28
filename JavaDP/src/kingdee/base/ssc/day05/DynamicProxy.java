package kingdee.base.ssc.day05;

import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static void main(String[] args) {
        Hire hire = new HireImpl();
        ProxyHandler proxyHandler = new ProxyHandler(hire);
        Hire hireProxy = (Hire)Proxy.newProxyInstance(Hire.class.getClassLoader(),new Class[]{Hire.class},proxyHandler);
        hireProxy.hireHouse();
    }
}
