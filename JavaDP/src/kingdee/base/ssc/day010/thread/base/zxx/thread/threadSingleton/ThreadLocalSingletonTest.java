package kingdee.base.ssc.day010.thread.base.zxx.thread.threadSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadSingleton singleton = ThreadSingleton.getInstance();
                singleton.setName("leipq");
                singleton.setAge(27);
                while(true){
                    System.out.println(Thread.currentThread().getName() + ";name:" +singleton.getName() + ";age:" + singleton.getAge());
                }
            }
        });

        ThreadSingleton singleton = ThreadSingleton.getInstance();
        singleton.setName("wangli");
        singleton.setAge(26);
        while(true){
            System.out.println(Thread.currentThread().getName() + ";name:" +singleton.getName() + ";age:" + singleton.getAge());
        }
    }
}
