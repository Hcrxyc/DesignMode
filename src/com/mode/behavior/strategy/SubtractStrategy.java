package com.mode.behavior.strategy;

/**
 * @Author admin
 * @Date 2022/3/16 16:31
 * @description
 */
public class SubtractStrategy implements Strategy{
    @Override
    public int calc(Integer num1, Integer num2) {
        return num1 - num2;
    }
}
