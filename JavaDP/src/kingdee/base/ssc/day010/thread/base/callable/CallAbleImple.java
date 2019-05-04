package kingdee.base.ssc.day010.thread.base.callable;

import java.util.concurrent.Callable;

public class CallAbleImple implements Callable {
    private int num = 100;
    @Override
    public Object call() throws Exception {

        for (int x = 0 ; x <100 ; x ++){
            System.out.println("Remainder ticket:" + (num - x));
        }

        return "ticket out of stock";
    }
}
