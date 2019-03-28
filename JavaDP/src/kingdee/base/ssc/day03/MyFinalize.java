package kingdee.base.ssc.day03;

public class MyFinalize {
    public static void main(String[] args) {
        new Book(false);
        new Book(true);
        System.gc();
    }
}
