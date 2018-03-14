package com.io.pm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// 
		File f = new File("./dir/ex08.bin");
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		DataOutputStream dos=null;
		
		try {
			fos=new FileOutputStream(f);
			bos=new BufferedOutputStream(fos);
			dos=new DataOutputStream(bos);
			if(!f.exists()){
				f.createNewFile();
			}
			dos.writeInt(1234);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
			dos.writeChar('A');
			dos.writeUTF("한글입력");
			dos.write(97);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				dos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("데이터 스트림 입력끝");
		
	}

}
