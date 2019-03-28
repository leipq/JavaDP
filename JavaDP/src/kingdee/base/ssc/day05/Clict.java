package kingdee.base.ssc.day05;

public class Clict {
    public static void main(String[] args) {
        HireHouse hireHouse = new HireHouseImpl();
        HireHouseProxy hireHouseProxy = new HireHouseProxy(hireHouse);
        hireHouseProxy.hire();
    }
}
