package com.itheima.day04.task01;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 需求：定义一个学生类Student，包含三个属性姓名、年龄、性别，私有成员变量,生成无参，有参构造方法，
         * 生成get/set方法并重写toString()方法。创建三个学生对象存入ArrayList集合中。
         *
         * 1. 遍历集合遍历输出。（输出格式如：姓名：张三, 年龄：23, 性别：男）
         *
         * 2. 求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
         */

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", 23, "男"));
        students.add(new Student("李四", 33, "男"));
        students.add(new Student("王五", 18, "男"));

        int maxAge = students.get(0).getAge();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));

            if (students.get(i).getAge() > maxAge) {
                maxAge = students.get(i).getAge();
                if (students.get(i).getAge() == maxAge) {
                    students.get(i).setName("小猪佩奇");
                }
            }
        }

        System.out.println("============================");
        for (Student student : students) {
            System.out.println(student);
        }


    }
}

class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("姓名：%s, 年龄：%d, 性别：%s", this.name, this.age, this.gender);
    }
}
