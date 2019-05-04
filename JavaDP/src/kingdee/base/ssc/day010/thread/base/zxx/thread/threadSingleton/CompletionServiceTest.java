package kingdee.base.ssc.day010.thread.base.zxx.thread.threadSingleton;

import java.util.Random;
import java.util.concurrent.*;

public class CompletionServiceTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        CompletionService service = new ExecutorCompletionService(threadPool);
        for (int i = 0; i < 20; i++) {
            int seq = i ;
            service.submit(new Callable() {
                @Override
                public Object call() throws Exception {
                    Thread.sleep(new Random().nextInt(200));
                    return "hello:" + seq;
                }
            });
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(service.take().get());
        }
        threadPool.shutdown();
    }
}
