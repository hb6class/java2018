package com.hb.am;
/*
 * �ֹι�ȣ�� �Է��ϼ���>123456-1234567
 * ����� 00�� �����Դϴ�
 * 
 * �ֹι�ȣ�� �Է��ϼ���>123456-2234567
 * ����� 00�� �����Դϴ�
 * 
 * �ֹι�ȣ�� �Է��ϼ���>1234561234567
 * '-'�� �������� ������
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
		System.out.println("�����մϴ�!!!!");
	}
	
	public boolean gameStart(){
		String input=null;
		int age=0;
		int year=2000;
		char gender='?';
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���>");
		input=sc.nextLine();
		boolean result=valid(input);
		if(result){
			if(input.charAt(0)-'0'>1){year=1900;}
			age=2018-(year+(input.charAt(0)-'0')*10+(input.charAt(1)-'0'));
			if(input.charAt(7)-'0'==1 || input.charAt(7)-'0'==3){
				gender='��';
			}else if(input.charAt(7)-'0'==2 || input.charAt(7)-'0'==4){
				gender='��';
			}
			System.out.println("����� "+age+"�� "+gender+"���Դϴ�");
		}
		
		return result;
	}
	
	public boolean valid(String msg){
		if(msg.length()!=14){
			System.out.println("��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000");
			return false;
		}
		
		for(int i=0; i<msg.length(); i++){
			if(i==6){
				if(msg.charAt(i)!='-'){
					System.out.println("'-'�� �������� ������");					
					return false;
				}
			}else{
				char temp=msg.charAt(i);
				if(!Character.isDigit(temp)){
					System.out.println("����6�ڸ�-����7�ڸ��� �Է����ּ���");					
					return false;
				}
			}
		}
		
		return true;
	}

}











