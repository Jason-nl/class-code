package com.itheima.day03.code;

/**
 * Created by Jason on 2020/10/6 13:48
 */
public class Test01 {
    /**
     * 请按标准格式定义一个“手机类”，它有三个属性：品牌(String)、颜色(String)、价格(double)请编写测试类，
     * 创建两个“手机对象”并为它们的属性赋值，并能直接打印手机对象的属性信息。
     */

    public static void main(String[] args) {
        Phone apple = new Phone("苹果", "白色", 5788D);

        Phone huawei = new Phone("华为", "黑色", 5000D);

        System.out.println(apple.toString());
        System.out.println(huawei.toString());

    }
}

class Phone {
    // 品牌(String)、颜色(String)、价格(double)
    private String brand;
    private String color;
    private double price;

    public Phone() {
    }

    public Phone(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
