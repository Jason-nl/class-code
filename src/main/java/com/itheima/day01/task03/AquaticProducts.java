package com.itheima.day01.task03;

/**
 * Created by Jason on 2020/10/6 12:02
 * 水产品类
 */
public abstract class AquaticProducts extends Food {
    // 种类
    private String brand;
    // 价格
    private double price;

    public AquaticProducts() {

    }

    public AquaticProducts(double weight, String brand, double price) {
        super(weight);
        this.brand = brand;
        this.price = price;
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
}
