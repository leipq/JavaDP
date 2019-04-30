package kingdee.base.ssc.day010.thread.base.threadPoll;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,20,200,
                TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(5));

        for (int i = 0 ; i < 15 ; i ++){
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("Thread pool - poolSize:[" + executor.getPoolSize()
                    + "];write["+executor.getQueue().size()
                    +"];completedSize["+executor.getCompletedTaskCount()+"]");
        }
        executor.shutdown();

    }
}
class MyTask implements Runnable{

    private int taskNum;
    public MyTask(int taskNum){
        this.taskNum = taskNum;
    }
    @Override
    public void run() {
        System.out.println("running task:"+ taskNum);
        try{
            Thread.currentThread().sleep(4000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("task " + taskNum +" end");
    }
}