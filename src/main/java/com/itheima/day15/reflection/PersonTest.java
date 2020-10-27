package com.itheima.day15.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * created by Jason on 2020/10/26 9:07 上午
 */
public class PersonTest {
    @Test
    public void testSpeak() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        Class<? extends Person> cls = person.getClass();
        Method speak = cls.getMethod("speak", String.class, int.class);

        Object invoke = speak.invoke(person, "木头人", 123);
        System.out.println(invoke);

    }

    @Test
    public void testShow() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        Class<? extends Person> cls = person.getClass();
        Method show = cls.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        Object invoke = show.invoke(person, "123木头人");

    }

    @Test
    public void testField() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();
        Class<? extends Person> cls = person.getClass();
        Field name = cls.getField("name");
        name.set(person,"123木头人");
        System.out.println(person);

        Object value = name.get(person);
        System.out.println(value);
    }

    @Test
    public void testFieldAccess() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<Person> cls = Person.class;
        Person person = cls.newInstance();
        Field age = cls.getDeclaredField("age");
        age.setAccessible(true);
        age.set(person, 23);

        Object value = age.get(person);
        System.out.println(value);
    }
}
