package com.bit.day07;

class BankCD{
	public int money=0;
	
	
	public void add(int b){
		money+=b;
	}
	public void del(int b){
		//
		if(money<b){
			System.out.println("찾으실 금액이 부족합니다");
			return;
		}
		money-=b;
	}
	public void show(){
		System.out.println("현재 잔고는 "+money+"원입니다");
	}
}


public class Ex06 {

	
	public static void main(String[] args) {
		int input=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		BankCD bank=new BankCD();
		while(true){
			System.out.print("1.입금 2.출금 3.잔고확인 0.종료>");
			input=sc.nextInt();
			if(input==1){
				System.out.print("입금하실 금액:");
				input=sc.nextInt();
				bank.add(input);
			}else if(input==2){
				System.out.print("출금하실 금액:");
				input=sc.nextInt();
				bank.del(input);
			}else if(input==3){
				bank.show();
			}else{
				break;
			}
		}
	}

}

















