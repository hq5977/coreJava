package com.hq.test;

class Office{
	public static void main(String[] args){
		//new 创建对象是静态加载，在编译时刻就需要加载所有的可能使用到的类。
		//通过动态加载类可以解决该问题
		if("word".equals(args[0])){
			Word w=new Word();
			w.start();
		}
		if("Excel".equals("args[0]")){
			Excel e=new Excel();
			e.start();
		}
		
	}
}