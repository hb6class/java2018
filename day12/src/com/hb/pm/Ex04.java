package com.hb.pm;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("main start");
		int a=2;
		int b=0;
		int c=0;
		
		try{// ����ó��
			System.out.println("�����߻� ��");
			c=a/b;
			System.out.println("�����߻� ��");
		}catch(ArithmeticException ex){
			System.out.println("���� ��Ȳ");
		}
		System.out.println("main end");
	}

}








