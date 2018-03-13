package com.hb.ui;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex05 extends Frame implements ItemListener{
	
	public Ex05() {
		Panel p = new Panel();
		
		Checkbox cb1=new Checkbox("item1",false);
		Checkbox cb2=new Checkbox("item2",false);
		Checkbox cb3=new Checkbox("item3",false);
		Checkbox cb4=new Checkbox("item4",false);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		add(p);
		setBounds(1600+400,0,300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();

	}

	public void itemStateChanged(ItemEvent e) {
		Checkbox item = (Checkbox)e.getSource();
//		System.out.print(item.getLabel()+":");
//		System.out.println(item.getState());
		
		System.out.print(item.getLabel()+"을 ");
		if(item.getState()){
			System.out.println("선택");
		}else{
			System.out.println("해제");			
		}
	}

}
