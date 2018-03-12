package com.hb.am;

// 패키지
// 임포트 - 앞으로 등장할 클래스의 위치를 찾는
//			예외 ) 해당패키지&&java.lang.~~제외
import java.util.Scanner;
// 클래스
public class Ex01 {
	//전역변수
	//생성자 - 객체 생성시에 수행할 내용
	//메서드
	
	public Ex01() {
		// TODO Auto-generated constructor stub
		this("");
		this.func01();
	}
	public Ex01(String st){//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.hb.am.Scanner sc = new com.hb.am.Scanner();
		Scanner sc2 = new Scanner(System.in);
		Ex01 me = new Ex01();
		me.func01();
	}
	
	public void func01(){
		this.func02();
	}
	public void func02(){}

}
