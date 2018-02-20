package com.hb.am;

public class Ex09 {
	// 전역변수
	// static : 클래스변수, static변수
	// non-static : 맴버필드, non-static변수
	int sum=100;
	static int sum2=1000;

	public static void main(String[] args) {
		System.out.println(Ex09.sum2);
		func01(200);
		System.out.println(Ex09.sum2);
		
	}
	
//	메서드 - 함수
	static void func01(int sum2){
		com.hb.am.Ex09.sum2=sum2;
	}

}// class end
