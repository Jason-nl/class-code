package com.itheima.day15.annotation;

/**
 * created by Jason on 2020/10/26 11:04 上午
 */
@Anno2(name = "ethan")
public class Demo02 {
    /*
        注解：annotation(注释；注解)
            1. 概念
                1. 注释：给程序员看的配置数据(不参与编译,运行)
                2. 注解：给程序看的配置数据(参与编译,运行)
            2. 注解是Java四大类型(class,interface,annotation,enum)
                1. 生成帮助文档：@author和@version
                2. 编译检查：@override @FunctionalInterface
                3. 配置

            定义注解：
                1. 关键字 @interface
                2. 注解只有属性没有方法
                3. 属性的定义
                        类型 变量名();
                        属性的类型有且仅有
                            八种基本数据类型(byte short int long float double char boolean)
                            String Class 注解类型 枚举类
                            以上类型的数组形式
                注解的使用：
                        配置，还未解析
                注解配置的注意：
                    1. 可以放在很多位置(类,属性,方法,构造,局部变量...)
                    2. 所有的属性必须都要赋值
                        1. 默认初始值 String name() default "Jason"
                        2. 手动赋值   @MyAnno2(name="Ethan",age=3)
                        3. 特殊情况
                            1. 如果属性名为value,且只给value赋值，赋值的时候value=可以省略
                             @Anno2("val1") 这种可以省略
                             @Anno2(value="val2",age=18) 这种就不可以省略
                            2. 如果属性是数组类型,并且赋值的时候元素只有一个,大括号可以省略
                            @Anno2(arr = {"1", "2", "3"})
                            @Anno2(arr = "1")
     */

    @Anno2(name = "field")
    int anInt;

    @Anno2("methodDeclared")
    public static void main(@Anno2(name = "arguments") String[] args) {

        @Anno2(arr = {"1", "2", "3"})
        int field1 = 10;

        @Anno2(arr = "1")
        int field2 = 20;

    }
}
