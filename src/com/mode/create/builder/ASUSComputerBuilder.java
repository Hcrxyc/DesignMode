package com.mode.create.builder;

/**
 * @Author admin
 * @Date 2022/3/2 18:52
 * @description
 */
public class ASUSComputerBuilder extends AbstractComputerBuilder{

    @Override
    public void buildMaster() {
        computer.setMaster("ASUS ROG败家之眼");
        System.out.println("构建 ASUS ROG败家之眼");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("机械键盘");
        System.out.println("构建 机械键盘");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("罗技G502鼠标");
        System.out.println("构建 罗技G502鼠标");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("ASUS 4K屏");
        System.out.println("构建 ASUS 4K屏");
    }
}
