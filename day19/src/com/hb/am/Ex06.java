package com.hb.am;

public class Ex06 implements Runnable {

	public static void main(String[] args) {
		System.out.println("start");
		Ex06 me = new Ex06();
		
		Thread thr1 = new Thread(me,"ù��°");
		Thread thr2 = new Thread(me,"�ι�°");
		Thread thr3 = new Thread(me,"����°");
		
		thr1.start();
		thr2.start();
		thr3.start();
		
		System.out.println("end");
	}
	
	public void run() {
		
		Thread thr = Thread.currentThread();
		
		System.out.println(thr.getName()+"����");
		System.out.println(thr.getName()+"����");
	}

}
