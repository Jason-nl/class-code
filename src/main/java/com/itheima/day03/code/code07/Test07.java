package com.itheima.day03.code.code07;

import java.util.Scanner;

/**
 * Created by Jason on 2020/10/6 15:14
 */
public class Test07 {
    public static void main(String[] args) {
        /**
         * 请定义学员类，有以下成员属性：
         *
         * ​       姓名：String类型
         * ​       年龄：int
         * ​       身高：double
         * ​       婚否：boolean
         * ​       性别：char
         * 请从控制台接收以下数据：
         * ​       姓名：王哈哈
         * ​       年龄：24
         * ​       身高：1.82
         * ​       婚否：false
         * ​       性别：男
         * ​       以上数据要求全部使用String类型接收
         * 请创建“学员对象”，并将所有数据转换后，存储到这个对象中，最后打印此对象的所有属性。
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = scanner.next();
        System.out.println("请输入年龄:");
        String age = scanner.next();
        System.out.println("请输入身高:");
        String width = scanner.next();
        System.out.println("请输入是否结婚:");
        String isMarried = scanner.next();
        System.out.println("请输入性别:");
        String gender = scanner.next();

        Student student = new Student(name, Integer.parseInt(age), Double.parseDouble(width), Boolean.parseBoolean(isMarried), gender.charAt(0));
        System.out.println(student);

    }
}

class Student {
    private String name;
    private int age;
    private double width;
    private boolean isMarried;
    private char gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", width=" + width +
                ", isMarried=" + isMarried +
                ", gender=" + gender +
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

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Student() {
    }

    public Student(String name, int age, double width, boolean isMarried, char gender) {
        this.name = name;
        this.age = age;
        this.width = width;
        this.isMarried = isMarried;
        this.gender = gender;
    }
}