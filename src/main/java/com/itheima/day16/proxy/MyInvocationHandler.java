package com.itheima.day16.proxy;

import java.lang.reflect.Method;

/**
 * created by Ethan on 2020/10/27 5:30 下午
 */
public interface MyInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args);
}
