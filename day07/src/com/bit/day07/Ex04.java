package com.bit.day07;

public class Ex04 {
	// 클래스의 구성요소
	// 1. 메서드 (static, non-static)
	// 2. 변수 (static[클래스변수], non-static[맴버필드])
	//		기본값이 존재
	// 		선언과 초기화 동시에 
	public static int sum=10000;// 클래스변수

	
	public static void main(String[] args) {
		int temp;
		
		Ex04 me = new Ex04();
		temp=1000;
		sum=me.add(temp);
		System.out.println("sum="+sum);
		temp=200;
		sum=me.del(temp);
		System.out.println("sum="+sum);
		temp=300;
		sum=me.del(temp);
		System.out.println("sum="+sum);
		
	}
	
	public int add(int b){
		return sum+b;
	}
	public int del(int b){
		return sum-b;
	}
	

}
