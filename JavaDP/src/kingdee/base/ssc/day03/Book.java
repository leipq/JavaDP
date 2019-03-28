package kingdee.base.ssc.day03;

public class Book {
    private boolean chick = false;
    public Book(boolean chick){
        this.chick = chick;
    }
    public void chinkOut(){
        this.chick = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if(chick){
            System.out.println("Book Error");
        }
        /*super.finalize();*/
    }
}
