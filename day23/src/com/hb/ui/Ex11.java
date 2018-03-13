package com.hb.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex11 extends Frame implements ActionListener {
	Button[] btns;
	String[] title={"가위","바위","보","종료"};
	JLabel target1, target2;
	Label la;
	public Ex11() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		setLayout(new BorderLayout());
		GridBagLayout gbl = new GridBagLayout();
		Panel c=new Panel(gbl);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		Label[] temp = new Label[5];
		for(int i=0; i<temp.length; i++){
			temp[i]=new Label();
			gbc.gridx=i;
			gbc.gridy=0;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			gbc.weightx=0.0;
			gbc.weighty=0.0;
			c.add(temp[i],gbc);
		}
		la = new Label();
		target1=new JLabel();
		
//		Icon icon=new ImageIcon("game2.png");
		target2=new JLabel();
		gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		c.add(target1,gbc);
		gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		c.add(la,gbc);
		gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=3;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		c.add(target2,gbc);
		
		Panel s=new Panel(new GridLayout(1,4));
		btns=new Button[4];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(title[i]);
			btns[i].addActionListener(this);
			s.add(btns[i]);
		}
		
		add(c,BorderLayout.CENTER);
		add(s,BorderLayout.SOUTH);
		Dimension screen = kit.getScreenSize();
		setBounds(1600+screen.width/2-500,screen.height/2-300,1000,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex11();
	}
	public int com(){
		Random ran = new Random();
		Icon icon=null;
		int su=ran.nextInt(3);
		switch (su) {
		case 0:
			icon=new ImageIcon("game1.png");
			break;
		case 1:
			icon=new ImageIcon("game2.png");
			break;
		case 2:
			icon=new ImageIcon("game3.png");
			break;
		}
		target2.setIcon(icon);
		return su;
	}

	public void actionPerformed(ActionEvent e) {
		String msg=((Button)e.getSource()).getLabel();
		if(msg.equals("종료")){
			dispose();
		}else{
			int com=com();
			int me=0;
			if(msg.equals("가위")){
				Icon icon=new ImageIcon("game1.png");
				target1.setIcon(icon);
				me=0;
			}else if(msg.equals("바위")){
				Icon icon=new ImageIcon("game2.png");
				target1.setIcon(icon);
				me=1;
			}else if(msg.equals("보")){
				Icon icon=new ImageIcon("game3.png");
				target1.setIcon(icon);
				me=2;
			}
			result(com,me);
		}
	}
	public void result(int com,int me){
		if(com==me){
			la.setText("비겼음");
		}else if(com==0){
			if(me==1){
				la.setText("이겼음");				
			}else{
				la.setText("졌음");								
			}
		}else if(com==1){
			if(me==0){
				la.setText("졌음");
			}else{
				la.setText("이겼음");			
			}
		}else if(com==2){
			if(me==0){
				la.setText("이겼음");
			}else{
				la.setText("졌음");
			}
		}
	}

}














