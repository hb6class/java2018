package com.hb.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Ex02 extends Frame {
	
	public Ex02() {
		super("°è»ê±â");
		//x:384,y:462
		Panel p = new Panel(null);
		TextField tf=new TextField();
		tf.setLocation(10,10);
		tf.setSize(364,80);
		
		int btnW=91;
		int btnH=85;
		
//		Button btn1=new Button("7");
//		btn1.setSize(btnW, btnH);
//		btn1.setLocation(10+btnW*0,100+btnH*0);
//		Button btn2=new Button("8");
//		btn2.setSize(btnW, btnH);
//		btn2.setLocation(10+btnW*1,100+btnH*0);
//		Button btn3=new Button("9");
//		btn3.setSize(btnW, btnH);
//		btn3.setLocation(10+btnW*2,100+btnH*0);
		Button btn4=new Button("+");
		btn4.setSize(btnW, btnH);
		btn4.setLocation(10+btnW*3,100+btnH*0);
		
//		Button btn5=new Button("4");
//		btn5.setSize(btnW, btnH);
//		btn5.setLocation(10+btnW*0,100+btnH*1);
//		Button btn6=new Button("5");
//		btn6.setSize(btnW, btnH);
//		btn6.setLocation(10+btnW*1,100+btnH*1);
//		Button btn7=new Button("6");
//		btn7.setSize(btnW, btnH);
//		btn7.setLocation(10+btnW*2,100+btnH*1);

//		Button btn8=new Button("1");
//		btn8.setSize(btnW, btnH);
//		btn8.setLocation(10+btnW*0,100+btnH*2);
//		Button btn9=new Button("2");
//		btn9.setSize(btnW, btnH);
//		btn9.setLocation(10+btnW*1,100+btnH*2);
//		Button btn10=new Button("3");
//		btn10.setSize(btnW, btnH);
//		btn10.setLocation(10+btnW*2,100+btnH*2);
		Button btn11=new Button("=");
		btn11.setSize(btnW, btnH);
		btn11.setLocation(10+btnW*3,100+btnH*2);
		
		Button btn12=new Button("0");
		btn12.setSize(btnW, btnH);
		btn12.setLocation(10+btnW*0,100+btnH*3);
		Button btn13=new Button("-");
		btn13.setSize(btnW, btnH);
		btn13.setLocation(10+btnW*2,100+btnH*3);
		
		Button[] btns=new Button[9];
		String[] msg={
				"7","8","9",
				"4","5","6",
				"1","2","3"
		};
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(msg[i]);
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				btns[i*3+j].setSize(btnW, btnH);
				btns[i*3+j].setLocation(10+btnW*j,100+btnH*i);
				
			}
		}
		for(int i=0; i<btns.length; i++){
			p.add(btns[i]);
		}
		
		
		
		btn4.setSize(btnW, btnH*2);
		btn11.setSize(btnW, btnH*2);
		btn12.setSize(btnW*2, btnH);

		p.add(btn13);
		p.add(btn12);
		p.add(btn11);
//		p.add(btn10);
//		p.add(btn9);
//		p.add(btn8);
//		p.add(btn7);
//		p.add(btn6);
//		p.add(btn5);
		p.add(btn4);
//		p.add(btn3);
//		p.add(btn2);
//		p.add(btn1);
		p.add(tf);
		add(p);
		setSize(400,500);
		setLocation(1600+400,0);
		setVisible(true);
		this.setResizable(false);
		System.out.println("x:"+p.getWidth()+",y:"+p.getHeight());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}

}
