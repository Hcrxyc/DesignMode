package com.mode.behavior.chainofresponsibility;

/**
 * @Author admin
 * @Date 2022/3/10 18:38
 * @description
 */
public class Manager extends Approver {

    @Override
    public void processRequest(Integer amount) {
        if (amount > 5000) {
            successor.processRequest(amount);
        } else {
            System.out.println("经理审批通过:" + amount);
        }
    }
}
