package com.hq.reflect;
/**
*@author huangq
*@date 2017年9月5日
*/
public class MethodDemo3 {

	public static void main(String[] args) {
		User u1=new User("zhangsan","123456",30);
		System.out.println(BeanUtil.getValueByPropertyName(u1, "username"));
		System.out.println(BeanUtil.getValueByPropertyName(u1, "userpass"));
	}

}
