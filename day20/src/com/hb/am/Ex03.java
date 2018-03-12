package com.hb.am;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex03 extends Frame {
	
	public Ex03() {
		Panel p = new Panel();
		
		Label la1 = new Label();
		la1.setText("다음을 선택하세요");
		Label la2 = new Label("123456");
		
		Button btn1=new Button();
		btn1.setLabel("버튼");
		Button btn2=new Button("버튼2");
		
		Checkbox chb1=new Checkbox("item1",true);
		Checkbox chb2=new Checkbox();
		chb2.setLabel("item2");
		chb2.setState(true);
		
		CheckboxGroup cbg=new CheckboxGroup();
		
		Checkbox chb3=new Checkbox("라디오1",cbg,false);
		Checkbox chb4=new Checkbox("라디오2",cbg,true);
		Checkbox chb5=new Checkbox("라디오3",cbg,true);
		
		p.add(la1);
		p.add(la2);
		p.add(btn1);
		p.add(btn2);
		p.add(chb1);
		p.add(chb2);
		p.add(chb3);
		p.add(chb4);
		p.add(chb5);
		
		add(p);
		setSize(500,400);
		setLocation(1600+500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// ui컴퍼넌트의 종류
		new Ex03();

	}

}
