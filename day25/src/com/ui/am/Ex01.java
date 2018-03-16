package com.ui.am;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex01 extends Frame {
	
	public Ex01() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료요청");
				dispose();
			}
		});
		
		FileDialog dia=new FileDialog(this,"열기",FileDialog.SAVE);
		dia.setSize(300, 300);
		dia.setLocation(1600+500, 100);
		dia.setVisible(true);
		
		System.out.println(dia.getDirectory());
		System.out.println(dia.getFile());
		
		setSize(500, 400);
		setLocation(1600+400, 0);
		setVisible(true);
	}


	public static void main(String[] args) {
		new Ex01();
	}

}
