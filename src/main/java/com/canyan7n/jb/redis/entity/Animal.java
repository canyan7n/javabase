package com.canyan7n.jb.redis.entity;

import org.bytedeco.opencv.presets.opencv_core;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.redis.entity
 * @className: Animal
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/25 11:35
 * @version: 1.0
 */

public class Animal {
    String name;
    String age;

    public Animal() {
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
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
}
