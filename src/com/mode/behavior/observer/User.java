package com.mode.behavior.observer;

/**
 * @Author admin
 * @Date 2022/3/16 11:28
 * @description
 */
public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到消息：" + message);
    }
}
