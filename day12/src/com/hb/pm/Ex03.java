package com.hb.pm;
//p.240~256;
class Lec03{
	int sum=100;
	
	void func01(){
		System.out.println("Lec03-func01");
	}
}
// 부모클래스,상위클래스,슈퍼클래스
// 자바에서 다형성이란 무엇인가?
// 객체?
// 자식클래스,하위클래스,유도클래스
public class Ex03 extends Lec03{
	int sum=200;
	// 오버라이드의 대상은 final(x) non-static메서드
	void func01(){
		System.out.println(++super.sum);
		System.out.println("Ex03-func01");
		System.out.println(super.sum);
		System.out.println(this.sum);
	}
	public static void main(String[] args) {
		Lec03 me = new Ex03();
		System.out.println(me.sum);
	}

}
