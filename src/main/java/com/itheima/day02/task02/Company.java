package com.itheima.day02.task02;

/**
 * Created by Jason on 2020/10/6 12:39
 */
public class Company implements Money {

    private double totalSalary;

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public void paySalary(Employee emp) {
        double over = totalSalary - emp.getSalary();
        System.out.println(String.format("给%s发工资%.1f 元，公司剩余：%.1f 元", emp.getName(), emp.getSalary(), over));
    }
}
