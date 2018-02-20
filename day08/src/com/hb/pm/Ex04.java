package com.hb.pm;

public class Ex04 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size='Z'-'A'+1;
		char[] chs = new char[size];
		for(int i=0; i<size; i++){
			chs[i]=(char)(65+i);
		}
		System.out.println("size:"+size);
		System.out.println("size:"+chs.length);
//		for(int i=0; i<size; i++){
//			System.out.println(chs[i]);
//		}
	}

}
