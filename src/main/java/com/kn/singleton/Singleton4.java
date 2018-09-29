package com.kn.singleton;

/**
 * Singleton4
 *      静态内部类实现（类的初始化方式，利用虚拟机的类初始化机制创建单例）
 *
 *      1、并发高效调用：getInstance()方法中没有锁，在高并发环境下性能优越
 *      2、延迟加载：只有在getInstance()第一次调用时，实例才会被创建
 *
 *      缺点：
 *          - 反射依然可以new 实例
 *          - 在遇到序列化对象时，默认的方式运行得到的结果就是多例的。
 * @author KVLT
 * @date 2018-09-22.
 */
public class Singleton4 {

    private Singleton4() {}

    private static class SingletonHolder {
        private static Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.instance;
    }

}
