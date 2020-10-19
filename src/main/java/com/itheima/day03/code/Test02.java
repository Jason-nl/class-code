package com.itheima.day03.code;

/**
 * Created by Jason on 2020/10/6 13:52
 */
public class Test02 {
    /**
     * 请按标准格式定义一个“学生类”，它有三个属性：姓名、性别、年龄
     * 请编写测试类，创建两个“学生对象”并为它们的属性赋值，并能比较两个对象的所有属性值是否完全相等。
     */

    public static void main(String[] args) {
        Student s1 = new Student("小明", "男", 18);
        Student s2 = new Student("小红", "女", 18);
        System.out.println(s1.getName().equals(s2.getName()));
        System.out.println(s1.getGender().equals(s2.getGender()));
        System.out.println(s1.getAge() == s2.getAge());
    }

}

class Student{
    private String name;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
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

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
