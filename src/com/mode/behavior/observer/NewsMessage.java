package com.mode.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author admin
 * @Date 2022/3/16 11:31
 * @description
 */
public class NewsMessage implements Message {

    private List<Observer> observers = new ArrayList<>();

    private String message;

    public void pushNewsMessage(String message) {
        System.out.println("推送新闻消息");
        this.message = message;
        notifyO();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyO() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
