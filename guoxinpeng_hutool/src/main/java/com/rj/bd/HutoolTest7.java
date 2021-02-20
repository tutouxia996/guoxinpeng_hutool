package com.rj.bd;


import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;

/**
 * 文件的下载
 */
public class HutoolTest7 {
    public static void main(String[] args) {
        String fileUrl = "http://learning.happymmall.com/nginx/linux-nginx-1.10.2.tar.gz";
        //将文件下载后保存在E盘的new目录想，返回结果为下载文件的大小
        long size = HttpUtil.downloadFile(fileUrl, FileUtil.file("E:\\new"));
        System.out.println("size: " + size);//size: 910812
        
        String strSize = FileUtil.readableFileSize(size);
        System.out.println("文件大小为: " + strSize);//文件大小为：: 889.46 kB
    }
}

