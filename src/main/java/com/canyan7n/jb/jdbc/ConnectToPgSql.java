package com.canyan7n.jb.jdbc;

import com.canyan7n.jb.jdbc.util.Connect;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.jdbc
 * @className: ConnectToPgSql
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/19 14:15
 * @version: 1.0
 */

public class ConnectToPgSql {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Connection pgSqlConnection = Connect.getPgSqlConnection();
        Statement statement = pgSqlConnection.createStatement();
        String sql = "select * from t_test";
        boolean execute = statement.execute(sql);
        if (execute == true){
            System.out.println("查询成功");
        }else {
            System.out.println("查询失败");
        }
    }
}
