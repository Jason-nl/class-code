package com.itheima.day15.pattern;

/**
 * created by Jason on 2020/10/26 9:33 上午
 */
public class Demo {
    public static void main(String[] args) {
        /*
         设计模式：Design pattern

         0. 解决一类问题的最佳实践
         1. 模版模式
              避免代码重复
         2. 装饰模式/代理模式(IO流)
              在原类不修改的前提，拓展一个类功能
         3. 工厂模式
              对象创建的最佳模式
         4. 单例模式 singleton
              作用：保证一个类只有一个实例
              运用场景：线程池
              推导：
                  I.  类的所有构造全部private
                  II. 在本类创建一个实例，并用static修饰
                  III. 设计一个static方法获取这个属性 -> 使得外部能够访问打破这个实例
              两种方式：实例创建的时机
                  I. 饿汉单例(hungry)：类加载的时候就创建了单例
                    优势:使用的快
                    劣势：占用内存
                  II. 懒汉单例(lazy)：类加载的时候不创建, 获取的时候判断,如果有就不创建，没有才创建
                    优势：节省内存
                    劣势：第一次使用比较慢
                        注意线程并发,可能会创建多个实例，记得加锁

         5. 多例模式
         */
        MyPool myPool = MyPool.getInstance();

    }
}
