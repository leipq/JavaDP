package kingdee.base.ssc.day002.adapter;

public class Adapter1 extends Adaptee implements Target {
    @Override
    public void repuest() {
        super.specificRequest();
    }
}
