package com.mode.create.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author admin
 * @Date 2022/3/7 17:41
 * @description 原型模式
 * 优点:
 * 当创建新的对象实例较为复杂时，使用原型模式可以简化对象的创建过程，通过复制一个已有实例可以提高新实例的创建效率。
 *
 * 扩展性较好，由于在原型模式中提供了抽象原型类，在客户端可以针对抽象原型类进行编程，而将具体原型类写在配置文件中，增加或减少产品类对原有系统都没有任何影响。
 *
 * 原型模式提供了简化的创建结构，工厂方法模式常常需要有一个与产品类等级结构相同的工厂等级结构，而原型模式就不需要这样，原型模式中产品的复制是通过封装在原型类中的克隆方法实现的，无须专门的工厂类来创建产品。
 *
 * 可以使用深克隆的方式保存对象的状态，使用原型模式将对象复制一份并将其状态保存起来，以便在需要的时候使用（如恢复到某一历史状态），可辅助实现撤销操作。
 *
 * 缺点:
 * 需要为每一个类配备一个克隆方法，而且该克隆方法位于一个类的内部，当对已有的类进行改造时，需要修改源代码，违背了“开闭原则”。
 *
 * 在实现深克隆时需要编写较为复杂的代码，而且当对象之间存在多重的嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来可能会比较麻烦。
 */
public class PrototypeMain {
    public static void main(String[] args) throws Exception {
        //浅克隆
        ArrayList<String> courseL = new ArrayList<>();
        courseL.add("语文");
        courseL.add("数学");
        System.out.println("----------------浅克隆--------------");
        ShallowClone sc1 = new ShallowClone( "张三",courseL);
        ShallowClone sc2 = (ShallowClone) sc1.clone();
        System.out.println(sc1);
        System.out.println(sc2);
        //false 克隆出来的对象不同
        System.out.println(sc1 == sc2);
        //true 引用类型的属性不会复制,克隆出的对象与原对象使用的是同一个
        System.out.println(sc1.getCourse() == sc2.getCourse());
        //两个对象的值都会改变,因为引用的是同一个List
        courseL.add("英语");
        System.out.println(sc1);
        System.out.println(sc2);

        System.out.println("----------------深克隆--------------");
        //深克隆
        DeepClone dc1 = new DeepClone("李四",courseL);
        DeepClone dc2 = (DeepClone) dc1.deepClone();
        System.out.println(dc1);
        System.out.println(dc2);
        System.out.println(dc1.getCourse() == dc2.getCourse());
        courseL.add("地理");
        System.out.println(dc1);
        System.out.println(dc2);

    }
}

/**
 * 浅克隆
 */
class ShallowClone implements Cloneable{

    private String name;

    private List<String> course;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ShallowClone(String name, List<String> course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "ShallowClone{" +
                " name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }
}

/**
 * 深克隆, 通过序列化实现
 */
class DeepClone implements Cloneable, Serializable {

    private String name;

    private List<String> course;

    /**
     * 深克隆
     * @return
     * @throws Exception
     */
    public Object deepClone() throws Exception{
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return  ois.readObject();
    }

    public DeepClone(String name, List<String> course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                " name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }
}
