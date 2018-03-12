package com.hb.am;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class Ex05 {

	public static void main(String[] args) {
		Frame f= new Frame();
		f.setTitle("목록중에 선택메뉴들");
		Panel p = new Panel();
		Choice cho1=new Choice();
		cho1.addItem("item1");
		cho1.addItem("item2");
		cho1.addItem("item3");
		cho1.addItem("item4");
		
		cho1.select("item2");
		
		List list1=new List(8,true);
		list1.add("item1");
		list1.add("item2");
		list1.add("item3");
		list1.add("item4");
		list1.add("item5");
		list1.add("item6");
		list1.add("item7");
		list1.add("item8");
		
		list1.select(1);
		
		p.add(cho1);
		p.add(list1);
		f.add(p);
		f.setSize(300, 500);
		f.setLocation(1600+500,0);
		f.setVisible(true);
	}

}
