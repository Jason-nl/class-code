package com.itheima.day05.task;

import java.util.*;

public class Test09 {
    public static void main(String[] args) {
        /*
        需求：一个年级有若干个班级，每个班级有若干个学生；要求：时

            1. 学生具有学号、姓名和成绩，学号和学生信息是一一对应的；

            2. 使用集合保存这个年级的所有学生的信息，然后遍历输出；
         */
        Map<Integer, ClassStu> class1 = new HashMap<>();

        List<Map<Integer, ClassStu>> grade = new ArrayList<>();
        ClassStu stu1 = new ClassStu(10,"张三",56);
        ClassStu stu2 = new ClassStu(11,"李四",11);
        class1.put(stu1.getNum(),stu1);
        class1.put(stu2.getNum(), stu2);

        grade.add(class1);


        Map<Integer, ClassStu> class2 = new HashMap<>();
        ClassStu stu3 = new ClassStu(12,"王五",67);
        ClassStu stu4 = new ClassStu(13,"赵六",88);
        class2.put(stu3.getNum(), stu3);
        class2.put(stu4.getNum(), stu4);

        grade.add(class2);

        for (Map<Integer, ClassStu> map : grade) {
            for (Map.Entry<Integer, ClassStu> entry : map.entrySet()) {
                Integer key = entry.getKey();
                ClassStu value = entry.getValue();
                System.out.println(key + "-" + value);
            }
        }




    }
}

class ClassStu {
    private int num;//学号
    private String name;//姓名
    private double score;//分数

    public ClassStu() {
    }

    public ClassStu(int num, String name, double score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassStu)) return false;
        ClassStu classStu = (ClassStu) o;
        return getNum() == classStu.getNum() &&
                Double.compare(classStu.getScore(), getScore()) == 0 &&
                getName().equals(classStu.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNum(), getName(), getScore());
    }

    @Override
    public String toString() {
        return "ClassStu{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}