package com.hb.am;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex04 extends Frame {
	
	public Ex04() {
		Panel p = new Panel();
		Label la1=new Label("力格");
		TextField tf1=new TextField("力格绝澜",15);
		Label la2=new Label("id");
		TextField tf2=new TextField();
		tf2.setColumns(5);
		tf2.setText("id涝仿");
		Label la3=new Label("pw");
		TextField tf3=new TextField(6);
		tf3.setEchoChar('#');
		
		TextArea ta1=new TextArea("",5,15,TextArea.SCROLLBARS_BOTH);
		
		p.add(la1);
		p.add(tf1);
		p.add(la2);
		p.add(tf2);
		p.add(la3);
		p.add(tf3);
		p.add(ta1);
		
		add(p);
		this.setSize(300,200);
		this.setLocation(1600+500, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

}
