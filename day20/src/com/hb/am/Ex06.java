package com.hb.am;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.util.Date;

public class Ex06 extends Frame {
	
	public Ex06() {
		Panel p = new Panel();
		Label la = new Label("년월일");
		Choice cho1 = new Choice(); 
//		cho1.addItem(""+2018);
//		cho1.addItem(""+2019);
//		cho1.addItem(""+2020);
//		cho1.addItem(""+2021);
		
		long time=System.currentTimeMillis();
		Date day=new Date(time);
		int year=day.getYear()+1900-2;
		System.out.println(year+1900);
		for(int i=0; i<5; i++){
			cho1.addItem(year+i+"년");
		}
		cho1.select(2);
		
		Choice cho2 = new Choice(); 
		for(int i=1; i<13; i++){
			cho2.addItem(i+"월");
		}
		Choice cho3 = new Choice(); 
		for(int i=1; i<32; i++){
			cho3.addItem(i+"일");
		}
		
		
		p.add(la);
		p.add(cho1);
		p.add(cho2);
		p.add(cho3);
		add(p);
		setSize(300,400);
		setLocation(1600+200,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06();

	}

}
