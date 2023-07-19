package com.canyan7n.jb.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.socket_
 * @className: Server
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/19 16:39
 * @version: 1.0
 */

public class Server {
    public static void main(String[] args) {
        waitConnect();
    }
    public static void waitConnect() {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("等待连接。。。");
            Socket accept = serverSocket.accept();
            BufferedReader bufferedReader =
                    new BufferedReader(
                            new InputStreamReader(accept.getInputStream()));
            String requestData = bufferedReader.readLine();
            System.out.println("服务器接收到客户端的数据：" + requestData);

            PrintWriter printWriter =
                    new PrintWriter(
                            accept.getOutputStream());
            printWriter.write(
                    "服务器已收到请求，响应数据为客户端发送的数据("+requestData+")");
            printWriter.flush();
            //资源关闭
            printWriter.close();
            bufferedReader.close();
            accept.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
