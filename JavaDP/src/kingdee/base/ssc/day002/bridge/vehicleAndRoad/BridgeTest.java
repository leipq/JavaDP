package kingdee.base.ssc.day002.bridge.vehicleAndRoad;

import org.junit.Test;

public class BridgeTest {
    @Test
    public void test1(){
        Vehicle bus = new Bus();
        Road unpavedRoad = new UnpavedRoad(bus);
        unpavedRoad.driveOnRoad();
    }
    @Test
    public void test2(){
        Vehicle bus = new Bus();
        Road cementRoad = new CementRoad(bus);
        cementRoad.driveOnRoad();
    }
    @Test
    public void test3(){
        Vehicle car = new Car();
        Road unpavedRoad = new UnpavedRoad(car);
        unpavedRoad.driveOnRoad();
    }
    @Test
    public void test4(){
        Vehicle car = new Car();
        Road unpavedRoad = new CementRoad(car);
        unpavedRoad.driveOnRoad();
    }
}
