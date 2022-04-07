package com.mode.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author admin
 * @Date 2022/3/14 16:24
 * @description 迭代器模式
 * 优点
 *
 * 它支持以不同的方式遍历一个聚合对象，在同一个聚合对象上可以定义多种遍历方式。在迭代器模式中只需要用一个不同的迭代器来替换原有迭代器即可改变遍历算法，我们也可以自己定义迭代器的子类以支持新的遍历方式。
 *
 * 迭代器简化了聚合类。由于引入了迭代器，在原有的聚合对象中不需要再自行提供数据遍历等方法，这样可以简化聚合类的设计。
 *
 * 在迭代器模式中，由于引入了抽象层，增加新的聚合类和迭代器类都很方便，无须修改原有代码，满足“开闭原则”的要求。
 *
 * 缺点
 *
 * 由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。
 *
 * 抽象迭代器的设计难度较大，需要充分考虑到系统将来的扩展，例如JDK内置迭代器Iterator就无法实现逆向遍历，如果需要实现逆向遍历，只能通过其子类ListIterator等来实现，而ListIterator迭代器无法用于操作Set类型的聚合对象。在自定义迭代器时，创建一个考虑全面的抽象迭代器并不是件很容易的事情。
 */
public class Clint {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        AbstractObjectList list;
        Iterator iterator;

        list = new ProductList(products); //创建聚合对象
        iterator = list.createIterator();	//创建迭代器对象

        System.out.println("正向遍历：");
        while(!iterator.isLast()) {
            System.out.print(iterator.getNextItem() + "，");
            iterator.next();
        }
        System.out.println("-----------------------------");
        System.out.println("逆向遍历：");
        while(!iterator.isFirst()) {
            System.out.print(iterator.getPreviousItem() + "，");
            iterator.previous();
        }
    }
}
