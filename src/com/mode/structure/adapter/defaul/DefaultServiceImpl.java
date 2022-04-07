package com.mode.structure.adapter.defaul;

/**
 * @Author admin
 * @Date 2022/3/8 17:23
 * @description 适配器模式 , 缺省适配器模式
 * 对有大量方法需要实现的接口提供一个抽象父类 , 将全部方法提供一个默认空实现
 * 子类可以有选择性的覆盖所需方法
 */
public class DefaultServiceImpl extends AbstractDefaultService{

    @Override
    public void a() {
        System.out.println("重写 a 方法");
    }

    public static void main(String[] args) {
        DefaultServiceImpl defaultService = new DefaultServiceImpl();
        defaultService.a();
        defaultService.b();
    }
}
