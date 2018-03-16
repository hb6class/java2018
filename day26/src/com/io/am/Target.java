package com.io.am;

import java.io.Serializable;

public class Target implements Serializable{
	
	transient public int sum1;
	transient private int sum2;
	int sum3;
	
	public Target() {
		sum1=1111;
		sum2=2222;
		sum3=3333;
	}
	
	public void func1(){
		System.out.println("sum2="+sum2);
	}
	public void func2(){
		System.out.println("내가 만든 기능2");
	}
}
