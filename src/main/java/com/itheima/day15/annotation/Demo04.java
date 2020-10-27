package com.itheima.day15.annotation;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * created by Jason on 2020/10/26 2:25 下午
 */
public class Demo04 {

    @Test
    public void testSpeak() throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 1.将属性name上的注解value赋值给name
        Student student = new Student();
        Class<? extends Student> cls = student.getClass();
        Field name = cls.getField("name");
        MyAnno4 anno4 = name.getAnnotation(MyAnno4.class);
        name.set(student, anno4.value());
        System.out.println(student);

        // 2. 将方法speak上的注解赋值给参数name
        Method speak = cls.getMethod("speak", String.class);
        MyAnno4 myAnno4 = speak.getAnnotation(MyAnno4.class);
        speak.invoke(student, myAnno4.value());
    }
}
