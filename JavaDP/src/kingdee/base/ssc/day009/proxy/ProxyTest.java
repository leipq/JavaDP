package kingdee.base.ssc.day009.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Class clazz = Proxy.class.getClass();
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor :constructors){
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getParameterizedType().getTypeName());
            }
        }

        Method[] methods = clazz.getMethods();
        for (Method method:methods
             ) {
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter:
                 parameters) {
                System.out.println(parameter.getParameterizedType().getTypeName());
            }
        }
    }
}
