package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer msg1=new StringBuffer("Java");
		//추가
		StringBuffer msg2=msg1.append("Add");
		//삭제 JavaAdd
 		StringBuffer msg3=msg1.delete(3, 5);
 		//수정
 		StringBuffer msg0=new StringBuffer("abcdefg");
// 		StringBuffer msg0=new StringBuffer("abCDefg");
// 		StringBuffer msg0=new StringBuffer("abCDcdefg");
 		StringBuffer msg4=msg0.replace(2, 4, "CD");
 		//삽입
 		StringBuffer msg5=msg0.insert(4, "cd");
		
 		System.out.println("msg4:"+msg4);
		System.out.println("msg3:"+msg3);
		System.out.println("msg2:"+msg2);
		System.out.println("msg1:"+msg1);
	}

}
