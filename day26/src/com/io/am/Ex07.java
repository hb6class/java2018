package com.io.am;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
//		FileOutputStream fos=new FileOutputStream("./test07.txt");
		Scanner sc =new Scanner(System.in);
		FileWriter fw=null;
		
		try {
			fw=new FileWriter("./data/text07.txt");
			
			while(true){
				String msg=sc.nextLine();
				if(".".equals(msg)){break;}
				fw.write(msg);
				fw.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
