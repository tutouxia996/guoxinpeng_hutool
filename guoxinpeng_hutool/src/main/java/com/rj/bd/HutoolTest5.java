package com.rj.bd;

import cn.hutool.core.util.ZipUtil;
import java.io.File;

/**
 *zip方法–打包成压缩包打包到当前目录
 */
public class HutoolTest5 {
    public static void main(String[] args) {
        //将"E:\new\demo"目录下的所有内容打包到"E:\new\demo.zip"文件中
        File file = ZipUtil.zip("E:\\new\\demo");
        System.out.println(file.getName());//运行结果：demo.zip
    }
}
//运行main方法后，就会在"E:\new"目录下多一个demo.zip压缩包
