package com.itheima.day14.ioc;

import java.util.ResourceBundle;

/**
 * created by Jason on 2020/10/25 4:53 下午
 */
public class SingerFactor {
    private static Singer singer;

    static {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("singer");
            String clsName = bundle.getString("singer");
            Class<?> cls = Class.forName(clsName);
            singer = (Singer) cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singer getSinger() {
        return singer;
    }
}
