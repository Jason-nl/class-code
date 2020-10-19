package com.itheima.day03.code;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jason on 2020/10/6 15:48
 */
public class Test09 {
    public static void main(String[] args) {
        /**
         * 请在控制台以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印当前系统时间。
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String now = sdf.format(date);
        System.out.println(now);
    }
}
