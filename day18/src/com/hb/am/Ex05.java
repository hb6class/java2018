package com.hb.am;
// db="�й�@�̸�@����@����@����\n";
// +"�й�@�̸�@����@����@����\n";
// +"�й�@�̸�@����@����@����\n";
// +"�й�@�̸�@����@����@����\n";

public class Ex05 {

	public static void main(String[] args) {
		String db="1@ȫ�浿@90@91@92\n";
		db+="2@�ּ���@60@61@62\n";
		db+="3@������@50@51@42\n";
		db+="4@�谳��@80@81@82\n";
		db+="5@�̸���@70@71@72";
		
		
		System.out.println("-----------------------------------------");
		System.out.println("�й�\t�̸�\t����\t����\t����");
		System.out.println("-----------------------------------------");
		String[] students=db.split("\n");
		for(int i=0; i<students.length; i++){
			String temp=students[i];
			String[] stu=temp.split("@");
			System.out.print(stu[0]);
			System.out.print("\t");
			System.out.print(stu[1]);
			System.out.print("\t");
			System.out.print(stu[2]);
			System.out.print("\t");
			System.out.print(stu[3]);
			System.out.print("\t");
			System.out.println(stu[4]);
		}
		System.out.println("-----------------------------------------");
	}

}












