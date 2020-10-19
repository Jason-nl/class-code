package com.itheima.day05.code01;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test02 {
    /*
    请按以下要求顺序编码：

1. 定义学生类Student，属性：姓名、性别、年龄
2. 定义测试类，及main()方法
3. 定义一个存储Student类型的HashSet集合
4. 创建以下三个Student对象
   张三,男,20
   李四,女,21
   张三,男,20

  将上述三个对象存储到Set集合中

2. 使用增强for遍历集合，获取每个Student对象，并打印属性值；
2. 请实现集合中不能存储姓名,性别,年龄相同的元素
     */
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s1 = new Student("张三", "男", 20);
        Student s2 = new Student("李四", "女", 21);
        Student s3 = new Student("张三", "男", 20);
        set.add(s1);
        set.add(s2);
        set.add(s3);

        for (Student student : set) {
            System.out.println(student);
        }


    }
}

class Student {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                getName().equals(student.getName()) &&
                getGender().equals(student.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender(), getAge());
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

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
