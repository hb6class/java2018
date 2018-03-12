package com.hb.pm;

interface Interf02{
	void func();
}

class Lec02{
	// static 내부클래스, 멤버클래스
	
	void func01(){
		//로컬클래스
		
		// 익명클래스
		Interf02 inn=new Interf02(){
			
			public void func(){
				System.out.println("내부클래스의 func");
			}
		};
		inn.func();
	}
}

abstract class Lec22{
	public void func01(){
		System.out.println("func01()");
	}
	public abstract void func02();
}


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec02 lec = new Lec02();
		lec.func01();
		
		Ex02 www=new Ex02(){};
		
		Ex02 me =new Ex02(){};
		
		Lec22 ab=new Lec22(){
			public void func02(){
				
			}
		};
		
		Interf02 inn=new Interf02(){
			public void func(){
				
			}
		};
	}

}
















