package com.mode.behavior.command;

/**
 * @Author admin
 * @Date 2022/3/11 17:23
 * @description
 */
public class CommandOn implements Command{

    private Tv tv;

    public CommandOn(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
