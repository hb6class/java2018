package com.hb.am;


class Lec03{
	// final class 상속의 허용x
	
	final int sum;
	// 상수형 변수
	
	public Lec03() {
		// 생성자 주요역할 - 필드값의 초기화
		sum=100;
	}
	
	final void func01(){
//		sum++;
		// method에서 final은 상속을 통한
		// 오버라이드 금지
		System.out.println("func01 run...");
	}
}

public class Ex03 extends Lec03 {

	public static void main(String[] args) {
//		Lec03 lec = new Lec03();
//		System.out.println(lec.sum);
//		lec.func01();
		Ex03 me = new Ex03();
		me.func01();
	}
	

}
