package com.io.am;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws InterruptedException {
		// �ӽ����ϻ���
		
		// winxp ~ windows>temp
		// win7 ~ ����ڰ��� ���� temp
		try {
			File temp=new File("./dir");
			File f = File.createTempFile("abcdefg", ".6class",temp);
			
			System.out.println(f.getName()+":���� ���� �Ϸ�");
			
			Thread.sleep(3000);
			
			f.deleteOnExit();
			System.out.println("���� ���� �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
