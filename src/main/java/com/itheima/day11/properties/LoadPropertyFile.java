package com.itheima.day11.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Jason on 2020/10/20 16:26
 */
public class LoadPropertyFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/data.properties"));
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            System.out.println(user + "-" + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
