package com.hq.reflect;
/**
*@author huangq
*@date 2017年9月4日
*/
public class ClassDemo5 {

	public static void main(String[] args) {
		String s="hello";
		ClassUtil.printConMessage(s);
		System.out.println("==============");
		ClassUtil.printConMessage(new Integer(1));
		
	}

}
