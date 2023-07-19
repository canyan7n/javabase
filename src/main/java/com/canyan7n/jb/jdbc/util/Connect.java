package com.canyan7n.jb.jdbc.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.jdbc.util
 * @className: Connect
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/19 14:17
 * @version: 1.0
 */

public class Connect {
    public static Connection getMySqlConnection() throws ClassNotFoundException, SQLException, IOException {
        String classpath = Connect.class.getClassLoader().getResource("").getPath();
        Properties properties = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(classpath + "//jdbc.properties"));
        properties.load(bufferedReader);
        String driver = properties.getProperty("jdbc.mysql.driver");
        String url = properties.getProperty("jdbc.mysql.url");
        String username = properties.getProperty("jdbc.mysql.username");
        String password = properties.getProperty("jdbc.mysql.password");
        //加载数据库连接驱动
        Class.forName(driver);

        //创建连接
        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
    public static Connection getPgSqlConnection() throws ClassNotFoundException, SQLException, IOException {
        String classpath = Connect.class.getClassLoader().getResource("").getPath();
        Properties properties = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(classpath + "//jdbc.properties"));
        properties.load(bufferedReader);
        String driver = properties.getProperty("jdbc.psql.driver");
        String url = properties.getProperty("jdbc.psql.url");
        String username = properties.getProperty("jdbc.psql.username");
        String password = properties.getProperty("jdbc.psql.password");
        //加载数据库连接驱动
        Class.forName(driver);

        //创建连接
        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
