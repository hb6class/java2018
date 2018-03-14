package com.io.pm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex10 {

	public static void main(String[] args) {
		File source = new File("./dir/ex07.txt");
		File target = new File("./dir/ex10.txt");
		byte[] buff=new byte[5];
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		// 데코레이션 패턴
		
		// 8192byte
		InputStream bis=null;
		OutputStream bos=null;
		try {
			fis=new FileInputStream(source);
			fos=new FileOutputStream(target);
			
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(fos);
			
			int su=0;
			while(true){
				su=bis.read(buff);
				if(su==-1){break;}
				bos.write(buff, 0, su);
				bos.flush();
			}
//			while(true){
//				su=fis.read(buff);
//				if(su==-1){break;}
//				fos.write(buff,0,su);
//			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				bos.close();
				bis.close();
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("복사끝");
	}

}














