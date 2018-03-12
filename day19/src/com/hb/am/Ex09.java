package com.hb.am;

class Lec09 extends Thread{
	Lec09 lec2;
	
	
	public Lec09(String name) {
		super(name);
	}
	
	public void setLec2(Lec09 lec2){
		this.lec2=lec2;
	}
	
	public void run() {
		try {
			if(getName().equals("첫번째")){
				lec2.join();
				}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String name=getName();
		System.out.println(name+"start");
		for(int i=0; i<10; i++){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+":"+i);
		}
		System.out.println(name+"end");
	}
}

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("main start");
		Lec09 lec1=new Lec09("첫번째");
		Lec09 lec2=new Lec09("두번째");
		lec1.setLec2(lec2);
		lec1.start();
		lec2.start();
//		try {
//			lec1.join();
//			lec2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("main end");
	}

}
