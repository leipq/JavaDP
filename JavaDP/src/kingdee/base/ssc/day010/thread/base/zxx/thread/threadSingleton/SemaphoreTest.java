package kingdee.base.ssc.day010.thread.base.zxx.thread.threadSingleton;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Semaphore semaphore = new Semaphore(3,true);
        for (int i = 0; i < 5; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println("threadName:" + Thread.currentThread().getName() +";has thread:" + (3-semaphore.availablePermits()));
                        Thread.sleep(new Random().nextInt(5000));
                        System.out.println("threadNameWELLLEVEL:" + Thread.currentThread().getName() +";has thread:" + (3-semaphore.availablePermits()));
                        semaphore.release();
                        System.out.println("endinGthreadName:" + Thread.currentThread().getName() +";has thread:" + (3-semaphore.availablePermits()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        threadPool.shutdown();
    }
}
