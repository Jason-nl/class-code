package com.itheima.day12.coditions.example01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 19:22
 * 1. 在项目下创建TCP 服务器端 端口号为8888
 *
 * 2. 等待客户端连接，如果有客户端连接则获取到客户端对象
 *
 * 3. 在获取到客户端对象之后 在服务器读取客户端传送的数据
 */
public class TcpServer {

    private static ServerSocket serverSocket;
    private static Socket socket;
    private static InputStream ins;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(8888);
        socket = serverSocket.accept();

        ins = socket.getInputStream();
        int len;
        byte[] buffer = new byte[1024];
        while ((len = ins.read(buffer)) != -1) {
            String res = new String(buffer, 0, len);
            System.out.println("客户端发送的数据:"+res);
        }

        ins.close();
        serverSocket.close();
    }
}
