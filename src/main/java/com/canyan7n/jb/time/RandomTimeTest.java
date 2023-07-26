package com.canyan7n.jb.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.time
 * @className: RandomTimeTest
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/25 16:50
 * @version: 1.0
 */

public class RandomTimeTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.print(format + " ");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.print("星期" + (i - 1) + " ");
//        int i1 = calendar.get(Calendar.);
//        System.out.println(i1);
    }
}
