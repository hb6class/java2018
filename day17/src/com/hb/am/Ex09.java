package com.hb.am;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex09 {

	public static void main(String[] args) {
		// 
//		List<Integer> list01 = new ArrayList<Integer>();
//		for(int i=0; i<10000000; i++){
//			list01.add(i);
//		}
//		System.out.println("꺼내오기시작");
//		for(int i=0; i<10000000; i++){
//			list01.get(i);
//		}
//		System.out.println("꺼내오기끝");
		List<Integer> list02 = new LinkedList<Integer>();
		for(int i=0; i<1000000; i++){
			list02.add(i);
		}
//		list02.add(1111);
//		list02.add(2222);
//		list02.add(3333);
//		list02.add(4444);
		System.out.println("입력시작");
		for(int i=0; i<1000000; i++){
			list02.get(i);
		}
		System.out.println("입력끝");
	}

}











