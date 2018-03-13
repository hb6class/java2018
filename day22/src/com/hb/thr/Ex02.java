package com.hb.thr;

public class Ex02{

	public static void main(String[] args) {
		System.out.println("main Thread run...");
		
		Runnable res = new Runnable(){
			public void run() {
				Thread me = Thread.currentThread();
				String name=me.getName();
				System.out.println(name+" - new Thread run..");
				System.out.println(name+" - new Thread end");
			}
		};
		
		Thread thr=new Thread(res,"첫번째");
		Thread thr2=new Thread(res,"두번째");
		thr.start();
		thr2.start();
		
		
		System.out.println("main Thread end");

	}


}
