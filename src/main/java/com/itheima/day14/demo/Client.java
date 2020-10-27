package com.itheima.day14.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * created by Jason on 2020/10/25 10:00 上午
 */
public class Client {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("localhost", 8888));
        ByteBuffer buffer = ByteBuffer.wrap("hello 8888".getBytes());

        socketChannel.write(buffer);
        socketChannel.close();
    }
}
