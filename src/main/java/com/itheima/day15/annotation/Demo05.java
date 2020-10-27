package com.itheima.day15.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * created by Jason on 2020/10/26 2:46 下午
 * 模拟Junit测试框架的底层原理
 */

public class Demo05 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 反射解析，只要带@MyTest注解的方法都需要给我运行
        Class<?> cls = Class.forName("com.itheima.day15.annotation.TestDemo");
        TestDemo demo = (TestDemo) cls.newInstance();
        // 反射TestDemo这个类,获取到所有的public方法
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            // 判断哪个方法上有@MyTest就运行
            if (method.isAnnotationPresent(MyTest.class))
                method.invoke(demo);
        }
    }
}
