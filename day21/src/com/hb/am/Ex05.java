package com.hb.am;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex05 extends Frame {
	
	public Ex05() {
		
		
		setSize(500,400);
		setLocation(1600+400,0);
		setVisible(true);
		
		Dialog dia= new Dialog(this,"종료확인");
		Panel p=new Panel();
		Label la=new Label("종료하시겠습니까?");
		Button btn1=new Button("저장");
		Button btn2=new Button("종료");
		p.add(la);
		p.add(btn1);
		p.add(btn2);
		dia.add(p);
		dia.setSize(100, 100);
		int x=getX()+250-50;
		int y=getY()+200-50;
		dia.setLocation(x, y);
		dia.setVisible(true);
	}

	public static void main(String[] args) {
		Ex05 me=new Ex05();
	}

}











