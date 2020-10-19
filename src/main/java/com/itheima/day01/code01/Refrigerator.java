package com.itheima.day01.code01;

public class Refrigerator extends Electric {
    // 门款式、制冷方式
    private String pattern;
    private String mode;

    public Refrigerator() {
    }

    public Refrigerator(String brand, String model, String color, double price, String pattern, String mode) {
        super(brand, model, color, price);
        this.pattern = pattern;
        this.mode = mode;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
