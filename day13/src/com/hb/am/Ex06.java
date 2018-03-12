package com.hb.am;

public class Ex06 extends Object{
	int val;
	
	public Ex06(int a) {
		val=a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex06 me = new Ex06(100);
		Ex06 me2= new Ex06(100);
		
		//주소값(레퍼런스) 비교
		System.out.println(me==me2);
		
		// 값의 비교
		System.out.println(me.equals(me));	
	}
	
//	public boolean equals(Object obj) {
//		if(this.val==((Ex06)obj).val){
//			return true;
//		}else{
//			return false;
//		}
//	}

}
