package com.hb.am;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex07 {

	public static void main(String[] args) {
		// 1.2 컬렉션프레임워크 추가
		// 1.5 제네릭 추가
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(1111);
		vec.add(2222);
		vec.add(3333);
		
//		vec.addElement(1111);
//		vec.addElement(2222);
//		vec.addElement(3333);
//		vec.addElement(4444);
		
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		
//		Iterator<Integer> ite = vec.iterator();
//		while(ite.hasNext()){
//			Integer item = ite.next();
//			System.out.println(item);
//		}
		
//		for(int i=0; i<vec.size(); i++){
//			Integer item = vec.get(i);
//			System.out.println(item);
//		}
		
//		Enumeration<Integer> eles = vec.elements();
//		while(eles.hasMoreElements()){
//			Integer item = eles.nextElement();
//			System.out.println(item);
//		}
	}

}














