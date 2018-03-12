package com.hb.am;

import java.util.Vector;

interface Lec55{
	//1. 다중상속의 기능
	//2. 통일성 index
	//3. 클래스의 설명
	//4. 클래스의 목적을 부여
	// ...
	
	public void func01();
	abstract void func02();
	public abstract void func03();
}
interface Lec5{
	// 수업에 사용된 클래스
	
}
interface Lec555 extends Lec5,Lec55{}


//abstract class Lec05{
//	public void func01(){
//		
//	}
//	public abstract void func02();
//}

public class Ex05 implements Lec55, Lec5{

	public static void main(String[] args) {
//		Object obj=new Lec05();
	}

	public void func01() {
		// TODO Auto-generated method stub
		
	}

	public void func02() {
		// TODO Auto-generated method stub
		
	}

	public void func03() {
		// TODO Auto-generated method stub
		
	}

}
