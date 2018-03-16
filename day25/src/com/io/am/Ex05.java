package com.io.am;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.TextArea;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex05 extends Frame{
	
	public Ex05() throws IOException {
		TextArea ta=new TextArea();
		add(ta);
		setBounds(1600+400,0,500,400);
		setVisible(true);
		FileDialog dia=new FileDialog(this,"¿­±â",FileDialog.LOAD);
		dia.setSize(300, 300);
		dia.setLocation(1600+500, 100);
		dia.setVisible(true);
		File f = new File(dia.getDirectory(),dia.getFile());
		System.out.println(dia.getDirectory());
		System.out.println(dia.getFile());
		FileReader fr =null;
		String msg="";
		try {
			fr = new FileReader(f);
			int su=0;
			while(true){
				su=fr.read();
				if(su==-1){break;}
				msg+=(char)su;
			}
		} finally{
				fr.close();
		}
		ta.setText(msg);
	}

	public static void main(String[] args) throws IOException {
		new Ex05();

	}

}
