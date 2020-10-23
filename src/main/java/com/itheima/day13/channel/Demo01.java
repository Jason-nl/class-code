package com.itheima.day13.channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/**
 * Created by Jason on 2020/10/23 11:11
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(3);
        FileInputStream fis = new FileInputStream("src/main/java/com/itheima/day13/resource/a.txt");
        FileOutputStream fos = new FileOutputStream("src/main/java/com/itheima/day13/resource/b.txt");

        /*
                FileChannel的获取：可以直接通过 输入流/输出流得到的
                输入流得到的管道：可以读
                输出流得到的管道：可以写
         */
        FileChannel fisChannel = fis.getChannel();

        int length = fisChannel.read(buffer);
        System.out.println(Arrays.toString(buffer.array()));
        System.out.println(length);

        buffer.clear();
        System.out.println(buffer);
        length = fisChannel.read(buffer);
        System.out.println(Arrays.toString(buffer.array()));
        System.out.println(length);

        buffer.flip();
        System.out.println(buffer);
        byte[] array = buffer.array();
        String str = new String(array, 0, buffer.limit());
        System.out.println(str);
//        FileChannel fosChannel = fos.getChannel();
//
//        fisChannel.transferTo(0, fisChannel.size(), fosChannel);
//
//        fosChannel.close();
//        fisChannel.close();
//        fos.close();
//        fis.close();

    }
}
