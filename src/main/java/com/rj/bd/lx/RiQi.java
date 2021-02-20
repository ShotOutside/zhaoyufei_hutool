package com.rj.bd.lx;

import java.util.Calendar;
import java.util.Date;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;

/**
 * @desc   日期时间
 * @author ZYF
 *
 */

public class RiQi {

	public static void main(String[] args) {
		//当前时间
		Date date =DateUtil.date();
		
	//1.Date、long、Calendar之间的相互转换
		//当前时间2
		Date date2 =DateUtil.date(Calendar.getInstance());
		//当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
		String now = DateUtil.now();
		//当前日期字符串，格式：yyyy-MM-dd
		String today= DateUtil.today();
		
	//2.字符串转日期
		String dateStr = "2017-03-01 20:03:01";
		Date date3 = DateUtil.parse(dateStr);
		//自定义输出格式
		Date date4 = DateUtil.parse(dateStr, "yyyy-MM-dd");
	
	//3.获取Date对象的某个部分
		//获得年的部分
		int date5 =DateUtil.year(date);
		
	//4.日期时间偏移
		//4.1天增加2
		Date newDate = DateUtil.offset(date, DateField.DAY_OF_MONTH, 2);
		//4.2天增加3
		DateTime newDate2 = DateUtil.offsetDay(date, 3);
		//4.2时间-3
		DateTime newDate3 = DateUtil.offsetHour(date, -3);
		
		//昨天
		DateUtil.yesterday();
		//明天
		DateUtil.tomorrow();
		//上周
		DateUtil.lastWeek();
		//下周
		DateUtil.nextWeek();
		//上个月
		DateUtil.lastMonth();
		//下个月
		DateUtil.nextMonth();
	
	//5.星座和属相
		String xingZuo = DateUtil.getZodiac(Month.NOVEMBER.getValue(), 10);
		String shuXiang = DateUtil.getChineseZodiac(2000);
		
	
	//6.年龄
		int age =DateUtil.ageOfNow("2000-11-10");
		System.out.println(age);
	//7.是否闰年
		boolean runNian= DateUtil.isLeapYear(2017);
	}

}
