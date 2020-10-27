package com.itheima.day14.asynchronous;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * created by Jason on 2020/10/25 10:27 上午
 * 接口回调：调用方法的线程不是当前定义的线程
 */
public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        asynchronousServerSocketChannel.bind(new InetSocketAddress(9999));

        System.out.println("服务端非阻塞接收连接");
        asynchronousServerSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {

            @Override
            public void completed(AsynchronousSocketChannel result, Object attachment) {
                System.out.println(Thread.currentThread().getName() + ":服务端获取连接成功");
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println(Thread.currentThread().getName() + ":服务端获取连接失败");
            }
        });

        System.out.println("服务端开启连接之后,继续运行");
        // Thread.sleep(10000);
        while (true) {

        }

    }
}
