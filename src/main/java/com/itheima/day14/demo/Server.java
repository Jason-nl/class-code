package com.itheima.day14.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * created by Jason on 2020/10/25 9:47 上午
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel channelA = ServerSocketChannel.open();
        channelA.configureBlocking(false);
        channelA.bind(new InetSocketAddress(7777));

        ServerSocketChannel channelB = ServerSocketChannel.open();
        channelB.configureBlocking(false);
        channelB.bind(new InetSocketAddress(8888));

        ServerSocketChannel channelC = ServerSocketChannel.open();
        channelC.configureBlocking(false);
        channelC.bind(new InetSocketAddress(9999));

        Selector selector = Selector.open();
        channelA.register(selector, SelectionKey.OP_ACCEPT);
        channelB.register(selector, SelectionKey.OP_ACCEPT);
        channelC.register(selector, SelectionKey.OP_ACCEPT);

        //死循环轮询
        while (true) {
            // 开启轮询，查看有没有客户端连接
            System.out.println("开启轮询，查看有没有客户端连接");
            int count = selector.select();
            System.out.println("count:" + count);

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> it = selectionKeys.iterator();
            while (it.hasNext()) {
                SelectionKey key = it.next();
                ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                SocketAddress localAddress = channel.getLocalAddress();
                System.out.println("当前被连接的服务端:" + localAddress);

                SocketChannel socketChannel = channel.accept();
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                while (socketChannel.read(buffer) != -1) {
                    buffer.flip();
                    String str = new String(buffer.array(), 0, buffer.limit());
                    System.out.println(localAddress + "接收到信息" + str);
                    buffer.clear();

                    // 清除集合中所有的通道
                    it.remove();
                }
            }
        }
    }
}
