package com.canyan7n.jb.jdbc;

import com.canyan7n.jb.jdbc.util.Connect;
import com.sun.xml.internal.ws.api.ResourceLoader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class ConnectToMySQL {
    public static void main(String[] args) throws Exception {
        Connection connection = Connect.getMySqlConnection();
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
