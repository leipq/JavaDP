package kingdee.base.ssc.day002.facade;

/**
 * 2，外观角色类
 * */
public class FacadeClass {
    public void facadeMethod(){
        SubClass1 s1 = new SubClass1();
        s1.method1();
        SubClass2 s2 = new SubClass2();
        s2.method1();
        SubClass3 s3 = new SubClass3();
        s3.method1();
    }
}
