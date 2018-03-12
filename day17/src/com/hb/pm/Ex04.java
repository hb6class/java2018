package com.hb.pm;

class Lec04<T>{
	T obj;
	
	void func01(T obj){
		this.obj=obj;
	}
	T func02(){
		return obj;
	}
}

class Lec55 extends Lec04{
	
}

interface Interf2{
	
}
interface Interf extends Interf2{
	
}

public class Ex04 {

	public static void main(String[] args) {
		// Á¦³×¸¯
		//Lec04<String> lec2 = new Lec04<String>();
		//Lec04 lec2 = new Lec04<String>();
		//Lec04<String> lec2 = new Lec04();
		
//		Lec04<String> temp = new Lec04<String>();
//		Lec04<Integer> temp2 = new Lec04<Integer>();
//		temp.func01("test");
		Lec04<? super Object> lec = new Lec04();
		lec.func01(new Lec04());
//		Object obj = lec.func02();
//		System.out.println();
//		lec = temp2;
		
		
		
//		lec.func01(11111);
		
//		Integer obj = lec.func02();
//		System.out.println(obj);
	}

}












