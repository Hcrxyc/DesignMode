package com.mode.structure.composite;

/**
 * @Author admin
 * @Date 2022/3/9 14:06
 * @description
 */
public class File extends AbstractFile{
    private String name;

    @Override
    public void add(AbstractFile af) {
        System.out.println("读不起,不支持该方法");
    }

    @Override
    public void remove(AbstractFile af) {
        System.out.println("读不起,不支持该方法");
    }

    @Override
    public AbstractFile getChild(Integer index) {
        System.out.println("读不起,不支持该方法");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("操作文件:" + name);
    }

    public File(String name) {
        this.name = name;
    }
}
