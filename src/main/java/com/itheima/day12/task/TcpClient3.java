package com.itheima.day12.task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 19:00
 */
public class TcpClient3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 10001);
        OutputStream out = socket.getOutputStream();
        out.write("客户端发送数据".getBytes());
        socket.shutdownOutput();
        InputStream ins = socket.getInputStream();
        int len;
        byte[] buffer = new byte[1024];
        while ((len = ins.read(buffer)) != -1) {
            String res = new String(buffer, 0, len);
            System.out.println("服务端发送的数据:" + res);
        }
    }
}
