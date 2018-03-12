package com.hb.am;

class Outter01{
	static int num01=1111;
	int num02=2222;
	
	// static 내부클래스
	static class Inner01{
		static int num11=1000;
		int num22=2000;
		
		public Inner01() {
			System.out.println("Inner 생성자");
		}
		
		public static void func11(){
			System.out.println("Inner func11()");
		}
		public void func22(){
			System.out.println("Inner func22()");			
		}
	}
	
	public Outter01() {
		System.out.println("Outter 생성자");
	}
	
	public static void func01(){
		System.out.println("Outter func01() start");
//		Inner01.func11();
//		Inner01 inn01=new Inner01();
//		inn01.func22();
		System.out.println("Outter func01() end");
	}
	
	public void func02(){
		System.out.println("Outter func02() start");
//		Inner01.func11();
//		Inner01 inn01=new Inner01();
//		inn01.func22();
		System.out.println("Outter func02() end");
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		// static 내부클래스
		Outter01 out01 = new Outter01();
		Outter01.func01();
		out01.func02();
		int su=Outter01.num01;
		System.out.println("--------------------");
		Outter01.Inner01.func11();
		Outter01.Inner01 inn01= null;
		inn01=new Outter01.Inner01();
		inn01.func22();
	}

}













