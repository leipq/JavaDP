package kingdee.base.ssc.day002.factory;

public class Bus implements Car {
    @Override
    public void gotowork(){
        System.out.println("做公交车上班");
    }
}
