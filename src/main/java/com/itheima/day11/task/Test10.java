package com.itheima.day11.task;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jason on 2020/10/20 19:55
 * 1.请参考讲义将commons-io包加入到项目中；
 *
 * ​	2.编写程序，使用FileUtils工具类：
 *
 * ​		1). 将d:\\视频.itcast文件复制到e:\\下
 *
 * ​		2). 将"d:\\多级目录"复制到"e:\\"下
 */
public class Test10 {
    public static void main(String[] args) {
        // copyFileToDirectory();
        copyDirectoryToDirectory();

    }

    private static void copyDirectoryToDirectory() {
        File src = new File("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day11/test01/");
        File dest = new File("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day11/test02");
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                try {
                    FileUtils.copyDirectoryToDirectory(file, dest);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void copyFileToDirectory() {
        File src = new File("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day11/test01/a.txt");
        File dest = new File("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day11/test02");
        try {
            FileUtils.copyFileToDirectory(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
