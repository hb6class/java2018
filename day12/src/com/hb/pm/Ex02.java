package com.hb.pm;

class Lec22{
	
	void func01(){
		System.out.println("Lec22-func01 run...");
	}
}


public class Ex02 extends Lec22 {
	
	void func01(){
		System.out.println("Ex02-func01 run...");
	}
	
	void func02(){
		System.out.println("func02 run...");
	}
	
	static void func03(Object obj){
		System.out.println(obj);
	}

	public static void main(String[] args) {
		
//		func03(1234);
		func03(new Integer(1234));
		func03(3.14);
		func03(true);
		func03('A');
		func03("test");
		
		////////////////
//		Object obj=new Ex02();
//		((Ex02)obj).func01();
//		((Ex02)obj).func02();
		////////////////
//		Lec22 me = new Ex02();
//		me.func01();
//		Ex02 me2=(Ex02)me;
//		me2.func02();
	}

}
