package com.hb.pm;

class Outter01{
	
	static int su1=10;
	int su2=20;
	
	public Outter01() {
	}
	
	public static void func01(){
		
		int sum=0;
		
		class Inner01{
			final static int su3=30;
			int su4=40;
			
			public Inner01() {
				System.out.println("Inner01 create");
			}
			
			public void func03(){
				System.out.println("Inner01-func03()");
			}
		} // Inner01 end
		
		Inner01 inn=new Inner01();
		inn.func03();
	}// func01 end
	
	public Interf func02(){
		// 로컬클래스
		class Inner11 implements Interf{
			final static int su5=50;
			int su6=60;
			
			public Inner11() {
				System.out.println("Inner11 create");
			}
			
			public void func04(){
				System.out.println("Inner11-func04()");				
			}
		}// Inner11 end
		
		Inner11 inn=new Inner11();
//		inn.func04();
		return inn;
	}// func02 end
	
}//Outter end

interface Interf{
	void func04();
}

public class Ex01{

	public static void main(String[] args) {
//		Outter01.func01();
		Outter01 out=new Outter01();
		Interf obj=out.func02();
		
		obj.func04();
	}

}











