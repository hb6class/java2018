package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File f = new File("./dir/ex02.txt");
		FileInputStream fis=null;
		byte[] byts=new byte[6];
		try {
			fis=new FileInputStream(f);
			int su=0;
			int cnt=0;
			while((su=fis.read())!=-1){
				byts[cnt++]=(byte)su;
			}
			System.out.println(new String(byts));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
