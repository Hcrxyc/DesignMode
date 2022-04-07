package com.mode.structure.bridge;

/**
 * @Author admin
 * @Date 2022/3/9 10:08
 * @description 桥接模式
 * 优点
 *
 * 分离抽象接口及其实现部分。桥接模式使用“对象间的关联关系”解耦了抽象和实现之间固有的绑定关系，使得抽象和实现可以沿着各自的维度来变化。所谓抽象和实现沿着各自维度的变化，也就是说抽象和实现不再在同一个继承层次结构中，而是“子类化”它们，使它们各自都具有自己的子类，以便任何组合子类，从而获得多维度组合对象。
 *
 * 在很多情况下，桥接模式可以取代多层继承方案，多层继承方案违背了“单一职责原则”，复用性较差，且类的个数非常多，桥接模式是比多层继承方案更好的解决方法，它极大减少了子类的个数。
 *
 * 桥接模式提高了系统的可扩展性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统，符合“开闭原则”。
 *
 * 缺点
 *
 * 桥接模式的使用会增加系统的理解与设计难度，由于关联关系建立在抽象层，要求开发者一开始就针对抽象层进行设计与编程。
 *
 * 桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性，如何正确识别两个独立维度也需要一定的经验积累。
 */
public class SmallCrayon extends AbstractCrayon{
    @Override
    public void painting() {
        color.coloring();
        System.out.println("开始绘图");
    }

    public static void main(String[] args) {
        Color blueColor = new BlueColor();
        SmallCrayon smallCrayon = new SmallCrayon();
        smallCrayon.setColor(blueColor);
        smallCrayon.painting();
    }
}
