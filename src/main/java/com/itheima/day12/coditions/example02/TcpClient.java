package com.itheima.day12.coditions.example02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 19:28
 * 需求：在项目下创建TCP客户端，访问之前创建的服务器端,服务器端ip127.0.0.1 端口号8888。要求：
 *
 * 1. 客户端连接服务器,并发送 hello.服务器,我是客户端.
 *
 *
 * 2. 开启上一题服务器,等待客户端连接,客户端连接并发送数据
 *
 * ### 训练目标
 *
 * TCP单向通信的客户端
 *
 * ### 训练提示
 *
 * 1、客户端连接服务器
 *
 * 2、连接成功后向服务器发送数据
 *
 * ### 参考方案
 *
 * 使用Socket完成
 *
 * ### 操作步骤
 *
 * 1、创建客户端对象,指定服务器IP和端口号,连接服务器
 *
 * 2、获取连接之后的输出流
 *
 * 3、使用输出流向服务器发送数据
 *
 * 4、释放资源
 */
public class TcpClient {

    private static Socket socket;
    private static OutputStream out;

    public static void main(String[] args) throws IOException {
        socket = new Socket("localhost", 8888);

        out = socket.getOutputStream();
        out.write("hello.服务器,我是客户端.".getBytes());

        out.close();
        socket.close();
    }
}
