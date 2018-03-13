package com.hb.thr;

public class Ex06 extends Thread{
	static int su=0;
	static Object key = new Object();
	int start;
	// 
	
	public Ex06(int start) {
		this.start=start;
	}
	
	void hap(int su){
		synchronized(key){
			int sum=Ex06.su;	// 14		// 17
			sum+=su;			// 17=14+3	// 26=14+12
			Ex06.su=sum;		// 17;		// 26
		}
	}
	
	public void run() {
		for(int i=start; i<start+1000; i++){
			hap(i);
		}		
	}

	public static void main(String[] args) {//result su=1999000
		// µ¿±âÈ­
		Ex06 me = new Ex06(0);
		Ex06 me2 = new Ex06(1000);
		me.start();
		me2.start();
		
		try {
			me.join();
			me2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("result su="+me.su);
	}

}
