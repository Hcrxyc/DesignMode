package com.mode.structure.adapter;

/**
 * @Author admin
 * @Date 2022/3/8 16:47
 * @description 适配器模式 , 对象适配器模式
 * 在对象适配器模式中，适配器与适配者之间是关联关系。
 * **优点：**
 * 无论是对象适配器模式还是类适配器模式都具有如下优点：
 *
 * 将目标类和适配者类解耦，通过引入一个适配器类来重用现有的适配者类，无须修改原有结构。
 *
 * 增加了类的透明性和复用性，将具体的业务实现过程封装在适配者类中，对于客户端类而言是透明的，而且提高了适配者的复用性，同一个适配者类可以在多个不同的系统中复用。
 *
 *
 * **具体来说，类适配器模式还有如下优点：**
 *
 * 由于适配器类是适配者类的子类，因此可以在适配器类中置换一些适配者的方法，使得适配器的灵活性更强。
 *
 * **对象适配器模式还有如下优点：**
 *
 * 一个对象适配器可以把多个不同的适配者适配到同一个目标；
 *
 * 可以适配一个适配者的子类，由于适配器和适配者之间是关联关系，根据“里氏代换原则”，适配者的子类也可通过该适配器进行适配。
 *
 * **缺点：**
 *
 * **类适配器模式的缺点如下：**
 *
 * 对于Java、C#等不支持多重类继承的语言，一次最多只能适配一个适配者类，不能同时适配多个适配者；
 *
 * 适配者类不能为最终类，如在Java中不能为final类，C#中不能为sealed类；
 *
 * 在Java、C#等语言中，类适配器模式中的目标抽象类只能为接口，不能为类，其使用有一定的局限性。
 *
 * **对象适配器模式的缺点如下：**
 *
 * 与类适配器模式相比，要在适配器中置换适配者类的某些方法比较麻烦。如果一定要置换掉适配者类的一个或多个方法，可以先做一个适配者类的子类，将适配者类的方法置换掉，然后再把适配者类的子类当做真正的适配者进行适配，实现过程较为复杂。
 */
public class UsbObjectAdapter implements Usb {
    private Vga vga  = new Vga();

    @Override
    public void connectUsb() {
        System.out.println("USB 连接转为 VGA 连接");
        vga.connectVga();
    }

    public static void main(String[] args) {
        Usb usbAdapter = new UsbObjectAdapter();
        usbAdapter.connectUsb();
    }
}
