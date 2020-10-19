package com.itheima.day02.task02;

/**
 * Created by Jason on 2020/10/6 12:36
 */
public class Main {
    /**
     * ## 题目2（综合案例）
     *
     * 模拟公司给员工发工资，代码实现，效果如图所示：
     *
     * ![img](day02.assets/wps786F.tmp.jpg)
     *
     * ### 训练目标
     *
     * 1、理解继承的思想
     *
     * 2、掌握接口的使用
     *
     * ### 训练提示
     *
     * 1、程序员和经理都属于员工，使用继承
     *
     * 2、员工作为父类，为其提供带参的构造函数，子类的有参构造需调用父类的有参构造
     *
     * 3、公司类中定义总资金属性，通过总资金扣除员工的工资，得出发工资后工资剩余的总资金
     *
     * ![1568968329069](day02.assets/1568968329069.png)
     *
     * ### 参考方案
     *
     * 使用继承抽取程序员和经理的公有内容
     *
     * 在接口中定义支付工资的方法
     *
     * ### 操作步骤
     *
     * 1. 定义Employee类,包含属性：姓名，薪资
     *
     * 2. 定义经理Manager类继承Employee类
     *
     * 3. 定义程序员Coder类继承Employee类
     *
     * 4. 定义Money接口包含抽象的paySalary方法,参数为(Employee emp)
     *
     * 5. 定义Company类,实现Money接口,Company类包含公司总资金属性
     *
     * 6. 在Company类中重写paySalary方法.当给一个员工发工资的时候.公司总资金减去已发工资
     *
     * 7. 在main方法中创建Manager对象m
     *
     * 8. 在main方法中创建Coder对象c
     *
     * 9. 在main方法中创建Company对象
     *
     * 10. 在main方法中调用Company的paySalary方法,传入m和c对象
     */
}
