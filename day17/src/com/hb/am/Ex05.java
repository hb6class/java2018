package com.hb.am;

import java.util.Vector;

interface Lec55{
	//1. ���߻���� ���
	//2. ���ϼ� index
	//3. Ŭ������ ����
	//4. Ŭ������ ������ �ο�
	// ...
	
	public void func01();
	abstract void func02();
	public abstract void func03();
}
interface Lec5{
	// ������ ���� Ŭ����
	
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
