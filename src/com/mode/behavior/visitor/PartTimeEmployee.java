package com.mode.behavior.visitor;

/**
 * @Author admin
 * @Date 2022/3/17 17:40
 * @description
 */
public class PartTimeEmployee extends  Employee{
    private String name;

    private Integer wages;

    public PartTimeEmployee(String name, Integer wages) {
        this.name = name;
        this.wages = wages;
    }

    @Override
    public void accept(Dept dept) {
        dept.visit(this);
    }

    public Integer getWages() {
        return wages;
    }
}
