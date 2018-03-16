package com.io.am;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex03 {

	public static void main(String[] args) {
		File source = new File("./txt/ex01.txt");
		File target = new File("./ex01.txt");
		
		char[] buff=new char[5];
		
		FileReader fr=null;
		FileWriter fw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		PrintWriter pw=null;
		
		try {
			fr=new FileReader(source);
			fw=new FileWriter(target);
			
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			
			pw=new PrintWriter(bw);
			
			while(true){
//				su = br.read(buff);
				String temp = br.readLine();
				if(temp==null){break;}
				pw.println(temp);
//				bw.write(temp);
//				bw.newLine();
//				bw.flush();
			}
//			while(true){
//				su=fr.read(buff);
//				if(su==-1){break;}
//				fw.write(buff,0,su);
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				pw.close();
				bw.close();
				br.close();
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("º¹»ç ³¡");

	}

}








