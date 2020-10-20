package com.itheima.day11.decorate;

import com.itheima.day11.decorate.bean.Agent;
import com.itheima.day11.decorate.bean.CaiXuKun;
import com.itheima.day11.decorate.bean.Son;

/**
 * Created by Jason on 2020/10/20 14:01
 * 需求1：
 *      公益演出，请刘德华免费唱跳
 *  需求2：
 *      商业演出，请刘德华不免费唱跳
 *
 *      解决方式：
 *          注意：不能直接修改LiuDeHua这个类
 *          解决方式1：创建LiuDeHua类的子类，子类重写父类的方法
 *          解决方式2：装饰设计模式
 *      对比：继承和装饰设计模式
 *          0、同样都能对一个类的方法进行增强/拓展
 *          1、装饰设计模式更好，更具备复用性
 *              不单单是刘德华，还有张学友...
 *          2、继承的复用性差
 *              刘德华的子类，只对刘德华的方法进行增强或拓展
 *              假设还有张学友，还需要创建张学友的子类
 *      # 装饰设计模式
 *      1、接口、抽象类             Star
 *      2、装饰者（花瓶：装饰功能）  Agent
 *      3、被装饰者（花）           LiuDeHua\ZhangXueYou..
 *      4、增强或拓展的方法          接口/抽象类中的方法
 *
 *      5、装饰者和被装饰者需要继承相同的接口/抽象类
 *      6、装饰者内部需要包装被装饰者
 *          因为装饰者本身不具备真正操作的方法，底层需要操作被装饰者
 *          
 *       # 装饰这么写：假设对A类的某方法进行增强/拓展
 *          1、将A类（被装饰者）的某方法抽取到一个接口中，让A实现该接口
 *          2、实现B类（装饰者）
 *              a.实现A接口
 *              b.将接口类型变量作为B类的属性，通过B类构造赋值
 *              c.重写需要增强的方法
 *          3、使用装饰：A作为B类对象的参数，然后调用B的方法（B的底层调用A的方法）
 *   明星愿意对外出售的能力，必须赋予经纪人
 *    1、对刘德华这类的明星进行共性抽取，接口/抽象类
 *    2、蔡徐坤继承这个接口
 *    3、给经纪人设置一个属性：明星
 *    4、给经纪人设置一个构造
 */
public class DecorateDemo01 {
    public static void main(String[] args) {
        // 公益演出
        CaiXuKun liuDeHua = new CaiXuKun();
        liuDeHua.sing(0);
        liuDeHua.dance(0);

        // 商业演出
        Son son = new Son();
        son.sing(101);
        son.dance(150);

        Agent agent = new Agent(new CaiXuKun());
        agent.sing(200);
        agent.dance(300);

    }
}
