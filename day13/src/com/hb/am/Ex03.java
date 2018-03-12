package com.hb.am;


class Lec03{
	// 디자인 패턴 - 싱글톤 패턴
//	public static Lec03 you = new Lec03(); 
	
	private static Lec03 you=null;
//	
	private Lec03() {
	}
//	
	public static Lec03 func01(){
		if(you==null){
			you=new Lec03();
		}
		return you;
	}
}


public class Ex03 {
	public int sum1;
	protected int sum2;
	int sum3;
	private int sum4;

	// public > protected >= default > private
	
	// class : public || default
	// 생성자,전역,메서드
	//	: public || protected || default  || private
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec03 you=Lec03.func01();
		System.out.println(you);
		you=Lec03.func01();
		System.out.println(you);
		you=Lec03.func01();
		System.out.println(you);
		you=Lec03.func01();
		System.out.println(you);
		you=Lec03.func01();
		System.out.println(you);
	}

}













