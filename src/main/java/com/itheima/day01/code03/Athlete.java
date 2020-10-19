package com.itheima.day01.code03;

public class Athlete extends Person {
    // 所在班级
    private String className;

    public Athlete() {
    }

    public Athlete(int id, String name, String gender, int age, String className) {
        super(id, name, gender, age);
        this.className = className;
    }

    @Override
    void eat() {
        System.out.println("吃营养餐...");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
