package com.bit.day07;

/*
 * 자동차
 * 
 * 최대속도(km) > 150
 * 
 * 1.가속 2.브라이크 3.현재속도 0.종료>3
 * 
 * 현재속도 : 0km
 * 
 * 1.가속(+10) 2.감속(-10) 3.현재속도 0.종료>1
 * 
 * 현재속도 : 10km
 * 
 * ...
 * 
 * 1.가속(+10) 2.감속(-10) 3.현재속도 0.종료>1
 * 
 * 현재속도 : 150km
 * 
 * 1.가속(+10) 2.감속(-10) 3.현재속도 0.종료>1
 * 
 * 현재속도 : 150km
 * 
 * ...
 * 
 * 1.가속(+10) 2.감속(-10) 3.현재속도 0.종료>2
 * 
 * 현재속도 : 140km
 * 
 * 1.가속(+10) 2.감속(-10) 3.현재속도 0.종료>2
 * 
 * 현재속도 : 140km
 * 
 * ...
 * 
 * 1.가속(+10) 2.감속(-10) 3.현재속도 0.종료>2
 * 
 * 현재속도 : 0km
 * 
 * 1.가속(+10) 2.감속(-10) 3.현재속도 0.종료>2
 * 
 * 현재속도 : 0km
 * 
 * 
 * 
*/
class MyCar{
	int max,speed;
	
	public void add(){
		if(speed+30<=max){
			speed+=30;
		}else{
			speed=max;
			}
	}
	public void stop(){
		if(speed-30>=0){
			speed-=30;
		}else{
			speed=0;
			}
	}
	public void show(){
		System.out.println("현재속도 : "+speed);
	}
	
}
public class Ex10 {

	public static void main(String[] args) {
		MyCar my = new MyCar();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("자동차제어");
		System.out.println("-------------------");
		System.out.print("최대속도(km) > ");
		my.max=sc.nextInt();
		int input=0;
		while(true){
		System.out.print("1.가속(+30) 2.감속(-30) 3.현재속도 0.종료 >");
		input=sc.nextInt();
			if(input==1){
				my.add();
				my.show();
			}else if(input==2){
				my.stop();
				my.show();				
			}else if(input==3){
				my.show();
			}else{
				break;
			}
		}
		
		
	}

}















