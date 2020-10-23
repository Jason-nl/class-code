package com.itheima.day13.channel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Jason on 2020/10/23 11:34
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/main/java/com/itheima/day13/resource/b.txt");

        FileChannel fosChannel = fos.getChannel();
        ByteBuffer buffer = ByteBuffer.wrap("abc".getBytes());
        fosChannel.write(buffer);

        fosChannel.close();
        fos.close();
    }
}
