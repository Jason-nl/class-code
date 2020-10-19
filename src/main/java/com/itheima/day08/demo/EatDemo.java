package com.itheima.day08.demo;

import java.util.ArrayList;

public class EatDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        new BaoZiPu(list).start();
        new ChiHuo(list).start();
    }
}
