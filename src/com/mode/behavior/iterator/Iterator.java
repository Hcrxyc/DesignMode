package com.mode.behavior.iterator;

/**
 * @Author admin
 * @Date 2022/3/14 16:19
 * @description
 */
public interface Iterator {
    void next(); //移至下一个元素

    boolean isLast(); //判断是否为最后一个元素

    void previous(); //移至上一个元素

    boolean isFirst(); //判断是否为第一个元素

    Object getNextItem(); //获取下一个元素

    Object getPreviousItem(); //获取上一个元素

}
