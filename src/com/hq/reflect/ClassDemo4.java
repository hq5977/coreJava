package com.hq.reflect;
/**
*@author huangq
*@date 2017年9月4日
*/
public class ClassDemo4 {

	public static void main(String[] args) {
		String s="hello";
		ClassUtil.printFieldMessage(s);
		System.out.println("==============");
		ClassUtil.printFieldMessage(new Integer(1));
		
	}

}
