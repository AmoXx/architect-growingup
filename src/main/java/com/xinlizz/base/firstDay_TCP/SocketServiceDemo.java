package com.xinlizz.base.firstDay_TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socket测试服务端
 * @Author xinlizz
 * @Date 2018/6/30
 */
public class SocketServiceDemo {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        BufferedReader reader = null;
        try {
            serverSocket = new ServerSocket(8080);
            //等待客户端连接
            Socket socket = serverSocket.accept();
            //获取输入流
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
        }catch (Exception e){

        }finally {
            if (null != serverSocket){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != reader){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
