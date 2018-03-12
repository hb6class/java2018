package com.hb.am;

import java.util.Date;

public class Ex07 extends Thread {

	public static void main(String[] args) {
		Ex07 me = new Ex07();
		me.start();
	}
	
	public void run() {
		for(int i=1; i<10; i++){
			Date d = new Date();
			int year=d.getYear()+1900;
			int month=d.getMonth()+1;
			int date=d.getDate();
			int h=d.getHours();
			int m=d.getMinutes();
			int s=d.getSeconds();
			System.out.println(year+"³â"+month+"¿ù"+date+"ÀÏ"+h+":"+m+":"+s);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

}








