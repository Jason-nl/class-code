package com.itheima.day11.buffer;

import java.io.*;

/**
 * Created by Jason on 2020/10/20 08:48
 */
public class BufferStreamDemo {

    private static FileInputStream fis;
    private static FileOutputStream fos;
    private static BufferedInputStream bufferedInputStream;
    private static BufferedOutputStream bufferedOutputStream;

    public static void main(String[] args) throws IOException {

        bufferedInputStream = new BufferedInputStream(new FileInputStream("com/itheima/day11/resource/a.txt"));
        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("com/itheima/day11/resource/copy.txt"));

        int len;
        byte[] buffer = new byte[1024];
        while ((len = bufferedInputStream.read(buffer)) != -1) {
            bufferedOutputStream.write(buffer, 0, len);
        }


        // fileStream();
    }

    private static void fileStream() throws IOException {
        try {
            fis = new FileInputStream("com/itheima/day11/resource/a.txt");
            fos = new FileOutputStream("com/itheima/day11/resource/copy.txt");

            int len;
            byte[] buffer = new byte[1024];
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            bufferedOutputStream.close();
            bufferedInputStream.close();
        }
    }
}
