package com.itheima.day16.task;


import java.lang.reflect.Proxy;
import java.util.List;

/**
 * created by Ethan on 2020/10/27 8:36 下午
 */
@SuppressWarnings("unchecked")
public class ListProxy {

    public static List<String> proxyList(List<String> list) {
        ClassLoader loader = list.getClass().getClassLoader();
        Class<?>[] interfaces = list.getClass().getInterfaces();
        return (List<String>)Proxy.newProxyInstance(loader, interfaces, new InvocationHandlerImpl(list));
    }
}
