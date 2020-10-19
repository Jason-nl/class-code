package com.itheima.day05.task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Test07 {
    public static void main(String[] args) {
        /*
        需求：使用LinkedHashMap保存学生对象；要求：

            1. 学生具有学号、姓名和成绩三个属性；

            2. 其中，学号不能重复；
         */
        LinkedHashMap<Stu, Integer> map = new LinkedHashMap<>();
        map.put(new Stu("1001", "张三", 88), 88);
        map.put(new Stu("1002", "李四", 99), 99);
        map.put(new Stu("1001", "王五", 100), 100);
        for (Map.Entry<Stu, Integer> entry : map.entrySet()) {
            Stu stu = entry.getKey();
            Integer score = entry.getValue();
            System.out.println(stu);
            System.out.println(score);
        }
    }
}

class Stu{
    private String sid;
    private String name;
    private int score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stu)) return false;
        Stu stu = (Stu) o;
        return sid.equals(stu.sid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid);
    }

    public Stu(String sid, String name, int score) {
        this.sid = sid;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
