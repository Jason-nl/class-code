package com.itheima.day02.code02;

/**
 * Created by Jason on 2020/10/6 13:23
 */
public class BMWMoto extends MotorCycle implements GPS {
    public BMWMoto(String brand, double price, int maxSpeed) {
        super(brand, price, maxSpeed);
    }

    @Override
    public void positioning() {
        System.out.println("使用GPS定位...");
    }
}
