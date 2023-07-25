package com.canyan7n.jb.redis.string;

import com.canyan7n.jb.redis.util.ConnectToRedis;
import redis.clients.jedis.Jedis;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.redis.string
 * @className: StringTest
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/25 11:17
 * @version: 1.0
 */

public class StringTest {
    public static void main(String[] args) {
        test01();
    }
    public static void test01(){
        Jedis connect = ConnectToRedis.getConnect();
        String k1 = connect.get("k1");
        System.out.println(k1);
    }
}
