package com.itheima.day16.enumeration;

import org.junit.Test;

import java.util.Scanner;

/**
 * created by Ethan on 2020/10/27 2:11 下午
 */
public class Demo01 {

    /**
     * 枚举类型的使用：在定义枚举时，设置了n个取值,那么此枚举类型的变量，就只能有这n个取值
     * 枚举类型的原理：本质上是类
     */

    @Test
    public void testGender() {
        Person person = new Person("张三", Gender.MALE);
        Person person1 = new Person("翠花", Gender.FEMALE);
        Person person2 = new Person("李四", Gender.MALE);
    }

    @Test
    public void testSeason() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个季节:大写字母");
        Season season = Season.valueOf(sc.next());
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;

            case SUMMER:
                System.out.println("夏天");
                break;

            case WINTER:
                System.out.println("冬天");
                break;

            default:
                System.out.println("输入有误");
                break;
        }
    }
}
