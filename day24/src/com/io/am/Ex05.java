package com.io.am;

import java.io.File;

public class Ex05 {

	public static void main(String[] args) {
		File f = new File("./dir");
		if(f.exists()){
			if(f.delete()){
				System.out.println("파일삭제 완료");
			}else{
				System.out.println("파일삭제 실패");
//				String[] tmp = f.list();
//				for(int i=0; i<tmp.length; i++){
//					File f2=new File(f,tmp[i]);
//					f2.delete();
//				}
//				f.delete();
//				System.out.println("디렉토리 강제 삭제 성공");
			}
		}

	}

}
