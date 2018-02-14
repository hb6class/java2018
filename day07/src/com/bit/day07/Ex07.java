package com.bit.day07;

class 은행CD{
	public int 잔고;
	
	public void 입금한다(int 돈){
		잔고+=돈;
		System.out.println("입금합니다");
	}
	
	public void 출금한다(int 돈){
		잔고-=돈;
		System.out.println("출금합니다");
	}
	
	public void 잔고를확인한다(){
		System.out.println("현재 잔고 : "+잔고);
	}
	
}


public class Ex07 {

	public static void main(String[] args) {
		은행CD cd = new 은행CD();
		cd.입금한다(1000);
		cd.잔고를확인한다();
		cd.출금한다(500);
		cd.잔고를확인한다();
	}

}
