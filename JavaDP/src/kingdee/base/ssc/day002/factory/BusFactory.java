package kingdee.base.ssc.day002.factory;

public class BusFactory implements ICarFactory{
    @Override
    public Car getCar(){
        return new Bus();
    }
}
