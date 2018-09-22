package com.kn.singleton;

/**
 * Singleton3
 *      双重检查
 *
 *      线程安全；延迟加载；效率较高
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
