package com.hb.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex01 {

	public static void main(String[] args) {
		Frame f = new Frame("배치관리자x(절대)");
		
//		FlowLayout fl =new FlowLayout();
		Panel p = new Panel(null);
		
		Button btn1= new Button("버튼");
		
		btn1.setSize(80,50);
		btn1.setLocation(284-80, 462-50);
		
		p.add(btn1);
		
		f.add(p);
		int x=p.getWidth();
		int y=p.getHeight();
		
		f.setSize(300,500);
		f.setLocation(1600+400,0);
		f.setVisible(true);
		System.out.println("w:"+p.getWidth());
		System.out.println("h:"+p.getHeight());
	}

}
