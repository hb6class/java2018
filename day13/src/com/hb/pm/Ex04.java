package com.hb.pm;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ArithmeticException ac=new ArithmeticException();
			throw ac;
		}catch(ArithmeticException ex){
			System.out.println("0���� ������ ���� ó��");
		}
	}

}
