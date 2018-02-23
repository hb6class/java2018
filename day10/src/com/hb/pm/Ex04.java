package com.hb.pm;



public class Ex04 {

	public static void main(String[] args) {
		// 다중배열
		String[] sts=new String[3];
		
		
		
		int[][] arrs={
						{11,22,33},
						{44,66},
						{77,88,99}
					};
		
		for(int i=0; i<arrs.length; i++){
			for(int j=0; j<arrs[i].length; j++){
				System.out.print(arrs[i][j] +" ");
			}
			System.out.println();
		}
				
		int[][] arrs2=new int[3][];
		arrs2[0]=new int[3];
		arrs2[1]=new int[2];
		arrs2[2]=new int[3];
//		
//		arrs[0][0]=11;
//		arrs[0][1]=22;
//		arrs[0][2]=33;
//		arrs[1][0]=44;
//		arrs[1][1]=55;
//		arrs[1][2]=66;
		
				
	}

}









