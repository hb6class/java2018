package com.hb.am;

class Lec10 extends Thread{
	public Lec10(String name) {
		super(name);
	}
	
	public void run() {
		String name=getName();
		for(int i=0; i<1000000; i++){
			System.out.print(name+"�� i="+i);
			System.out.println("�̰� �켱����="+getPriority());
		}
		System.out.println(name+" end");
	}
}

public class Ex10 {
	// �켱����
	// �켱������ �������� ���� Ȯ���� ������
	// value: 1~10, default:5
	// 6(6/11) 5(5/11) 8(8/13) 5(5/13)
	// 10:1 or 6:5
	public static void main(String[] args) {
		Lec10 lec1 = new Lec10("ù��°");
		Lec10 lec2 = new Lec10("�ι�°");
		Lec10 lec3 = new Lec10("�¹�°");
		lec1.setPriority(Thread.MAX_PRIORITY);
		lec2.setPriority(Thread.MIN_PRIORITY);
		lec3.setPriority(Thread.NORM_PRIORITY);
		lec1.start();
		lec2.start();
		lec3.start();
		
	}

}
