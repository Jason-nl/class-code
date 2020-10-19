package com.itheima.day08.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class timerDemo {
    public static void main(String[] args) {
        // 创建一个定时器对象
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
//                System.out.println(Thread.currentThread().getName() + "爆炸了");
//                // 取消定时器
//                timer.cancel();

                // 打印当前时间
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String format = sdf.format(date);
                System.out.println(format);
            }
        };
        System.out.println("计时开始");
//        timer.schedule(task, 3000,1000);
        Calendar cal = Calendar.getInstance();
        cal.set(2020, 9, 16, 17, 52, 01);
        Date time = cal.getTime();
        timer.schedule(task, time);
    }
}
