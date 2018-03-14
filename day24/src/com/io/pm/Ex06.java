package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		File file = new File("./dir/ex02.txt");
		FileInputStream fis=null;
		List<String> list=new ArrayList<String>();
		byte[] buff= new byte[13];
		try {
			fis=new FileInputStream(file);
			int su=0;
			while(true){
				su=fis.read(buff,0,buff.length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}
