package com.hb.pm;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("main start");
		int a=2;
		int b=0;
		int c=0;
		
		try{// 예외처리
			System.out.println("에러발생 전");
			c=a/b;
			System.out.println("에러발생 후");
		}catch(ArithmeticException ex){
			System.out.println("에러 상황");
		}
		System.out.println("main end");
	}

}








