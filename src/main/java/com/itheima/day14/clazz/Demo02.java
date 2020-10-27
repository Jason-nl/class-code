package com.itheima.day14.clazz;

/**
 * created by Jason on 2020/10/25 3:45 下午
 */
public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> cls1 = Student.class;
        Class<Student> cls2 = (Class<Student>) new Student().getClass();
        Class<?> cls3 = Class.forName("com.itheima.day14.clazz.Student");
        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls1 == cls2 && cls1 == cls3);

        ClassLoader loader = cls1.getClassLoader();
        System.out.println(loader);


    }
}
