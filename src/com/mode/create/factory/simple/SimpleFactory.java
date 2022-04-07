package com.mode.create.factory.simple;


import com.mode.create.factory.AppleComputer;
import com.mode.create.factory.Computer;
import com.mode.create.factory.WindowsComputer;

/**
 * @Author admin
 * @Date 2022/3/2 11:48
 * @description 简单工厂模式
 * 以抽象类为例, 接口同
 *
 *  优点:
 *
 *  将对象的创建和对象本身业务处理分离可以降低系统的耦合度，使得两者修改起来都相对容易。
 *
 *  当你需要什么，只需要传入一个正确的参数，就可以获取你所需要的对象，而无须知道其创建细节。
 *
 *  缺点:
 *
 *  工厂类的职责相对过重，且增加新的产品需要修改工厂类的逻辑，这与开闭原则是相违背的。
 *
 */
public class SimpleFactory {

    public static Computer createComputer(String type){
        Computer computer = null;
        if("windows".equals(type)){
            computer = new WindowsComputer();
        }else if("apple".equals(type)){
            computer =  new AppleComputer();
        }
        return computer;
    }

    public static void main(String[] args) {
        Computer computer = SimpleFactory.createComputer("windows");
        System.out.println(computer.hi());
    }

}
