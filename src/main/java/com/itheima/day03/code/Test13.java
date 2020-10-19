package com.itheima.day03.code;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Jason on 2020/10/6 16:41
 */
public class Test13 {
    public static void main(String[] args) {
        /**
         * 有以下double数组：
         *
         * ​       double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
         *
         *   请编程计算它们的总值及平均值(四舍五入保留小数点后2位)
         */
        double sum = 0;
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};// 5.6 + 5.56 = 11.16 + 7.21 = 18.37
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }


        BigDecimal decimal1 = new BigDecimal(sum);
        BigDecimal avg1 = decimal1.divide(BigDecimal.valueOf(arr.length), 2, RoundingMode.HALF_UP);
        System.out.println(avg1);

        BigDecimal decimal = new BigDecimal(sum);
        BigDecimal avg = decimal.divide(new BigDecimal(arr.length),2, RoundingMode.HALF_UP);
        System.out.println(avg);


        //
        BigDecimal result = new BigDecimal(0);
        for (int i = 0; i < arr.length; i++) {
            result = result.add(new BigDecimal(arr[i]));
        }

        BigDecimal divide = result.divide(new BigDecimal(arr.length), 2, RoundingMode.HALF_UP);
        System.out.println(divide.doubleValue());

//        double v = result.doubleValue();
//        System.out.println(v);
    }
}
