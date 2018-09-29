package com.kn.singleton;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * Test4Build
 *  多线程环境下测试五种单例方式的性能
 *
 * @author KVLT
 * @date 2018-09-29.
 */
public class Test4Build {

    private static final int threadNum = 20;

    private static final Map<String, Class> singletonMap = new LinkedHashMap<>();

    static {
        singletonMap.put("饿汉模式    ", Singleton1.class);
        singletonMap.put("懒汉模式(锁)", Singleton2.class);
        singletonMap.put("双重校验    ", Singleton3.class);
        singletonMap.put("静态内部类  ", Singleton4.class);
        singletonMap.put("枚举实现    ", Singleton5.class);
    }

    public static void main(String[] args) throws Exception {

        singletonMap.entrySet().stream().forEach(entry -> {
            final long start = System.currentTimeMillis();
            final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

            try {
                Method method = entry.getValue().getMethod("getInstance");
                for (int i = 0; i < threadNum; i++) {
                    new Thread(() -> {
                        try {
                            for (int i1 = 0; i1 < 1000000; i1++) {
                                // 反射会影响一点点性能
                                method.invoke(null, null);
                            }
                        } catch (Exception e) {
                            System.out.println();
                            Thread.currentThread().interrupt();
                        }

                        countDownLatch.countDown();
                    }).start();
                }

                countDownLatch.await();  // main线程阻塞，等待 threadNum 个线程执行完毕
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (Exception e) {

            }

            final long end = System.currentTimeMillis();

            System.out.println(entry.getKey() + "\t\t- 总耗时：" + (end-start));
        });

    }
}
