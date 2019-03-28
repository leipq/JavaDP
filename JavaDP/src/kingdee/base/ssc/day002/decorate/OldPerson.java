package kingdee.base.ssc.day002.decorate;

public class OldPerson implements Person {
    private SouPerson souPerson;
    public OldPerson(SouPerson souPerson){
        this.souPerson = souPerson;
    }
    @Override
    public void doSomthing() {
        System.out.println("生火");
        souPerson.doSomthing();
    }
}
