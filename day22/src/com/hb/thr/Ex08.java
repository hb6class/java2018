package com.hb.thr;

public class Ex08 extends Thread {
	
	public void run() {
		System.out.println(getName()+"- start");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+"- end");
	}

	public static void main(String[] args) {
		System.out.println("main run...");
		Ex08 me = new Ex08();
		
		me.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		me.notify();
		
		System.out.println("main end");

	}

}
