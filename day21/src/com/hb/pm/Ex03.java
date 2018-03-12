package com.hb.pm;

import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex03 extends Frame implements MouseListener {
	
	public Ex03() {
		addWindowListener(new WindowListener() {
			
			public void windowOpened(WindowEvent e) {}
			
			public void windowIconified(WindowEvent e) {}
			
			public void windowDeiconified(WindowEvent e) {}
			
			public void windowDeactivated(WindowEvent e) {}
			
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
			public void windowClosed(WindowEvent e) {}
			
			public void windowActivated(WindowEvent e) {}
		});
		addMouseListener(this);
		
		Panel p=new Panel();
		p.addMouseListener(this);
		Button btn=new Button("버튼");
		
		btn.addMouseListener(this);
		p.add(btn);
		
		add(p);
		setSize(500,300);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex03();
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		Component comp=(Component) obj;
		
		if("button0".equals(comp.getName())){
			dispose();
		}else if("panel0".equals(comp.getName())){
			System.out.println("패널위 클릭");
		}
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
