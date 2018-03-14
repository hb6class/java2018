package com.io.pm;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File f = new File("./dir/ex08.bin");
		FileInputStream fis=null;
		DataInputStream dis=null;
		
		try {
			fis=new FileInputStream(f);
			dis=new DataInputStream(fis);
			
			int su1=dis.readInt();
			double su2=dis.readDouble();
			boolean boo=dis.readBoolean();
			char ch=dis.readChar();
			String msg=dis.readUTF();
			int orgin=dis.read();
			
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(boo);
			System.out.println(ch);
			System.out.println(msg);
			System.out.println(orgin);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}











