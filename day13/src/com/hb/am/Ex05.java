package com.hb.am;

public class Ex05 {
	static String tot01="";

	public static void main(String[] args) {
		Ex05 me = new Ex05();
		System.out.println(me.toString());
		System.out.println(me.func01("Java").func01("Web").func01("Framework"));
	}
	
	public Ex05 func01(String msg){
		this.tot01+=msg;
		return this;
	}
	
	public String toString(){
		return tot01;
	}

}










