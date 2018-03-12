package com.hb.pm;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex08 extends Frame implements ActionListener {
	TextArea ta;
	TextField tf;
	public Ex08() {
		Panel p = new Panel();
		
		Button btn1= new Button("버튼1");
		Button btn2= new Button("버튼2");
		tf=new TextField(15);
		ta=new TextArea(5,50);
		List list = new List();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.addActionListener(this);
		
		
		
		btn1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 이벤트로 클릭");
			}
		});
		
		btn2.addActionListener(this);
		tf.addActionListener(this);
		
		p.add(btn1);
		p.add(btn2);
		p.add(tf);
		p.add(list);
		p.add(ta);
		
		add(p);
		setSize(400,500);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex08();
	}

	public void actionPerformed(ActionEvent e) {
		Component comp= (Component) e.getSource();
		System.out.println(comp.getName()+"actionPerformed()");
		if("textfield0".equals(comp.getName()) || "button0".equals(comp.getName())){
			String msg=tf.getText();
			String beforeMsg=ta.getText();
			ta.setText(beforeMsg+"\n"+msg);
			tf.setText("");
			tf.requestFocus();
		}
	}

}
