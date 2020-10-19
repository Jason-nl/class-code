package com.itheima.day05.task;

import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 3, 4, 2);
        Map<Integer, List<Integer>> map = classify(list);
        System.out.println(map);
    }

    /**
     * 对给定的数字列表进行分组，要求返回的Map中，Key为数字，Value为该数字出现的列表。
     * 例如，输入的数字列表为：[1,2,3,3,4,2]，
     * 那么返回值应为：{1=[1],2=[2,2],3=[3,3],4=[4]}
     */
    public static Map<Integer, List<Integer>> classify(Collection<Integer> numbers) {
        //创建一个Map集合，用于保存需要返回的数据
        Map<Integer, List<Integer>> map = new HashMap<>();
        //定义一个List类型的变量
        //定义一个List类型的变量
        List<Integer> list = null;
        //遍历参数集合，获取参数集合中每一个元素
        for (Integer integer : numbers) {
            //判断Map集合中是否已经包含这个元素做的键
            if(map.containsKey(integer)){
                //如果map集合中已经包含这个元素做的键，说明不是第一次出现，可以获取它的对应的值，也就是保存这个元素的List集合
                list = map.get(integer);
            }else{
                //如果map集合中没有包含这个元素做的键，说明是第一次出现，所以需要新建一个List集合，用来保存这个元素
                list = new ArrayList<>();
            }
            //将这个元素添加到保存它的List集合中
            list.add(integer);
            //将这个元素作为键，保存它的List集合作为值，添加到map集合中
            map.put(integer, list);
        }

        //TODO在这里补足代码
        //--------------------------
        return map;
    }
}
