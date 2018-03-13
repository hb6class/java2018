package com.hb.thr;

import java.awt.Frame;
import java.awt.Label;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 implements Runnable {
	static Label la;

	public static void main(String[] args){
		System.out.println("main Thread start");
		Frame f = new Frame();
		la = new Label();
		f.add(la);
		f.setSize(300,200);
		f.setLocation(1600+400,0);
		f.setVisible(true);
		Thread thr=new Thread(new Ex03());
		thr.start();
		System.out.println("main Thread end");
	}

	public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName()+" 시간을 출력한다");
			Date day = new Date();
			SimpleDateFormat sdf= new SimpleDateFormat("hh:mm:ss");
			la.setText(sdf.format(day));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}












