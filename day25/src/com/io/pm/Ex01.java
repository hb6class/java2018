package com.io.pm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		File file = new File("./ex01.txt");
		byte[] buff=new byte[32];
		FileInputStream fis=null;
		ByteArrayOutputStream baos=null;
		ByteArrayInputStream bais=null;
		
		try {
			fis=new FileInputStream(file);
			baos=new ByteArrayOutputStream();
			while(true){
				int su=fis.read(buff);
				if(su==-1){break;}
				baos.write(buff, 0, su);
			}
			bais=new ByteArrayInputStream(baos.toByteArray());
			while(true){
				int su=bais.read(buff);
				if(su==-1){break;}
				System.out.write(buff, 0, su);
				System.out.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				baos.close();
				bais.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}










