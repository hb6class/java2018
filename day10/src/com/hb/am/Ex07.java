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
		
		// �����ڵ� ����
		System.out.println(Character.isDefined('@'));
		// ��������
		System.out.println("a:"+Character.isLetter('a'));
		System.out.println("��:"+Character.isLetter('��'));
		System.out.println("��:"+Character.isLetter('��'));
		System.out.println("9:"+Character.isLetter('9'));
		System.out.println("@:"+Character.isLetter('@'));
		System.out.println("!:"+Character.isLetter('!'));
		// ��������
		System.out.println("9:"+Character.isDigit('9'));
		System.out.println("a:"+Character.isDigit('a'));
		System.out.println("��:"+Character.isDigit('��'));
		System.out.println("@:"+Character.isDigit('@'));
		// ���ĺ�����
		System.out.println("a�� �빮��:"+Character.isUpperCase('a'));
		System.out.println("A�� �빮��:"+Character.isUpperCase('A'));
		System.out.println("a�� �ҹ���:"+Character.isLowerCase('a'));
		System.out.println("A�� �ҹ���:"+Character.isLowerCase('A'));
		
//		System.out.println("A:"+Character.isAlphabetic('A'));
//		System.out.println("Z:"+Character.isAlphabetic('Z'));
//		System.out.println("a:"+Character.isAlphabetic('a'));
//		System.out.println("z:"+Character.isAlphabetic('z'));
//		System.out.println("��:"+Character.isAlphabetic('��'));
//		System.out.println("��:"+Character.isAlphabetic('��'));
//		System.out.println("@:"+Character.isAlphabetic('@'));
		// ����
		System.out.println(Character.isSpace(' '));
		System.out.println(Character.isSpace('a'));
		System.out.println(Character.isSpace('!'));
		System.out.println(Character.isWhitespace(' '));
		
		
	}

}

























