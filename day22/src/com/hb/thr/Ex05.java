package com.hb.thr;

public class Ex05 extends Thread {
	public void run() {
		String name=getName();
		System.out.println(name+"의 우선순위는 "+getPriority());
	}

	public static void main(String[] args) {
		Ex05 me = new Ex05();
		Ex05 me2 = new Ex05();
		Ex05 me3 = new Ex05();
		
		me.setPriority(Thread.MIN_PRIORITY);
		me2.setPriority(Thread.MAX_PRIORITY);
		me3.setPriority(Thread.NORM_PRIORITY);
		
		me.start();
		me2.start();
		me3.start();
		
	}

}
