package com.hb.pm;

interface Interf02{
	void func();
}

class Lec02{
	// static ����Ŭ����, ���Ŭ����
	
	void func01(){
		//����Ŭ����
		
		// �͸�Ŭ����
		Interf02 inn=new Interf02(){
			
			public void func(){
				System.out.println("����Ŭ������ func");
			}
		};
		inn.func();
	}
}

abstract class Lec22{
	public void func01(){
		System.out.println("func01()");
	}
	public abstract void func02();
}


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec02 lec = new Lec02();
		lec.func01();
		
		Ex02 www=new Ex02(){};
		
		Ex02 me =new Ex02(){};
		
		Lec22 ab=new Lec22(){
			public void func02(){
				
			}
		};
		
		Interf02 inn=new Interf02(){
			public void func(){
				
			}
		};
	}

}
















