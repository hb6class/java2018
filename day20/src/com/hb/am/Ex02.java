package com.hb.am;

import java.awt.Frame;

public class Ex02 extends Frame {
	
	public Ex02() {
		this.setSize(400,300);
		this.setLocation(1600+500,300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();
		
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			me.setLocation(1600+500+i*20,300);
		}
	}

}



















