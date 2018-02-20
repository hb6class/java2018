package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		String msg1="Hello";
		// ∞¥√º, ¡÷º“
		String msg2="World";
		String msg3=msg1+msg2;
		String msg4="HelloWorld";
		System.out.println(msg3==msg4);
		System.out.println(msg3.equals(msg4));
		
		for(int i=0; i<100; i++){
			msg2=msg1+i;
			System.out.println(msg2);
		}
	}

}
