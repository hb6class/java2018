package com.io.am;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg=sc.nextLine();
		
		File f = new File("./txt/ex01.txt");
		FileWriter fw =null;
		
		try {
			fw=new FileWriter(f);
			fw.write(msg);
			
//			for(int i=0; i<chs.length; i++){
//				int su=(int)chs[i];
//				fw.write(su);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}










