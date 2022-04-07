package com.mode.structure.bridge;

/**
 * @Author admin
 * @Date 2022/3/9 10:04
 * @description
 */
public abstract class AbstractCrayon {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void painting();
}
