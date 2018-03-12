package com.hb.am;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Ex10 {

	public static void main(String[] args) {
		// 밀레니엄버그
		// 
		GregorianCalendar gc = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println("윤년:"+gc.isLeapYear(2020));
		System.out.println(gc.get(Calendar.YEAR)+"년");
		System.out.println(gc.get(Calendar.MONTH)+1+"월");
		System.out.println(gc.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(gc.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.println(gc.get(Calendar.MINUTE)+"분");
		System.out.println(gc.get(Calendar.SECOND)+"초");
		Date d=gc.getGregorianChange();
		System.out.println(d);
	}

}
