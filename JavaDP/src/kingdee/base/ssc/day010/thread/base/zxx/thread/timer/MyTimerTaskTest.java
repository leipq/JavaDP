package kingdee.base.ssc.day010.thread.base.zxx.thread.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTaskTest {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("bombing");
            }
        },1000,2000);
        while (true){
            Thread.sleep(1000);
            System.out.println(new Date().getSeconds());
        }
    }
}
