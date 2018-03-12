package com.hb.pm;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(1111);
		list.add(2222);
		list.add(4444);
		list.add(3333);
		
		ArrayList list2= new ArrayList(3);
//		list2.add("test1");
//		list2.add("test2");
//		list2.addAll(1,list);
		
		
		Iterator<Integer> ite = list2.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

	}

}
