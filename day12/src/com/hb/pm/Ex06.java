package com.hb.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int su =0;
		String msg=null;
			for(int i=0; i<5; i++){
				try{
					System.out.print("숫자>>");
					su=Integer.parseInt(sc.nextLine());//10진수 정수
					System.out.print("문자열>>");
					msg=sc.nextLine();
					System.out.println(msg+"="+su);
				
				}catch(InputMismatchException ex){
					System.out.println("에러남");
					sc = new Scanner(System.in);
				} //try~catch end
				
			}//for end
			
	}//main end

}// class end











