package com.hb.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Ex04 implements MouseMotionListener{
	static Button btn;

	public static void main(String[] args) {
		Ex04 me = new Ex04();
		Frame f= new Frame();
		Panel p=new Panel(null);
		btn = new Button("*");
		btn.setLocation(0, 0);
		btn.setSize(20,20);
		btn.setVisible(true);
		p.add(btn);
		p.addMouseMotionListener(me);
		
		f.add(p);
		f.setSize(500,500);
		f.setLocation(1600+400,0);
		f.setVisible(true);
	}

	public void mouseDragged(MouseEvent e) {
		//System.out.println("mouseDragged()");
//		System.out.println("x:"+x+",y:"+y);
		
	}

	public void mouseMoved(MouseEvent e) {
//		System.out.println("mouseMoved()");
		int x=e.getX();
		int y=e.getY();
		btn.setLocation(x+10, y+10);
	}

}
