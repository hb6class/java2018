package com.hb.pm;


public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int su=(int)'A';
		
//		for(int i=0; i<9; i++){
//		System.out.print((char)su++);
//		if((i+1)%3==0){System.out.println();}
//		}
		
		
		for(int i=0; i<4; i++){
			
			for(int j=0; j<i+1; j++){
				System.out.print((char)(su+i));
			}
			System.out.println();
		}
		System.out.println("---------------------");
//¡Ù¡Ù¡Ú i=0, j=2~
//¡Ù¡Ú¡Ú i=1, j=1~
//¡Ú¡Ú¡Ú i=2, j=0~
		int limit=3;
		for(int i=0; i<limit; i++){
			for(int j=0; j<limit; j++){
				if((limit-1)-j<i){
					System.out.print(' ');
				}else{
					System.out.print('¡Ú');					
				}
			}
			System.out.println();
		}	
		System.out.println("---------------------");
//¡Ú¡Ú¡Ú i=0, j=~
//¡Ù¡Ú¡Ú i=1, j=~
//¡Ù¡Ù¡Ú i=2, j=~
		
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i<=j){
					System.out.print('¡Ú');
				}else{
					System.out.print(' ');					
				}
			}
			System.out.println();
		}
		
	}

}










