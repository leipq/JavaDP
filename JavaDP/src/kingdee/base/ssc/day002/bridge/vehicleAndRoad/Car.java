package kingdee.base.ssc.day002.bridge.vehicleAndRoad;
/**
 *
 * ConcreteImplementor
 * */
public class Car implements Vehicle {
    @Override
    public void driver() {
        System.out.println("小轿车...");
    }
}
