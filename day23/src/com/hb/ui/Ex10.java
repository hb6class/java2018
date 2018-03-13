package com.hb.ui;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex10 extends Frame {
	
	public Ex10() {
		Panel p = new Panel(new GridLayout(2,1));
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img=kit.getImage("main04.png");
		Icon icon=new ImageIcon(img);
		JButton btn1=new JButton("btn",icon);
		p.add(btn1);
		add(p);
		setBounds(1600+0,0,300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10();

	}

}
