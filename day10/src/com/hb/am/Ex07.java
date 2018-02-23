package com.hb.am;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1= 'a';
		Character ch2 = new Character('A');
		
		System.out.println((int)(Character.MIN_VALUE));
		System.out.println((int)(Character.MAX_VALUE));
		System.out.println(Character.SIZE);
		
		System.out.println(ch2.charValue()+1);
		System.out.println(ch2.toString()+1);
		System.out.println(Character.valueOf(ch1));
		
		// 유니코드 인지
		System.out.println(Character.isDefined('@'));
		// 문자인지
		System.out.println("a:"+Character.isLetter('a'));
		System.out.println("한:"+Character.isLetter('한'));
		System.out.println("韓:"+Character.isLetter('韓'));
		System.out.println("9:"+Character.isLetter('9'));
		System.out.println("@:"+Character.isLetter('@'));
		System.out.println("!:"+Character.isLetter('!'));
		// 숫자인지
		System.out.println("9:"+Character.isDigit('9'));
		System.out.println("a:"+Character.isDigit('a'));
		System.out.println("한:"+Character.isDigit('한'));
		System.out.println("@:"+Character.isDigit('@'));
		// 알파벳인지
		System.out.println("a의 대문자:"+Character.isUpperCase('a'));
		System.out.println("A의 대문자:"+Character.isUpperCase('A'));
		System.out.println("a의 소문자:"+Character.isLowerCase('a'));
		System.out.println("A의 소문자:"+Character.isLowerCase('A'));
		
//		System.out.println("A:"+Character.isAlphabetic('A'));
//		System.out.println("Z:"+Character.isAlphabetic('Z'));
//		System.out.println("a:"+Character.isAlphabetic('a'));
//		System.out.println("z:"+Character.isAlphabetic('z'));
//		System.out.println("한:"+Character.isAlphabetic('한'));
//		System.out.println("韓:"+Character.isAlphabetic('韓'));
//		System.out.println("@:"+Character.isAlphabetic('@'));
		// 띄어쓰기
		System.out.println(Character.isSpace(' '));
		System.out.println(Character.isSpace('a'));
		System.out.println(Character.isSpace('!'));
		System.out.println(Character.isWhitespace(' '));
		
		
	}

}

























