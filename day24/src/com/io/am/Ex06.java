package com.io.am;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		File f = new File("./");
		File dir= new File(f,"dir");
		
		File txt= new File(dir,".temp");
		if(txt.createNewFile()){
			System.out.println("���� ����");
		}else{
			System.out.println("���� ��������");
		}
		
//		if(dir.mkdir()){
//			System.out.println("���丮 ����");
//		}else{
//			System.out.println("���丮 ��������");
//			
//		}

	}

}
