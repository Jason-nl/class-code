package com.itheima.day04.task01;

import com.itheima.day04.task01.bean.Person;

import java.util.LinkedList;

public class Test06 {
    public static void main(String[] args) {
        /**
         * 需求：创建一个类，提供一个功能，向LinkedList集合中添加自定义的Person类对象；要求：
         *
         * 1. Person应该具有姓名、性别和年龄三个属性；
         *
         * 2. 添加对象时，如果容器中已存在该对象，就不添加；（要求：不能使用集合提供的contains方法）
         *
         * 3. 如果Person对象的姓名和性别相同，就认为是同一个人；
         */
        Client client = new Client();
        LinkedList<Person> list = new LinkedList<>();
        Person p1 = new Person("Jason", "男", 23);
        Person p2 = new Person("focus", "男", 25);
        Person p3 = new Person("lucas", "男", 33);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(client.addPerson(list, p2));
        System.out.println(list);
    }
}

class Client {
    public boolean addPerson(LinkedList<Person> list, Person person) {
        for (Person p : list) {
            if (p.equals(person)) {
                return false;
            }
        }
        return list.add(person);
    }
}
