package kingdee.base.ssc.day002.adapter;

public class Adapter2 implements Target {
    private Adaptee adaptee;
    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void repuest() {
        this.adaptee.specificRequest();
    }
}
