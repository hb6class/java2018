package com.hb.am;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class Ex07 extends Frame{
	
	public Ex07() {
		Label la = new Label();
		la.setText("��ư");
		Font font=new Font("�ü�ü, ����ü, Arial", Font.PLAIN , 32);
		la.setFont(font);
		
		add(la);
		setSize(300, 400);
		setLocation(1600+500,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();

	}

}
