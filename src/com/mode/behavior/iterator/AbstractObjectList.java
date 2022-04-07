package com.mode.behavior.iterator;

import java.util.List;

/**
 * @Author admin
 * @Date 2022/3/14 16:21
 * @description
 */
public abstract class AbstractObjectList {
    protected List<Object> objects;

    public AbstractObjectList(List objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List getObjects() {
        return this.objects;
    }

    //声明创建迭代器对象的抽象工厂方法
    public abstract Iterator createIterator();
}
