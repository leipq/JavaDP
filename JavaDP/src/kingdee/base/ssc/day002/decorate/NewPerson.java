package kingdee.base.ssc.day002.decorate;

public class NewPerson implements Person
{
    private OldPerson oldPerson;
    public NewPerson(OldPerson oldPerson){
        this.oldPerson = oldPerson;
    }
    @Override
    public void doSomthing() {
        oldPerson.doSomthing();
        System.out.println("洗碗");
    }
}
