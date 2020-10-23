package com.itheima.day13.blocking;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by Jason on 2020/10/23 15:59
 */
public class TcpChannelClient1 {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("localhost", 9988));
        ByteBuffer buffer = ByteBuffer.wrap("hellogoodbye".getBytes());
        socketChannel.write(buffer);
        socketChannel.shutdownOutput();


        // 读数据
        ByteBuffer buffer1 = ByteBuffer.allocate(1024);
        int len = socketChannel.read(buffer1);

        byte[] bytes = buffer1.array();
        String str = new String(bytes, 0, len);
        System.out.println("服务端传输的数据:"+str);

        socketChannel.close();
    }
}
