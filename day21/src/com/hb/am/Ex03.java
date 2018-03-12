package com.hb.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex03 extends Frame{
	
	public Ex03() {
		super("GridBagLayout");
		GridBagLayout gbl=new GridBagLayout();
		Panel p = new Panel(gbl);
		
		Button[] btns=new Button[6];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button("버튼"+i);
		}
		// 크기, 위치, 가중치
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.NONE;
		
		//위치
		gbc.gridx=0;
		gbc.gridy=0;
		//크기
		gbc.gridwidth=2;
		gbc.gridheight=1;
		//가중치
		gbc.weightx=0.0;
		gbc.weighty=0.0;
		gbl.setConstraints(btns[0], gbc);
		p.add(btns[0],gbc);
		
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=0.0;
		gbc.weighty=0.0;

		gbl.setConstraints(btns[1], gbc);
		p.add(btns[1],gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		gbc.weightx=0.0;
		gbc.weighty=0.0;

		gbl.setConstraints(btns[2], gbc);
		p.add(btns[2],gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weightx=0.0;
		gbc.weighty=0.0;

		gbl.setConstraints(btns[3], gbc);
		p.add(btns[3],gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=0.0;
		gbc.weighty=0.0;

		gbl.setConstraints(btns[4], gbc);
		p.add(btns[4],gbc);
		
		gbc.gridx=1;
		gbc.gridy=3;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=0.0;
		gbc.weighty=0.0;

		gbl.setConstraints(btns[5], gbc);
		p.add(btns[5],gbc);
		
		add(p);
		setSize(500,300);
		setLocation(1600+400,0);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
