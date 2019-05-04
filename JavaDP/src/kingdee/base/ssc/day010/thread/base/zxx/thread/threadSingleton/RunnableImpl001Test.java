package kingdee.base.ssc.day010.thread.base.zxx.thread.threadSingleton;

public class RunnableImpl001Test {
    public static void main(String[] args) {
        RunnableImpl001 runnableImpl001 =  new RunnableImpl001();
        new Thread(runnableImpl001).start();
        new Thread(runnableImpl001).start();
        new Thread(runnableImpl001).start();
    }
}
class RunnableImpl001 implements Runnable{
    private int ticket = 0;
    @Override
    public void run() {
        for(int i = 0 ; i < 1000 ; i ++ ){
            this.addOne();
        }
        System.out.println(this.ticket);
    }
    private synchronized int addOne(){
        return this.ticket ++;
    }
}
