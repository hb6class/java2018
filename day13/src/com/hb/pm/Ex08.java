package com.hb.pm;

class Lec08 implements Inter01{

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02(int a) {
		// TODO Auto-generated method stub
		
	}
	
}

interface Inter01{
	// 오직 추상메서드만 갖음(단, 상수형 변수만 갖음)
	// 인터페이스의 다중상속 허용(다중상속처럼...)
//	public final int sum=100;
	int sum=100;
	
	public void func01();	// 인터페이스의 추상메서드는 public
	void func02(int a);
}

interface Inter02{
	void func03();
}

interface Inter03 extends Inter02, Inter01{
	void func03();
}

interface Inter04{
	// 상속받는 클래스의 구체화
}

public class Ex08 implements Inter01,Inter03,Inter04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter01 me=null; 
		me =new Ex08();
		me =new Lec08();
		me.func01();
		me.func02(111);
	}

	public void func01() {
		// TODO Auto-generated method stub
//		sum++;
		System.out.println(sum);
	}

	public void func02(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}

}
