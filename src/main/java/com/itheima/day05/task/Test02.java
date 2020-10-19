package com.itheima.day05.task;

import java.util.HashSet;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        /*
        需求：双色球规则，双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
        红色球号码从1—33中选择，红球不可重复；蓝色球号码从1—16中选择。请随机生成一注双色球号码。
         */
        Random random = new Random();
        HashSet<Integer> redSet = new HashSet<>();

        while (redSet.size() < 6) {
            Integer redBall = random.nextInt(33) + 1;
            redSet.add(redBall);
        }

//        System.out.println(redSet);
        Integer blueBall = random.nextInt(16) + 1;

        for (Integer ball : redSet) {
            System.out.print("红球是:" + ball + " ");
        }
        System.out.println();
        System.out.println("篮球是:" + blueBall);
    }
}
