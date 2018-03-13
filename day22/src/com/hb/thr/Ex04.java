package com.hb.thr;

public class Ex04 extends Thread {
	
	public void run() {
			System.out.println(getName()+" -start");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName()+" -end");
		}

	public static void main(String[] args) {
		System.out.println("main start");
		Ex04 me = new Ex04();
		
		Ex04 me2 = new Ex04();
		
		me.start();
		me2.start();
		
		try {
			me.join(5000);
			me2.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");

	}

}
