package com.hb.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex01 {

	public static void main(String[] args) {
		java.awt.Frame f= new Frame();
		
		Panel p = new Panel();
		
		java.awt.Button btn=new Button();
		Button btn2=new Button();
		Button btn3=new Button();
		
		btn.setLabel("btn01");		
		btn2.setLabel("btn02");
		btn3.setLabel("btn03");
		
		p.add(btn);
		p.add(btn2);
		p.add(btn3);
		
		f.add(p);
		
		btn.setVisible(true);
		
		f.setSize(400,300); // 창 크기
		
		f.setLocation(1600+500, 300); // 위치
		
		f.setVisible(true); // 화면에 보여줄것인가 말것인가
	}

}
