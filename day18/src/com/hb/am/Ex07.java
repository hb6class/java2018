package com.hb.am;

import java.util.Calendar;

class Lec07{
	
	private Lec07() {
	}
	
	static Lec07 getInstance(){
		return new Lec07();
	}
	
	void func(){
		System.out.println("������");
	}
}


public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lec07 lec=Lec07.getInstance();
//		lec.func();
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR)+"��");
		System.out.println(now.get(Calendar.MONTH)+1+"��");//0~11
		System.out.println(now.get(Calendar.DATE)+"�� ");
		char w='��';
		switch (now.get(Calendar.DAY_OF_WEEK)) {
		case 1: w='��'; break;
		case 2: w='��'; break;
		case 3: w='ȭ'; break;
		case 4: w='��'; break;
		case 5: w='��'; break;
		case 6: w='��'; break;
		case 7: w='��'; break;
		}
		System.out.println(w);// 1~7
		if(Calendar.AM_PM==0){
			System.out.println(" a.m. "); // 0, 1
		}else{
			System.out.println(" p.m. "); // 0, 1
		}
//		System.out.println(now.get(Calendar.HOUR)+"��");//0~11
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+"��");//0~23
		System.out.println(now.get(Calendar.MINUTE)+"��");
		System.out.println(now.get(Calendar.SECOND)+"��");
		
	}

}

















