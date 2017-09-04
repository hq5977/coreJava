package com.hq.reflect;

import java.lang.reflect.Method;

public class MethodDemo1 {

	public static void main(String[] args) {
		//要获取print(int ,int) 方法 1.要获取一个方法就是获取类的信息，获取类的信息首先要获取类的类类型
		
		A a1=new A();
		Class c=a1.getClass();
		try {
			Method m=c.getMethod("print", new Class[]{int.class,int.class});
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

class A{
	public void print(){
		System.out.println("helloworld");
	}
	public void pring(int a,int b){
		System.out.println(a+b);
	}
	public void print(String a,String b){
		System.out.println(a.toUpperCase()+","+b.toLowerCase());
	}
}
