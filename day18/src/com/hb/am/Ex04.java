package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder msg1=new StringBuilder("abcd12354efg");
//		msg1.reverse();
//		System.out.println(msg1);
		
		char[] ch=new char[msg1.length()];
		msg1.getChars(0, 12, ch, 0);
		for(int i=0; i<ch.length; i++){
			System.out.println(ch[i]);
		}
		String msg2= new String(ch);
		System.out.println(msg2);
	}

}
