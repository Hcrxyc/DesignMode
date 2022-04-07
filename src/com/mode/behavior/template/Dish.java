package com.mode.behavior.template;

/**
 * @Author admin
 * @Date 2022/3/16 17:46
 * @description
 */
public abstract class Dish {

    //具体的整个过程
    public void doDish() {
        this.preparation();
        this.doing();
        this.spicy();
        this.carriedDishes();
    }

    //备料
    public abstract void preparation();

    //做菜
    public abstract void doing();

    //钩子方法,是否加辣,空实现子类根据情况实现,
    //用钩子方法可以在子类控制父类的流程(钩子方法返回 Boolean)
    public void spicy(){}

    //上菜
    public abstract void carriedDishes();
}
