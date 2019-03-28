package kingdee.base.ssc.day002.dynamicProxy.staticProxy;

public class StudentProxy implements Person {
    private Student student;
    public StudentProxy(Person person){
        if(person instanceof Student){
            this.student =(Student) person;
        }else{
            System.out.println("动态代理对象错误");
        }
    }
    @Override
    public void giveMoney() {
        student.giveMoney();
    }
}
