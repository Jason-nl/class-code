package com.itheima.day14.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Set;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建三个通道，同时监听3个端口
        ServerSocketChannel channelA = ServerSocketChannel.open();
        channelA.configureBlocking(false);
        channelA.bind(new InetSocketAddress(7777));

        ServerSocketChannel channelB = ServerSocketChannel.open();
        channelB.configureBlocking(false);
        channelB.bind(new InetSocketAddress(8888));

        ServerSocketChannel channelC = ServerSocketChannel.open();
        channelC.configureBlocking(false);
        channelC.bind(new InetSocketAddress(9999));

        //获取选择器
        Selector selector = Selector.open();

        //注册三个通道
        channelA.register(selector, SelectionKey.OP_ACCEPT);
        channelA.register(selector, SelectionKey.OP_ACCEPT);
        channelA.register(selector, SelectionKey.OP_ACCEPT);

        // 获取已经注册通道的集合
        /*

        Set<SelectionKey> keys = selector.keys();
        System.out.println("注册通道:" + keys.size());

        //获取已连接通道的集合
        Set<SelectionKey> selectionKeys = selector.selectedKeys();
        System.out.println("连接通道:" + selectionKeys.size());
        System.out.println("--------------------------------");

        System.out.println("服务器等待连接...");
        // 阻塞方法
        int selectedCount = selector.select();
        System.out.println("连接数量:" + selectedCount);

        //
        Set<SelectionKey> keys1 = selector.keys();
        Set<SelectionKey> selectionKeys1 = selector.selectedKeys();
        System.out.println("注册通道:" + keys1.size());
        System.out.println("连接通道:" + selectionKeys1.size());

         */


        while(true) {
            System.out.println("等待连接......");
            int selectedCount = selector.select();
            System.out.println("连接数量：" + selectedCount);
            //获取已连接的通道对象
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            System.out.println("集合大小：" + selectionKeys.size());

            System.out.println("休息1秒......");
            Thread.sleep(1000);
            System.out.println();//打印一个空行

        }

    }

}
