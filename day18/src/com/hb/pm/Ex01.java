package com.hb.pm;

import java.util.Date;


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date day=new Date();
		System.out.println(day);
		System.out.println(day.getYear()+1900);
		System.out.println(day.getMonth()+1);//0~11
		System.out.println(day.getDate());
		System.out.println(day.getHours());
		System.out.println(day.getMinutes());
		System.out.println(day.getSeconds());
		System.out.println(day.getTime());
		Date day2 = new Date(day.getTime());
		System.out.println(day2);
	}

}














