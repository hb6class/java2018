package com.hb.am;

interface Interf{
	public void func();
}

public class Ex06 {
	static int su1=1111;
	int su2;
	Interf me4=new Interf(){
		public void func(){}
	};
	
//	public Ex06() {
//		su2=2222;
//		me4=func01();
//	}
	
	
	// static (내부)클래스
	static class Lec02{
		
		static void func02_1(){
			System.out.println(su1);
		}
		void func02_2(){
			System.out.println(su1);
		}
	}
	// 멤버클래스
	class Lec01{
		
		void func01_2(){
			System.out.println(su1);
			System.out.println(su2);
		}
		
	}
	
	public void func02(){
		func01(100);
		func01(200);
		func01(300);
	}

	public Interf func01(final int su){
		//로컬클래스의 밖에 있는 변수접근
		// ~ 1.7  final
		// 1.8 ~ 
		Lec02 me1=new Lec02();
		Lec01 me2=new Lec01();
		
		
		// 로컬클래스
		class Lec03 implements Interf {
			public void func(){
				System.out.println(su);
			}
		}
		
		Lec03 me3=new Lec03();
//		Interf me3=new Interf(){
//			public void func(){}
//		};
		return new Interf(){
			public void func(){}
		};
		
	}
	
	public static void main(String[] args) {
		int a=Ex06.su1;

	}

}
