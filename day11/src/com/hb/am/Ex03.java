package com.hb.am;

class Mother01{
	public void func03(){
		System.out.println("�ܼҸ��� �Ѵ�");
	}
}

class Father01 extends Object{
	int money=1000;
	
	public void func01(int money){
		this.money+=money;
		System.out.println(money+"���� �����-����:"+this.money);
	}
}

class Son01 extends Father01{

	//�޼��� �����ε�
	public void func01(){
		System.out.println("������ ����Ѵ�");
	}
	
	//�޼��� �������̵�
	public void func01(int money){
		System.out.println(money+"�� ���� ��θ� �Ѵ�");
	}
	
	public void func02(int money){
		super.money-=money;
		System.out.println(money+"���� ����-����:"+super.money);
	}
}

public class Ex03 {

	public static void main(String[] args) {
		//���
		// �ڽ�Ŭ���� extends �θ�Ŭ����
		// ��, ���� ��� (���߻�ӺҰ�)
		
//		Father01 fa=new Father01();
//		fa.func01(10000);
//		System.out.println(fa.money);
		System.out.println("--------------------------------");
		Son01 son=new Son01();
		son.func02(400);
		System.out.println(son.money);
		son.func01();
		son.func01(2000);
	}

}
















