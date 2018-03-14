package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		File source = new File("./dir/test.wmv");
		File target = new File("./dir/copy.wmv");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(source);
			fos=new FileOutputStream(target);
			int su=0;
			while((su=fis.read())!=-1){
				fos.write(su);
			}
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("º¹»ç³¡");
	}

}
