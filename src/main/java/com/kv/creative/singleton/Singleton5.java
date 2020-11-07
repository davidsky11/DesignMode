package com.kv.creative.singleton;

/**
 * Singleton5
 *      枚举实现
 *
 *      优点：
 *          - 实现简单
 *          - 枚举本身就是单例模式。由JVM从根本上提供保障，避免通过反射和反序列化的漏洞。
 *      缺点：
 *          - 无延迟加载
 *
 *      能避免多线程同步问题，能防止反序列化重新创建新的对象。
 * @author KVLT
 * @date 2018-09-22.
 */
public class Singleton5 {

    // 内部枚举类
    private enum SingletonEnum {
        INSTANCE;  // 枚举元素，本身就是单例对象
        private Singleton5 instance;

        // 枚举类的构造方法在类加载时被实例化
        private SingletonEnum() {
            instance = new Singleton5();
        }

        public Singleton5 getInstance() {
            return instance;
        }
    }

    public static Singleton5 getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }

}

