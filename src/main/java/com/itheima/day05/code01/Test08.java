package com.itheima.day05.code01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test08 {
    /*
    请按以下要求顺序编码：

1. 定义一个：键Integer，值String类型的HashMap集合
1. 存储以下数据：”张三” ,“李四”,“王五”
1. 打印集合大小；
1. 使用“键找值”的方式遍历集合，打印键和值；
1. 使用“键值对”的方式遍历集合，打印键和值；
1. 获取键为1的值，并打印
1. 获取键为10的值，并打印
1. 判断集合中是否有键：10
1. 删除键为1的键值对，删除完毕打印集合
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(10, "王五");
        // 打印集合大小；
        System.out.println(map);
        // 使用“键找值”的方式遍历集合，打印键和值；
        for (Integer key : map.keySet()) {
            System.out.println("key:"+ key + ",value:" + map.get(key));
        }

        System.out.println("---------------------------");
        // 使用“键值对”的方式遍历集合，打印键和值；
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println("key:"+ entry.getKey() + ",value:" + entry.getValue());
        }

        //1. 获取键为1的值，并打印
        String val = map.get(1);
        System.out.println(val);
        //1. 获取键为10的值，并打印
        String val2 = map.get(10);
        System.out.println(val2);
        //1. 判断集合中是否有键：10
        System.out.println(map.containsKey(10));
        //1. 删除键为1的键值对，删除完毕打印集合
        map.remove(1);
        System.out.println(map);

    }
}
