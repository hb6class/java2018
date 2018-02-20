package com.hb.am;

import com.hb.pm.Ex06;

class Ex44{
	// 접근제한자
	// 접근제한자 [static] 자료형 변수명;
	// public > default > private
	// private접근 허용범위가 동일 클래스 내부에서만 접근허용
	// default 동일 패키지 내부에서만 접근허용
	// public 어디서든 접근 허용
	
	// 필드의 접근제한자
	
	public int su1=1111;
	int su2=2222;
	private int su3=3333;
	
	public void func01(){
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println("퍼블릭 메서드");
	}
	void func02(){
		System.out.println("디폴트 메서드");
	}
	private void func03(){
		System.out.println("private 메서드");		
	}
	
}


public class Ex04 {
	

	public static void main(String[] args) {
		Ex44 ex1=new Ex44();
		System.out.println(ex1.su1);
		System.out.println(ex1.su2);
//		System.out.println(ex1.su3);
		Ex05 ex5=new Ex05();
		System.out.println(ex5.su4);
//		System.out.println(ex5.su5);
		System.out.println(ex5.su6);
		
		Ex06 ex6 = new Ex06();
		System.out.println(ex6.su7);
//		System.out.println(ex6.su8);
//		System.out.println(ex6.su9);
		
	}

}
