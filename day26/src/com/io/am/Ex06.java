package com.io.am;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex06 {

	public static void main(String[] args) {
		File file = new File("test06.bin");
		RandomAccessFile raf=null;
		
		try{
			if(!file.exists()){
				file.createNewFile();
			}
			raf=new RandomAccessFile(file, "rw");
			raf.write("hello".getBytes());
			raf.writeBytes("hello2");
//			raf.writ
			raf.seek(0);
			int su=0;
			while(true){
				su=raf.read();
//				raf.readLine()
				if(su==-1){break;}
				System.out.print((char)su);
			}
		}catch(Exception ex){
		}finally{
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
