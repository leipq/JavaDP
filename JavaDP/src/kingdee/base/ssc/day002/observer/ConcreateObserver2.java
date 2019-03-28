package kingdee.base.ssc.day002.observer;

public class ConcreateObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreateObserver2观察者受到信息...并进行处理...");
    }
}
