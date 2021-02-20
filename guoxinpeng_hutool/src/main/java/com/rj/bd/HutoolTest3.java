package com.rj.bd;

import cn.hutool.core.convert.Convert;

/**
 * 金额转大写
 */
public class HutoolTest3 {
    public static void main(String[] args) {
        double d = 67556.32;
        String s = Convert.digitToChinese(d);
        System.out.println(s);//运行结果：陆万柒仟伍佰伍拾陆元叁角贰分
    }
}
