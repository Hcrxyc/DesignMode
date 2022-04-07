package com.mode.behavior.mediator;

/**
 * @Author admin
 * @Date 2022/3/15 14:35
 * @description 中介者模式
 * 优点
 *
 *  中介者模式简化了对象之间的交互，它用中介者和同事的一对多交互代替了原来同事之间的多对多交互，一对多关系更容易理解、维护和扩展，将原本难以理解的网状结构转换成相对简单的星型结构。
 *
 * 中介者模式可将各同事对象解耦。中介者有利于各同事之间的松耦合，我们可以独立的改变和复用每一个同事和中介者，增加新的中介者和新的同事类都比较方便，更好地符合“开闭原则”。
 *
 * 可以减少子类生成，中介者将原本分布于多个对象间的行为集中在一起，改变这些行为只需生成新的中介者子类即可，这使各个同事类可被重用，无须对同事类进行扩展。
 *
 * 缺点
 *
 * 在具体中介者类中包含了大量同事之间的交互细节，可能会导致具体中介者类非常复杂，使得系统难以维护。
 */
public class Clint {
    public static void main(String args[]) {
        //定义中介者对象
        ConcreteMediator mediator = new ConcreteMediator();

        //定义同事对象
        AddButton addBT = new AddButton();
        UserList list = new UserList();
        TextBox textBox = new TextBox();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        textBox.setMediator(mediator);

        mediator.addButton = addBT;
        mediator.list = list;
        mediator.textBox = textBox;

        addBT.changed();
        System.out.println("-----------------------------");
        list.changed();
        System.out.println("-----------------------------");
        textBox.changed();
    }
}
