package com.canyan7n.jb.redis.hash;

import com.canyan7n.jb.redis.entity.Animal;
import com.canyan7n.jb.redis.util.ConnectToRedis;
import com.google.gson.Gson;
import com.mysql.cj.xdevapi.JsonString;
import redis.clients.jedis.Jedis;

import java.io.UnsupportedEncodingException;
import java.time.temporal.ValueRange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.redis.hash
 * @className: HashTest
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/25 11:21
 * @version: 1.0
 */

public class HashTest {
    public static void main(String[] args) {
        test01();
    }
    public static void test01(){
        Jedis connect = ConnectToRedis.getConnect();
        //设置一个k-v并设置过期时间 根据k获取v并获取过期时间
        connect.setex("k2",60,"v2");
        System.out.println(connect.get("k2"));
        System.out.println(connect.ttl("k2"));

        //获取stu hash表所有字段
        Set<String> stu = connect.hkeys("stu");
        for (String item : stu){
            System.out.println(item);
        }
        //获取stu hash表所有的字段和值
        Map<String, String> map = connect.hgetAll("stu");
        System.out.println(map);


        //查看stu 所有字段的值
        List<String> hvals = connect.hvals("stu");
        System.out.println(hvals);

        //添加一个hash表
        /*HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("cat","猫");
        hashMap.put("dog","狗");
        hashMap.put("fish","鱼");
        connect.hset("animal",hashMap);*/

        //添加一个hash表
        /*Gson gson = new Gson();
        Animal cat = new Animal("cat", "20");
        Animal dog = new Animal("dog", "21");
        String catJson = gson.toJson(cat);
        String dogJson = gson.toJson(dog);

        connect.hset("animal","1",catJson);
        connect.hset("animal","2",dogJson);*/

        //序列化存储java对象
        Animal lion = new Animal("狮子", "25");
        String key = "3";
        Gson gson = new Gson();
        String value = gson.toJson(lion);
        try {
            connect.set(key.getBytes("utf-8"),value.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
