package com.hb.pm;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Ex05 extends Frame implements KeyListener{
	
	public Ex05() {
		TextField tf = new TextField();
		tf.addKeyListener(this);
		
		
		setLayout(new GridLayout(3,1));
		add(tf);
		setSize(300,500);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ ����");
		TextField tf=(TextField)e.getSource();
		String input=tf.getText();
		System.out.println("���ȴ� ������"+input);
	}

	public void keyPressed(KeyEvent e) {
		// Ű ������ ����
	}

	public void keyReleased(KeyEvent e) {
		// Ű �ö���� ����
//		int input=e.getKeyCode();
		System.out.println("��������");
//		char input=e.getKeyChar();
	}

}
