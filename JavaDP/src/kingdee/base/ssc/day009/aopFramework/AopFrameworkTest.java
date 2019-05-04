package kingdee.base.ssc.day009.aopFramework;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AopFrameworkTest {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        InputStream inputStream = AopFrameworkTest.class.getResourceAsStream("config.properties");
        BeanFactory beanFactory = new BeanFactory(inputStream);
        List list = (List)beanFactory.getBean("xxx.bean");
        list.add("leipq");
        list.add("wangli");
        System.out.println(list.size());

    }
}
