package com.hb.am;

class Lec11 extends Thread{
	public void run() {
		for(int i=0; i<1000; i++){
			System.out.println(getName()+" i="+i);
		}
	}
}

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec11 lec = new Lec11();
		lec.start();
		try {
			lec.join(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<10; i++){
			System.out.println("main i="+i);
		}
	}

}
