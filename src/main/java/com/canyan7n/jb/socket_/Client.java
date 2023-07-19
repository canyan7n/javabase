package com.canyan7n.jb.socket_;

import java.io.*;
import java.net.Socket;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.socket_
 * @className: Client
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/19 16:39
 * @version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        requestConnect();
    }
    public static void requestConnect(){
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            PrintWriter printWriter =
                    new PrintWriter(
                            socket.getOutputStream());
            String requestData = "我是客户端";
            printWriter.write(requestData);
            printWriter.flush();

            BufferedReader bufferedReader =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));
            String responseData = bufferedReader.readLine();
            System.out.println("服务器响应的数据" + responseData);
            //关闭资源
            bufferedReader.close();
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
