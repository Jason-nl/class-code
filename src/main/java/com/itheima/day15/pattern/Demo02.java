package com.itheima.day15.pattern;

/**
 * created by Jason on 2020/10/26 10:25 上午
 */
public class Demo02 {

    /*
        多例模式
            1. 特点：一个类有指定数量的实例
            2. 运用场景：线程池单例,线程多例(线程池的线程)

            3. 推导:
                I.   构造private
                II.  在类中定义该类被创建的总数量
                III. 在类中定义存放该类实例的容器
                IV.  在类中提供静态代码块,在静态代码块中创建类的实例
                V.   提供获取类实例的静态方法
     */

    public static void main(String[] args) {
        MyThread mt = MyThread.getInstance();
        System.out.println("mt在干活");
        MyThread.back(mt);
    }
}
