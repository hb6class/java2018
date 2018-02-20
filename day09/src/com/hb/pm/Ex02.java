package com.hb.pm;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * 991234-1234567
 * 001234-3456789
 * 001234-4456789
 * 001234-9456789
 * 19180221
 * 1908
 * 주민번호를 입력하세요>123456-1234567
 * 당신은 00살 남자입니다
 * 
 * 주민번호를 입력하세요>123456-2234567
 * 당신은 00살 여자입니다
 * 
 * 주민번호를 입력하세요>1234561234567
 * '-'를 생략하지 마세요
 * 
 * 주민번호를 입력하세요>123456-123456
 * 양식에 맞춰 입력바랍니다 ex)000000-0000000
 * 
 * 주민번호를 입력하세요>12345-1234567
 * 양식에 맞춰 입력바랍니다 ex)000000-0000000
 * 
 * 주민번호를 입력하세요>일이삼사오육-일이삼사오육칠
 * 당신은 00살 남자입니다
 * 
*/

public class Ex02 {
	public static void main(String[] args) {

		char[] src={'1','2','3','4','5','6','7','8','9','0'};
		char[] target={'일','이','삼','사','오','육','칠','팔','구','영'};
		
		InputStream is = System.in;
		java.util.Scanner sc=null;
		sc=new Scanner(is);
		String msg=null;
		while(true){
			System.out.print("주민번호를 입력하세요>");
			msg=sc.nextLine();
			if(msg.length()==14){
				if(msg.charAt(6)=='-'){
					System.out.println(msg);
					char[] ch=msg.toCharArray();
					//////한글지원//////
					for(int i=0; i<ch.length; i++){
						for(int idx=0; idx<target.length; idx++){
							if(ch[i]==target[idx]){
								ch[i]=src[idx];
							}
						}
					}
					msg=new String(ch);
					System.out.println(msg);
					////////////////////
					
					boolean result=true;
					for(int i=0; i<msg.length(); i++){
						if(i==6){
							continue;
						}
//						'0'<= msg.charAt(i) <='9'
//						'0'<= msg.charAt(i) && msg.charAt(i) <='9'
						if(msg.charAt(i)<'0' || msg.charAt(i)>'9'){result=false;}
					}
					if(result){
						break;
					}else{
						System.out.println("장난하지 마세요");						
					}
				}else{
					System.out.println("'-'를 생략하지 마세요");					
				}
			}else{
				System.out.println("양식에 맞춰 입력바랍니다 ex)000000-0000000");
			}
		}
		int age=0;
		String gender="외계인";
		int su=(msg.charAt(0)-'0')*10+(msg.charAt(1)-'0');
		if(su>18){
			age=2018-(su+1900)+1;
		}else{
			age=2018-(su+2000)+1;			
		}
		switch (msg.charAt(7)) {
		case '1':
		case '3':
			gender="남자";
			break;
		case '2':
		case '4':
			gender="여자";
			break;
		case '8':
		case '9':
			gender="외국인";
			break;
		}
		System.out.println("당신은 "+age+"살 "+gender+"입니다");
		
	}

}














