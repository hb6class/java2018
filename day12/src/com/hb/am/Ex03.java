package com.hb.am;


class Lec03{
	// final class ����� ���x
	
	final int sum;
	// ����� ����
	
	public Lec03() {
		// ������ �ֿ俪�� - �ʵ尪�� �ʱ�ȭ
		sum=100;
	}
	
	final void func01(){
//		sum++;
		// method���� final�� ����� ����
		// �������̵� ����
		System.out.println("func01 run...");
	}
}

public class Ex03 extends Lec03 {

	public static void main(String[] args) {
//		Lec03 lec = new Lec03();
//		System.out.println(lec.sum);
//		lec.func01();
		Ex03 me = new Ex03();
		me.func01();
	}
	

}
