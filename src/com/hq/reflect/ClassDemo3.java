package com.hq.reflect;
/**
*@author huangq
*@date 2017年9月4日
*/
public class ClassDemo3 {

	public static void main(String[] args) {
		String s="hello";
		ClassUtil.printClassMethodMessage(s);
		//ClassUtil.printFieldMessage(s);
		ClassUtil.printClassMethodMessage(new Integer(1));
		
	}

}
