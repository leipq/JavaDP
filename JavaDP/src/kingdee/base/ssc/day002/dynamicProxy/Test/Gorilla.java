package kingdee.base.ssc.day002.dynamicProxy.Test;
/**
 * Gorilla 大猩猩
 * */
public class Gorilla implements Leaning,Sleeping{
    private String name;
    public Gorilla(String name){
        this.name = name;
    }
    @Override
    public void starding() {
        System.out.println("名称为："+name+"的大猩猩有学习的能力！");
    }
    @Override
    public void sleep() {
        System.out.println("名称为："+name+"的大猩猩会睡觉！");
    }
}
