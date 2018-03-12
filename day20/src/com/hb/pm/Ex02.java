package com.hb.pm;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex02 extends Frame {
	CardLayout card;
	Panel mainP;
	
	public Ex02() {
		card=new CardLayout();
		mainP=new Panel();
		mainP.setLayout(card);
		
		Panel p1=new Panel();
		p1.setBackground(new Color(255,0,0));
		p1.add(new Label("첫번째 페이지"));
		Panel p2=new Panel();
		p2.setBackground(new Color(0,255,0));
		p2.add(new Label("두번째 페이지"));
		Panel p3=new Panel();
		p3.setBackground(new Color(0,0,255));
		p3.add(new Label("세번째 페이지"));
		
		mainP.add(p1);
		mainP.add(p2);
		mainP.add(p3);
		
		
		add(mainP);
		setSize(300,400);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			me.card.next(me.mainP);
		}

	}

}
