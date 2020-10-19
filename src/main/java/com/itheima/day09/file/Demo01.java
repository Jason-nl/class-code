package com.itheima.day09.file;

import java.io.File;

/**
 * Created by Jason on 2020/10/17 15:43
 */
public class Demo01 {
    public static void main(String[] args) {
        File file = new File("/Volumes/Worker/Code/Java/class-code/src/com/itheima/day09/file/a.txt");
        System.out.println(file);
//        file.delete();

        File file1 = new File("/Volumes/Worker/Code/Java/class-code/src/com/itheima/day09/file", "a.txt");
        System.out.println(file1);
        String parentPath = file1.getParent();
        System.out.println(parentPath);

        File parent = new File(parentPath);
        File file2 = new File(parent, "a.txt");

    }
}
