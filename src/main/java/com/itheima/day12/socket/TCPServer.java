package com.itheima.day12.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/21 21:56
 */
public class TCPServer {

    private static ServerSocket serverSocket;
    private static Socket socket;

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            // 读取客户端发送的内容
            InputStream ins = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len = ins.read(buffer);
            System.out.println("len=" + len);
            System.out.println("客户端发送的内容:" + new String(buffer, 0, len));

            // 响应客户端内容
            OutputStream out = socket.getOutputStream();
            // 向客户端响应数据
            out.write("约你妹".getBytes());
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

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
