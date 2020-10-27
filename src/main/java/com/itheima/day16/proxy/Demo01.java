package com.itheima.day16.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * created by Ethan on 2020/10/27 3:29 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        // 被代理对象(被装饰的对象)
        LiuDeHua liuDeHua = new LiuDeHua();
        ClassLoader loader = liuDeHua.getClass().getClassLoader();
        Class<?>[] interfaces = liuDeHua.getClass().getInterfaces();
        // 动态的代理对象(装饰器)用于装饰对象 动态生成 使用反射动态生成的

        /**
         * loader 被代理对象所需的加载器
         * interfaces 被代理对象所实现的接口数组
         * InvocationHandler 处理器接口
         */
        Singer singer = (Singer) Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            /**
             * 处理业务
             * @param proxy  代理的对象
             * @param method 代理对象的方法
             * @param args   代理对象方法的参数列表
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                // 切点
                if ("sing".equalsIgnoreCase(name)) {
                    double money = (double) args[0];
                    if (money > 100) {
                        liuDeHua.sing(money);
                    }
                } else if ("dance".equalsIgnoreCase(name)) {
                    double money = (double) args[0];
                    if (money > 250) {
                        liuDeHua.dance(money);
                    }
                } else {
                    Object obj = method.invoke(proxy, args);
                    return obj;
                }

                return null;
            }
        });

        singer.sing(150);
        singer.dance(250);


    }
}
