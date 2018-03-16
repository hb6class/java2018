package com.io.am;

import java.io.Serializable;

public class Target implements Serializable{
	
	
	public int sum;
	
	public Target() {
		sum=1234;
	}
	
	public void func(){
		System.out.println("내가 만든 기능");
	}
}
