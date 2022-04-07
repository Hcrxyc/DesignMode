package com.mode.structure.decorator;

/**
 * @Author admin
 * @Date 2022/3/9 16:57
 * @description 装饰模式
 * 优点
 *
 * 对于扩展一个对象的功能，装饰模式比继承更加灵活性，不会导致类的个数急剧增加。
 *
 * 可以通过一种动态的方式来扩展一个对象的功能，通过配置文件可以在运行时选择不同的具体装饰类，从而实现不同的行为。
 *
 * 可以对一个对象进行多次装饰，通过使用不同的具体装饰类以及这些装饰类的排列组合，可以创造出很多不同行为的组合，得到功能更为强大的对象。
 *
 * 具体构件类与具体装饰类可以独立变化，用户可以根据需要增加新的具体构件类和具体装饰类，原有类库代码无须改变，符合“开闭原则”。
 *
 * 缺点
 *
 * 使用装饰模式进行系统设计时将产生很多小对象，这些对象的区别在于它们之间相互连接的方式有所不同，而不是它们的类或者属性值有所不同，大量小对象的产生势必会占用更多的系统资源，在一定程序上影响程序的性能。
 *
 * 装饰模式提供了一种比继承更加灵活机动的解决方案，但同时也意味着比继承更加易于出错，排错也很困难，对于多次装饰的对象，调试时寻找错误可能需要逐级排查，较为繁琐。
 */
public class BlackBorderDecorator extends  ComponentDecorator{
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }

    public static void main(String[] args) {
        Window window = new Window();
        ScrollBarDecorator scrollBarDecorator = new ScrollBarDecorator(window);
        BlackBorderDecorator blackBorderDecorator = new BlackBorderDecorator(scrollBarDecorator);
        blackBorderDecorator.display();
    }
}
