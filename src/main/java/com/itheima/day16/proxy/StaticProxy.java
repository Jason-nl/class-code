package com.itheima.day16.proxy;

import java.lang.reflect.Method;

/**
 * created by Ethan on 2020/10/27 5:29 下午
 */
public class StaticProxy implements Singer{

    private Singer singer;
    private MyInvocationHandler handler;

    private StaticProxy(Singer singer, MyInvocationHandler handler) {
        this.singer = singer;
        this.handler = handler;
    }

    public static Object getProxyInstance(Singer singer, MyInvocationHandler handler) {
        StaticProxy proxy = new StaticProxy(singer, handler);
        return proxy;
    }

    @Override
    public void sing(double money) {
        // 内省
        try {
            Method method = this.getClass().getMethod("sing", double.class);
            Object[] args = {money};
            handler.invoke(this, method, args);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void dance(double money) {
        try {
            Method method = this.getClass().getMethod("dance", double.class);
            Object[] args = {money};
            handler.invoke(this, method, args);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eat() {
        try {
            Method method = this.getClass().getMethod("eat");
            Object[] args = null;
            handler.invoke(this, method, args);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sleep() {
        try {
            Method method = this.getClass().getMethod("sleep");
            Object[] args = null;
            handler.invoke(this, method, args);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
