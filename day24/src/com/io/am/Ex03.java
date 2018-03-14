package com.io.am;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		/*
				C:\test 디렉터리
				
				2018-03-14  오전 10:58    <DIR>          .
				2018-03-14  오전 10:58    <DIR>          ..
				2018-03-14  오전 10:58                16 aaaa.txt
				2018-03-14  오전 10:58               201 abcd.txt
				2018-03-14  오전 10:57    <DIR>          dir
				2018-03-14  오전 10:57                 0 run.bat
				2018-03-14  오전 10:58    <DIR>          src
				               3개 파일                 217 바이트
		 * */
		File f = new File("c:\\test");
		if(f.exists()){
			String[] names=f.list();
			System.out.print(isTime(f)+"\t");
			if(isDir(f)){System.out.print("<dir>");}
			System.out.print("\t");
			System.out.print(isSize(f)+"\t");
			System.out.println(".");
			if(f.getParent()!=null){
				File parent=new File(f.getParent());
				System.out.print(isTime(parent)+"\t");
				if(isDir(parent)){System.out.print("<dir>");}
				System.out.print("\t");
				System.out.print(isSize(parent)+"\t");
				System.out.println("..");
			}
			for(int i=0; i<names.length; i++){
				
				File temp=new File(f,names[i]);
				System.out.print(isTime(temp));
				System.out.print("\t");					
				if(isDir(temp)){
					System.out.print("<DIR>");
				}
				System.out.print("\t");					
				System.out.print(isSize(temp));
				System.out.print("\t");					
				System.out.println(names[i]);
			}
		}
		
	}//main end
	public static String isSize(File f){
		String msg="";
		if(f.isFile()){
			msg=""+f.length();
		}
		return msg;
	}
	public static String isTime(File f){
		String msg=null;
		long time = f.lastModified();
		//2018-03-14  오전 10:58
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd\ta\thh:mm");
		msg=sdf.format(date);
		return msg;
	}
	
	public static boolean isDir(File f){
		boolean tf=false;
		if(f.isDirectory()){
			tf=true;
		}
		return tf;
	}

}


























