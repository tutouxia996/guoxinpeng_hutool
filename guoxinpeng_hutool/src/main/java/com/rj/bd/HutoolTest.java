package com.rj.bd;

import cn.hutool.core.convert.Convert;
import java.util.Date;

/**
 * 字符串转为日期
 */
public class HutoolTest {
    public static void main(String[] args) {
        Date date1 = Convert.toDate("2021/01/02");
        System.out.println(date1);//运行结果：Sat Jan 02 00:00:00 CST 2021

        Date date2 = Convert.toDate("20210102182025");
        System.out.println(date2);//运行结果：Sat Jan 02 18:20:25 CST 2021

        Date date3 = Convert.toDate("2021-01-02 18:20:25");
        System.out.println(date3);//运行结果：Sat Jan 02 18:20:25 CST 2021

        Date date4 = Convert.toDate("2021-13-02 18:20:25");
        System.out.println(date4);//运行结果：Sun Jan 02 18:20:25 CST 2022

        Date date5 = Convert.toDate("2021,01,02");
        System.out.println(date5);//运行结果：null

        Date date6 = Convert.toDate("2021,01,02", new Date());
        System.out.println(date6);//运行结果：Sat Jan 02 18:28:12 CST 2021
    }
}
