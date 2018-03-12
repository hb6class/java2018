package com.hb.pm;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01 extends Frame implements WindowListener,MouseListener{
	
	public Ex01() {
		// 이벤트 리스너 등록
		this.addWindowListener(this);
		this.addMouseListener(this);
		setSize(400,300);
		setLocation(1600+400,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();
	}

	public void windowOpened(WindowEvent e) {
		// 창이 열렸을때
		System.out.println("windowOpened()");
	}

	public void windowClosing(WindowEvent e) {
		// 창을 x눌렀을때
		System.out.println("windowClosing()");
//		System.exit(0);
		dispose(); // 창을 안전하게 종료요청
		     
	}

	public void windowClosed(WindowEvent e) {
		// 창을 닫고 추가적으로 할일을 명세
		// 이후 안전하게 종료
		System.out.println("windowClosed()");
	}

	public void windowIconified(WindowEvent e) {
		// 창이 최소화 되었을때
		System.out.println("windowIconified()");
	}

	public void windowDeiconified(WindowEvent e) {
		// 창이 최소화에서 다시 복귀
		System.out.println("windowDeiconified()");
	}

	public void windowActivated(WindowEvent e) {
		// 윈도우가 활성화될때-창이 포커싱 되었을때
		System.out.println("windowActivated()");
	}

	public void windowDeactivated(WindowEvent e) {
		// 윈도우가 불활성화되었을때-창이 선택받지 못할때
		System.out.println("windowDeactivated()");
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭");
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
