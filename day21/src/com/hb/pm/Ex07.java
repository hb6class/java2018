package com.hb.pm;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex07 extends Frame {
	
	public Ex07() {
		WindowAdapter ad = new WindowAdapter() {
		
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		};
		
		addWindowListener(ad);
		
		setSize(200,200);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();
	}

}
