package com.mode.behavior.memento;

/**
 * @Author admin
 * @Date 2022/3/15 16:16
 * @description
 */
public class Memento {
    private Integer state;

    public Memento(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
