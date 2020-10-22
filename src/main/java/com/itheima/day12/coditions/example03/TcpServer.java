package com.itheima.day12.coditions.example03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason on 2020/10/22 19:35
 */
public class TcpServer {

    private static ServerSocket serverSocket;
    private static BufferedReader reader;
    private static Socket socket;
    private static BufferedWriter writer;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(9999);

        while (true) {
            socket = serverSocket.accept();
            try {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                reader.close();
                socket.close();
                serverSocket.close();
            }

        }
    }
}
