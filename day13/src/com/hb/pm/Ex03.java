package com.hb.pm;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("main start");
		try{
		func01();
		}catch(ArithmeticException ex){
			System.out.println("main에서 처리");
		}
		System.out.println("main end");
	}
	
	public static void func01() throws ArithmeticException{
		System.out.println("func01 run");
		int x=100;
		int y=0;
		func01(x,y);
		System.out.println("func01 end");
	}
	public static void func01(int a, int b) throws ArithmeticException{
		
		System.out.println(a/b);
	}

}
