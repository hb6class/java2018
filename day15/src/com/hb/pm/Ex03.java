package com.hb.pm;

import java.util.Vector;

public class Ex03 {
	public static void main(String[] args) {
		Vector vec = new Vector(100);
		for(int i=0; i<8; i++){
			vec.addElement((i+1)*1000);
		}
		vec.trimToSize();
		vec.addElement(1234);
		System.out.println(vec.capacity());
	}

}
