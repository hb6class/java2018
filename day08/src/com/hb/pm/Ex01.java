package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
		// ¹è¿­
		int a0=1;
		int a1=2;
		int a2=3;
		int a3=4;
		int a4=5;
		
		System.out.println(a0);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println("-------------------");
		int[] b = new int[5];
//		b[0]=1;
//		b[1]=2;
//		b[2]=3;
//		b[3]=4;
//		b[4]=5;
		for(int i=0; i<5; i++){
			b[i]=i+1;
		}
		
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);
//		System.out.println(b[3]);
//		System.out.println(b[4]);
		for(int i=0; i<5; i++){
		System.out.println(b[i]);
		}

	}

}













