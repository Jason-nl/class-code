package com.itheima.day12.task;

/**
 * Created by Jason on 2020/10/22 18:48
 * 请编写客户端向服务器端上传的案例，要求上传完毕，服务器端要向客户端发送一条反馈信息，客户端收到反馈后打印到控制台，两端结束。
 *
 * ### 客户端开发
 *
 * 客户端向服务器发送数据，并接收服务端回发的数据
 *
 * **开发步骤**
 *
 * 1. 创建Socket对象并指定服务端的IP和端口
 * 2. 获取网络输出流：getOutputStream
 * 3. 使用网络输出流给服务端发送一个字符串
 * 4. 当发送完数据后，告诉服务端，发送完毕：shutdownOutput()
 * 5. 获取网络输入流，读取服务端发送的数据
 * 6. 释放资源
 */
public class Test02 {
    public static void main(String[] args) {

    }
}
