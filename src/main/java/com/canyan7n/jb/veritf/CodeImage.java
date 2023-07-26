package com.canyan7n.jb.veritf;

import com.wf.captcha.SpecCaptcha;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.veritf
 * @className: CodeImage
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/12 14:09
 * @version: 1.0
 */

public class CodeImage {
    public static void main(String[] args) {
        SpecCaptcha specCaptcha = new SpecCaptcha(13,4);
        try {
            String path = CodeImage.class.getClassLoader().getResource("").getPath();

            System.out.println(path);
            OutputStream outputStream = new FileOutputStream(new File("static/img/"));
            boolean flag = specCaptcha.out(outputStream);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
