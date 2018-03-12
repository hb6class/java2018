package com.hb.am;

import java.util.Calendar;

class Lec07{
	
	private Lec07() {
	}
	
	static Lec07 getInstance(){
		return new Lec07();
	}
	
	void func(){
		System.out.println("실행함");
	}
}


public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lec07 lec=Lec07.getInstance();
//		lec.func();
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR)+"년");
		System.out.println(now.get(Calendar.MONTH)+1+"월");//0~11
		System.out.println(now.get(Calendar.DATE)+"일 ");
		char w='일';
		switch (now.get(Calendar.DAY_OF_WEEK)) {
		case 1: w='일'; break;
		case 2: w='월'; break;
		case 3: w='화'; break;
		case 4: w='수'; break;
		case 5: w='목'; break;
		case 6: w='금'; break;
		case 7: w='토'; break;
		}
		System.out.println(w);// 1~7
		if(Calendar.AM_PM==0){
			System.out.println(" a.m. "); // 0, 1
		}else{
			System.out.println(" p.m. "); // 0, 1
		}
//		System.out.println(now.get(Calendar.HOUR)+"시");//0~11
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+"시");//0~23
		System.out.println(now.get(Calendar.MINUTE)+"분");
		System.out.println(now.get(Calendar.SECOND)+"초");
		
	}

}

















