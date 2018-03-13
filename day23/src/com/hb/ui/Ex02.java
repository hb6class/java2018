package com.hb.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex02 extends Frame {
	String[][] msgs={
			{"7","8","9","+"},
			{"4","5","6"},
			{"1","2","3","ENT"},
			{"0","."}
	};
	Button[] btns;
	
	public Ex02() {
		GridBagLayout gbl=new GridBagLayout();
		Panel p = new Panel(gbl);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		btns=new Button[13];
		int cnt=0;
		for(int i=0; i<msgs.length; i++){
			for(int j=0; j<msgs[i].length; j++){
				String msg=msgs[i][j];
				btns[cnt++]=new Button(msg);
			}
		}
		cnt=0;
		for(int i=0; i<msgs.length; i++){
			gbc.gridy=i;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			gbc.weightx=1.0;
			gbc.weighty=1.0;
			for(int j=0; j<msgs[i].length; j++){
				if((i==0&&j==3)||(i==2&&j==3)){
					gbc.gridheight=2;
				}else if(i==3&&j==0){
					gbc.gridwidth=2;
				}else if(i==3&&j==1){
					gbc.gridwidth=1;
					j++;
				}
				gbc.gridx=j;
				p.add(btns[cnt++] , gbc);
			}
		}
		add(p);
		setSize(400,400);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
