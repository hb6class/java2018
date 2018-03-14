package com.io.am;

import java.io.File;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// File 
//		File f0 = new File("game.png");
//		System.out.println("�������� ���� : "+f0.exists());
//		func01(f0);
		//�����
		File f1 = new File("C:\\jtest\\workspace\\day24\\dir\\..\\game1.png");
//		File f1 = new File("./");
		System.out.println("�������� ���� : "+f1.exists());
		func01(f1);
		//game1.png
		System.out.println(f1.getPath());
		//������
		//C:\jtest\workspace\day24\game1.png
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getCanonicalPath());
		String path1=f1.getAbsolutePath();
		String path2=f1.getPath();
		System.out.println(path1.replace(path2, ""));
		System.out.println(f1.getParent());
		System.out.println(f1.getName());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		
//		File f2 = new File("dir");
//		System.out.println("�������� ���� : "+f2.exists());
//		func01(f2);
		
		
		
	}
	public static void func01(File f){
		if(f.isDirectory()){
			System.out.println("���丮 �Դϴ�");
		}else if(f.isFile()){
			System.out.println("���� �Դϴ�");
		}
	}

}
