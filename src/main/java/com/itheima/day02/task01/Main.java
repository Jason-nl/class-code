package com.itheima.day02.task01;

/**
 * Created by Jason on 2020/10/6 12:26
 * 按照以下说明，编写代码：
 *
 * 定义类描述手机和电脑，二者都具有开机、关机和玩游戏的功能，并提供测试类测试玩游戏的东西；
 *
 * ### 训练目标
 *
 * 1、掌握接口的使用
 *
 * 2、掌握抽象类的使用
 *
 * 3、理解接口和抽象类的使用场景
 *
 * 4、掌握多态的用法
 *
 * ### 训练提示
 *
 * 1、手机和电脑都是电子产品，需要将共性内容抽取到父类中
 *
 * 2、子类的开机和关机行为均与父类的不同，因此父类需要定义为抽象类
 *
 * 3、开机和关机是所有电子产品公有的功能，但是玩游戏不是，所以需要定义接口，在接口中定义玩有戏的功能。
 *
 * 4、测试某产品是否可以玩游戏，可以使用多态
 *
 * ### 思路分析
 *
 * 1、根据需求，我们需要先创建两个类，分别表示手机和电脑；
 *
 * 2、 接下来，在两个类中书写函数，表示手机和电脑应该具有的功能；
 *
 * 3、 然后观察代码发现，手机和电脑中存在相同的功能，所以需要向上抽取；
 *
 * 4、 因为手机和电脑都是电子产品，而开机和关机是所有电子产品都应该具有的功能，
 *
 * 5、 但是不同的电子产品开机关机的具体实现不同，所以应该创建一个抽象的电子产品类，作为手机和电脑的父类；
 *
 * 6、 在电子产品类中应该提供抽象的开机和关机的功能；
 *
 * 7、 而玩游戏不属于电子产品都应该具有的功能（如电磁炉也是电子产品，就没有玩游戏的功能）， 所以手机和电脑都具有的玩游戏的功能，就不能抽取到电子产品类中，而是应该使用一个接口表示
 *
 * 8、需求中要求提供功能，测试玩游戏的东西；这是一个独立的功能，所以应该定义为一个函数，因为要测试的是可以玩游戏的东西，具体是什么不知道，只知道肯定应该具有玩游戏的功能， 所以这个函数的参数类型应该是Playable类型，表示任何可玩游戏的东西；实际接受的参数，是这个接口的实现类对象。
 *
 * ### 操作步骤
 *
 * 1、定义抽象类电子产品
 *
 * 2、创建手机类和电脑类继承电子产品抽象类
 *
 * 3、创建玩游戏接口
 *
 * 4、手机类和电脑类实现玩游戏接口
 *
 * 5、测试某个产品的玩游戏功能
 */
public class Main {
}
