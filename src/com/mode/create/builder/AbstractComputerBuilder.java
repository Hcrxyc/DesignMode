package com.mode.create.builder;

/**
 * @Author admin
 * @Date 2022/3/2 18:38
 * @description
 */
public abstract class AbstractComputerBuilder {
    //创建产品对象
    protected Computer computer = new Computer();

    public abstract void buildMaster();

    public abstract void buildKeyboard();

    public abstract void buildMouse();

    public abstract void buildScreen();

    /**
     * 返回产品对象
     */
    public Computer getResult() {
        return computer;
    }

}
