package kingdee.base.ssc.day002.strategy;

public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }
    public void execute(){
        iStrategy.doSomeThing();
    }
}
