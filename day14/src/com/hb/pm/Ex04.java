package com.hb.pm;

public class Ex04 {

	public static void main(String[] args) {
		MyArray arr01= new MyArray();
		arr01.add(1);
		arr01.add(3.14);
		arr01.add(true);
		arr01.add('A');
		arr01.add("¹®ÀÚ¿­");
		
		System.out.println(arr01.get(3));
	}

}
