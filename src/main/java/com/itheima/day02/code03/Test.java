package com.itheima.day02.code03;

/**
 * Created by Jason on 2020/10/6 13:39
 */
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();

        Cat cat1 = (Cat) cat;
        cat1.catchMouse();
    }
}
