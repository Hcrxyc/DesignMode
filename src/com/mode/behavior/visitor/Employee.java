package com.mode.behavior.visitor;

/**
 * @Author admin
 * @Date 2022/3/17 17:30
 * @description
 */
public abstract class Employee {
    //接受一个抽象访问者访问
    public abstract void accept(Dept dept);
}
