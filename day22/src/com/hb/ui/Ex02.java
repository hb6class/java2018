package com.hb.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.javafx.scene.layout.region.SliceSequenceConverter;

public class Ex02 extends Frame implements ActionListener {
	Label la;
	Thread thr;
	Button btn1,btn2;
	
	public Ex02() {
		super("시계");
		Panel p = new Panel(new GridLayout(3,1));
		
		la = new Label();
		btn1= new Button("시작");
		btn2= new Button("종료");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		p.add(la);
		p.add(btn1);
		p.add(btn2);
		
		add(p);
		setSize(300,400);
		setLocation(1600+400,0);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			if(thr==null){
				thr = new Thread(new Runnable(){
					@Override
					public void run() {
						while(true){
							Date day = new Date();
							SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
							String time=sdf.format(day);
							la.setText(time);
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				});
				btn1.setEnabled(false);
			}
			thr.start();
		}else if(e.getSource()==btn2){
			if(thr!=null){
				thr.stop();
				la.setText("");
				thr=null;
				btn1.setEnabled(true);
			}
		}
	}

}










