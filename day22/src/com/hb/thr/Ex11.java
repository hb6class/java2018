package com.hb.thr;

public class Ex11 implements Runnable {
	
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" run...");
		}
	};

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Ex11 me = new Ex11();
		ThreadGroup tg=new ThreadGroup("Me");
		Thread thr1=new Thread(tg,me);
		Thread thr2=new Thread(tg,me);
		Thread thr3=new Thread(tg,me);
		thr1.start();
		thr2.start();
		thr3.start();
		
		Thread.sleep(5000);
		tg.stop();//suspend(); stop();
	}

}
