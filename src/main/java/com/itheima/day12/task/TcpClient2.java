package com.itheima.day12.task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 18:49
 *  * 1. 创建Socket对象并指定服务端的IP和端口
 *  * 2. 获取网络输出流：getOutputStream
 *  * 3. 使用网络输出流给服务端发送一个字符串
 *  * 4. 当发送完数据后，告诉服务端，发送完毕：shutdownOutput()
 *  * 5. 获取网络输入流，读取服务端发送的数据
 *  * 6. 释放资源
 */
public class TcpClient2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9090);
        OutputStream out = socket.getOutputStream();
        out.write("我要发送了,请接收".getBytes());
        socket.shutdownOutput();
        InputStream ins = socket.getInputStream();
        int len;
        byte[] buffer = new byte[1024];
        while ((len = ins.read(buffer)) != -1) {
            String res = new String(buffer, 0, len);
            System.out.println("服务端响应数据:" + res);
        }
    }
}
