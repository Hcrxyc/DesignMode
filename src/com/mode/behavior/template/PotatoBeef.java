package com.mode.behavior.template;

/**
 * @Author admin
 * @Date 2022/3/16 17:51
 * @description
 */
public class PotatoBeef extends Dish{
    @Override
    public void preparation() {
        System.out.println("切猪肉和土豆。");
    }

    @Override
    public void doing() {
        System.out.println("将切好的猪肉倒入锅中炒一会然后倒入土豆连炒带炖。");
    }

    @Override
    public void spicy() {
        System.out.println("整点辣椒");
    }

    @Override
    public void carriedDishes() {
        System.out.println("将做好的红烧肉盛进碗里,上菜。");
    }

}
