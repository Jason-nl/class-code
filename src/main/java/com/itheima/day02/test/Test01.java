package com.itheima.day02.test;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        Person.name = "jason";

        Person p1 = new Person();
        System.out.println(p1.name);
    }
}

class Person{
    static String name;
}
