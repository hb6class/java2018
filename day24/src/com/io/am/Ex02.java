package com.io.am;

import java.io.File;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
		File f = new File("./game1.png");
		
		if(f.exists()){
			System.out.println(new Date(f.lastModified()));
			System.out.println(f.length()+"byte");
//			String[] st=f.list();
//			for(int i=0; i<st.length; i++){
//				System.out.println(st[i]);
//			}
		}
	}

}
