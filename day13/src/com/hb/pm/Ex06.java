package com.hb.pm;
// p260 ~ 264

abstract class Car{
	
	public abstract void carRun();
//	public void carRun();
	
	public void stop(){
		System.out.println("�����");
	}
}

class Tico extends Car{

	public void carRun(){
		System.out.println("õõ�� �޸���");
	}
}

class Sonata extends Car{
	public void carRun(){
		System.out.println("������ �޸���");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Car myCar= new Sonata();
		myCar.carRun();
		myCar.stop();

	}

}
















