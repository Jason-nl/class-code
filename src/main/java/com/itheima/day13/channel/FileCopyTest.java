package com.itheima.day13.channel;

import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Jason on 2020/10/23 14:26
 * 直接缓冲区：读写块，创建和释放慢
 * 文件小：用间接缓冲区（常规复制）
 * 文件大：用直接缓冲区（Channel和映射缓冲区）
 */
public class FileCopyTest {

//    public static final String PATH = "/Volumes/Worker/学习资料/极客时间/【No1088】左耳听风.zip";
//    public static final String PATH_COPY = "/Volumes/Worker/学习资料/极客时间/【No1088】左耳听风_copy.zip";
    public static final String PATH = "/Volumes/Worker/学习资料/Java/API.zip";
    public static final String PATH_COPY = "/Volumes/Worker/学习资料/Java/API_COPY.zip";


    @Test // 3s623ms  //3s145ms  // 2s683ms
    public void testFileStreamCopy() {
        try (FileInputStream fis = new FileInputStream(PATH);
             FileOutputStream fos = new FileOutputStream(PATH_COPY);) {
            int len;
            byte[] buffer = new byte[1024 * 1024];
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * MAX_INT = 2147
     */
    @Test //691ms  // 3s259ms
    public void testFileChannelCopy() {
        try (RandomAccessFile fis = new RandomAccessFile(PATH, "r");
             RandomAccessFile fos = new RandomAccessFile(PATH_COPY, "rw");

             FileChannel fisChannel = fis.getChannel();
             FileChannel fosChannel = fos.getChannel();) {
            long size = fisChannel.size();
            MappedByteBuffer inMap = fisChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            MappedByteBuffer outMap = fosChannel.map(FileChannel.MapMode.READ_WRITE, 0, size);

            for (long i = 0; i < size; i++) {
                byte b = inMap.get((int) i);
                outMap.put((int) i, b);
            }

//            ByteBuffer buffer = ByteBuffer.allocate(1024);
//            int len = fisChannel.read(buffer);
//            fisChannel.transferTo(0, fisChannel.size(), fosChannel);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test // 2s986ms
    public void fileCopy() {
        try (RandomAccessFile inRaf = new RandomAccessFile(PATH, "r");
             RandomAccessFile outRaf = new RandomAccessFile(PATH_COPY, "rw");
             FileChannel inRafChannel = inRaf.getChannel();
             FileChannel outRafChannel = outRaf.getChannel();) {
            // 总大小
            long size = inRafChannel.size();
            // 每块大小
            long everSize = 512 * 1024 * 1024;
            // 总块数
            long count = size % everSize == 0 ? size / everSize : size / everSize + 1;
            // 逐块复制
            long startIndex = 0;
            long length = everSize;
            for (long i = 0; i < count; i++) {
                if (i == count - 1) {
                    length = size - startIndex;
                }
                // 直接缓冲区
                MappedByteBuffer inMap = inRafChannel.map(FileChannel.MapMode.READ_ONLY, startIndex, length);
                MappedByteBuffer outMap = outRafChannel.map(FileChannel.MapMode.READ_WRITE, startIndex, length);

                for (int j = 0; j < length; j++) {
                    byte b = inMap.get((int) i);
                    outMap.put((int) i, b);
                }
                startIndex += everSize;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
