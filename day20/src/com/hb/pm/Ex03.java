package com.hb.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex03 extends Frame{
	
	public Ex03() {
		super("���̾ƿ�");
		
		GridLayout gl=new GridLayout(2,2);
		Panel p = new Panel(gl);
		
		Button btn1=new Button("��ư1");
		Button btn2=new Button("��ư2");
		Button btn3=new Button("��ư3");
		Button btn4=new Button("��ư4");
		
		Button btn5=new Button("��ư5");
		Button btn6=new Button("��ư6");
		Button btn7=new Button("��ư7");
		Button btn8=new Button("��ư8");
		Button btn9=new Button("��ư9");
		
		p.add(btn1);
		p.add(btn2);	
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);	
		p.add(btn7);
//		p.add(btn8);
//		p.add(btn9);
		
		add(p);
		setLocation(1600+400,0);
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex03();
	}

}
