package com.itheima.day12.task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 18:53
 */
public class TcpServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);
        Socket socket = serverSocket.accept();

//        InputStream ins = socket.getInputStream();
//        int len;
//        byte[] buffer = new byte[1024];
//        while ((len = ins.read(buffer)) != -1) {
//            String res = new String(buffer, 0, len);
//            System.out.println("客户端发送数据:" + res);
//        }

        OutputStream out = socket.getOutputStream();
        out.write("收到了,你准备一下".getBytes());


    }
}
