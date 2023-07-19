package com.canyan7n.jb.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            //创建一个socket用来发起请求 设置请求ip和端口
            Socket socket = new Socket("127.0.0.1",8888);
            //通过socket的流对象 创建printwriter发送数据 创建bufferreader接收数据
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            //发送数据
            String requestData = "客户端请求的数据";
            printWriter.println(requestData);
            printWriter.flush();
            //接收服务器的响应数据
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            String responseData = bufferedReader.readLine();
            System.out.println("服务器的响应数据：" + responseData);
            //关闭资源
            printWriter.close();
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
