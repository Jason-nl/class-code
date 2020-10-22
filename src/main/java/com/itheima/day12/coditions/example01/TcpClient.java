package com.itheima.day12.coditions.example01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 19:22
 */
public class TcpClient {

    private static Socket socket;
    private static OutputStream out;

    public static void main(String[] args) throws IOException {
        socket = new Socket("localhost", 8888);
        out = socket.getOutputStream();
        out.write("今天天气不错哟".getBytes());
        socket.shutdownOutput();

        out.close();
        socket.close();
    }
}
