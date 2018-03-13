package com.hb.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class Ex08 extends Frame implements ContainerListener,ActionListener {
	Panel p;
	Button btn;
	boolean clk;
	public Ex08() {
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		p = new Panel();
		p.setBackground(Color.GREEN);
		p.addContainerListener(this);
		
		Button btn1= new Button("toggle");
		btn1.addActionListener(this);
		
		add(p,BorderLayout.CENTER);
		add(btn1,BorderLayout.SOUTH);
		setBounds(1600+0,0,300,500);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
//				System.out.println("click");
		if(!clk){
			btn= new Button("add");
			p.add(btn);
		}else{
			p.remove(btn);
		}
		clk=!clk;
	}

	public static void main(String[] args) {
		new Ex08();
		
	}

	public void componentAdded(ContainerEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ãß°¡µÊ");
		p.revalidate();
	}

	public void componentRemoved(ContainerEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Á¦°ÅµÊ");
	}

}
