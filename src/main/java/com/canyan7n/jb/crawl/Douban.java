package com.canyan7n.jb.crawl;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.crawl
 * @className: Douban
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/20 17:10
 * @version: 1.0
 */

public class Douban {
    public static void main(String[] args) {
        doubanCrawl();
    }
    public static void doubanCrawl(){
        System.setProperty("webdriver.chrome.driver","d:\\Tools\\Google\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://movie.douban.com/top250");
        chromeDriver.manage().window().maximize();
//        chromeDriver.findElement();

    }

}
