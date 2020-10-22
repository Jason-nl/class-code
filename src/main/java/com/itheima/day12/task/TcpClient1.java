package com.itheima.day12.task;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 17:54
 */
public class TcpClient1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8090);
        OutputStream out = socket.getOutputStream();
        out.write("你好，我是客户端小白。".getBytes());
    }
}
