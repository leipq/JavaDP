package kingdee.base.ssc.day002.bridge.vehicleAndRoad;
/**
 *
 * ConcreteImplementor
 * */
public class Bus implements Vehicle {
    @Override
    public void driver() {
        System.out.println("公交车...");
    }
}
