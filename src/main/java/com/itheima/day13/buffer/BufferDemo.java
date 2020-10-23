package com.itheima.day13.buffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * Created by Jason on 2020/10/23 09:10
 * static ByteBuffer allocate(int capacity)             间接缓冲区
 * static ByteBuffer allocateDirect(int capacity)       直接缓冲区
 * static ByteBuffer wrap(byte[] array)                 间接缓冲区
 */
public class BufferDemo {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(3);
        System.out.println(buffer);
//        ByteBuffer buffer1 = ByteBuffer.allocateDirect(1024);
//        System.out.println(buffer1);
//        ByteBuffer buffer2 = ByteBuffer.wrap("呵呵".getBytes());
//        System.out.println(buffer2);

         bufferPut(buffer);


//        bufferFlip(buffer);

//        bufferClear(buffer);

        bufferArray(buffer);
    }

    /**
     * 取数据：
     * public byte[] array() 返回实现此缓冲区的byte数组
     * public byte get()     当前位置+1，读取此缓冲区当前位置的字节
     * @param buffer
     */
    private static void bufferArray(ByteBuffer buffer) {
        System.out.println("================array&get================");
        byte[] arr = buffer.array();
        System.out.println(Arrays.toString(arr));

    }



    private static void bufferClear(ByteBuffer buffer) {
        System.out.println("================clear================");
        buffer.clear();
        System.out.println("position:"+buffer.position());
        System.out.println("limit:"+buffer.limit());
        System.out.println("capacity:"+buffer.capacity());
    }

    private static void bufferFlip(ByteBuffer buffer) {
        System.out.println("================flip================");
        buffer.flip();
        System.out.println("position:"+buffer.position());
        System.out.println("limit:"+buffer.limit());
        System.out.println("capacity:"+buffer.capacity());
    }

    private static void bufferPut(ByteBuffer buffer) {
        System.out.println("================put================");
//        buffer.put("1".getBytes());
//        buffer.put("2".getBytes());
//        buffer.put("3".getBytes());
        System.out.println("position:"+buffer.position());
        System.out.println("limit:"+buffer.limit());
        System.out.println("capacity:"+buffer.capacity());
    }
}
