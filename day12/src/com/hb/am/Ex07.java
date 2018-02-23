package com.hb.am;

import java.util.Scanner;

class Machine{
	
	void on(){
		System.out.println("�Ѵ�");
	}
	
	void off(){
		System.out.println("����");
	}
	
}

class Tv extends Machine{
	void on(){
		System.out.println("Tv�� �Ѵ�");
	}
	void off(){
		System.out.println("Tv�� ����");
	}
}

class Radio extends Machine{
	
	void on(){
		System.out.println("������ �Ѵ�");
	}
	void off(){
		System.out.println("������ ����");
	}
}

class Aircon extends Machine{
	void on(){
		System.out.println("�������� �Ѵ�");
	}
	void off(){
		System.out.println("�������� ����");
	}
}


public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Machine romote=null;
		System.out.print("1.Ƽ�� ���� 2.������ ���� 3.�������� ����>");
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












