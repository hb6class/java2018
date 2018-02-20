package com.hb.am;

public class Ex02 {
	// 생성자 
	// 대표적 기능 - 필드의 초기화
	// 오버로드 가능
	int sum;
	
	public Ex02(){
		
	}
	
	public Ex02(int a){
		System.out.println("생성자 발동");
		sum=a;
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		System.out.println("sum="+me.sum);
		me = new Ex02(1004);
		System.out.println("sum="+me.sum);
	}

}
