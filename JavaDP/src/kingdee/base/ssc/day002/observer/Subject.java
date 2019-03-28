package kingdee.base.ssc.day002.observer;

import java.util.Vector;

public abstract class Subject {
    private Vector<Observer> obs = new Vector<>();
    public void addObserver(Observer observer){
        this.obs.add(observer);
    }
    public void delObserver(Observer observer){
        this.obs.remove(observer);
    }
    protected void notifyObserver(){
        for (Observer observer:obs) {
            observer.update();
        }
    }
    public abstract void doSomething();
}
