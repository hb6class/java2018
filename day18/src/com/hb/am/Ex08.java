package com.hb.am;

import java.util.Calendar;

public class Ex08 {

	public static void main(String[] args) {
		// 31+28+6
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		char[] ch ={'일','월','화','수','목','금','토'};
		System.out.println(ch[cal.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
	}

}
