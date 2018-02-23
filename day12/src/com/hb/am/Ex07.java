package com.hb.am;

import java.util.Scanner;

class Machine{
	
	void on(){
		System.out.println("켜다");
	}
	
	void off(){
		System.out.println("끄다");
	}
	
}

class Tv extends Machine{
	void on(){
		System.out.println("Tv를 켜다");
	}
	void off(){
		System.out.println("Tv를 끄다");
	}
}

class Radio extends Machine{
	
	void on(){
		System.out.println("라디오를 켜다");
	}
	void off(){
		System.out.println("라디오를 끄다");
	}
}

class Aircon extends Machine{
	void on(){
		System.out.println("에어컨을 켜다");
	}
	void off(){
		System.out.println("에어컨을 끄다");
	}
}


public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Machine romote=null;
		System.out.print("1.티비를 향해 2.라디오를 향해 3.에어컨을 향해>");
		int input=sc.nextInt();
		if(input==1){
			romote=new Tv();
		}else if(input==2){
			romote=new Radio();
		}else{
			romote=new Aircon();
		}
		
		romote.on();
		romote.off();
	}

}












