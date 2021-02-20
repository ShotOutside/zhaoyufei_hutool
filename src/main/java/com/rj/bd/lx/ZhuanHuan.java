package com.rj.bd.lx;

import java.util.Date;

import cn.hutool.core.convert.Convert;

/**
 * @desc   类型转换
 * @author ZYF
 *
 */

public class ZhuanHuan {

	public static void main(String[] args) {
	//1.数字转字符串
		//1.1定义一个数字类型
		int a =1;
		//1.2调用方法转变为字符串类型
		String aString =Convert.toStr(a);
		//System.out.println(aString);
		
	//2.转变数组类型
		//2.1创建字符串数组
		String[] shuZu ={"1221","212","12","1213"};
		//2.2调用方法转变为Integer类型
		Integer[] shuZu2 =Convert.toIntArray(shuZu);
		
	//3.转变为日期对象
		//3.1创建字符串类型
		String riQi ="2021-2-20";
		Date value =Convert.toDate(riQi);
		System.out.println(value);
	}

}
