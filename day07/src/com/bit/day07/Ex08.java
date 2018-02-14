package com.bit.day07;

class Car{
	String model="";
	String color="흰색 ";
	int speed=0;
	int cnt=0;
	
	public void run(){
		int temp=1;
		
		if(model.equals("티코")){
			temp=2;
		}else if(model.equals("소나타")){
			temp=5;
		}else if(model.equals("그랜져")){
			temp=10;
		}
		
		cnt++;
		speed+=temp*cnt;
	}
	public void stop(){
		speed=0;
	}
	public void showSpeed(){
		System.out.println(color+model+"인 내차의 현재속도:"+speed);
	}
}


public class Ex08 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.model="티코";
		myCar.showSpeed();
		myCar.run();
		myCar.showSpeed();
		myCar.run();
		myCar.showSpeed();
		myCar.stop();
		myCar.showSpeed();
		myCar=new Car();
		myCar.model="소나타";
		myCar.color="똥색 ";
		myCar.run();
		myCar.showSpeed();
		myCar.run();
		myCar.showSpeed();
		myCar.stop();
		myCar.showSpeed();
		myCar=new Car();
		myCar.model="그랜져";
		myCar.color="검정색 ";
		myCar.run();
		myCar.showSpeed();
		myCar.run();
		myCar.showSpeed();
		myCar.stop();
		
	}

}
