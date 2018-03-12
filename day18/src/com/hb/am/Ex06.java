package com.hb.am;

import java.util.StringTokenizer;

public class Ex06 {

	public static void main(String[] args) {
		String db="java,web,,db,spring";
		
//		String[] lec = db.split(",");
//		for(int i=0; i<lec.length; i++){
//			System.out.println(lec[i]);
//		}
		
		StringTokenizer stz=new StringTokenizer(db,",");
		System.out.println(stz.countTokens());
		String[] st=new String[stz.countTokens()];
		int cnt=0;
		while(stz.hasMoreTokens()){
			st[cnt++]=stz.nextToken();
			System.out.println(st[cnt-1]);
		}
		
	}

}













