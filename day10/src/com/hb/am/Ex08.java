package com.hb.am;
/*
 * 주민번호를 입력하세요>123456-1234567
 * 당신은 00살 남자입니다
 * 
 * 주민번호를 입력하세요>123456-2234567
 * 당신은 00살 여자입니다
 * 
 * 주민번호를 입력하세요>1234561234567
 * '-'를 생략하지 마세요
*/

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 
		Ex08 me = new Ex08();
		boolean result=true;
		do{
			result=me.gameStart();
		}while(!result);
		System.out.println("감사합니다!!!!");
	}
	
	public boolean gameStart(){
		String input=null;
		int age=0;
		int year=2000;
		char gender='?';
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요>");
		input=sc.nextLine();
		boolean result=valid(input);
		if(result){
			if(input.charAt(0)-'0'>1){year=1900;}
			age=2018-(year+(input.charAt(0)-'0')*10+(input.charAt(1)-'0'));
			if(input.charAt(7)-'0'==1 || input.charAt(7)-'0'==3){
				gender='남';
			}else if(input.charAt(7)-'0'==2 || input.charAt(7)-'0'==4){
				gender='여';
			}
			System.out.println("당신은 "+age+"살 "+gender+"자입니다");
		}
		
		return result;
	}
	
	public boolean valid(String msg){
		if(msg.length()!=14){
			System.out.println("양식에 맞춰 입력바랍니다 ex)000000-0000000");
			return false;
		}
		
		for(int i=0; i<msg.length(); i++){
			if(i==6){
				if(msg.charAt(i)!='-'){
					System.out.println("'-'를 생략하지 마세요");					
					return false;
				}
			}else{
				char temp=msg.charAt(i);
				if(!Character.isDigit(temp)){
					System.out.println("숫자6자리-숫자7자리로 입력해주세요");					
					return false;
				}
			}
		}
		
		return true;
	}

}











