package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		//����ó�� - ����ȸ�� 
		for(int i=0; i<5; i++){
		try{
				int a=5/i;
				System.out.println("5/"+i+"="+a);
		}catch(ArithmeticException ex){
			
		}catch(Exception ex){
			
		}
		}

	}

}
