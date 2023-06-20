package com.canyan7n.jb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectToMySQL {
    public static void main(String[] args) throws Exception {
        //加载数据库连接驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        String URL = "jdbc:mysql://localhost:3306/study?serverTimezone=UTC";
        String username = "root";
        String password = "root";
        //创建连接
        Connection connection = DriverManager.getConnection(URL, username, password);
        //执行sql
        String sql = "select * from t_user";
        Statement statement = connection.createStatement();
        boolean execute = statement.execute(sql);
        if (execute){
            System.out.println("查询成功");
        }else {
            System.out.println("查询失败");
        }
    }
}
