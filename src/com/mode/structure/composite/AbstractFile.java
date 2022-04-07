package com.mode.structure.composite;

/**
 * @Author admin
 * @Date 2022/3/9 14:00
 * @description
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile af);
    public abstract void remove(AbstractFile af);
    public abstract AbstractFile getChild(Integer index);
    public abstract void operation();
}
