package com.hb.pm;

import java.util.HashSet;

public class Ex04 {

	public static void main(String[] args) {
		// SET - 집합
		// 순서가없음
		// 순서가없음 - 중복x
		
		java.util.Set set01=null;
//		set01= new HashSet();
		set01= new java.util.HashSet();
//		set01= new java.util.TreeSet();
		set01.add(1111);
		set01.add(2222);
		set01.add(3333);
		set01.add(1111);
		set01.add(2222);
		set01.add(3333);
		set01.add(4444);
		
		java.util.Iterator ite=set01.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
















