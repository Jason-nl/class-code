package com.itheima.day03.code.code14;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Jason on 2020/10/6 16:51
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 有以下学员信息：
         *
         * ​       张三,男,20,79.5
         *
         * ​       李四,女,21,80.2
         *
         * ​       王五,男,22,77.9
         *
         * ​       周六,男,20,55.8
         *
         * ​       赵七,女,21,99.9
         *
         * ​    请定义学员类，属性：姓名、性别、年龄、分数
         *
         * ​    请编写测试类，创建5个对象，分别存储上述值，并计算5名学员的“平均分”(四舍五入到小数点后2位)。
         */

        Student s1 = new Student("张三", "男", 20, 79.5);
        Student s2 = new Student("李四", "女", 21, 80.2);
        Student s3 = new Student("王五", "男", 22, 77.9);
        Student s4 = new Student("周六", "男", 20, 55.8);
        Student s5 = new Student("赵七", "女", 21, 99.9);

        double sumScore = s1.getScore() + s2.getScore() + s3.getScore() + s4.getScore() + s5.getScore();

        BigDecimal decimal = new BigDecimal(sumScore / 5);
        double avg = decimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(avg);

//        BigDecimal decimal = new BigDecimal(sumScore);
//        BigDecimal avg = decimal.divide(new BigDecimal(5), 2, RoundingMode.HALF_EVEN);
//        System.out.println(avg);
    }
}

class Student {
    private String name;
    private String gender;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, String gender, int age, double score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}