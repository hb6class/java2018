package com.hb.ui;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;


public class Ex03 extends Frame{

	public Ex03() {
		Toolkit kit=Toolkit.getDefaultToolkit();
		
		Dimension dim = kit.getScreenSize();
		System.out.println("x:"+dim.getWidth()+",y:"+dim.getHeight());
		
		Dimension mySize=new Dimension(300,300);
		
		int x=(int)dim.getWidth()/2-(int)mySize.getWidth()/2;
		int y=dim.height/2-mySize.height/2;
		
//		setSize(mySize);
//		setLocation(1600+w,h);
		setBounds(1600+x, y, mySize.width, mySize.height);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex03();
	}

}
