package com.itheima.day05.task.entity;

import java.util.Objects;

public class Student {
    //    1. Student应该具有姓名、性别、年龄和学号四个属性；
//    2. 如果Student对象的学号相同，就认为是同一个人；
    private String name;
    private String gender;
    private String age;
    private String sid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getSid().equals(student.getSid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSid());
    }

    public Student() {
    }

    public Student(String name, String gender, String age, String sid) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", sid='" + sid + '\'' +
                '}';
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
