package com.hb.pm;
// p260 ~ 264

abstract class Car{
	
	public abstract void carRun();
//	public void carRun();
	
	public void stop(){
		System.out.println("멈춘다");
	}
}

class Tico extends Car{

	public void carRun(){
		System.out.println("천천히 달린다");
	}
}

class Sonata extends Car{
	public void carRun(){
		System.out.println("빠르게 달린다");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Car myCar= new Sonata();
		myCar.carRun();
		myCar.stop();

	}

}
















