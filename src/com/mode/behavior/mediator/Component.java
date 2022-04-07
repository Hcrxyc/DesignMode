package com.mode.behavior.mediator;

/**
 * @Author admin
 * @Date 2022/3/15 11:52
 * @description
 */
public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
