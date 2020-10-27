package com.itheima.day16.task;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * created by Ethan on 2020/10/27 7:33 下午
 */
@SuppressWarnings("ALL")
public class Test04 {
    /**
     * 需求：对Collection接口的子类ArrayList进行代理,以前的remove(Object obj)方法是删除集合中的第一次出现的元素,
     * (比如集合中有多个"abc",调用remove("abc"))后只会删除一个元素，代理后要求在调用remove(Object obj)后，
     * 能够删除集合中所有匹配的元素 使用动态代理的方式
     * 删除集合中重复的元素
     */

    @Test
    public void testProxy1() {
        ArrayList<String> list = new ArrayList<>();

        ClassLoader loader = list.getClass().getClassLoader();
        Class<?>[] interfaces = list.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if ("remove".equalsIgnoreCase(name)) {
                    Boolean remove = false;
                    for (int i = list.size() - 1; i >= 0; i--) {
                        String item = list.get(i);
                        if (args[0].equals(item)) {
                            remove = list.remove(item);
                        }
                    }
                    return remove;
                } else {
                    Object res = method.invoke(list, args);
                    return res;
                }
            }
        };
        List<String> proxy = (List<String>) Proxy.newProxyInstance(loader, interfaces, handler);

        proxy.add("abc");
        proxy.add("abc");
        proxy.add("abc");
        proxy.add("def");
        proxy.add("123");
        System.out.println(proxy);
        proxy.remove("abc");

        System.out.println(proxy);

    }

    @Test
    public void testProxy2() {
        ArrayList<String> list = new ArrayList<>();
        List<String> proxyList = ListProxy.proxyList(list);
        proxyList.add("abc");
        proxyList.add("abc");
        proxyList.add("abc");

        proxyList.add("123");
        proxyList.add("LilMama");

        System.out.println(proxyList);
        proxyList.remove("abc");
        System.out.println(proxyList);

    }

}
