package com.hb.am;

// 다형성

class Lec05{
	int sum=1234;
	
	void func01(){
		System.out.println("Lec05-func01 run...");
	}
}

public class Ex05 extends Lec05 {
	
	void func01(){
		System.out.println("Ex05-func01 run...");
	}
	

	public static void main(String[] args) {
		Lec05 lec= new Lec05();
		lec.func01();
		Ex05 me = new Ex05();
		me.func01();
		Lec05 you = new Ex05();// 다형성
		you.func01();
	}

}










