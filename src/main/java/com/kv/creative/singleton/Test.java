package com.kv.creative.singleton;

public class Test {

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
