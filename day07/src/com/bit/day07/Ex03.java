package com.bit.day07;

public class Ex03 {

	public static void main(String[] args) {
		Ex03 me;
		me = new Ex03();
		me.func01();

	}
//	메서드
//	이름 : 알파벳 소문자로시작
//			중복x
//	오버로드 : 중복허용
//				인자의 유무,인자의 자료형,인자의 갯수
	public static void func01(){
		System.out.println("func01...");
	}
	public static void func01(int a){
		System.out.println("func01-a:"+a);
	}
	public void func01(int a, int b){
		System.out.println("func01-a:"+a+" , b:"+b);
	}
	public void func01(int a, String b){
		System.out.println("1func01-"+b+":"+a);
	}
	public void func01(String a, int b){
		System.out.println("2func01-"+a+":"+b);
	}

}
