package com.canyan7n.jb.redis.util;

import com.canyan7n.jb.jdbc.util.Connect;
import redis.clients.jedis.Jedis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.redis.util
 * @className: ConnectToRedis
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/25 11:17
 * @version: 1.0
 */

public class ConnectToRedis {
    public static Jedis getConnect()  {
        String classpath = Connect.class.getClassLoader().getResource("").getPath();
        Properties properties = new Properties();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(classpath + "//jdbc.properties"));
            properties.load(bufferedReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String host = properties.getProperty("jdbc.redis.host");
        Integer port = Integer.parseInt(properties.getProperty("jdbc.redis.port"));
        Jedis jedis = new Jedis(host, port);
        String authPassword = "root";
        jedis.auth(authPassword);
        return jedis;
    }
}
