package com.itheima.day01.task01;

/**
 * Created by Jason on 2020/10/5 21:02
 */
public class Manager extends Employee{
    // 属性:职员Clerk(该经理的职员)
    private Clerk clerk;

    public Manager() {
    }

    public Manager(String name, String workId, String dept, Clerk clerk) {
        super(name, workId, dept);
        this.clerk = clerk;
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    // 重写父类的showMsg方法，方法内先调用父类的showMsg方法，然后打印经理中的职员的名字
    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println("他的职员：" + clerk.getName());
    }
}
