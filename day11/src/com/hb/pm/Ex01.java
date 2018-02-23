package com.hb.pm;

/*
 * 로또
 * 
*/

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto =new int[45];
		for(int i=0; i<lotto.length; i++){
			lotto[i]=i+1;
		}
		
		//
//		1~44
//		0~43
		for(int i=0; i<10000; i++){
			int ran=(int)(Math.random()*44)+1;
			int temp=lotto[0];
			lotto[0]=lotto[ran];
			lotto[ran]=temp;
		}
		//	
		
		for(int i=0; i<6; i++){
			System.out.print(lotto[i]+" ");
		}
		System.out.print(" 보너스번호:"+lotto[7]);
	}

}
