package com.hb.pm;
//p.240~256;
class Lec03{
	int sum=100;
	
	void func01(){
		System.out.println("Lec03-func01");
	}
}
// �θ�Ŭ����,����Ŭ����,����Ŭ����
// �ڹٿ��� �������̶� �����ΰ�?
// ��ü?
// �ڽ�Ŭ����,����Ŭ����,����Ŭ����
public class Ex03 extends Lec03{
	int sum=200;
	// �������̵��� ����� final(x) non-static�޼���
	void func01(){
		System.out.println(++super.sum);
		System.out.println("Ex03-func01");
		System.out.println(super.sum);
		System.out.println(this.sum);
	}
	public static void main(String[] args) {
		Lec03 me = new Ex03();
		System.out.println(me.sum);
	}

}
