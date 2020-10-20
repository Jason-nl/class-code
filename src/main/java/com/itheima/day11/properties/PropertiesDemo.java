package com.itheima.day11.properties;

import java.util.Properties;
import java.util.Set;

/**
 * Created by Jason on 2020/10/20 16:14
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "zl241680");

        Set<String> keySet = properties.stringPropertyNames();
        for (String key : keySet) {
            System.out.println(key);
            String value = properties.getProperty(key);
            System.out.println(key + "-" + value);
        }
    }
}
