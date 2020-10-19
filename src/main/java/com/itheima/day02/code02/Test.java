package com.itheima.day02.code02;

public class Test {
    public static void main(String[] args) {
        BenzCar benzCar = new BenzCar("奔驰", 500000D, 200);
        BMWCar bmwCar = new BMWCar("宝马", 300000D, 200);
        YamahaMoto yamahaMoto = new YamahaMoto("雅马哈", 150000D, 150);
        BMWMoto bmwMoto = new BMWMoto("宝马", 200000D, 150);
        benzCar.run();
        bmwCar.run();
        bmwCar.positioning();
        yamahaMoto.run();
        bmwMoto.run();
        bmwMoto.positioning();
    }
}
