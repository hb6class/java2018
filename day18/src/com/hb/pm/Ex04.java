package com.hb.pm;

import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		// 
		long time1 = System.currentTimeMillis();
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<100000; i++){
			sb.append(i);
		}
		long time2 = System.currentTimeMillis();
//		long time3 = System.currentTimeMillis();
//		String st = new String();
//		for(int i=0; i<100000; i++){
//			st+=i;
//		}
//		long time4 = System.currentTimeMillis();
//		System.out.println("String:"+(time4-time3));
		System.out.println("StringBuffer:"+(time2-time1));
	}

}
