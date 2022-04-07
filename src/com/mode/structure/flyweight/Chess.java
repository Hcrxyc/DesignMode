package com.mode.structure.flyweight;

/**
 * @Author admin
 * @Date 2022/3/10 11:54
 * @description
 */
public abstract class Chess {

    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("棋子颜色" + getColor() + ",棋子位置:" + coordinates.getX() + "," + coordinates.getY());
    }
}
