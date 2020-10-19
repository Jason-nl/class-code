package com.itheima.day09.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jason on 2020/10/17 16:34
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        File f = new File("day09/file");
        String path = f.getAbsolutePath();
        System.out.println(path);
        File file = new File(path,"aa");

//        boolean newFile = file.createNewFile();
//        System.out.println(newFile);

        file.mkdirs();
        file.mkdir();
        

    }
}
