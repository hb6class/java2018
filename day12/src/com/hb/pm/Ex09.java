package com.hb.pm;

public class Ex09 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
		func01(10,0);
		}catch(ArithmeticException ex){
			System.out.print("내가 출력->");
			ex.printStackTrace();
			
			System.out.print(ex.getMessage());
			System.out.print("<-내가 출력");
		}
	}
	
	static void func01(int a, int b) throws ArithmeticException{
				int result=a/b;
				System.out.println(result);
	}

}
