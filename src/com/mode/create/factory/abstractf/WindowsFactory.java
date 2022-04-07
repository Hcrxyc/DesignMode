package com.mode.create.factory.abstractf;

/**
 * @Author admin
 * @Date 2022/3/2 15:48
 * @description 抽象工厂方法
 *
 * 优点:
 *  抽象工厂模式隔离了具体类的生成，使得客户并不需要知道什么被创建。由于这种隔离，更换一个具体工厂就变得相对容易，所有的具体工厂都实现了抽象工厂中定义的那些公共接口，因此只需改变具体工厂的实例。
 *
 *  当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象。
 *
 *  增加新的产品族很方便，无须修改已有系统，符合“开闭原则”。
 *
 *  缺点:
 *  增加新的产品等级结构麻烦，对原有系统进行较大的修改，需要修改抽象层代码，这显然会带来较大的不便，违背了“开闭原则”。
 */
public class WindowsFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new WindowsComputer();
    }

    @Override
    public Software createSoftware() {
        return new WindowsSoftware();
    }

    public static void main(String[] args) {
        ComputerFactory computerFactory = new WindowsFactory();
        Computer computer = computerFactory.createComputer();
        Software software = computerFactory.createSoftware();
        System.out.println(computer.hi());
        System.out.println(software.use());
    }
}
