package com.itheima.day03.code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Jason on 2020/10/6 15:52
 */
public class Test10 {
    public static void main(String[] args) {
        /**
         * 请编写程序，从控制台接收一个“日期”，格式：yyyy-MM-dd，程序将其转换为：xxxx年xx月xx日的格式输出到控制台
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个日期: 格式：yyyy-MM-dd");
        String date = scanner.next();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");

        try {
            Date newDate = sdf1.parse(date);
            String result = sdf2.format(newDate);
            System.out.println(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
