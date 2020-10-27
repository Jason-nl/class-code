package com.itheima.day15.xml;

/**
 * created by Jason on 2020/10/26 3:23 下午
 */
public class Demo01 {
    /*
            Hypertext markup language HTML: 超文本标记语言
            html的标签不能随意拓展,具有固定含义,可被浏览器解析
            html作用:展示数据
            xml:
                1. 可拓展 ：标签随意自定义
                2. 标记：xml作用：传输数据,存储数据(配置文件)

            XML组成
                1. 声明
                2. 元素(标签)
                3. 属性
                4. 注释
                5. 转义字符
                6. CDATA 字符区
            1. 声明 declare
                <?xml version="1.0" encoding="UTF-8" ?>
                xml版本1.0
                编码 utf-8
                必须出现在xml文件的第一行

            2. 元素(标签) element(tag)
                1. 它是xml最重要组成部分
                2. 两种形式
                    I. 成对标签
                    开始标签 结束标签(start tag,end tag) 开,闭
                    <tag></tag>
                    II. 单标签(空标签)  自关闭标签<tag/>
                3. 元素：开标签到闭标签之间的所有内容
                4. 语法：
                    I.   xml有且只有一个根标签(root tag)
                    II.  标签内可以包裹其他标签(子标签) 也可以包裹文本
                    III. 元素命名
                        - 区分大小写
                        - 不能使用空格,不能使用冒号
                        - 不建议以XML、xml、Xml开头
                        - 标签名不能以数字开头

            3. 属性
                1. 开始标签和空标签内,可以写属性
                2. 语法：
                    I.  key="value"
                    II. key=value空格key=value

            4. 注释
                <!--注释内容-->

            5. 转义字符
                sql中的<符号在xml是标签符号 不能直接使用,需要转义处理
                        &lt;    less than 小于
                        &gt;    greater than 大于
                        &amp;   &   和号 and与

            6. CDATA区：不被解析的数据(Character Data)  当注释处理
                        <![CDATA["开始,由"]]>

            xml的约束
            规范xml的书写：为了方便解析
            约束：
                1. DTD：Document Type definition 文档类型定义
                2. Schema：模式 xml schema definition xml模式定义替代dtd
     */
}
