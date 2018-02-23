package com.hb.am;

public class Ball {
	
	private int num;
	boolean marking;
	String color;
	
	public Ball(int num, String color) {
		this.num=num;
		marking=false;
		this.color=color;
	}
	
	public int showNum(){
		return this.num;
	}
}
