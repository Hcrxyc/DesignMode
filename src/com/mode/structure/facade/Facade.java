package com.mode.structure.facade;

/**
 * @Author admin
 * @Date 2022/3/9 18:24
 * @description 外观模式
 * 优点
 *
 * 它对客户端屏蔽了子系统组件，减少了客户端所需处理的对象数目，并使得子系统使用起来更加容易。通过引入外观模式，客户端代码将变得很简单，与之关联的对象也很少。
 *
 * 它实现了子系统与客户端之间的松耦合关系，这使得子系统的变化不会影响到调用它的客户端，只需要调整外观类即可。
 *
 * 一个子系统的修改对其他子系统没有任何影响，而且子系统内部变化也不会影响到外观对象。
 *
 * 缺点
 *
 * 不能很好地限制客户端直接使用子系统类，如果对客户端访问子系统类做太多的限制则减少了可变性和灵活性。
 *
 * 如果设计不当，增加新的子系统可能需要修改外观类的源代码，违背了开闭原则。
 */
public class Facade {
    private SubSys1 subSys1 = new SubSys1();
    private SubSys2 subSys2 = new SubSys2();
    private SubSys3 subSys3 = new SubSys3();

    public void method(){
        subSys1.method1();
        subSys2.method2();
        subSys3.method3();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
