package com.itheima.day03.code;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Jason on 2020/10/6 16:03
 */
public class Test11 {
    public static void main(String[] args) {
        /**
         * 请编写程序，使用Calendar类获取日历对象，并分别获取年、月、日、小时、分、秒，并将它们打印到控制台。
         */


        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        //获得年、月、日、时、分、秒并打印在控制台
        System.out.println("年: " + cal.get(Calendar.YEAR));
        System.out.println("月: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分: " + cal.get(Calendar.MINUTE));
        System.out.println("秒: " + cal.get(Calendar.SECOND));
    }
}
