package com.itheima.day01.code01;

public class Tv extends Electric {
    // 屏幕尺寸、分辨率屏幕尺寸、分辨率
    private String size;
    // 分辨率
    private String resolution;

    public Tv() {
    }

    public Tv(String brand, String model, String color, double price, String size, String resolution) {
        super(brand, model, color, price);
        this.size = size;
        this.resolution = resolution;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
