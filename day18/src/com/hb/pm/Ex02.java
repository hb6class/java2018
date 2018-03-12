package com.hb.pm;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex02 {

	public static void main(String[] args) {
		Date day=new Date();
		System.out.println(day);
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,Locale.JAPAN);
		System.out.println(df.format(day));
		DateFormat df2=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG, Locale.KOREA);
		System.out.println(df2.format(day));
		
	}

}












