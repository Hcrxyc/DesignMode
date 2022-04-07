package com.mode.behavior.chainofresponsibility;

/**
 * @Author admin
 * @Date 2022/3/10 18:25
 * @description
 */
public abstract class Approver {
    protected Approver successor;

    public abstract void processRequest(Integer amount);

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
}
