package kingdee.base.ssc.day002.builder;

public class BuildProduct implements IBuild {
    Product p = new Product();
    @Override
    public void createEntity1() {
        p.entity1 = new Entity1();
    }

    @Override
    public void createEntity2() {
        p.entity2 = new Entity2();
    }

    @Override
    public void createEntity3() {
        p.entity3 = new Entity3();
    }
    /*
    * composite 混合成的，综合成的; [建] 综合式的; [数] 可分解的; [植] 菊科的
    * */
    @Override
    public Product composite() {
        createEntity1();
        createEntity2();
        createEntity3();
        return p;
    }

    @Override
    public Product create() {
        return composite();
    }
}
