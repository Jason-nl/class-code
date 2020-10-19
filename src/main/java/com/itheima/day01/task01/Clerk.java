package com.itheima.day01.task01;

/**
 * Created by Jason on 2020/10/5 21:02
 */
public class Clerk extends Employee {
    // 属性:经理Manager(该职员的经理)
    private Manager manager;

    public Clerk() {
    }

    public Clerk(String name, String workId, String dept, Manager manager) {
        super(name, workId, dept);
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    //重写showMsg方法，方法内先调用父类的showMsg方法，然后打印经理的名字
    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println("他的经理："+manager.getName());
    }
}
