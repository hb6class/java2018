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
		System.out.println("누르는 도중");
		TextField tf=(TextField)e.getSource();
		String input=tf.getText();
		System.out.println("눌렸다 땠을때"+input);
	}

	public void keyPressed(KeyEvent e) {
		// 키 누르는 순간
	}

	public void keyReleased(KeyEvent e) {
		// 키 올라오는 순간
//		int input=e.getKeyCode();
		System.out.println("눌렸을때");
//		char input=e.getKeyChar();
	}

}
