package com.hb.pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// ����ó��
		Scanner sc =new Scanner(System.in);
		int result=0;
		try{
		int su=sc.nextInt();
		result=10/su;
		System.out.println("���:"+result);
		}catch(java.lang.ArithmeticException ex){
			System.out.println("0���� ������ ����");
		}catch(java.util.InputMismatchException ex){
			System.out.println("�����Է��� �ƴ�");
			
		}catch(RuntimeException ex){
			//System.out.println("���� 0�� �ų� ���ڰ� �ƴ�");
			System.out.println("������ �Ͼ ������");
			System.out.println("���� 0�� �ų� ���ڷ� �Ͼ ������ �ƴ�");
		}catch(Exception ex){
			System.out.println("��� �����߿� �ϳ�");
		}

	}

}












