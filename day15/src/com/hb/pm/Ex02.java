package com.hb.pm;

import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
		// 동적할당을 위한 자료구조(vector)
		Vector vec01=new Vector();
		vec01.addElement(1111);
		vec01.addElement(2222);
		vec01.addElement(3333);
		vec01.addElement(4444);
		vec01.addElement(1111);
		vec01.addElement(2222);
		vec01.addElement(3333);
		
		System.out.println(vec01.elementAt(0));
		System.out.println(vec01.elementAt(1));
		System.out.println(vec01.elementAt(2));
		System.out.println(vec01.elementAt(3));
		System.out.println("-------------------------------");
		for(int i=0; i<vec01.size(); i++){
			System.out.println(vec01.elementAt(i));
		}
		for(int i=0; i<vec01.size(); i++){
			System.out.println(vec01.elementAt(i));
		}
		System.out.println("-------------------------------");
//		vec01.removeElementAt(2);//삭제
		vec01.removeElement(3333);
		
		java.util.Enumeration en=vec01.elements();
		
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		System.out.println("-------------------------------");
		vec01.setElementAt(5555, 1);
		
		en=vec01.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}

}















