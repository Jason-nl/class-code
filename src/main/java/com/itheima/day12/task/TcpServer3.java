package com.itheima.day12.task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 18:57
 * 服务端接收客户端的连接，并获取客户端的数据，然后回发一条数据给客户端。
 *
 * **开发步骤**
 *
 * 1. 创建服务端ServerSocket对象，绑定端口号
 * 2. 调用accept方法，等待客户端连接。
 * 3. 当accept解阻塞，意味着有客户端连接，得到一个Socket对象
 * 4. 获取网络输入流，读取客户端发送的数据
 * 5. 获取网络输出流，写数据给客户端
 * 6. 告诉客户端，写数据完毕
 * 7. 释放资源
 */
public class TcpServer3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket socket = serverSocket.accept();

        InputStream ins = socket.getInputStream();
        int len;
        byte[] buffer = new byte[1024];
        while ((len = ins.read(buffer)) != -1) {
            String res = new String(buffer, 0, len);
            System.out.println("客户端发送的数据:" + res);
        }

        OutputStream out = socket.getOutputStream();
        out.write("服务端响应".getBytes());
    }
}
