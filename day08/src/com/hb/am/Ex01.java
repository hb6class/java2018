package com.hb.am;

class Bike{
	// 클래스 구성요소
	// 1.메서드
	// 2.변수
	// 3.생성자
	
	// 객체의 속성 - 객체 특성
	public int nowSpeed;
	public String color;
	public int maxSpeed;
	
	// 생성자
	public Bike(String a, int b){
		color=a;
		maxSpeed=b;
	}
	
	// 객체의 기능 - 객체 제어
	public int speedUp(int speed){
		if(nowSpeed+speed<=maxSpeed){
			nowSpeed+=speed;
		}
		System.out.println(color+"색 바이크는 현재속도 "+nowSpeed+"km 입니다");
		return nowSpeed;
	}
	
	public int speedDown(int speed){
		nowSpeed-=speed;
		System.out.println(color+"색 바이크는 현재속도 "+nowSpeed+"km 입니다");
		return nowSpeed;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		Bike me = new Bike("노랑",150);
//		me.color="노랑";
//		me.maxSpeed=150;
		
		Bike you = new Bike("빨강",100);
//		you.color="빨강";
//		you.maxSpeed=100;
		
		me.speedUp(10);
		you.speedUp(10);
		me.speedUp(30);
		you.speedUp(30);
		me.speedUp(50);
		you.speedUp(50);
		me.speedUp(10);
		you.speedUp(10);
		me.speedUp(10);
		you.speedUp(10);
		me.speedUp(10);
		you.speedUp(10);
		
		
	}

}













