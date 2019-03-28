package kingdee.base.ssc.day05;

public class HireHouseProxy implements HireHouse{
    private HireHouse hireHouse;
    public HireHouseProxy(HireHouse hireHouse){
        this.hireHouse = hireHouse;
    }

    @Override
    public void hire() {
        System.out.println("前置事件");
        hireHouse.hire();
        System.out.println("后置事件");
    }
}
