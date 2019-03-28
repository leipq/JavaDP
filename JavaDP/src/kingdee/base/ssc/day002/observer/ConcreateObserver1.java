package kingdee.base.ssc.day002.observer;

public class ConcreateObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreateObserver1观察者受到信息...并进行处理...");
    }
}
