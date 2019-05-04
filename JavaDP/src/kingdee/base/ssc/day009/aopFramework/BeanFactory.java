package kingdee.base.ssc.day009.aopFramework;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.Class.forName;


public class BeanFactory {
    private Properties props = new Properties();
    public BeanFactory(InputStream inputStream) throws IOException {
        props.load(inputStream);
    }

    public Object getBean(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = props.getProperty(name);
        Class clazz = forName(className);
        Object bean = clazz.newInstance();
        if(bean instanceof ProxyFactoryBean){
            ProxyFactoryBean proxyFactoryBean = (ProxyFactoryBean)bean;
            Advice advice =(Advice) (forName(props.getProperty(name + ".advice")).newInstance());
            proxyFactoryBean.setAdvice(advice);
            Object object = forName(props.getProperty(name + ".proxy")).newInstance();
            proxyFactoryBean.setTarget(object);
            Object proxy = proxyFactoryBean.getProxy();
            return proxy;
        }
        return bean;
    }
}
