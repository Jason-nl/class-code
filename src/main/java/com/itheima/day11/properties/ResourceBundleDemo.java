package com.itheima.day11.properties;

import java.util.ResourceBundle;

/**
 * Created by Jason on 2020/10/20 16:39
 */
public class ResourceBundleDemo {
    public static void main(String[] args) {
        ResourceBundle data = ResourceBundle.getBundle("data");
        String user = data.getString("user");
        System.out.println(user);

        String password = data.getString("password");
        System.out.println(password);
    }
}
