package com.hb.am;


class Son04 extends Mother04{
	public Son04() {
		super();
		System.out.println("자식객체생성");
	}
}

class Mother04{
	int sum=100;
	
	public Mother04() {
		this("인자전달");
		System.out.println("엄마객체생성");
	}
	public Mother04(String msg) {
		System.out.println(msg+"가 있는 엄마객체생성");
	}
	
	public void func01(){
		System.out.println("엄마기능 수행-sum:"+this.sum);
	}
}

public class Ex04 {

	public static void main(String[] args) {
//		Son04 son=new Son04();
//		son.func01();
		Mother04 mo=new Mother04();
//		mo.func01();
	}

}
