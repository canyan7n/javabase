package com.canyan7n.jb.redis.util;

import redis.clients.jedis.Jedis;

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
    public static Jedis getConnect(){
        String url = "localhost";
        Integer port = 6379;
        Jedis jedis = new Jedis(url, port);
        String authPassword = "root";
        jedis.auth(authPassword);
        return jedis;
    }
}
