package com.hb.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

import java.awt.Font;

public class Ex01 extends Frame {
	// ~
	// ¿¤¸®¸ÕÆ® size(x)
	
	
	public Ex01() {
		FlowLayout fl=new FlowLayout();
		BorderLayout bl=new BorderLayout();
		Panel p=new Panel();
		Panel p1=new Panel();
		
		//	rgb - ºûÀÇ»ï¿ø»ö
		// CMYK
		// »¡°­,³ì»ö,ÆÄ¶õ
		Color color=new Color(255,0,0);
		p1.setBackground(color);
		
		Panel p2=new Panel();
		color=new Color(0,255,0);
		p2.setBackground(color);
		
		Panel p3=new Panel();
		color=new Color(0,0,255);
		p3.setBackground(color);
		
		Panel p4=new Panel();
		color=new Color(0,255,255);
		p4.setBackground(color);
		
		Panel p5=new Panel();
		color=new Color(255,0,255);
		p5.setBackground(color);
		p.setLayout(bl);
		
		Font font=new Font("±¼¸²",Font.PLAIN,20);
		Button bttn1=new Button("btn01");
		Button bttn2=new Button("btn02");
		Button bttn3=new Button("btn03");
		Button bttn4=new Button("btn04");
		Button bttn5=new Button("btn05");
		
		bttn1.setFont(font);
		bttn2.setFont(font);
		bttn3.setFont(font);
		bttn4.setFont(font);
		bttn5.setFont(font);
		p1.add(bttn1);
		p2.add(bttn2);
		p3.add(bttn3);
		p4.add(bttn4);
		p5.add(bttn5);
//		p.add("North",p1);
//		p.add("Center",p2);
//		p.add("South",p3);
//		p.add("West",p4);
//		p.add("East",p5);
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		p.add(p3,BorderLayout.SOUTH);
		p.add(p4,BorderLayout.WEST);
		p.add(p5,BorderLayout.EAST);
		
		add(p);
		setSize(300,400);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
