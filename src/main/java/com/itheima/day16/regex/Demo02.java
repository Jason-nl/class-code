package com.itheima.day16.regex;

import org.junit.Test;

public class Demo02 {

    @Test
    public void m1() {
        String regex = "[abc]";
        String str = "d";
        boolean matches = str.matches(regex);
        System.out.println(matches);
    }

    @Test
    public void m2() {
        String regex = "[a-z]&&[^bcd]";
        String str = "b";
        boolean matches = str.matches(regex);
        System.out.println(matches);
    }

    @Test
    public void m3() {
        String regex = ".";
        String str = ";";
        boolean matches = str.matches(regex);
        System.out.println(matches);
    }
}
