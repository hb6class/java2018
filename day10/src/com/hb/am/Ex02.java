package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1=new Integer(10);
		Integer a2=new Integer("1234");
		Integer a3=4321;// 오토랩핑
		int a4=a1+a2;// 언랩핑
		Integer a5=a1+a2;// 언랩핑->오토랩핑
		
		// 속성 변수
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		// 기능 메서드
		String su1="1234";
		System.out.println(su1+1);
		int result1=Integer.parseInt(su1);
		System.out.println(result1+1);
		Integer result2=Integer.valueOf(su1);
		System.out.println(result2+1);
		Integer result3=Integer.valueOf(100);
		int su=16;
		System.out.println("2진수"+su+":"+Integer.toBinaryString(su));
		System.out.println("8진수"+su+":"+Integer.toOctalString(su));
		System.out.println("16진수"+su+":"+Integer.toHexString(su));
		
		Integer b1=new Integer(101);
		Integer b2=new Integer(101);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		int c1=3;
		Integer c2=new Integer(c1);
		System.out.println(""+c1+1);
		System.out.println(c2.toString()+1);
		Integer d1=new Integer(128);
		int d2=d1.intValue();
		double d3=d1.doubleValue();
		byte d4=d1.byteValue();
		short d5=d1.shortValue();
		System.out.println(d4);
	}

}















