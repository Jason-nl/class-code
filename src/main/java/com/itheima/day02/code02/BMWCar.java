package com.itheima.day02.code02;

/**
 * Created by Jason on 2020/10/6 13:21
 */
public class BMWCar extends Car implements GPS{
    public BMWCar(String brand,double price,int maxSpeed) {
        super(brand, price, maxSpeed);
    }

    @Override
    public void positioning() {
        System.out.println("使用GPS定位...");
    }
}
