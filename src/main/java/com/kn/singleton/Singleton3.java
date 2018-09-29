package com.kn.singleton;

/**
 * Singleton3
 *      双重检测锁式（不推荐使用）
 *
 *      线程安全；延迟加载；效率较高
 *
 *      问题：
 *          由于编译器优化原因和JVM底层内部模型原因，偶尔会出问题，不建议使用
 * @author KVLT
 * @date 2018-09-22.
 */
public class Singleton3 {

    private static volatile Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }

        return instance;
    }
}
