package kingdee.base.ssc.day002.bridge.vehicleAndRoad;
/**
 *
 * */
public abstract class Road {
    protected Vehicle vehicle;
    public Road(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public abstract void driveOnRoad();
}
