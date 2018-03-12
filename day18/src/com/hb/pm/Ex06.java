package com.hb.pm;

import java.util.Properties;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = System.getProperties();
		System.out.print("자바버젼:");
		System.out.println(System.getProperty("java.version"));
		System.out.print("자바홈:");
		System.out.println(System.getProperty("java.home"));
		System.out.print("자바vm버젼:");
		System.out.println(System.getProperty("java.vm.version"));
		System.out.print("자바라이브러리:");
		System.out.println(System.getProperty("java.library.path"));
		System.out.print("os이름:");
		System.out.println(System.getProperty("os.name"));
		System.out.print("지금사용자:");
		System.out.println(System.getProperty("user.name"));
	}

}
