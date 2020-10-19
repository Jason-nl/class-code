package com.itheima.day04.task01;

import java.util.ArrayList;
import java.util.Iterator;

public class Test04 {
    public static void main(String[] args) {
        /**
         * 需求：
         *
         * 1. 自定义人类:包含姓名,年龄,身高属性，私有成员变量,生成无参,有参构造方法,生成get/set方法；
         *
         * 2. 创建5个人放到ArrayList中；
         *
         * 3. 使用迭代器获取每个人的信息：找出最高的人,最矮的人，并输出最高人和最矮人的信息。
         *
         *   打印格式为：最高的人是张三,身高1.80；最矮的人是李四,身高1.60 。
         */

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 23, 1.80));
        list.add(new Person("李四", 23, 1.60));
        list.add(new Person("王五", 23, 1.77));
        list.add(new Person("赵六", 23, 1.67));
        list.add(new Person("谭七", 23, 1.78));

        double maxWidth = list.get(0).getWidth();
        double minWidth = list.get(0).getWidth();
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getWidth() >= maxWidth) {
                maxWidth = p.getWidth();
                if (p.getWidth() == maxWidth) {
                    System.out.println("最高的人是" + p.getName() + ",身高" + p.getWidth());
                }
            }

            if (p.getWidth() < minWidth) {
                minWidth = p.getWidth();
                if (p.getWidth() == minWidth) {
                    System.out.println("最矮的人是"+p.getName() + ",身高" + p.getWidth());
                }
            }
        }
    }
}

class Person {
    private String name;
    private int age;
    private double width;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", width=" + width +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Person() {
    }

    public Person(String name, int age, double width) {
        this.name = name;
        this.age = age;
        this.width = width;
    }
}