package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// 
		byte a1=127;
		Byte a2=new Byte(a1);
		Byte a3=new Byte("+127");//-128~127
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.parseByte("127"));
		System.out.println("-------------------------");
		
		
		short b1=123;
		Short b2=new Short(b1);
		Short b3=new Short("1234");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.SIZE);
		System.out.println(Short.parseShort("123"));
		System.out.println("-------------------------");
		
		long c1=12345678L;
		Long c2=new Long(123456);
		Long c3=new Long(123456L);
		Long c4=new Long("123456");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.SIZE);
		System.out.println(Long.parseLong("123"));
		System.out.println("-------------------------");

	}

}
