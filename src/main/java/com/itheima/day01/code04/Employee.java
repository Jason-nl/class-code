package com.itheima.day01.code04;

public class Employee extends Staff{
    public Employee() {
    }

    public Employee(String jobId, String name, int age) {
        super(jobId, name, age);
    }

    @Override
    public void setContent(String content) {
        System.out.println(content);
    }
}
