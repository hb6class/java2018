package com.hb.pm;

public class Ex05 {

	public static void main(String[] args) {
		// 라이브러리...
		// String
		String msg1= "abc";
		String msg2=new String(msg1);
		String msg3= "abc";
		byte[] by=new byte[5];// 0 ~ 127
		by[0]=65;
		by[1]=66;
		by[2]=67;
		by[3]=68;
		by[4]=69;
		String msg4=new String(by,1,3);
		char[] ch=new char[5];
		ch[0]='가';
		ch[1]='나';
		ch[2]='다';
		ch[3]='라';
		ch[4]='마';
		String msg5= new String(ch,1,3);
		int[] sus={65,66,67};
		String msg6= new String(sus,0,3);
		String msg7="가나다라";
//		char[] ch2=msg7.toCharArray();
//		byte[] by2 = msg7.getBytes();
//		for(int i=0; i<by2.length; i++){
//			System.out.println(by2[i]);
//		}
		
		String msg11="Java";
		String msg12="Web";
		
		String msg13=msg11.replace('a', 'A');
		String msg14=msg12.replace("e", "");
		String msg15=msg11.replace("J", "");
		String msg16=msg11.substring(1,3);
		//msg11.concat(msg12);//msg11+msg12;
//		System.out.println(msg16);
		
		String msg21="abc abcd abcde abcdef";
		String msg22=msg21.replace("ab", "AB");
		String msg23=msg21.substring(4,5);
		System.out.println(msg23);
	}

}













