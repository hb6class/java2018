package com.hb.am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex03 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try{
			throw new ArithmeticException();
		}catch(ArithmeticException ex){
			System.out.println("예외처리");
//			ex.printStackTrace();
//			System.out.println(">>>"+ex.toString());
//			System.out.println(">>>"+ex.getMessage());
			
//			Class e= ex.getClass();
//			System.out.println(e.getName());
//			StackTraceElement[] errs = ex.getStackTrace();
//			System.out.println(errs.length);
//			ex.printStackTrace(new PrintStream("log.txt"));
		}
	}
	
	public static void func01() throws ArithmeticException{
		int a=5/0;
	}

}













