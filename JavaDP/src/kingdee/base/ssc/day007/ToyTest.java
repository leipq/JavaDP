package kingdee.base.ssc.day007;

public class ToyTest {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("kingdee.base.ssc.day007.FancyToy");
        for (Class cl : cls.getInterfaces()){
            System.out.println(cl);
        }
        Class<?> superclass = cls.getSuperclass();
        cls.getName();
        System.out.println(superclass);
        System.out.println(cls.getName());
        System.out.println(cls.isInterface());
        System.out.println(cls.getSimpleName());
        System.out.println(cls.getCanonicalName());
    }
}
