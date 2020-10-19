package com.itheima.day03.code;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Jason on 2020/10/6 15:26
 */
public class Test08 {
    public static void main(String[] args) throws Exception {
        /**
         * 请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。
         *
         * ​    **注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！**
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生日日期: 按照以下格式:yyyy-MM-dd");
        String birthday = scanner.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();

        long nd = 1000 * 24 * 60 * 60;//一天的毫秒数
        try {
            Date bir = sdf.parse(birthday);
            long time = Math.abs(today.getTime() - bir.getTime());
            long day = time / nd;
            System.out.println("他来到世界" + day + "天");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
