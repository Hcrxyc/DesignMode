package com.mode.structure.flyweight;

/**
 * @Author admin
 * @Date 2022/3/10 11:55
 * @description
 */
public class Coordinates {
    private Integer x;

    private Integer y;

    public Coordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

     public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
