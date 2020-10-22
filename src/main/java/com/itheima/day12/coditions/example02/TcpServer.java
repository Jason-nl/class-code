package com.itheima.day12.coditions.example02;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 19:28
 */
public class TcpServer {

    private static ServerSocket serverSocket;
    private static InputStream ins;
    private static Socket socket;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(8888);

        socket = serverSocket.accept();
        ins = socket.getInputStream();

        int len;
        byte[] buffer = new byte[1024];
        while ((len = ins.read(buffer)) != -1) {
            String res = new String(buffer, 0, len);
            System.out.println("客户端发送的数据:" + res);
        }

        ins.close();
        socket.close();
        serverSocket.close();
    }
}
