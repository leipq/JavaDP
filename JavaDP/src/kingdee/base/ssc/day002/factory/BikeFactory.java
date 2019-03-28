package kingdee.base.ssc.day002.factory;

public class BikeFactory implements ICarFactory {
    @Override
    public Car getCar(){
        return new Bike();
    }
}
