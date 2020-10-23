package com.itheima.day13.channel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Jason on 2020/10/23 11:36
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/com/itheima/day13/resource/a.txt");
        FileOutputStream fos = new FileOutputStream("src/main/java/com/itheima/day13/resource/b.txt");

        FileChannel fisChannel = fis.getChannel();
        FileChannel fosChannel = fos.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        int len;
        while ((len = fisChannel.read(buffer)) != -1) {
            buffer.flip();
            System.out.println(buffer);
            fosChannel.write(buffer);
            buffer.clear();
            System.out.println(buffer);
        }

        fosChannel.close();
        fisChannel.close();
        fos.close();
        fis.close();
    }
}
