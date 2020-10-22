package com.itheima.day12.web;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 15:40
 */
public class HttpServer {

    private static ServerSocket serverSocket;
    private static Socket socket;
    private static FileInputStream fis;
    private static OutputStream out;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(63342);
        while (true) {
            socket = serverSocket.accept();
            new Thread(() -> {
                try {
                    fis = new FileInputStream("src/main/java/com/itheima/day12/web/index.html");
                    out = socket.getOutputStream();
                    out.write("HTTP/1.1 200 OK\n".getBytes());
                    out.write("Content-Type:text/html\n".getBytes());
                    out.write("\n".getBytes());
                    int len;
                    byte[] buffer = new byte[1024];
                    while ((len = fis.read(buffer)) != -1) {
                        out.write(buffer, 0, len);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
