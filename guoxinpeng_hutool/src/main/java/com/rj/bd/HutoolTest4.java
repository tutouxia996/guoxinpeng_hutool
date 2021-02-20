package com.rj.bd;

	import cn.hutool.core.io.FileUtil;
	import cn.hutool.core.io.IoUtil;
	import java.io.BufferedInputStream;
	import java.io.BufferedOutputStream;

	/**
	 * copy方法–文件的复制
	 */
	public class HutoolTest4 {
	    public static void main(String[] args) {
	        BufferedInputStream in = FileUtil.getInputStream("E:\\new\\a.txt");
	        BufferedOutputStream out = FileUtil.getOutputStream("E:\\new\\b.txt");
	        long copySize = IoUtil.copy(in, out);
	        System.out.println("文件大小为："+copySize);//显示文件大小
	    }
	}
