package com.mode.create.builder;

/**
 * @Author admin
 * @Date 2022/3/2 18:39
 * @description
 */
public class Computer {
    /**
     * 定义部件，部件可以是任意类型，包括值类型和引用类型
     */
    private  String master;

    private  String keyboard;

    private  String mouse;

    private  String screen;

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
}
