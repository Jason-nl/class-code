package com.itheima.day02.code02;

/**
 * Created by Jason on 2020/10/6 13:09
 */
public abstract class MotorVehicle {
    // 品牌 价格 可以跑
    private String brand;
    private double price;
    private int maxSpeed; //最大速度

    public MotorVehicle() {
    }

    public void run() {
        System.out.println(brand + "以每小时" + maxSpeed + "公里的速度在狂奔...");
    }

    public MotorVehicle(String brand, double price, int maxSpeed) {
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
