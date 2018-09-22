package com.kn.singleton;

/**
 * Singleton5
 *      枚举实现
 *
 *      能避免多线程同步问题，能防止反序列化重新创建新的对象。
 *
 * @author KVLT
 * @date 2018-09-22.
 */
public class Singleton5 {

    // 内部枚举类
    private enum SingletonEnum {
        INSTANCE;
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

    // -------------- 以下为测试代码 -----------
    static class MyThread implements Runnable {

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Singleton5.getInstance().hashCode());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());

        t1.start();
        t2.start();
        t3.start();
    }
}

