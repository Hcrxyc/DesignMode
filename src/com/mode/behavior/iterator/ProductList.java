package com.mode.behavior.iterator;

import java.util.List;

/**
 * @Author admin
 * @Date 2022/3/14 16:22
 * @description
 */
public class ProductList extends AbstractObjectList{
    public ProductList(List products) {
        super(products);
    }

    //实现创建迭代器对象的具体工厂方法
    @Override
    public Iterator createIterator() {
        return new ProductIterator(this);
    }
}
