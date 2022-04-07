package com.mode.behavior.memento;

/**
 * @Author admin
 * @Date 2022/3/15 16:16
 * @description
 */
public class Originator {
    private Integer state;

    public Memento save() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }

    public void display() {
        System.out.println("当前状态为:" + state);
    }

    public Originator(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
