package com.hb.am;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Ex10 {

	public static void main(String[] args) {
		// �з��Ͼ�����
		// 
		GregorianCalendar gc = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println("����:"+gc.isLeapYear(2020));
		System.out.println(gc.get(Calendar.YEAR)+"��");
		System.out.println(gc.get(Calendar.MONTH)+1+"��");
		System.out.println(gc.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println(gc.get(Calendar.HOUR_OF_DAY)+"��");
		System.out.println(gc.get(Calendar.MINUTE)+"��");
		System.out.println(gc.get(Calendar.SECOND)+"��");
		Date d=gc.getGregorianChange();
		System.out.println(d);
	}

}
