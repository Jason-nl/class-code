package com.itheima.day14.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class Client {
    public static void main(String[] args) {
        new Thread(()->{
            try (SocketChannel socket = SocketChannel.open()) {
                System.out.println("7777客户端连接服务器......");
                socket.connect(new InetSocketAddress("localhost", 7777));
                System.out.println("7777客户端连接成功....");
            } catch (IOException e) {
                System.out.println("7777异常重连");
            }

        }).start();

        new Thread(()->{

            try (SocketChannel socket = SocketChannel.open()) {
                System.out.println("8888客户端连接服务器......");
                socket.connect(new InetSocketAddress("localhost", 8888));
                System.out.println("8888客户端连接成功....");
            } catch (IOException e) {
                System.out.println("8888异常重连");
            }

        }).start();
    }
}
