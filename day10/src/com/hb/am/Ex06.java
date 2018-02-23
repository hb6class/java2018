package com.hb.am;

public class Ex06 {
	public static void main(String[] args) {
		float a1=3.14f;
		
		Float a2= new Float(a1);
		Float a3= new Float("3.14");
		
		Double b1 = new Double(3.14);
		int b2=b1.intValue();
		Float a4=b1.floatValue();
		System.out.println(a2.intValue());

	}

}
