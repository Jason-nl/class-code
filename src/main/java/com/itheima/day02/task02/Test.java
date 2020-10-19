package com.itheima.day02.task02;

/**
 * Created by Jason on 2020/10/6 12:46
 */
public class Test {
    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.setName("张小强");
        manager.setSalary(9000D);

        Employee coder = new Coder();
        coder.setName("李小亮");
        coder.setSalary(5000D);

        Company company = new Company();
        company.setTotalSalary(1000000D);
        company.paySalary(manager);
        company.paySalary(coder);
    }
}
