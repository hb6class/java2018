package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		File file = new File("./dir/test.wmv");
		File source = new File("./dir/copy.wmv");
		byte[] buff=new byte[5];
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(file);
			fos=new FileOutputStream(source);
			int su=0;
			while((su=fis.read(buff))!=-1){
			
				fos.write(buff,0,su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("쓰기 완료");
	}

}
