package com.itheima.day13.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * Created by Jason on 2020/10/23 15:52
 */
public class TcpChannelServer1 {
    public static void main(String[] args) {
        try (ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();){
            serverSocketChannel.bind(new InetSocketAddress(9988));
            //等待客户端连接（默认也是阻塞）
            SocketChannel socketChannel = serverSocketChannel.accept();
            // 读写数据
            // 读到的数据放在buffer
            ByteBuffer buffer = ByteBuffer.allocate(5);
            while (socketChannel.read(buffer) != -1) {
                String str = new String(buffer.array(), 0, buffer.position());
                System.out.print(str);
                buffer.clear();
            }

            //写数据
            ByteBuffer wrap = ByteBuffer.wrap("来了老弟".getBytes());
            socketChannel.write(wrap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
