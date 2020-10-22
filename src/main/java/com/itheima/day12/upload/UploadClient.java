package com.itheima.day12.upload;

import java.io.*;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 14:44
 */
public class UploadClient {

    private static Socket socket;

    public static void main(String[] args) throws IOException {
        try {
            socket = new Socket("localhost", 8888);

            // 先读后写
            InputStream ins = new FileInputStream(UploadServer.PATH + "/bailu.jpg");
            OutputStream out = socket.getOutputStream();
            int len;
            byte[] buffer = new byte[1024 * 8];
            while ((len = ins.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }
}
