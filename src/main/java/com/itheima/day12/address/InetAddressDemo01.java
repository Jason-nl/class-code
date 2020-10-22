package com.itheima.day12.address;

import java.net.InetAddress;

/**
 * Created by Jason on 2020/10/21 21:40
 */
public class InetAddressDemo01 {
    public static void main(String[] args) throws Exception {
        // 获得本地主机IP地址对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        // 根据IP地址字符串获取对应IP地址对象
        InetAddress alibaba = InetAddress.getByName("alibaba.com");
        System.out.println(alibaba);

        //获取主机名
        String alibabaHostName = alibaba.getHostName();
        System.out.println(alibabaHostName);

        // 获取IP地址
        String alibabaHostAddress = alibaba.getHostAddress();
        System.out.println(alibabaHostAddress);
    }
}
