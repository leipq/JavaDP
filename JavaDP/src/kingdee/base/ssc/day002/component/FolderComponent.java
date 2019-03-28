package kingdee.base.ssc.day002.component;

public abstract class FolderComponent {
    private String name;

    public String getName() {
        return name;
    }
    /**
     * 1、
     *
     * final 修饰在变量上，说明这个变量的值不能修改
     * final 修饰在方法上，说明这个方法在继承后不能覆盖.
     * final 修饰在类上，说明这个类为终态，不能被继承了.
     *
     * 2、final类型修饰的参数分为两种类型：基本类型 与 引用类型
     *
     * 参考：http://www.cnblogs.com/lan0725/archive/2013/05/24/3097573.html
     *
     * (1) 在调用的参数内部，无论是基本类型还是引用类型，其值不可改变（引用类型指的引用对象不变）
     *
     * (2) 引用类型中属性可变
     *
     * @ final修饰基本类型(int,double,...)时，值不能改变：例final int a = 6，a 的值就是6，不能改；
     * @ final修饰引用类型时，引用类型变量的地址值不可被修改。但如果final修饰的是对象类型那么则不能将其他对象赋值给它，但它所指向的对象内部的值是可变的.
     * 很容易理解：final表示输入的值不能再被修改
     *
     * 像上面的例子，如果你想改变ref的引用地址是错误的，如：ref = new BB()或ref = null是错的，但可以改变ref引用对象的值，如ref.i = 2；
     *
     * 总结：对于基本类型，不可变指的是值
     * 　　　对于引用类型，不可变指的是引用地址
     *
     * */

    public void setName(final String name) {
        this.name = name;
    }

    public FolderComponent() {
    }

    public FolderComponent(String name) {

        this.name = name;
    }

    public abstract void add(FolderComponent component);

    public abstract void remove(FolderComponent component);

    public abstract void display();
}
