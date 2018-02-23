package com.hb.am;

class Lec05{
	
	public void func01(){
		System.out.println("원본기능");
	}
}

class Lec55 extends Lec05{
	public void func01(){
		super.func01();
		System.out.println("수정기능");
	}
	
}

public class Ex05 extends Lec05{

	public static void main(String[] args) {
		Lec55 lec = new Lec55();
		lec.func01();
	}
	

}
