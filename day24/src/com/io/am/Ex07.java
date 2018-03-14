package com.io.am;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws InterruptedException {
		// 임시파일생성
		
		// winxp ~ windows>temp
		// win7 ~ 사용자계정 폴더 temp
		try {
			File temp=new File("./dir");
			File f = File.createTempFile("abcdefg", ".6class",temp);
			
			System.out.println(f.getName()+":파일 생성 완료");
			
			Thread.sleep(3000);
			
			f.deleteOnExit();
			System.out.println("파일 삭제 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
