package com.itheima.day06.test;

public class Test03 {
    public static void main(String[] args) {
        /*
        try{
            // 可能出现异常的代码块
        } catch(Exception e){
            // 如果发生异常并捕获到异常，执行到这里
        }
         */

//        try {
//            // 代码块
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }


        try {
            m1();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void m1() throws Exception{
        int res = 4 / 0;
    }


}
