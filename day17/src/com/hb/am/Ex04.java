package com.hb.am;

public class Ex04 {

	static class MyErr extends Exception{
		public MyErr(String msg) {
			super(msg);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
//			try{
//				int a=5/0;
//			}catch(ArithmeticException ex){
//				throw new MyErr("0���� ����������");
//			}
			int i=0;
			if(i==0){
				throw new MyErr("0���� ����������");				
			}else{
			int a=5/i;
			}
		}catch(MyErr err){
			System.out.println(err.getMessage());
		}
	}

}









