package com.hb.pm;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		try{
			try{
			int su=5/sc.nextInt();
			}catch(java.util.InputMismatchException ex){
				System.out.println("�����Է��� �ƴ�");
			}
		}catch(Exception ex){
			System.out.println("�����߻�");
		}
		
	}

}
