package com.hb.pm;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date day = new Date();
		
		DateFormatSymbols dfs= new DateFormatSymbols();
				
		String aPattern="YY-MM-dd hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(aPattern, dfs);
		System.out.println(sdf.format(day));
	}

}










