package com.hb.am;

class Car{
	void go(){
		System.out.print("�޸���");
	}
	
	void stop(){
		System.out.println("�����");
	}
}

class Tico extends Car{
	// �θ� - ��ü�� ������ ����
	void go(){
		super.go();
		System.out.println("-�ִ�100km��");
	}
	
}
class TicoTurbo extends Tico{
	void go(){
		super.go();
		System.out.println("�޸��� ���� ���� �� ������ ������");
	}
}

class Sonata extends Car{
	// �ڽ� - �θ𿡼� ���� ��üȭ
	void go(){
		super.go();
		System.out.println("-�ִ�150km��");
	}
}


public class Ex06 {

	public static void main(String[] args) {
		Car myCar=new TicoTurbo();
		myCar.go();
		myCar.stop();
	}

}
