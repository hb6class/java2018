package com.hb.pm;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++){
			// 1~6
			// 0~5 +1
			//1~ 45
			//0~44  +1
			// random*45
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}				
			}
		}
		
		for(int i=0; i<lotto.length; i++){
			System.out.print(lotto[i]+" ");
		}
	}

}
