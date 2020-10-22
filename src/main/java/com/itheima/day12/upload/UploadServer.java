package com.itheima.day12.upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * Created by Jason on 2020/10/22 14:44
 */
public class UploadServer {

    private static ServerSocket serverSocket;
    private static Socket socket;
    private static InputStream ins;
    private static OutputStream out;
    public static String PATH = "src/main/java/com/itheima/day12/resource";

    public static void main(String[] args) throws IOException {
        try {
            serverSocket = new ServerSocket(8888);
            socket = serverSocket.accept();

            // 先读后写
            ins = socket.getInputStream();
            String uid = UUID.randomUUID().toString().replace("-", "");
            out = new FileOutputStream(PATH + "/" + uid + ".jpg");


            int len;
            byte[] buffer = new byte[1024 * 8];
            while ((len = ins.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            serverSocket.close();
            socket.close();
        }

    }
}
