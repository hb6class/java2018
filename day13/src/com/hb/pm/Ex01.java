package com.hb.pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 예외처리
		Scanner sc =new Scanner(System.in);
		int result=0;
		try{
		int su=sc.nextInt();
		result=10/su;
		System.out.println("결과:"+result);
		}catch(java.lang.ArithmeticException ex){
			System.out.println("0으로 나누지 못함");
		}catch(java.util.InputMismatchException ex){
			System.out.println("숫자입력이 아님");
			
		}catch(RuntimeException ex){
			//System.out.println("값이 0이 거나 문자가 아님");
			System.out.println("실행중 일어난 에러로");
			System.out.println("값이 0이 거나 문자로 일어난 에러는 아님");
		}catch(Exception ex){
			System.out.println("모든 에러중에 하나");
		}

	}

}












