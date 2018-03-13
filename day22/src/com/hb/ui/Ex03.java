package com.hb.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03 extends Frame implements ActionListener{
	Button btn01,btn02;
	Label la;
	int first;
	Thread thr;
	
	public Ex03() {
		super("≈∏¿Ã∏”");
		Panel p = new Panel(new BorderLayout());
		Panel s = new Panel();
		Font font= new Font("ªı±º∏≤", Font.BOLD, 32);
		la = new Label();
		la.setFont(font);
		btn01=new Button("Ω√¿€");
		btn02=new Button("√ ±‚»≠");
		
		btn01.addActionListener(this);
		btn02.addActionListener(this);
		
		s.add(btn01);
		s.add(btn02);
		
		p.add(la, BorderLayout.CENTER);
		p.add(s, BorderLayout.SOUTH);
		
		add(p);
		setSize(300,500);
		setLocation(1600+400, 0);
		setVisible(true);
	}
	public void cnt(){
		int su=10;
		while(true){
			la.setText(""+su--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			if(su<0){
				break;
			}
		}
		btn01.setLabel("Ω√¿€");
		btn01.setEnabled(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn01){
			if(first==0){
				thr=new Thread(new Runnable() {
					
					@Override
					public void run() {
						cnt();
					}
				});
				thr.start();
				first++;
				btn01.setLabel("∏ÿ√„");
			}else if(first==1){
				thr.suspend();
				btn01.setLabel("¿ÁΩ√¿€");
				first++;
			}else{
				thr.resume();
				btn01.setLabel("∏ÿ√„");
				first--;
				
			}
		}else if(e.getSource()==btn02){
			thr=new Thread(new Runnable() {
				
				@Override
				public void run() {
					cnt();
				}
			});
			first=0;
			btn01.setLabel("Ω√¿€");
			btn01.setEnabled(true);
		}
		
	}

	public static void main(String[] args) {
		// ≈∏¿Ã∏”
		new Ex03();

	}


}
