package com.hb.am;

class Outter03{
	static int su1=1000;
	int su2=2000;
	
	//멤버클래스(non-static 내부클래스)
	class Inner03{
		final static int su3=3333;
		int su4=4444;
		final int su5=4444;
		
		public Inner03() {
			System.out.println("Inner03 create");
		}
		
//		public static void func03(){
//			System.out.println("Inner-static func03");
//		}
		
		public void func04(){
			System.out.println("Inner-func04");
		}
		
	}
	
	public Outter03() {
		System.out.println("Outter create");
	}
	
	public static void func01(){
		System.out.println("Outter-static func01() start");
//		System.out.println(su1);
//		System.out.println(Inner03.su3);
//		Outter03 me = new Outter03();
//		Inner03 inn = null;
//		inn=me.new Inner03();
//		
//		System.out.println(inn.su4);
//		System.out.println(inn.su5);
//		inn.func04();
		
		System.out.println("Outter-static func01() end");
	}
	public void func02(){
		System.out.println("Outter- func02() start");
//		System.out.println(Inner03.su3);
//		Inner03 inn = new Inner03();
//		System.out.println(inn.su4);
//		inn.func04();
		System.out.println("Outter- func02() end");
	}
	
	
}


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Outter03 out=new Outter03();
//		out.func02();
//		Outter03.func01();
		
		System.out.println(Outter03.Inner03.su3);
		
		Outter03 out=new Outter03();
		Outter03.Inner03 inn=out.new Inner03();
		inn.func04();
		System.out.println(inn.su4);
	}

}














