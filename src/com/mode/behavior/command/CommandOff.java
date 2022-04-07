package com.mode.behavior.command;

/**
 * @Author admin
 * @Date 2022/3/11 17:24
 * @description
 */
public class CommandOff implements Command{

    private Tv tv;

    public CommandOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
