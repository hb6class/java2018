package com.io.pm;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		InputStream myInput = System.in;
		try {
			int su=0;
			while((su=myInput.read())!=13){
				System.out.println((char)su);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
