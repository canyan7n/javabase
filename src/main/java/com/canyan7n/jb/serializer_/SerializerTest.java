package com.canyan7n.jb.serializer_;

import java.io.*;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.serializer_
 * @className: SerializerTest
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/26 14:24
 * @version: 1.0
 */

public class SerializerTest extends OutputStream implements Serializable {
    public static void main(String[] args) {
        creatASerializerClass();
    }

    private static void creatASerializerClass() {
        SerializerTest serializerTest = new SerializerTest();
        System.out.println(serializerTest);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new ObjectOutputStream(serializerTest).toString());
            System.out.println(fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(int b) throws IOException {

    }
}
