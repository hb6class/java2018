package com.io.am;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) {
		File file = new File("./data/ex01.txt");
		FileInputStream fis=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		if(file.exists()){
			try {
				fis=new FileInputStream(file);
				isr=new InputStreamReader(fis);
				br=new BufferedReader(isr);
				while(true){
					String msg=br.readLine();
					if(msg==null){break;}
					System.out.println(msg);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				
				try {
					br.close();
					isr.close();
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
			
			
		}
		
	}

}
