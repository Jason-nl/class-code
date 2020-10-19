package com.itheima.day02.code01;

/**
 * Created by Jason on 2020/10/6 13:01
 */
public class Employee {
    private String name;
    private String gender;
    private int age;

    public void work() {

    }

    public Employee() {
    }

    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
