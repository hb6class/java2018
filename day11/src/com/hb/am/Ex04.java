package com.hb.am;


class Son04 extends Mother04{
	public Son04() {
		super();
		System.out.println("�ڽİ�ü����");
	}
}

class Mother04{
	int sum=100;
	
	public Mother04() {
		this("��������");
		System.out.println("������ü����");
	}
	public Mother04(String msg) {
		System.out.println(msg+"�� �ִ� ������ü����");
	}
	
	public void func01(){
		System.out.println("������� ����-sum:"+this.sum);
	}
}

public class Ex04 {

	public static void main(String[] args) {
//		Son04 son=new Son04();
//		son.func01();
		Mother04 mo=new Mother04();
//		mo.func01();
	}

}
