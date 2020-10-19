package com.itheima.day04.code01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
    /**
     * # 编程题【增强for】
     * <p>
     * ## 题目
     * <p>
     * 请定义一个Collection类型的集合，存储以下分数信息：
     * <p>
     * 88.5,39.2,77.1,56.8,89,99,59.5
     * <p>
     * 请编程实现以下功能：
     * <p>
     * - 使用增强for遍历所有元素，并打印
     * - 使用增强for遍历所有元素，打印不及格的分数；
     * - 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
     * - 使用增强for遍历所有元素，求出最高分，并打印；
     * <p>
     * <p>
     * (注意：以上所有功能写在一个main()方法中，但请单独实现)
     */

    public static void main(String[] args) {
        Collection<Double> grades = new ArrayList<>();
        grades.add(88.5);
        grades.add(39.2);
        grades.add(77.1);
        grades.add(56.8);
        grades.add(89D);
        grades.add(89D);
        grades.add(99D);
        grades.add(59.5);
        for (Double grade : grades) {
            System.out.println("集合的所有元素:"+grade);
        }

        for (Double grade : grades) {
            if (grade < 60) {
                System.out.println("不及格的分数:"+grade);
            }
        }

        int count = 0;
        BigDecimal sum = new BigDecimal(0);
        for (Double grade : grades) {
            if (grade < 60) {
                count++;
            }
            sum = sum.add(new BigDecimal(grade));
        }

        double avg = sum.divide(new BigDecimal(grades.size())).doubleValue();
        System.out.println("平均分:" + avg);
        System.out.println("不及格人数:" + count);

        double max = 0;
        for (Double grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }

        System.out.println("最高分:" + max);
    }
}
