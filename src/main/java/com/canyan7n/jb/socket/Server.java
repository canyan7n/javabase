package com.canyan7n.jb.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try {
            //创建一个socket
            ServerSocket serverSocket = new ServerSocket(8888);
            //等待客户端连接
            Socket socket = serverSocket.accept();
            //接收来自客户端的数据
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String requestData = bufferedReader.readLine();
            System.out.println("接收到来自客户端的数据:" + requestData);
            //发送响应数据给客户端
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            //写入响应的数据
            printWriter.println("服务器已收到请求，响应数据为:" + requestData);
            //强制发送
            printWriter.flush();
            //关闭资源
            printWriter.close();
            bufferedReader.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
