package com.itheima.day01.task01;

/**
 * Created by Jason on 2020/10/5 21:06
 */
public class Test {
    public static void main(String[] args) {
        // main方法中创建经理对象和职员对象，信息分别如下:
        Manager manager = new Manager();
        manager.setName("张小强");
        manager.setDept("销售部");
        manager.setWorkId("M001");
        Clerk clerk = new Clerk();
        clerk.setName("李小亮");
        clerk.setDept("销售部");
        clerk.setWorkId("C001");
        // 设置经理的职员为李小亮，设置职员的经理为张小强
        manager.setClerk(clerk);
        clerk.setManager(manager);
        //分别调用经理的showMsg方法和职员的showMsg方法
        manager.showMsg();
        clerk.showMsg();
    }
}
