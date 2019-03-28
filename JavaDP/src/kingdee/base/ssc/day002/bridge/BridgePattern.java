package kingdee.base.ssc.day002.bridge;

import org.junit.Test;


/***
 *
 * 介绍
 *
 * 桥接模式 (Bridge)将抽象部分与实现部分分离，使它们都可以独立的变化。
 * 桥接模式是一种结构式模式。
 *应用场景
 *
 * 1、如果你不希望在抽象和实现部分采用固定的绑定关系，可以采用桥接模式，来把抽象和实现部分分开，
 * 然后在程序运行期间来动态的设置抽象部分需要用到的具体的实现，还可以动态切换具体的实现。
 *
 * 2、如果出现抽象部分和实现部分都应该可以扩展的情况，可以采用桥接模式，让抽象部分和实现部分可以
 * 独立的变化，从而可以灵活的进行单独扩展，而不是搅在一起，扩展一边会影响到另一边。
 *
 * 3、如果希望实现部分的修改，不会对客户产生影响，可以采用桥接模式，客户是面向抽象的接口在运行，
 * 实现部分的修改，可以独立于抽象部分，也就不会对客户产生影响了，也可以说对客户是透明的。
 *
 * 4、如果采用继承的实现方案，会导致产生很多子类，对于这种情况，可以考虑采用桥接模式，分析功能变化的原因，
 * 看看是否能分离成不同的纬度，然后通过桥接模式来分离它们，从而减少子类的数目。
 *
 * 要点
 *
 * 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的联系。
 * 抽象化角色和具体化角色都应该可以被子类扩展。在这种情况下，桥接模式可以灵活地组合不同的抽象化角色和具体化角色，并独立化地扩展。
 * 设计要求实现化角色的任何改变不应当影响客户端，或者说实现化角色的改变对客户端是完全透明的。
 *
 * */

public class BridgePattern {
    @Test
    public void test() {
        Implementor implementor = new ConcreteImplementorA();
        RefinedAbstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
        abstraction.otherOperation();
    }
}