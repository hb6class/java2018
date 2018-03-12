package com.hb.am;

public class Ex04 {

	
	public static void main(String[] args) {
		String msg="Java"+"Web"+"Framework";
		System.out.println(msg);
		String msg1="Java";
		String msg2="Web";
		String msg3="Framework";
		String msg4=msg1+msg2;
		String msg5=msg1.concat(msg2);
		String msg6=msg1.concat(msg2).concat(msg3);
		System.out.println(msg6);
	}

}
