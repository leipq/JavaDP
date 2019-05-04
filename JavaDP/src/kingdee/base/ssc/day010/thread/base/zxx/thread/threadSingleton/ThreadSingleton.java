package kingdee.base.ssc.day010.thread.base.zxx.thread.threadSingleton;

public class ThreadSingleton {
    private ThreadSingleton(){}
    private static ThreadSingleton instance = null;
    private static ThreadLocal<ThreadSingleton> threadLocalMap = new ThreadLocal<>();
    public static ThreadSingleton getInstance(){
        if(threadLocalMap.get() == null){
            instance = new ThreadSingleton();
            threadLocalMap.set(instance);
        }
        return threadLocalMap.get();
    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
