package com.hb.pm;

public class Ex07 {

	public static void main(String[] args) {
		String msg="25627%������%Gangwon-do%������%Gangneung-si%������%Gangdong-myeon%������%0%%2%3%880%0\n25627%������%Gangwon-do%������%Gangneung-si%������%Gangdong-myeon%������%1%%26%3%240%0";
		String[] parts = msg.split("\n");
		for(int i=0; i<parts.length; i++){
			String[] db=parts[i].split("%");
			System.out.println(db[2]);
//			for(int j=0; j<db.length; j++){
//				System.out.print(db[j]);
////				if(j==1){System.out.print(db[j]);}
//			}
			System.out.println();
		}
	}

}
