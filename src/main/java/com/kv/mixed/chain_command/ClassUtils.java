package com.kv.mixed.chain_command;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassUtils
 *
 * @author KVLT
 * @date 2020-11-07.
 */
public class ClassUtils {

    // 根据父类查找到所有的子类，默认情况是子类和父类都在同一个包名下
    public static List<Class> getSonClass(Class fatherClass) {
        // 过程不重要，省略
        return new ArrayList<>();
    }

    // 从一个包中查找出所有的类，在jar包中不能查找
    private static List<Class> getClassed(String packageName) {
        // 过程不重要，省略
        return null;
    }

}
