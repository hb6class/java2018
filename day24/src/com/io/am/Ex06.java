package com.io.am;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		File f = new File("./");
		File dir= new File(f,"dir");
		
		File txt= new File(dir,".temp");
		if(txt.createNewFile()){
			System.out.println("颇老 积己");
		}else{
			System.out.println("颇老 积己角菩");
		}
		
//		if(dir.mkdir()){
//			System.out.println("叼泛配府 积己");
//		}else{
//			System.out.println("叼泛配府 积己角菩");
//			
//		}

	}

}
