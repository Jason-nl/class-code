package com.itheima.day01.code04;

public class Manager extends Staff {
    private double bonus;

    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String jobId, String name, int age, double bonus) {
        super(jobId, name, age);
        this.bonus = bonus;
    }

    @Override
    public void setContent(String content) {
        System.out.println(content);
    }
}
