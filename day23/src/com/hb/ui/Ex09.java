package com.hb.ui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Ex09 extends Frame {
	
	public Ex09() {
		
		Canvas can = new Canvas(){
			
			public void paint(Graphics g) {
				g.setColor(Color.RED);
				g.drawLine(50, 50, 200, 50);
				g.setColor(Color.GRAY);
				g.drawRect(100, 100, 50, 50);
				g.drawOval(200, 100, 50, 50);
				g.fillRect(100, 200, 50, 50);
				g.fillOval(200, 200, 50, 50);
				g.drawArc(300, 100, 50, 50, 0, 180);
				g.fillArc(300, 200, 50, 50, 0, 270);
				
				g.fill3DRect(100, 300, 50, 50, true);
				Toolkit kit = Toolkit.getDefaultToolkit();
				Image img = kit.getImage("myimge.png");
				g.drawImage(img, 200, 300, this);
			}
		};
		
		add(can);
		setBounds(1600+0,0,400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex09();
	}

}
