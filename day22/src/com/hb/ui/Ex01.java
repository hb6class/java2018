package com.hb.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JFrame;

public class Ex01 {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p = new Panel(null);

		Button btn = new Button("¹öÆ°");
		btn.setSize(100,50);
		btn.setLocation(50,50);
		
		p.add(btn);
		f.add(p);
		f.setSize(300,300);
		f.setLocation(1600+400,0);
		f.setVisible(true);
	}

}
