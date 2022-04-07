package com.mode.behavior.strategy;

/**
 * @Author admin
 * @Date 2022/3/16 16:32
 * @description
 */
public class User {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(Integer a, Integer b) {
        return strategy.calc(a, b);
    }

    public static void main(String[] args) {
        User user = new User();

        user.setStrategy(new AddStrategy());
        int calculate = user.calculate(10, 10);
        System.out.println(calculate);

        user.setStrategy(new SubtractStrategy());
        calculate = user.calculate(10,10);
        System.out.println(calculate);
    }
}
