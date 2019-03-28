package kingdee.base.ssc.day002.factory;

public class Bike implements Car{
    @Override
    public void gotowork(){
        System.out.println("骑单车去上班");
    }
}
