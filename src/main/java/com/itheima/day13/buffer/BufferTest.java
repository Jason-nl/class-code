package com.itheima.day13.buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * Created by Jason on 2020/10/22 21:29
 */
public class BufferTest {
    public static void main(String[] args) {
        // 分配一个指定容量的缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int position = buffer.position();
        int limit = buffer.limit();
        int capacity = buffer.capacity();
        System.out.println("----------------allocate--------------");
        System.out.println("position:" + position);
        System.out.println("limit:" + limit);
        System.out.println("capacity:" + capacity);

        // 添加数据
        System.out.println("----------------put--------------");
        String str = "abcde";
        buffer.put(str.getBytes());
        System.out.println("position:" + buffer.position());

        // 切换到读数据模式
        buffer.flip();
        System.out.println("----------------flip--------------");
        System.out.println("position:" + buffer.position());
        System.out.println("limit:" + buffer.limit());
        System.out.println("capacity:" + buffer.capacity());

        // get读数据
        byte[] bytes = new byte[buffer.limit()];
        buffer.get(bytes);

        System.out.println("获取缓冲区的数据:" + new String(bytes, 0, bytes.length));
        System.out.println("----------------flip--------------");
        System.out.println("position:" + buffer.position());
        System.out.println("limit:" + buffer.limit());
        System.out.println("capacity:" + buffer.capacity());

        // 重复读数据
        buffer.rewind(); // 重置position为0
        System.out.println();
        System.out.println("----------------rewind--------------");
        System.out.println("position:" + buffer.position());
        System.out.println("limit:" + buffer.limit());
        System.out.println("capacity:" + buffer.capacity());

        // 清空缓冲区
        buffer.clear();
        System.out.println("----------------clear--------------");
        System.out.println("position:" + buffer.position());
        System.out.println("limit:" + buffer.limit());
        System.out.println("capacity:" + buffer.capacity());

    }
}
