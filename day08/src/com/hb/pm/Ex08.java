package com.hb.pm;

// ¡Ú			limit =1
// ¡Ú ¡Ú			limit =2
// ¡Ú ¡Ú ¡Ú		limit =3
// ¡Ú ¡Ú ¡Ú ¡Ú		limit =4

// 1		1*1
// 22		10*2+1*2
// 333		100*3+10*3+1*3
// 4444		1000*4+100*4+10*4+1*4 

// 1		"1"
// 22		"2"+"2"
// 333		"3"+"3"+"3"
// 4444		"4"+"4"+"4"+"4"

//¡Ú				
//¡Ú ¡Ú			
//¡Ú ¡Ú ¡Ú				
//¡Ú ¡Ú ¡Ú ¡Ú			


public class Ex08 {

	public static void main(String[] args) {
//		String[] str={"¡Ú","¡Ú ¡Ú","¡Ú ¡Ú ¡Ú","¡Ú ¡Ú ¡Ú ¡Ú"};
		String[] str=new String[4];
		String stars="";
		for(int i=0; i<str.length; i++){
//			if(i==0){
//				str[i]="¡Ú";
//			}else{
//				str[i]=str[i-1]+"¡Ú";
//			}
			stars="";
			for(int j=0; j<i+1; j++){
				stars+="¡Ú";
			}
			str[i]=stars;
		}
		
		for(int i=0; i<str.length; i++){
			System.out.println(str[i]);
		}
	}

}








