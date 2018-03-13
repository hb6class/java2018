package com.hb.ui;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex04 extends Frame implements TextListener,ActionListener,KeyListener{
	TextField tf;
	Label la;
	public Ex04() {
		Panel p = new Panel(new GridLayout(2,1));
		la = new Label();
		p.add(la);
		
		tf= new TextField(15);
//		tf.addKeyListener(this);
//		tf.addActionListener(this);
		tf.addTextListener(this);
		p.add(tf);
		add(p);
		setBounds(1600+400,0,300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();

	}
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==10){
			System.out.println(tf.getText());
		}
	}
	public void actionPerformed(ActionEvent e) {
//		System.out.println(tf.getText());
		System.out.println(((TextField)e.getSource()).getText());
	}

	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		la.setText(tf.getText());
	}

}
