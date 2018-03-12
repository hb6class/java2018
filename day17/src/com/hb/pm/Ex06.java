package com.hb.pm;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg1="abcabcdabcde";
		System.out.println(msg1.contains("ce"));
		System.out.println(msg1.endsWith("fg"));
		System.out.println(msg1.startsWith("abc"));
		System.out.println(msg1.indexOf("abc",2));
		System.out.println(msg1.lastIndexOf("a",4));
		char[] ch= {'a','b','c'};
		System.out.println(String.valueOf(ch));
		String msg2="aaaㄴㅁㅇㄻㄹㅇㄴ";
		String msg3=new String("aa");
		System.out.println(msg2==msg3);
		System.out.println(msg2.equals(msg3));
		// 0 같음
		// 다른index 차이
		// 길이
		System.out.println(msg2.compareTo(msg3));
	}

}

















