package com.hb.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02 extends Frame implements MouseListener {
	
	public Ex02() {
		Panel p= new Panel();
		
		Button btn1=new Button("��ư");
		btn1.addMouseListener(this);
		p.add(btn1);
		
		
		add(p);
		setSize(500,400);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺Ŭ����");
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("���콺�����¼���");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("���콺�ö���¼���");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("���콺���ε�");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("���콺�����ε�");
	}

}
