package com.hb.am;

public class Ex05 extends Thread{
	public Ex05(String name) {
		super(name);
	}

	public static void main(String[] args) {
		Thread Thr = Thread.currentThread();
		System.out.println(Thr.getName()+" start");
		Ex05 me1=new Ex05("ù��°");
		Ex05 me2=new Ex05("�ι�°");
		Ex05 me3=new Ex05("����°");
		me1.start();
		me2.start();
		me3.start();
		
		System.out.println(Thr.getName()+" end");
	}
	
	public void run() {
		String name=getName();
		System.out.println(name+" ������ ����");

		System.out.println(name+" ������ ����");
	}

}
