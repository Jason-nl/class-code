package com.itheima.day04.task01;

import java.util.ArrayList;
import java.util.Vector;

public class Test07 {
    /**
     * 需求：使用ArrayList集合，模拟实现一个栈；要求：
     *  栈的特点: 单开口 先进后出
     * - 提供入栈、出栈和获取栈长度的功能；
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Vector<Integer> vector = new Vector<>();

        MyStack<String> stack = new MyStack<>();
        stack.add("111");
        stack.add("222");
        stack.add("333");

        while (stack.getSize() > 0) {
            System.out.println(stack.delete());
        }
    }

}

class MyStack<T>{

    ArrayList<T> list = new ArrayList<>();

    // 入栈
    public void add(T t) {
        list.add(t);
    }

    // 出栈
    public T delete() {
        return list.remove(list.size() - 1);
    }

    // 获取栈的长度
    public int getSize() {
        return list.size();
    }
}


