package com.mode.behavior.observer;

/**
 * @Author admin
 * @Date 2022/3/16 11:28
 * @description
 */
public interface Message {
    //注册观察者
    void register(Observer o);

    //删除观察者
    void remove(Observer o);

    //通知观察者
    void notifyO();
}
