package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("main start");
		Runnable runner=new Runnable() {
			
			public void run() {
				System.out.println("시작");
				
				System.out.println("종료");
			}
		};
		Thread thr=new Thread(runner);
		thr.start();
		Thread thr2=new Thread(runner);
		thr2.start();
		System.out.println("main end");
	}

}
