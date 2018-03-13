package com.hb.thr;

public class Ex10 extends Thread {
	
	@Override
		public void run() {
			while(true){
				try {
					sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("running...");
			}
		}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		Ex10 me = new Ex10();
		me.setDaemon(true);
		me.start();
		
		Thread.sleep(3000);
		System.out.println("main end");
	}

}
