package com.hb.am;

/*
 * "Java Web Spring"
 * 
 * Q1. 대문자가 몇개인지 구하시오
 * 		>> 3개
 * 
 * Q2. 모두 대문자로 출력하시오
 * 		>> "JAVA WEB SPRING"
 * 
 * Q3. 띄어쓰기로 잘라서 
 * 		String[] 에 담아 출력하시오
 * 		>> str[0]="Java"
 * 		>> str[1]="Web"
 * 		>> str[2]="Spring"
 * 
 * 
*/
public class Ex04 {

	public static void main(String[] args) {
		String msg="Java Web Spring";
		int cnt=0;
		for(int i=0; i<msg.length(); i++){
			if(msg.charAt(i)>='A' && msg.charAt(i)<='Z'){
				cnt++;
			}
		}
		
		System.out.println("Q1.>대문자 :"+cnt+"개");
		System.out.println("-----------------------");
		int gap='a'-'A';// 97 - 65
		System.out.print("Q2.");
		String msg2="";
//		char[] chs = new char[msg.length()];
		for(int i=0; i<msg.length(); i++){
			if(msg.charAt(i)>='a'&& msg.charAt(i)<='z'){
				//System.out.print((char)(msg.charAt(i)+gap));
//				chs[i]=(char)(msg.charAt(i)+gap);
				msg2+=(char)(msg.charAt(i)-gap);
			}else{
				//System.out.print(msg.charAt(i));	
//				chs[i]=msg.charAt(i);
				msg2+=msg.charAt(i);
			}
		}
		
		///////////////////////
//		char[] chs=msg.toCharArray();
//		for(int i=0; i<chs.length; i++){
//			if(chs[i]>='a'&& chs[i]<='z'){
//				chs[i]=(char)(chs[i]-gap);
//			}
//		}
//		String msg2=new String(chs);
		System.out.println(msg2);
	}

}
















