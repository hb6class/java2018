package com.hb.pm;

import java.util.Properties;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = System.getProperties();
		System.out.print("�ڹٹ���:");
		System.out.println(System.getProperty("java.version"));
		System.out.print("�ڹ�Ȩ:");
		System.out.println(System.getProperty("java.home"));
		System.out.print("�ڹ�vm����:");
		System.out.println(System.getProperty("java.vm.version"));
		System.out.print("�ڹٶ��̺귯��:");
		System.out.println(System.getProperty("java.library.path"));
		System.out.print("os�̸�:");
		System.out.println(System.getProperty("os.name"));
		System.out.print("���ݻ����:");
		System.out.println(System.getProperty("user.name"));
	}

}
