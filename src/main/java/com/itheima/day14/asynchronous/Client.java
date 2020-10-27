package com.itheima.day14.asynchronous;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * created by Jason on 2020/10/25 10:33 上午
 */
public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        AsynchronousSocketChannel asynchronousSocketChannel = AsynchronousSocketChannel.open();
        // 同步连接
        // asynchronousSocketChannel.connect(new InetSocketAddress("localhost", 9999));
        InetSocketAddress net = new InetSocketAddress("localhost", 9999);
        asynchronousSocketChannel.connect(net, null, new CompletionHandler<Void, Object>() {
            @Override
            public void completed(Void result, Object attachment) {
                System.out.println(Thread.currentThread().getName() + "客户端连接成功");
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println(Thread.currentThread().getName() + "客户端连接失败");
            }
        });

        System.out.println("客户端继续干活");
        Thread.sleep(100000);

        asynchronousSocketChannel.close();
    }
}
