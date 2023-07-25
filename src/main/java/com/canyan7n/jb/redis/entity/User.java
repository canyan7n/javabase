package com.canyan7n.jb.redis.entity;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.redis.entity
 * @className: User
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/25 14:37
 * @version: 1.0
 */

public class User {
    String name;
    String age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
