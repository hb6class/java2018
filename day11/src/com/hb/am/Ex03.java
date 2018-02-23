package com.hb.am;

class Mother01{
	public void func03(){
		System.out.println("잔소리를 한다");
	}
}

class Father01 extends Object{
	int money=1000;
	
	public void func01(int money){
		this.money+=money;
		System.out.println(money+"원을 벌어옴-누적:"+this.money);
	}
}

class Son01 extends Father01{

	//메서드 오버로딩
	public void func01(){
		System.out.println("돈벌까 고민한다");
	}
	
	//메서드 오버라이드
	public void func01(int money){
		System.out.println(money+"원 벌까 고민만 한다");
	}
	
	public void func02(int money){
		super.money-=money;
		System.out.println(money+"원을 쓴다-누적:"+super.money);
	}
}

public class Ex03 {

	public static void main(String[] args) {
		//상속
		// 자식클래스 extends 부모클래스
		// 단, 단일 상속 (다중상속불가)
		
//		Father01 fa=new Father01();
//		fa.func01(10000);
//		System.out.println(fa.money);
		System.out.println("--------------------------------");
		Son01 son=new Son01();
		son.func02(400);
		System.out.println(son.money);
		son.func01();
		son.func01(2000);
	}

}
















