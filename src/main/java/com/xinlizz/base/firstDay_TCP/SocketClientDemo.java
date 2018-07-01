package com.xinlizz.base.firstDay_TCP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 测试socket客户端
 * @Author xinlizz
 * @Date 2018/6/30
 */
public class SocketClientDemo {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter writer = null;
        try {
            socket = new Socket("127.0.0.1",8080);
            writer = new PrintWriter(socket.getOutputStream(),true);
            writer.println("hello!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != writer){
                writer.close();
            }
        }
    }
}
