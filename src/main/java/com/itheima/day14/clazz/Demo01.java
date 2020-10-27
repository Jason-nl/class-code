package com.itheima.day14.clazz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * created by Jason on 2020/10/25 2:20 下午
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
//        1. 创建类的实例。
        // Student student = new Student();
        Class<Student> clazz = Student.class;
        ClassLoader loader1 = clazz.getClassLoader();
        System.out.println(loader1);

        ClassLoader loader2 = loader1.getParent();
        System.out.println(loader2);

        ClassLoader loader3 = loader2.getParent();
        System.out.println(loader3); //null : 启动类加载器(用C/C++写的)
//        2. 类的静态变量，或者为静态变量赋值。
        // Student.age = 2;

//        3. 类的静态方法。
            //Student.speak();
//        4. 使用反射方式来强制创建某个类或接口对应的java.lang.Class对象。
        // Class<Student> clazz = (Class<Student>) Class.forName("com.itheima.day14.clazz.Student");
//        5. 初始化某个类的子类。
        // Son son = new Son();
//        6. 直接使用java.exe命令来运行某个主类。

//        以上六种情况的任何一种，都可以导致JVM将一个类加载到方法区。


        /*
        javase工程文件必须放在src(类路径) 底层用的是类加载器
        类路径：
            1、类加载器的工作路径
                .class文件加载内存中
            2、源码
                src下的内容 编译到 类路径下
         */
        Properties properties = new Properties();
//        FileInputStream fis = new FileInputStream("src/main/resources/data.properties");
        InputStream fis = Class.forName("com.itheima.day14.clazz.Demo01").getClassLoader().getResourceAsStream("data.properties");
        properties.load(fis);
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("password");
        System.out.println(user);
        System.out.println(pwd);

        ResourceBundle bundle = ResourceBundle.getBundle("data");
        String name = bundle.getString("user");
        String password = bundle.getString("password");
    }
}
