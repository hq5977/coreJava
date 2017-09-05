package com.hq.reflect;

import java.lang.reflect.Method;

/**
*@author huangq
*@date 2017年9月5日
*/
public class BeanUtil {
	/**
	 * 根据标准javabean对象的属性名获取属性值
	 */
	public static Object getValueByPropertyName(Object obj,String propertyName){
		//1.根据属性名称就可以获取get方法
		String getMethodName="get"+propertyName.substring(0, 1).toUpperCase()+propertyName.substring(1);
		
		//2.获取方法对象
		Class c=obj.getClass();
		try {
			//get方法都是public的且无参数
			Method m=c.getMethod(getMethodName);
			//3 通过方法的反射操作方法
			Object value=m.invoke(obj);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
