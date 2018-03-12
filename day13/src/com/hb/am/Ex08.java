package com.hb.am;

abstract class Lec08{
	// 추상클래스
	// - 추상메서드를 0개이상~
	// - 독립적 객체의 생성불가
	// - 상속받는 측에서 추상메서드를 구현해서 쓰도록
	
	int su=1234;
	
	public Lec08() {
		System.out.println("Lec08 create");
	}
	
	public void func01(){
		System.out.println("Lec08 func01 run...");
	}
	
	// 추상메서드
	public abstract void func02();
	
}


public class Ex08 extends Lec08{
	
	// 상속
	
	public Ex08() {
		super();
		System.out.println("Ex08 create...");
	}

	public static void main(String[] args) {
		Lec08 me = new Ex08();
		me.func01();
		me.func02();
	}

	@Override
	public void func02() {
		System.out.println("Ex08 override func02...");
	}

}
