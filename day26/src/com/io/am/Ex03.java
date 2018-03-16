package com.io.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		File file = new File("./data/ex01.txt");
		FileInputStream fis=null;
		Scanner sc=null;
		
		try {
			fis=new FileInputStream(file);
			sc=new Scanner(fis);
			
			while(true){
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
