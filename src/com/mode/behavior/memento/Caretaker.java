package com.mode.behavior.memento;

/**
 * @Author admin
 * @Date 2022/3/15 16:19
 * @description 备忘录模式
 * 优点
 *
 * 它提供了一种状态恢复的实现机制，使得用户可以方便地回到一个特定的历史步骤，当新的状态无效或者存在问题时，可以使用暂时存储起来的备忘录将状态复原。
 *
 * 备忘录实现了对信息的封装，一个备忘录对象是一种原发器对象状态的表示，不会被其他代码所改动。备忘录保存了原发器的状态，采用列表、堆栈等集合来存储备忘录对象可以实现多次撤销操作。
 *
 * 缺点
 *
 * 资源消耗过大，如果需要保存的原发器类的成员变量太多，就不可避免需要占用大量的存储空间，每保存一次对象的状态都需要消耗一定的系统资源。
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public static void main(String[] args) {
        Originator originator = new Originator(1);
        Caretaker caretaker = new Caretaker();

        originator.display();
        System.out.println("-----------保存当前状态-----------");
        caretaker.setMemento(originator.save());

        originator.setState(5);
        originator.display();
        System.out.println("-----------撤销状态变更-----------");
        originator.restore(caretaker.getMemento());

        originator.display();
    }
}
