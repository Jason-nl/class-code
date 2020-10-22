package com.itheima.day12.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 11:27
 */
public class TcpClient {

    private static Socket localhost;
    private static OutputStream out;
    private static InputStream ins;
    private static String LOCAL_IP = "127.0.0.1";

    public static void main(String[] args) {
        try {
            // 本机回环地址：127.0.0.1(localhost)
            // port:客户端指定要连接服务端的ip和port，自动连接
            localhost = new Socket(LOCAL_IP, TcpServer.PORT);
            // 向服务端发送数据
            out = localhost.getOutputStream();
            out.write("hello".getBytes());

            localhost.shutdownOutput();

            // 接收服务端响应数据
            ins = localhost.getInputStream();
            byte[] buffer = new byte[1024];
            int len = ins.read(buffer);
            System.out.println("服务端回显数据:" + new String(buffer, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (localhost != null) {
                try {
                    localhost.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
