package com.hb.thr;

public class Ex01 extends Thread{
	
	public Ex01(String name) {
		super(name);
//		setName(name);
	}
	
	public void run() {
		String name=getName();
		System.out.println(name+" - new Thread run...");
		
		
		System.out.println(name+" - new Thread end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Thread run..");
		Ex01 me = new Ex01("첫번째");
		me.start();
		Ex01 me2=new Ex01("두번째");
		me2.start();
		System.out.println("main Thread end");
	}

}
