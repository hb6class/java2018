package com.hb.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Ex07 extends Frame implements ComponentListener{

	public void componentResized(ComponentEvent e) {
		// 크기가 바뀔때
		System.out.println("componentResized()");
	}

	public void componentMoved(ComponentEvent e) {
		// 위치가 바뀔때
		System.out.println("componentMoved()");
	}

	public void componentShown(ComponentEvent e) {
		System.out.println("componentShown()");
	}

	public void componentHidden(ComponentEvent e) {
		System.out.println("componentHidden()");
	}
	
	public Ex07() {
		Panel p = new Panel();
		final Button btn1=new Button("btn1");
		Button btn2=new Button("togle");
		btn1.addComponentListener(this);
		btn2.addActionListener(new ActionListener() {
			boolean show;
			public void actionPerformed(ActionEvent e) {
				btn1.setVisible(show);
				show=!show;
			}
		});
		p.add(btn1);
		p.add(btn2);
		add(p);
		setBounds(1600+400,0,300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();

	}

}
