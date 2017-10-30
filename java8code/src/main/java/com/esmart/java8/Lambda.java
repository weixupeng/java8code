package com.esmart.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * java8新特性
 * Lambda 表达式
 * 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
 * Lambda 表达式免去了使用匿名方法的麻烦
 * 》》》通过实践感觉这个表达式就是适用于接口方法的,这也是java8比较重要的一大更新
 * @author Thinkpad
 *
 */
public class Lambda {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(100);
		list.add(56);
		list.add(98);
		list.add(2);
		list.add(21);
		
		Collections.sort(list, (i1,i2)-> i1.compareTo(i2));
		
		//原来的java7是
		/*Collections.sort(list, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				
				return o1.compareTo(o2);
			}});*/
		
		System.out.println("排序后的结合："+list.toString());
		
		
		/**
		 * 打印结果是
		 * 排序后的结合：[0, 2, 21, 56, 98, 100]
		 */
	}
}
