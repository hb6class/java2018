package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer st1=new StringBuffer("java");
		StringBuffer st2=new StringBuffer(1);
		System.out.println(st1.append(st2));
		StringBuffer st3=new StringBuffer();
		System.out.println(st3.capacity());
		for(int i=0; i<17; i++){
			st3.append("a");
		}
		System.out.println(st3);
		System.out.println(st3.capacity());
		st3.delete(0, 7);
		System.out.println(st3);
		System.out.println(st3.capacity());
		st3.trimToSize();
		System.out.println(st3);
		System.out.println(st3.capacity());
		st3.append("a");
		System.out.println(st3);
		System.out.println(st3.capacity());
		
	}

}
