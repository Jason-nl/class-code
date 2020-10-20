package com.itheima.day11.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Jason on 2020/10/20 15:18
 */
public class IoUtils {
    public static void copyFile(String src, String dest) {
        try ( // 原文件
              FileInputStream fis = new FileInputStream(src);
              // 新文件
              FileOutputStream fos = new FileOutputStream(dest)) {
            int len;
            byte[] buffer = new byte[1024];
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String src, String dest, int bufferSize) {
        try ( // 原文件
              FileInputStream fis = new FileInputStream(src);
              // 新文件
              FileOutputStream fos = new FileOutputStream(dest)) {
            int len;
            byte[] buffer = new byte[bufferSize];
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
