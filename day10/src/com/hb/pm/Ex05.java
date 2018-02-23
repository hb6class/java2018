package com.hb.pm;

public class Ex05 {

	public static void main(String[] args) {
		// ±¸±¸´Ü 2*3
//		int[][] gugudan={
//				{2,3,4,5,6,7,8,9},
//				{4,6,8,10,12,14,16,18},
//				....
//				{18,27,36,45,54,63,72,81}
//		}
		int[][] gugudan=new int[8][9];
		for(int i=0; i<gugudan.length; i++){
			gugudan[i]=new int[9];
		}
		
		for(int i=0; i<gugudan.length; i++){
			for(int j=0; j<gugudan[i].length; j++){
				gugudan[i][j]=(i+2)*(j+1);			
			}
		}
		
		for(int i=0; i<9; i++){
			for(int j=0; j<8; j++){
				System.out.print(gugudan[j][i]+"\t");
			}
			System.out.println();
		}

	}

}













