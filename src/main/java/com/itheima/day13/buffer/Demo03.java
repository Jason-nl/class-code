package com.itheima.day13.buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * Created by Jason on 2020/10/23 10:23
 */
public class Demo03 {
    public static void main(String[] args) {
        // bufferLimit();

       // bufferPosition();

        // bufferMark();

        

    }

    private static void bufferMark() {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        byte[] b = {10, 20};
        buffer.put(b);
        System.out.println(buffer);

        buffer.mark();
        byte[] b2 = {30, 40, 50};
        buffer.put(b2);
        buffer.reset();
        byte val = buffer.get();
        System.out.println(val);
    }

    private static void bufferPosition() {
        byte[] b = {10, 20, 30, 40, 50};
        ByteBuffer buffer = ByteBuffer.wrap(b);
        System.out.println("当前可以索引的位置:" + buffer.position());
        buffer.position(2);

        byte element = buffer.get();
        System.out.println(element);
    }

    private static void bufferLimit() {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        int limit = buffer.limit();
        System.out.println(limit);

        Buffer limit1 = buffer.limit(6);
        System.out.println(limit1);
        buffer.put("呵呵".getBytes());
    }
}
