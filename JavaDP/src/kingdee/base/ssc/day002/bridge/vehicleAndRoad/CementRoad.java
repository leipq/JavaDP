package kingdee.base.ssc.day002.bridge.vehicleAndRoad;

public class CementRoad extends Road {
    public CementRoad(Vehicle vehicle){
        super(vehicle);
    }
    @Override
    public void driveOnRoad() {
        System.out.print("水泥路...");
        super.vehicle.driver();
    }
}
