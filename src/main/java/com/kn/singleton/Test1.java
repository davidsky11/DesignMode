package com.kn.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Test1
 *
 * @author KVLT
 * @date 2018-09-29.
 */
public class Test1 {

    public static void main(String[] args) throws Exception {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        // 1、通过反射的方式直接调用私有构造器
        // 解决办法：在私有构造器里处理
        /*Class<Singleton1> clazz = (Class<Singleton1>) Class.forName("com.kn.singleton.Singleton1");
        Constructor<Singleton1> constructor = clazz.getDeclaredConstructor(null);

        constructor.setAccessible(true);  // 不检查
        Singleton1 s3 = constructor.newInstance();
        Singleton1 s4 = constructor.newInstance();

        System.out.println(s3);
        System.out.println(s4);*/

        // 2、通过反序列化的方式
        // implements Serializable
        // 实现 readResolve() 方法
        String filePath = "d:/a.txt";
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);  // 将s1写入
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        Singleton1 s5 = (Singleton1) ois.readObject();
        System.out.println(s5);
    }
}
