package kingdee.base.ssc.day002.bridge.vehicleAndRoad;

public class UnpavedRoad extends Road {
    public UnpavedRoad(Vehicle vehicle){
        super(vehicle);
    }
    @Override
    public void driveOnRoad() {
        System.out.print("石子路...");
        this.vehicle.driver();
    }
}
