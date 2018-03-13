package com.hb.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex01 extends Frame{
	
	public Ex01() {
		GridBagLayout gbl=new GridBagLayout();
		Panel p = new Panel(gbl);
		
		GridBagConstraints gbc=new GridBagConstraints();
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		Button btn1=new Button("btn1");
		Button btn2=new Button("btn2");
		Button btn3=new Button("btn3");
		Button btn4=new Button("btn4");
		Button btn5=new Button("btn5");
		Button btn6=new Button("btn6");
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=0.9;
		gbc.weighty=0.0;
		p.add(btn1,gbc);
		gbc.gridx=1;
		gbc.weightx=0.1;
		p.add(btn2,gbc);
		gbc.gridx=2;
		gbc.weightx=0.0;
		p.add(btn3,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.weightx=0.0;
		p.add(btn4,gbc);
		gbc.gridx=1;
		gbc.gridwidth=2;
		gbc.weightx=0.0;
		p.add(btn5,gbc);
//		gbc.gridx=2;
//		gbc.weightx=2.0;
//		p.add(btn6,gbc);
		
		
		add(p);
		setSize(400,300);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
