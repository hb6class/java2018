package com.io.pm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.io.am.Target;

public class Ex04 {

	public static void main(String[] args) {
		File f=new File("./test04.bin");

		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(f);
			oos=new ObjectOutputStream(fos);
			
			com.io.am.Target tar=new Target();
			
			oos.writeObject(tar);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("입력완료");
	}

}

















