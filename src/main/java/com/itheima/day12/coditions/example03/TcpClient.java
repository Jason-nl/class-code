package com.itheima.day12.coditions.example03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Jason on 2020/10/22 19:35
 * 需求：使用TCP协议实现客户端和服务端互相发送消息。
 *
 * 客户端发送一条消息，服务器读取之后，返回一条消息给客户端，
 * 客户端读取服务器返回的消息之后，又发送一条消息…循环执行，直到输入exit。
 *
 * 要求:
 *
 * 1. 消息内容通过键盘输入
 *
 * 2. 要求服务器端和客户端都使用字符流的方式发送和接收数据。
 *
 *    使用BufffferedReader方法readLine()读取一行数据。
 *
 *    使用BufffferedWriter方法write("字符串的数据")发送数据。
 *
 * ### 训练目标
 *
 * TCP双向通信
 *
 * ### 训练提示
 *
 * 1、需要在客户端和服务器分别无限循环
 *
 * 2、接收到消息必须判断是否是exit
 *
 * ### 参考方案
 *
 * 使用Socket和ServerSocket完成
 *
 * ### 操作步骤
 *
 * 1、定义变量记录学生个数
 *
 * 2、定义变量统计总的植树数量
 *
 * 3、定义for循环，循环条件是20个年份
 *
 * 4、在循环中，每年的植树数量是学生数量 * 当前年份，再累加之前的总数
 *
 * 5、循环结束，输出统计变量的值
 */
public class TcpClient {

    private static Socket socket;
    private static Scanner scanner;
    private static BufferedWriter writer;

    public static void main(String[] args) throws IOException {
        scanner = new Scanner(System.in);
        socket = new Socket("localhost", 9999);
        writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        while (true) {
            System.out.println("请发送请求数据:");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                System.exit(0);
                socket.close();
                writer.close();
            }
            writer.write(line);
            writer.newLine();
            writer.flush();
//            socket.shutdownOutput();
        }


    }
}
