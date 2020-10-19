package com.itheima.day04.task01;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(listTest(list, 4));
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        for (int i = 0; i < al.size(); i++) {
            if (s.equals(al.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
