package kingdee.base.ssc.day002.component;

import org.junit.Test;
/**
 * 介绍
 * 组合模式又叫做部分-整体模式,它使我们树型结构的问题中,模糊了简单元素和复杂元素的概念,
 * 客户程序可以向处理简单元素一样来处理复杂元素,从而使得客户程序与复杂元素的内部结构解藕.
 *
 * 组合模式可以优化处理递归或分级数据结构.有许多关于分级数据结构的例子,使得组合模式非常有用武之地.
 *组成部分：
 * Component: 为参加组合的对象声明一个公共接口, 不管是组合还是叶结点.
 * Leaf: 在组合中表示叶子结点对象,叶子结点没有子结点.
 * Composite: 表示参加组合的有子对象的对象, 并给出树枝购件的行为.
 *
 *
 * 使用场景
 * 以下情况下适用Composite模式：
 *         1，你想表示对象的部分-整体层次结构
 *         2，你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
 *
 * 总结
 *         组合模式解耦了客户程序与复杂元素内部结构，从而使客户程序可以向处理简单元素一样来处理复杂元素。
 *         如果你想要创建层次结构，并可以在其中以相同的方式对待所有元素，那么组合模式就是最理想的选择。本章使用了一个文件
 *         系统的例子来举例说明了组合模式的用途。在这个例子中，文件和目录都执行相同的接口，这是组合模式的关键。通过执行相同的接口，
 *         你就可以用相同的方式对待文件和目录，从而实现将文件或者目录储存为目录的子级元素。
 * */
public class FolderComponentTest {
    @Test
    public void test(){
        FolderComponent folderComponent1 = new FileLeaf("设计模式");
        FolderComponent folderComponent2 = new FolderComposite("java学习指南");
        folderComponent2.add(folderComponent1);
        folderComponent2.add(folderComponent2);
        folderComponent2.display();
    }

}