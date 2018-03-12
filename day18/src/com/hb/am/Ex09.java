package com.hb.am;

import java.util.Calendar;
import java.util.Date;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, 2002);
		cal.set(2022, 4, 1,23,0,0);
		System.out.print(cal.get(Calendar.YEAR)+"³â");
		System.out.print(cal.get(Calendar.MONTH)+1+"¿ù");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"ÀÏ");
		System.out.println(cal.after(Calendar.getInstance()));
		Date d=cal.getTime();
		System.out.println(d);
	}

}
