package com.itheima.day11.serializable;

import java.io.*;

/**
  Created by Jason on 2020/10/20 10:55
  - 概念：(serializable)
       1. 序列化：将对象或数据结构 转成二进制的过程，目的是为了保存到硬盘上
       (编码：将xx 转成 二进制) 保存进度-存档：序列化过程
       2. 反序列化：二进制转成对象 或数据结构
           读档：反序列化

  - API
       ObjectOutputStream：序列化流
           ObjectOutputStream(OutputStream out)
           这个序列化流，底层用out去写，自己掌握序列化编码规则
       ObjectInputStream：反序列化流

       第一个异常：NotSerializableException：不可序列化异常
       解决：让Hero类实现Serializable接口
       Serializable接口中什么都没有（标识接口）
       安全机制：一个类实现Serializable接口，意味着这个类的对象允许被保存

       第二个异常：InvalidClassException
       local class incompatible: stream classdesc serialVersionUID = -2116567231304829378,
       local class serialVersionUID = 3404606521097444712
       无效的类异常：Hero
       本地的类不兼容,反序列化流的类描述的 uid = -2116567231304829378
       本地的类的 uid = 3404606521097444712

       解释：序列化的时候，Hero没有bigSkill属性,这个时候，底层会随机给它一个身份证3404606521097444712
            反序列化的时候，Hero添加bigSkill属性，这个属性，底层重新随机给它一个身份证-2116567231304829378
       解决方案：
           不能让底层随机分配一个  serialVersionUID (序列化版本号) 类改一下
           自己手动执行一个serialVersionUID
       注意事项：
           1.一个项目不能存在两个serialVersionUID相同值的类
           2.变量名必须 serialVersionUID
       如果有一个属性不想被保存
           关键字：transient（不可持久化）
           用这个关键字修饰的属性，就不可被序列化和反序列化

  - 总结：
       被序列化的类
       1. 必须实现Serializable接口
       2. 一般都要设置serialVersionUID 鼠标选中被序列的类名上, 快捷键alt + enter
       3. 不想被序列化的属性可以用transient修饰
 */
public class Demo01  {

    private static ObjectOutputStream oos;
    private static ObjectInputStream ois;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//         serlizableWrite();
        serlizableRead();
    }

    private static void serlizableRead() throws IOException {
        try {
            ois = new ObjectInputStream(new FileInputStream("src/main/java/com/itheima/day11/resource/archive.txt"));
            Hero o = (Hero) ois.readObject();
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }

    private static void serlizableWrite() throws IOException {
        Hero hero = new Hero(30, 10, "亚索");
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/main/java/com/itheima/day11/resource/archive.txt"));
            oos.writeObject(hero);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
    }
}
