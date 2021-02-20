package com.rj.bd;

import cn.hutool.core.convert.Convert;
import java.util.List;

/**
 * toList方法–数组转集合
 */
public class HutoolTest2 {
    public static void main(String[] args) {
        String[] arr = {"abc","你好","秃头侠"};
        List list = Convert.toList(arr);
        System.out.println(list.size());//运行结果：3
        //集合的运行结果：abc 你好 秃头侠
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
