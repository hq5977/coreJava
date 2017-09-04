package com.hq.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {

	/**
	 * 打印类的信息，包括累的成员函数、成员变量（只获取成员函数）
	 * 
	 */
	public static void printClassMethodMessage(Object obj){
		//首先获取类的类类型
		Class c=obj.getClass();
		System.out.println("类的名称是："+c.getName());
		
		/**
		 * Method类，方法对象
		 * 一个成员方法就是一个Method对象
		 * getMethods()方法获取的是所有的public的函数,包括弗雷继承而来的
		 * getDeclaredMethods()获取的是所有该类自己声明的方法，不问访问权限
		 */
		
		Method[] ms=c.getMethods();
		
		for(int i=0;i<ms.length;i++){
			//得到方法的返回值类型的类类型
			Class returnType=ms[i].getReturnType();
			System.out.print("方法的返回类型："+returnType.getName()+" ");
			//得到方法的名称
			System.out.print("--方法名称"+ms[i].getName()+"(");
			//获取参数类型--->得到的是参数列表的类型的类类型
			Class[] paramType=ms[i].getParameterTypes();
			for (Class class1 : paramType) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
	/**
	 * 获取成员变量的信息
	 * @param obj
	 */
	public static void printFieldMessage(Object obj){
		Class c=obj.getClass();
		/*
		 * 成员变量也是对象
		 * java.lang.reflect.Field
		 * Field类封装了关于成员变量的操作
		 * getFields()方法获取的是所有的public的成员变量的信息
		 * getDeclaredField获取的是该类自己声明的成员变量的信息
		 */
		//Field[] fs=c.getFields();
		Field[] fs=c.getDeclaredFields();
		for (Field field : fs) {
			//得到成员变量的类型的类类型
			Class fieldType=field.getType();
			String typeName=fieldType.getName();
			//得到成员变量的名称
			String fieldName=field.getName();
			System.out.println("成员变量类型:"+typeName+"--成员变量名称：  "+fieldName);
		}
	}
	
	public static void printConMessage(Object obj){
		Class c=obj.getClass();
		/*
		 * 构造函数也是对象
		 * java.lang.Constructor中封装了构造函数的信息
		 * getConstructor获取所有的public的构造函数
		 * getDeclaredConstructor得到所有的构造函数
		 */
		//Constructor[] cs=c.getConstructors();
		
		Constructor[] cs=c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName()+"(");
			//获取构造函数的参数列表--->得到的是参数列表的类类型
			Class[] paramTypes=constructor.getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
}
