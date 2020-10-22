package com.itheima.day12.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/21 21:50
 */
public class TCPClient {

    private static Socket socket;

    public static void main(String[] args) {
        String content = "你好TCP服务器端，约吗";
        try {
            // 192.168.1.100
            socket = new Socket("localhost", 9999);
            OutputStream out = socket.getOutputStream();
            // 向服务端发送数据
            out.write(content.getBytes());

            // 读取服务端响应回来的数据
            InputStream ins = socket.getInputStream();
            int len;
            byte[] buffer = new byte[1024];
            len = ins.read(buffer);
            System.out.println("len=" + len);
            System.out.println("服务端返回内容:" + new String(buffer, 0, len));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
