package kingdee.base.ssc.day010.thread.base.zxx.thread.threadSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsCached {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            final int x = i;
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("threadName:" +Thread.currentThread().getName() + ";x:" + x + ";j:" +j);
                    }
                }
            });
        }
        threadPool.shutdown();
    }
}
