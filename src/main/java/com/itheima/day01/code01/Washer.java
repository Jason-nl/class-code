package com.itheima.day01.code01;

public class Washer extends Electric {
    // private String 电机类型;
    private String type;
    //、洗涤容量
    private String capacity;

    public Washer() {
    }

    public Washer(String brand, String model, String color, double price, String type, String capacity) {
        super(brand, model, color, price);
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
