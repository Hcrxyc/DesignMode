package com.mode.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author admin
 * @Date 2022/3/9 14:07
 * @description 组合模式
 * 优点
 *
 * 组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制。
 *
 * 客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码。
 *
 * 在组合模式中增加新的容器构件和叶子构件都很方便，无须对现有类库进行任何修改，符合“开闭原则”。
 *
 * 组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和容器对象的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。
 *
 * 缺点
 *
 * 在增加新构件时很难对容器中的构件类型进行限制。有时候我们希望一个容器中只能有某些特定类型的对象，例如在某个文件夹中只能包含文本文件，使用组合模式时，不能依赖类型系统来施加这些约束，因为它们都来自于相同的抽象层，在这种情况下，必须通过在运行时进行类型检查来实现。
 */
public class Folder extends AbstractFile{
    private List<AbstractFile> fileList = new ArrayList<>();

    private String name;

    @Override
    public void add(AbstractFile af) {
        fileList.add(af);
    }

    @Override
    public void remove(AbstractFile af) {
        fileList.remove(af);
    }

    @Override
    public AbstractFile getChild(Integer index) {
        return fileList.get(index);
    }

    @Override
    public void operation() {
        System.out.println("操作文件夹:" + name);
        //递归调用文件夹中的操作
        for (AbstractFile abstractFile : fileList) {
            abstractFile.operation();
        }
    }

    public Folder(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        File t1 = new File("t1.txt");
        File t2 = new File("t2.txt");
        Folder tFolder = new Folder("文本文件夹");
        tFolder.add(t1);
        tFolder.add(t2);

        File v1 = new File("v1.rmvb");
        File v2 = new File("v2.rmvb");
        Folder vFolder = new Folder("视频文件夹");
        vFolder.add(v1);
        vFolder.add(v2);

        Folder folder = new Folder("总文件夹");
        folder.add(tFolder);
        folder.add(vFolder);

        folder.operation();
        System.out.println("------------------");
        t1.getChild(0);
    }
}
