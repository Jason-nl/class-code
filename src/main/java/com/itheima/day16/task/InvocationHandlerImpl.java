package com.itheima.day16.task;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * created by Ethan on 2020/10/27 8:40 下午
 */
public class InvocationHandlerImpl implements InvocationHandler {
    private List<String> list;

    public InvocationHandlerImpl(List<String> list) {
        super();
        this.list = list;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String name = method.getName();
        if ("remove".equalsIgnoreCase(name)) {
            list.removeIf(item -> args[0].equals(item));
        }

        return method.invoke(list, args);
    }
}
