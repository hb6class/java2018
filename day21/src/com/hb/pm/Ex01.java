package com.hb.pm;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01 extends Frame implements WindowListener,MouseListener{
	
	public Ex01() {
		// �̺�Ʈ ������ ���
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
		// â�� ��������
		System.out.println("windowOpened()");
	}

	public void windowClosing(WindowEvent e) {
		// â�� x��������
		System.out.println("windowClosing()");
//		System.exit(0);
		dispose(); // â�� �����ϰ� �����û
		     
	}

	public void windowClosed(WindowEvent e) {
		// â�� �ݰ� �߰������� ������ ��
		// ���� �����ϰ� ����
		System.out.println("windowClosed()");
	}

	public void windowIconified(WindowEvent e) {
		// â�� �ּ�ȭ �Ǿ�����
		System.out.println("windowIconified()");
	}

	public void windowDeiconified(WindowEvent e) {
		// â�� �ּ�ȭ���� �ٽ� ����
		System.out.println("windowDeiconified()");
	}

	public void windowActivated(WindowEvent e) {
		// �����찡 Ȱ��ȭ�ɶ�-â�� ��Ŀ�� �Ǿ�����
		System.out.println("windowActivated()");
	}

	public void windowDeactivated(WindowEvent e) {
		// �����찡 ��Ȱ��ȭ�Ǿ�����-â�� ���ù��� ���Ҷ�
		System.out.println("windowDeactivated()");
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("Ŭ��");
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
