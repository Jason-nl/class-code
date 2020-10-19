package com.itheima.day04.task01;

import java.util.ArrayList;
import java.util.Collection;

import com.itheima.day04.task01.bean.Student;

public class Test05 {
    public static void main(String[] args) {
        /**
         * 需求：
         *
         * 1. 有如下一个数据操作接口IDataOperation<E>和一个学生类Student，
         * 现需要提供一个IDataOperation接口的实现类，用来对学生信息进行操作；
         * 2. 在IDataOperation接口实现类中，使用集合保存学生信息；
         * 3. 注意：学生信息包括学号、姓名、年龄和地址；其中，学生的学号是唯一的，不能出现两个学号一样的学生
         */

        IDataOperator<Student> iDataOperator = new IDataOperatorImpl();
        iDataOperator.add(new Student("1001", "Jason", "23", "上海"));
        iDataOperator.add(new Student("1002", "focus", "23", "北京"));
//        System.out.println(iDataOperator.getAll());
//        System.out.println(iDataOperator.get("1001"));
//
        iDataOperator.update(new Student("1002", "lucas", "33", "北京"));
        System.out.println(iDataOperator.get("1002"));
        System.out.println(iDataOperator.delete("1002"));
        System.out.println(iDataOperator.get("1002"));
    }
}

interface IDataOperator<E> {
    // 添加数据
    public boolean add(E t);

    // 根据唯一标识删除一个数据
    public <T> boolean delete(T t);

    // 修改一个数据
    public <T> boolean update(E e);

    // 根据唯一表示查找一个数据
    public <T> E get(T t);

    // 查找所有数据
    public Collection<E> getAll();
}

class IDataOperatorImpl implements IDataOperator<Student> {
    private ArrayList<Student> list = new ArrayList<>();
    @Override
    public boolean add(Student t) {
        // // 添加数据
        Student stu = get(t.getId());
        if (stu != null) {
            System.out.println("已经存在该学号的学生信息，不能重复添加");
            return false;
        } else {
            return list.add(t);
        }
    }

    @Override
    public <T> boolean delete(T t) {
        // 根据唯一标识删除一个数据
        Student stu = get(t);
        if (stu == null) {
            return false;
        } else {
            return list.remove(stu);
        }
    }

    @Override
    public <T> boolean update(Student student) {
        // // 修改一个数据
        Student stu = get(student.getId());
        if (stu == null) {
            System.out.println("没有这个学生信息");
            return false;
        } else {
            stu.setAddress(student.getAddress());
            stu.setAge(student.getAge());
            stu.setName(student.getName());
            return true;
        }
    }

    @Override
    public <T> Student get(T t) {
        if (list.isEmpty()) {
            System.out.println("没有任何学生,请添加学生");
        } else {
            for (Student student : list) {
                if (t.equals(student.getId())) {
                    return student;
                }
            }
        }
        return null;
    }

    @Override
    public Collection<Student> getAll() {
        return list;
    }
}
