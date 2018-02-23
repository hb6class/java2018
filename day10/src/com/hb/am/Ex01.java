package com.hb.am;

/*
 * 기초자료형(원시자료형)
 * int Long Double...
 * 
 * 랩퍼클래스
 * 
*/

public class Ex01 {

	public static void main(String[] args) {
		// int 의 객체형
		int a;
		a=100;
		int b;
		b=200;
		int c=a+b;
		System.out.println(c);
		System.out.println("-----------------");
		Integer x=10;// 오토랩핑
		Integer y=20;
		Integer z=x+y;
		System.out.println(z);
		System.out.println("-----------------");
		Integer a1=new Integer(1000);
		Integer a2=new Integer(2000);
		Integer a3=new Integer(1000+2000);
		System.out.println(a3);
		System.out.println("-----------------");
	}

}











