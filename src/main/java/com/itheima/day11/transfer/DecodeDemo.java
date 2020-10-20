package com.itheima.day11.transfer;

import java.io.*;

/**
 * Created by Jason on 2020/10/20 10:12
 */
public class DecodeDemo {

    private static InputStreamReader in;
    private static OutputStreamWriter out;

    public static void main(String[] args) throws IOException {
        try {
            in = new InputStreamReader(new FileInputStream("src/main/java/com/itheima/day11/resource/a.txt"), "gbk");
            out = new OutputStreamWriter(new FileOutputStream("src/main/java/com/itheima/day11/resource/b.txt"), "utf-8");
            int len;
            char[] buffer = new char[1024];
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            out.close();
            in.close();
        }
    }
}
