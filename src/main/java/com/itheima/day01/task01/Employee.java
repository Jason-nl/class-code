package com.itheima.day01.task01;

/**
 * Created by Jason on 2020/10/5 20:59
 */
public class Employee {
    // 姓名(name,字符串类型)，工号(workId,字符串类型)，部门(dept,字符串类型),
    private String name;
    private String workId;
    private String dept;

    public Employee() {
    }

    public Employee(String name, String workId, String dept) {
        this.name = name;
        this.workId = workId;
        this.dept = dept;
    }

    public void showMsg() {
        System.out.println(dept +"的：" + name + ", 员工编号:" + workId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
