package com.mode.behavior.visitor;

/**
 * @Author admin
 * @Date 2022/3/17 17:31
 * @description
 */
public abstract class Dept {
    //声明一组重载的访问方法，用于访问不同类型的具体元素
    public abstract void visit(FullTimeEmployee employee);
    public abstract void visit(PartTimeEmployee employee);
}
