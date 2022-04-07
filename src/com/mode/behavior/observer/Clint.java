package com.mode.behavior.observer;

/**
 * @Author admin
 * @Date 2022/3/16 11:37
 * @description 观察者模式
 * 优点
 *
 * 观察者模式可以实现表示层和数据逻辑层的分离，定义了稳定的消息更新传递机制，并抽象了更新接口，使得可以有各种各样不同的表示层充当具体观察者角色。
 *
 * 观察者模式在观察目标和观察者之间建立一个抽象的耦合。观察目标只需要维持一个抽象观察者的集合，无须了解其具体观察者。由于观察目标和观察者没有紧密地耦合在一起，因此它们可以属于不同的抽象化层次。
 *
 * 观察者模式支持广播通信，观察目标会向所有已注册的观察者对象发送通知，简化了一对多系统设计的难度。
 *
 * 观察者模式满足“开闭原则”的要求，增加新的具体观察者无须修改原有系统代码，在具体观察者与观察目标之间不存在关联关系的情况下，增加新的观察目标也很方便。
 *
 * 缺点
 *
 * 如果一个观察目标对象有很多直接和间接观察者，将所有的观察者都通知到会花费很多时间。
 *
 * 如果在观察者和观察目标之间存在循环依赖，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
 *
 * 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
 */
public class Clint {
    public static void main(String[] args) {
        NewsMessage newsMessage = new NewsMessage();
        User u1 = new User("张三");
        User u2 = new User("李四");

        newsMessage.register(u1);
        newsMessage.register(u2);

        newsMessage.pushNewsMessage("震惊,某男子竟光天化日下.....");

        System.out.println("--------------李四顶不住震惊部,退订了--------------------");
        newsMessage.remove(u2);
        newsMessage.pushNewsMessage("男默女泪");
    }
}
