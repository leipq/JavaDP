package kingdee.base.ssc.day002.builder;

public class Director {
    private IBuild build;
    public Director(IBuild build){
        this.build = build;
    }
    public Product build(){
        return build.create();
    }
}
