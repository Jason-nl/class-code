package com.itheima.day12.task;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 17:55
 */
public class TcpServer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8090);
        Socket socket = serverSocket.accept();
        InputStream ins = socket.getInputStream();
        int len;
        byte[] buffer = new byte[1024];
        while ((len = ins.read(buffer)) != -1) {
            String result = new String(buffer, 0, len);
            System.out.println(result);
        }
    }
}
