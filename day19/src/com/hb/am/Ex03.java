package com.hb.am;

class Lec03 implements Runnable{

	public void run() {
		System.out.println("������� �������");
		for(int i=0; i<100; i++){
			System.out.println(i);
		}
		System.out.println("������� ��������");
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("main start");
		Lec03 lec01=new Lec03();
		Thread thr01=new Thread(lec01);
		thr01.start();
		System.out.println("main end");

	}

}










