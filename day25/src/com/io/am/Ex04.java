package com.io.am;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("start");
		File source = new File("./txt/ex01.txt");
		File target = new File("./txt/copy01.txt");

//		FileInputStream fis=null;
		FileReader fr=null;
		FileOutputStream fos=null;
		
//		BufferedInputStream bis=null;
		BufferedReader br=null;
		BufferedOutputStream bos=null;
		
		PrintStream ps=null;
		
		byte[] buff=new byte[128];
		try {
//			fis=new FileInputStream(source);
			fr=new FileReader(source);
			fos=new FileOutputStream(target);
			
//			bis=new BufferedInputStream(fis);
			br=new BufferedReader(fr);
			bos=new BufferedOutputStream(fos);
			
			ps=new PrintStream(bos);
			int su=0;
			while(true){
//				su=bis.read(buff);
				String temp=br.readLine();
//				if(su==-1){break;}
				if(temp==null){break;}
				ps.println(temp);
//				ps.write(buff,0,su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				ps.close();
				bos.close();
				br.close();
//				bis.close();
				fos.close();
//				fis.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Á¾·á");
	}

}














