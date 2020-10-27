package com.itheima.day16.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * created by Ethan on 2020/10/27 5:14 下午
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ClassLoader loader = list.getClass().getClassLoader();
        Class<?>[] interfaces = list.getClass().getInterfaces();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if ("add".equalsIgnoreCase(name) || "remove".equalsIgnoreCase(name) || "set".equalsIgnoreCase(name)) {
                    throw new UnsupportedOperationException("你个傻鸟，不能增删改");
                } else {
                    Object res = method.invoke(list, args);
                    return res;
                }
            }
        };
        List proxy = (List) Proxy.newProxyInstance(loader, interfaces, handler);
        int size = proxy.size();
        System.out.println(size);
        // proxy.add("xxx");

    }
}
