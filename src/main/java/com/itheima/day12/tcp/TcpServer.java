package com.itheima.day12.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 11:18
 */
public class TcpServer {

    private static ServerSocket serverSocket;
    private static InputStream ins;
    private static OutputStream out;
    public static int PORT = 8899;

    public static void main(String[] args) {
        try {
            // 服务端协议是tcp协议，IP是当前程序运行的计算机的ip
            // IP是当前程序运行计算机的IP
            // port 是10010
            // 创建服务端 socket（套接字）
            serverSocket = new ServerSocket(PORT);
            // 接收来自客户端的请求，创建连接通道
            // accept是阻塞方法，客户端如果还未发起请求，此方法一直等在这里
            // 直到客户端发起请求，建立连接，此方法才会继续向下运行
            Socket socket = serverSocket.accept();

            // 接收客户端发送数据
            ins = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len = ins.read(buffer);
            System.out.println("收到客户端的请求信息:" + new String(buffer, 0, len));

            // 服务端响应
            out = socket.getOutputStream();
            out.write("我已经收到".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
