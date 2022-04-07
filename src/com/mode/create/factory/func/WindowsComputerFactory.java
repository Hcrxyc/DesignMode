package com.mode.create.factory.func;

import com.mode.create.factory.Computer;
import com.mode.create.factory.WindowsComputer;

/**
 * @Author admin
 * @Date 2022/3/2 14:22
 * @description 工厂方法实现类
 *
 *  优点:
 *  在工厂方法模式中，工厂方法用来创建客户所需要的产品，同时还向客户隐藏了哪种具体产品类将被实例化这一细节，用户只需要关心所需产品对应的工厂，无须关心创建细节。
 *
 *  在系统中加入新产品时，无须修改抽象工厂和抽象产品提供的接口，无须修改客户端，也无须修改其他的具体工厂和具体产品，而只要添加一个具体工厂和具体产品就可以了，系统的可扩展性变得非常好，完全符合开闭原则。
 *
 *  缺点:
 *  增加了很多类,在一定程度上增加了系统的复杂度，有更多的类需要编译和运行，会给系统带来一些额外的开销。
 */
public class WindowsComputerFactory implements ComputerFactory{

    @Override
    public Computer createComputer() {
        return new WindowsComputer();
    }

    public static void main(String[] args) {
        ComputerFactory computerFactory =  new AppleComputerFactory();
        Computer computer = computerFactory.createComputer();
        System.out.println(computer.hi());
    }
}
