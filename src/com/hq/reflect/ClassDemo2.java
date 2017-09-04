package com.hq.reflect;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
*@author huangq
*@date 2017年9月4日
*/
public class ClassDemo2 {

	public static void main(String[] args) {
		Class c1=int.class;//int 的类类型
		Class c2=String.class;//String 类的类类型，
		Class c3=double.class;
		Class c4=Double.class;
		Class c5=void.class;
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());
		System.out.println(c3.getName());
		System.out.println(c4.getName());
		System.out.println(c5.getName());
	}

}
