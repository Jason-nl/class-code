package com.itheima.day13.channel;

import java.io.RandomAccessFile;

/**
 * Created by Jason on 2020/10/23 14:04
 * RandomAccessFile :
 * 1、支持随机访问的文件（IO流）文件索引可以任意调整
 * 2、支持双向操作：既可写又可以读
 *
 * 多线程断点下载
 *      1.在本地创建与要下载的文件同等大小的空间（随机访问文件对象）
 *      2.对文件进行分块，每块一个线程进行负责
 *      3.本地文件支持随机写入（文件的索引）
 *
 * 下载：
 *      1.目标文件5G
 *      2.临时文件（记录当前文件的下载状态）
 *
 */
public class Demo04 {
    public static void main(String[] args) {
//        RandomAccessFile randomAccessFile = new RandomAccessFile();

    }
}
