package kingdee.base.ssc.day008.stream;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String name;
    private double price;
    private int count;
    public Book(String name,double price,int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }
    @Override
    public String toString(){
        return "书名：" + this.name + ";单价：" + this.price + ";数量：" + this.count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}

public class DemoTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book("Java开发实战",79.8,1));
        list.add(new Book("Java并发编程",66.8,8));
        list.add(new Book("Java编程思想",99.8,10));
        list.add(new Book("Jsp开发",49.8,6));
        list.add(new Book("网络编程",69.8,3));
        list.add(new Book("算法导论",112.8,3));
        list.add(new Book("Java8",68.8,1));
        list.add(new Book("JVM",109.8,10));
        list.add(new Book("Java内存模型",59.8,3));
        list.add(new Book("Linux",119.8,1));
        list.add(new Book("git",20.0,5));
        list.add(new Book("svn",13.5,5));

        long count  = list.stream().filter((x) -> x.getName().contains("Java")).count();
        System.out.println(count);

    }
}
