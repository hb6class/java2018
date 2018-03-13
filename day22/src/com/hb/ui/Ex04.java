package com.hb.ui;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex04 extends Frame implements ActionListener,MouseListener{
	CardLayout cl;
	Panel pmain;
	int startx;
	int endx;
	
	public Ex04() {
		cl=new CardLayout();
		pmain = new Panel(cl);
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		
		Label la1=new Label("page1");
		Label la2=new Label("page2");
		Label la3=new Label("page3");
		
		p1.add(la1);
		p2.add(la2);
		p3.add(la3);
		
		Button btn1=new Button("next 2page");
		Button btn2=new Button("next 3page");
		Button btn3=new Button("next 1page");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		p1.add(btn1);
		p2.add(btn2);
		p3.add(btn3);
		
		pmain.add(p1);
		pmain.add(p2);
		pmain.add(p3);
		add(pmain);
		setSize(300,500);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cl.next(pmain);// 다음
//		cl.previous(pmain);// 이전
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.getX());
		startx=e.getX();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.getX());
		endx=e.getX();
		if(endx-startx<-100){
			cl.next(pmain);
		}else if(endx-startx>100){
			cl.previous(pmain);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
