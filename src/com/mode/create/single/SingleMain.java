package com.mode.create.single;

/**
 * @Author admin
 * @Date 2022/3/2 17:13
 * @description 单例模式
 * 总结：
 * 需要延时加载：静态内部类方式
 * 不需要延时加载：枚举方式
 */
public class SingleMain {
    public static void main(String[] args) {
        System.out.println(LHSingle.getInstance() == LHSingle.getInstance());
        System.out.println(EHSingle.getInstance() == EHSingle.getInstance());
        System.out.println(Single.SINGLE == Single.SINGLE);
    }
}

/**
 * 饿汉式 , 类初始化时实例化单例对象
 * 不能延时加载,无锁 效率高
 */
class EHSingle {
    private static EHSingle ehSingle = new EHSingle();

    private EHSingle() {}

    public static EHSingle getInstance() {
        return ehSingle;
    }
}

/**
 * 懒汉式 , 使用时实例化单例对象
 * 线程不安全，可能会出现多个实例
 * 解决方案 :  同步锁
 *            双重检测锁(同步锁的优化方案,真正实例化时才加锁)
 *            静态内部类,延时加载,线程安全  建议使用
 */
class LHSingle {
    private static LHSingle lhSingle = null;

    private LHSingle() {
    }


    /**
     * 普通懒汉式
     */
   /* public static LHSingle getInstance() {
        if(null == lhSingle){
            lhSingle = new LHSingle();
        }
        return lhSingle;
    }
   */

    /**
     * 直接加同步锁 线程安全,效率低
     */
    /*public synchronized static LHSingle getInstance() {
        if(null == lhSingle){
            lhSingle = new LHSingle();
        }
        return lhSingle;
    }*/

    /**
     * 双重检测锁,同步锁优化方案,真正实例化时才加锁
     */
    /*public static LHSingle getInstance() {
        if (null == lhSingle) {
            synchronized (LHSingle.class) {
                if (null == lhSingle) {
                    lhSingle = new LHSingle();
                }
            }
        }
        return lhSingle;
    }*/

    /**
     * 静态内部类,延时加载,线程安全
      */
    private static class LHSingleLazy{
        private static  final  LHSingle LH_SINGLE = new LHSingle();
    }
    public  static final LHSingle getInstance(){
        return LHSingleLazy.LH_SINGLE;
    }

}

/**
 * 枚举方式
 */
enum Single{
    SINGLE
}
