package com.hq.io;

import java.io.File;

/**
*@author huangq
*@date 2017年9月5日
*/
public class FileDemo {

	public static void main(String[] args) {
		//了解构造函数的情况  查帮助
		File file=new File("E:\\javaio\\imocc");
		System.out.println(file.exists());
	}

}
