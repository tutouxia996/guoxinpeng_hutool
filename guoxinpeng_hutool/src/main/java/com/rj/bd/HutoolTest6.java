package com.rj.bd;

import cn.hutool.core.util.ZipUtil;
import java.io.File;

/**
 * 文件打包到不同目录
 */
public class HutoolTest6 {
    public static void main(String[] args) {
        //将"E:\new\demo"目录下的所有内容打包到"E:\new\test\abc.zip"文件中
        File file = ZipUtil.zip("E:\\new\\demo","E:\\new\\test\\abc.zip");
        System.out.println(file.getName());//运行结果：abc.zip
    }
}
//运行main方法后，就会在"E:\new\test"目录下多一个abc.zip压缩包

