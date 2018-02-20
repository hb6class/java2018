package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg1="abc";
		String msg2=msg1+"1234";
		String msg3=msg1.concat(msg1);
		System.out.println(msg3);
		System.out.println("-------------");
		System.out.println("วั".concat("ฑÛ"));
		System.out.println("-------------");
		System.out.println("ABCD".length());
		System.out.println("".length());
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println("-------------");
		String msg4="java";
		String msg5=new String("java");
		char[] ch1=new char[4];
		ch1[0]='j';
		ch1[1]='a';
		ch1[2]='v';
		ch1[3]='a';
		String msg6=new String(ch1);
		System.out.println(msg6);
		System.out.println("-------------");
		String msg7="abcd1234";
		char[] ch2=msg7.toCharArray();
		for(int i=0; i<ch2.length; i++){
			int temp=(int)(ch2[i]);
			if(temp>=97){
				ch2[i]=(char)(temp-('a'-'A'));
			}
		}
		msg7=new String(ch2);
		System.out.println(msg7);
		System.out.println("-------------");
		String msg8="abcdefg";
//		System.out.println(msg8.charAt(0));
//		System.out.println(msg8.charAt(1));
//		System.out.println(msg8.charAt(2));
//		System.out.println(msg8.charAt(msg8.length()-1));
		for(int i=0;i<msg8.length(); i++){
			System.out.println(msg8.charAt(i));
		}
		
	}
}














