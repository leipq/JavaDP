package kingdee.base.ssc.day002.observer;

public class ConcreateSubject extends Subject {
    @Override
    public void doSomething() {
        System.out.println("被观察者事件发生");
        this.notifyObserver();
    }
}
