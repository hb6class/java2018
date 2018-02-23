package com.hb.am;

class Car{
	void go(){
		System.out.print("달린다");
	}
	
	void stop(){
		System.out.println("멈춘다");
	}
}

class Tico extends Car{
	// 부모 - 객체의 상위적 개념
	void go(){
		super.go();
		System.out.println("-최대100km로");
	}
	
}
class TicoTurbo extends Tico{
	void go(){
		super.go();
		System.out.println("달리던 차를 조금 더 가속이 빠르게");
	}
}

class Sonata extends Car{
	// 자식 - 부모에서 보다 구체화
	void go(){
		super.go();
		System.out.println("-최대150km로");
	}
}


public class Ex06 {

	public static void main(String[] args) {
		Car myCar=new TicoTurbo();
		myCar.go();
		myCar.stop();
	}

}
