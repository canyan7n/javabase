package com.canyan7n.jb.redis.string;

import com.alibaba.fastjson.JSON;
import com.canyan7n.jb.redis.entity.User;
import com.canyan7n.jb.redis.util.ConnectToRedis;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import redis.clients.jedis.Jedis;

import javax.crypto.interfaces.PBEKey;
import javax.swing.text.IconView;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

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
//        test01();
        test02();
    }
    public static void test01(){
        Jedis connect = ConnectToRedis.getConnect();
        connect.select(1);

        String key = "1";
        User user = new User("张三", "20");
        String value = JSON.toJSONString(user);

        try {
            connect.set(key.getBytes("utf-8"),value.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    public static void test02(){
        Jedis connect = ConnectToRedis.getConnect();
        connect.select(1);
    }
}
