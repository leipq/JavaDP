package kingdee.base.ssc.day010.thread.base.zxx.thread.threadSingleton;

import java.util.concurrent.*;

public class ExecutorsScheduled {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newScheduledThreadPool(2);
        for (int i = 0; i < 10; i++) {
            final int x = i;
//            public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
//            long initialDelay,
//            long period,
//            TimeUnit unit);
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        try {
                            Thread.sleep(150);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("ThreadName:" +Thread.currentThread().getName() + ";x:" + x + ";j:" +j);
                    }
                }
            });
        }
        threadPool.shutdown();
    }
}
