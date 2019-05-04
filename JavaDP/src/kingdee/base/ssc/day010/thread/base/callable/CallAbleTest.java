package kingdee.base.ssc.day010.thread.base.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class CallAbleTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RunnableFuture future = new FutureTask(new CallAbleImple());
        new Thread(future).start();
//        System.out.println(future.get());
        for (int x = 0 ; x <10000; x ++){
            System.out.println("x:" + x);
        }
    }
}
