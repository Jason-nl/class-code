package com.itheima.day14.clazz;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * created by Jason on 2020/10/25 4:12 下午
 */
public class Demo03 {

    @Test
    public void testConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 反射的方式创建对象
        Class<Person> cls = Person.class;
        // 获取类中的一个构造器对象
        // public Constructor<T> getConstructor(Class<?>... parameterTypes)
        // parameterTypes参数类型(可变参数)
        // Constructor<Person> constructor = cls.getConstructor(String.class, int.class);
        // getConstructor()只能获取public修饰的构造方法
        // Constructor<Person> constructor = cls.getConstructor();

        Constructor<Person> constructor = cls.getDeclaredConstructor(String.class,int.class);

        // 暴力反射：临时修改可访问权限
        // 暴力反射会破坏类的封装性，通常情况下不推荐使用
        constructor.setAccessible(true);

        // IllegalAccessException
        Person guyue = constructor.newInstance("古月", 23);
//        Person guyue = constructor.newInstance();
        System.out.println(guyue);
    }

    @Test
    public void testConstructor2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> cls = Class.forName("com.itheima.day14.clazz.Person");
        Person person = (Person) cls.newInstance();
        System.out.println(person);
    }
}
